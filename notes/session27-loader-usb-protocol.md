# Session 27 — Application Loader USB protocol: opcode map + ChannelPacket (live)

Date: 2026-10-05. Device: BlackBerry Bold 9930 (Montana), MSM8655, BBOS
7.1.0.1066, OS session `0FCA:8004`. Host: Linux, pyusb.

Goal (Front B from the campaign assessment): reverse the Application Loader's
USB protocol to obtain a **flash/NVS write primitive** from Linux, which would
let us set the JVM "secure" flag (NVS property `0x32 = 0`) and then install an
unsigned COD via the working JavaLoader → root.

This session cracked the **protocol structure and opcode map** and achieved the
first **live loader ChannelPacket exchange** on the device. The remaining piece
is the loader's per-channel handshake.

---

## 1. Tooling / artifacts

- `rom/apploader/Loader.exe` — PE32 i386, imagebase `0x400000`, 5 sections
  (`.text` file `0x400` vma `0x401000` size `0x4f657a`; `.rdata` file `0x4f6a00`
  vma `0x8f8000`). String VMA = file offset + `0x401600`.
- New tools: `tools/bb_probe_channels.py`, `tools/bb_desktop_probe.py`.
- Reference implementation: **Barry** (`/tmp/opencode/barry`), files
  `src/m_raw_channel.{h,cc}`, `src/socket.cc`, `src/controller.cc`.

## 2. Loader API opcode map (recovered by disassembly)

`Loader.exe` exports are the client API; each sends a one-byte opcode:

| export | opcode | notes |
|---|---|---|
| `loaderDebugMode` | **0x70** | == JavaLoader `SET_UNKNOWN1` (session25) |
| `loaderSaveModule` | **0x7e** | == JavaLoader `SAVE_MODULE` |
| `loaderResetToFactory` | **0x91** | == JavaLoader `RESET_FACTORY` |
| `loaderNvStoreDump` | **0x92** | NVS read; response markers `0x64`('d')/`0x6e`('n')/`0x00` |
| `loaderDeletePersistentStore` | **0x11** | deletes the persistent store (destructive) |
| `loaderBork` | **0x9a** | |
| `loaderRecoverFlash` | **0x89** | |
| `loaderActivateWAFs` | **0x8f**, **0x81** | |

`loaderNvStoreDump` (export `0x57FCD0`) sends a single `0x92` byte via the
connection `send` (`conn->vtable[0x34]`) and reads via `conn->vtable[0x2c]`.

**Note (correction):** `RimBBBWriteNessusInfo` / `RimBBBWriteNessusDatabaseInfo`
/ `RimBBBWriteNessusStorageUnitInfo` are **XML-element writers for a backup
manifest** (strings `Error writing element (%d)`), **not** device NVS writes.
The earlier session23 note calling them a "possible NVS write" was wrong.

## 3. Wire protocol = classic socket + ChannelPacket

From `Loader.exe`'s send/recv wrappers (`conn->vtable[0x34]` = `0x586310`,
`[0x2c]` = `0x586260`):

```
packet = [4-byte header][payload]
  header: bytes 0..1 = socket, bytes 2..3 = TOTAL size (u16, little-endian)
  payload: first byte = opcode
```

This is **exactly Barry's `ChannelPacket`**:
```c
struct ChannelPacket { uint16_t socket; uint16_t size; uint8_t data[1]; };
#define SB_CHANNELPACKET_HEADER_SIZE   4
#define SB_CHANNELPACKET_MAX_DATA_SIZE 0x3FFC
```
`size` = **total** (header 4 + data), confirmed live (§5).

## 4. The loader channel is the classic "RIM Bypass" mode

Barry's `Controller::SelectMode` names: `RIM Bypass`, `RIM Desktop`,
`RIM_JavaLoader`, `RIM_JVMDebug`, `RIM_UsbSerData`, `RIM_UsbSerCtrl`. RawChannel
mode takes an **explicit** mode name.

Live `SELECT_MODE` sweep (tools/bb_probe_channels.py):

| name | result |
|---|---|
| `DesktopMgr`, `RIMDeviceConfig`, `RIMDeviceFileAccess`, `BlackBerry_Backup`, `BBPIN` | **NOT_SELECTED (0x09)** |
| `RIM_UsbSerData`, `RIM_UsbSerCtrl` | NOT_SELECTED |
| `RIM Desktop` | SELECTED, socket 7 |
| `RIM_JavaLoader` | SELECTED, socket 5 |
| `RIM_JVMDebug` | SELECTED, socket 6 |
| **`RIM Bypass`** | **SELECTED, socket 8** |

The `RIM Bypass` mode reply advertises `...01fc3f00 02fc3f00...` = **0x3FFC**,
the `SB_CHANNELPACKET_MAX_DATA_SIZE` — confirming **RIM Bypass is the
loader/RawChannel mode**.

## 5. Live result: ChannelPacket accepted (transport works)

`tools/bb_desktop_probe.py` / inline probes, after `SELECT_MODE` + `OPEN_SOCKET`:

```
RIM Bypass  sock=8  TX=0800050092   -> 00000c001308010001000000   (sequence ACK 0x13)
RIM Desktop sock=7  TX=0700050092   -> 00000c001307010001000000   (sequence ACK 0x13)
```

So the device **accepts the ChannelPacket** `[socket][total_size=5][0x92]` and
returns the per-send **sequence handshake packet** (`0x13`) that Barry's
`Socket::SyncSend` consumes. This is the first live loader-packet exchange from
Linux.

**Earlier framing bug (now fixed):** sending `size` = data length (1) instead of
total (5) produced no reply; `size` must be `4 + len(data)`.

`0x92` itself produced only the transport ACK, no NvStore data — the loader
does a **connect/handshake sequence** before opcodes are serviced (§6).

## 6. Remaining blocker: the loader connect / BootImage handshake

`loaderConnect` (export `0x57ABD0`):
```
conn = 0x581c40(...)                 ; CoCreateInstance + OpenChannel(name)
conn->vtable[0x20](arg)              ; set mode/param
conn->vtable[0x00](buf, 0x800)       ; open
conn->vtable[0x08]()                 ; <-- likely BootImage handshake / connect
conn->vtable[0x0c]()                 ; <-- likely BootImage ready
```
The BootImage handshake state machine lives at `0x5c1880` (logs
"Requesting BootImage Handshake" @ `0x910d4c`, "Connected to BootImage",
"HANDSHAKE failed", "BootImageProtocol %d.%d"). The tunnel packet parser
("Bad tunnel packet length" @ `0x91320c`, code `0x5d21c9`; "Unsupported Opcode"
@ `0x913574`, code `0x5d3287`) validates `u16 [obj+0x81a] == len` and switches
on the first packet byte (types seen: `0x03`, `0x07`).

The channel name passed to `OpenChannel` is a **device property** supplied at
discovery time (session24e), not a compile-time string.

## 7. Next steps

1. **Decode the connect/handshake**: decompile `conn->vtable[0x08]`/`[0x0c]`
   (the connection object's vtable is `0x904B84`) and the `0x5c1880` BootImage
   handshake to get the exact pre-opcode exchange; replay it from Linux.
2. **Or port Barry's `RawChannel`**: build `brawchannel` (or a minimal client)
   and open the `RIM Bypass` channel, which handles the sequence state machine
   for us; then send `[socket][size][opcode]` packets.
3. Once a channel services opcodes: use **read-only `0x92` (NvStoreDump)** to
   read the NVS and locate property `0x32`; then decide between
   `loaderDeletePersistentStore` (0x11, destructive reset → property absent →
   `secure=0`) or a targeted write.
4. Re-test the JavaLoader `loaderDebugMode` (0x70) → modified-COD install cleanly
   (session25 was inconclusive).

## 7b. Connection object decode (addendum)

`loaderConnect` uses the connection object whose vtable is `0x904B84`:
```
+0x00 0x581c90 open      +0x08 0x5812f0 query(byte==1)   +0x20 0x586390 (ret 1)
+0x04 0x581a50 close     +0x0c 0x581320 HELLO            +0x2c 0x586260 recv
+0x14 0x5823a0 ...       +0x34 0x586310 send             +0x38 0x586360 flush
```
`loaderConnect` (0x57ABD0) order: create `0x581c40` → `vtable[0x20]` →
`vtable[0x00]` (open) → `vtable[0x08]` (query) → `vtable[0x0c]` (**HELLO**).
`vtable[0x0c]` (`0x581320`) sends `0x64` and expects `0x65` — the JavaLoader
HELLO/HELLO_ACK. So the loader connection is JavaLoader-like and does a HELLO
after open.

**Live addendum (full JavaLoader handshake, then loader opcodes with the
ChannelPacket framing):**
```
0x92 (NvStoreDump)          -> timeout
0x11 (DeletePersistentStore)-> 050008006f000000  (resp 0x6F = rejected)
0x9a (Bork)                 -> timeout
```
So `0x11` is *parsed* by the JavaLoader channel but rejected (`0x6F`); the
loader's own channel (RIM Bypass / the named channel) is where these opcodes are
serviced, and it needs its connect sequence (BootImage handshake) first.

## 8. Safety

The probe tools send only read-only opcodes and USB-reset before/after.
Destructive opcodes (`0x11`, `0x9a`, `0x91`, `0x89`, `0x69`, `0x6a`, `0x6b`,
`0x7b`) were **not** sent. Command `0x00` remains blacklisted (session24: it
dropped the device off USB).
