# Session 12 — Live OS-session (PID 8004) probing

Date: 2026-10-04
Device: BlackBerry Bold 9930, booted into **OS mode** (`0FCA:8004`), connected.

With the phone on, probed the OS session aggressively over USB.

---

## 1. OS-session device

```
PID 8004  bcd 0232  "RIM Composite Device"  serial …AAF275
  iface0: vendor FF/01/FF, 8 endpoints: 81/01 82/02 83/03 84/04 (512B each)
  iface1: mass storage (SCSI) -- exposes zero-size disks (no media)
```
No CDC/RNDIS network interface appears (so the HTTP CGI path is tunnelled,
session11). Kernel `usb-storage` holds the config; probe detaches iface0.

## 2. The OS session speaks channel0 (and does **not** wedge)

Unlike BootROM (session07), the OS session answers **channel0 on EP `82/02`**
and keeps working across many commands:

```
ping0                 -> 02 ff 0000 14058319 00000000
GetVar(2,2000)        -> 736-byte BRMetrics
GetVar(0) / (6)       -> short replies
GetVar sweep 0..0x7f  -> ids 1-4,7,8,A-D,F,10 return data (below)
command 0x03          -> device REBOOTS (came back as 8004 in ~15 s)
```

This is the first session that sustained more than one command — BootROM was
one-write-then-dead, the OS session is a normal channel0 endpoint.

## 3. Device variable table (GetVar)

| id | len | content |
|----|-----|---------|
| 0x01 | 24 | **serial** `d71fd222c5b89768f713901f6bdd313509aaf275` |
| 0x02 | 736 | **BRMetrics** (see §4) |
| 0x03 | 464 | **OS metrics** (`ec_agent`, build `Aug  8 2013`) |
| 0x04 | 12 | `08000400 04000000 37fc2133` → **PIN** `0x3321FC37` |
| 0x07 | 8 | `02020000` |
| 0x08 | 8 | `00010000` |
| 0x0A | 8 | `48f5c080` |
| 0x0B | 8 | `00000000` |
| 0x0C | 6 | `68 00` |
| 0x0D | 12 | `1801fc25 0000a000` (sizes) |
| 0x0F | 19 | `03 05 02 00 01 06 00 05 00 01 07 01 06 01 00` |
| 0x10 | 5 | `01` |

Everything else (0x11–0x7F) is empty.

## 4. BRMetrics / memory map (var 0x02, 736 B)

```
@16  HWID 0x05001204        @20 "RIM BlackBerry Device"
@84  "ec_agent"             @100 "Jul  7 2011"  @116 "14:31:57"
```
Tail contains region entries (id, base, limit), e.g.:
```
0x0C23  0x00000000 - 0x0FFFFFFF
0x0C23  0x20000000 - 0x2FFFFFFF
0x0C23  0x40000000 - 0x4FFFFFFF
0x0C1D 0x0C18 0x0C1E 0x0C21 0x0C20 0x0C36 0x0C22 0x0C25 0x0C26
0x0832 0x0819 0x081A 0x2007 0x2008 0x0C31 0x0C2B
```
(same MCT region IDs family as session10). Saved: `/tmp/opencode/brmetrics.bin`,
`var_02.bin`, `var_03.bin`.

## 5. What the OS session does **not** allow

- `set_mode(1)` / `set_mode(2)` → refused (no `0x08`), no re-enumeration.
- channel2 (RAM-loader) commands `B4/D9/BF/D8/E7/EA/DB/B0/E4/E5` → all time out.
- `GetPasswordInfo` (channel0 `0x0A`) → no reply (timeout).
- channel0 `0x0B` → reply cmd `0x0D` (soft failure); `0x0C` wedges the session.
- cmd `0x03` = reboot (works).

So: **rich identification, no flash/loader primitive** from the OS session.

## 6. Next lead: classic socket protocol

The OS session also speaks RIM's classic socket protocol (Barry's
`Packet{socket,size,command} + SocketCommand{socket,sequence,{ModeSelect|
PasswordChallenge|AttributeFetch|Echo}}`). `ModeSelect.name[16]` is the same
"RIM-BootLoader"-style selector as bb10mt — the classic-mode equivalent of
`set_mode`, on the `81/01` channel. Untested; candidate for forcing loader mode.

## 7. Device state

Survived all probing; rebooted to OS mode on command. Currently `8004`.

## 8. Mode map — breakthrough (explains the BootROM wedge)

`channel0` `SetMode` (cmd `0x07`, 17-byte `name` + `0x01`) uses the **classic
RIM mode names**, not the bb10mt ones. Results on the OS session:

| name sent | reply cmd | meaning |
|-----------|-----------|---------|
| `RIM Desktop` | `0x08` | **SELECTED** |
| `RIM_JavaLoader` | `0x08` | **SELECTED** |
| `RIM_JVMDebug` | `0x08` | **SELECTED** |
| `RIM_UsbSerData` | `0x09` | NOT_SELECTED |
| `RIM_UsbSerCtrl` | `0x09` | NOT_SELECTED |
| `RIM-BootLoader` | `0x09` | NOT_SELECTED |
| `RIM-RAMLoader` | `0x09` | NOT_SELECTED |
| `RIM UPL` / `RIM-BootNUKE` / `RIM REINIT` | `0x09` | NOT_SELECTED |

`0x08` = `SB_COMMAND_MODE_SELECTED`, `0x09` = `SB_COMMAND_MODE_NOT_SELECTED`
(Barry `protocol.h`). The selected reply carries a socket table, e.g.
`...0100 0800 0200 0800 0301 0000 0401 0000 0510 0300` for `RIM_JavaLoader`.

**This is why `bblink` wedged the BootROM**: bb10mt/`bblink` sends
`RIM-BootLoader`; the device answers `0x09 NOT_SELECTED` (the "0x09 stream"),
i.e. the mode simply does not exist. `Ping0` and `GetVar` use the same
channel0 transport, so our framing was right — only the mode name was wrong.

### New capabilities

- **`RIM_JavaLoader`** and **`RIM_JVMDebug`** are selectable — the classic
  JavaLoader (app/FS) and JVM-debug channels. These ride the OS/signing layer,
  but JavaLoader gives live filesystem/module access (read, and with master
  control, potentially writes to the user partition).
- `RIM Desktop` selects the Desktop Channel (the same one the HTTP update uses,
  session11).

### Notes

- Classic socket-0 `SELECT_MODE` (`Packet{socket,size,cmd=0x07}+SocketCommand{
  socket,seq,ModeSelect.name[16]}`) got **no reply** on either endpoint — the
  classic socket protocol needs its own (sequence/hello) handshake; the raw
  channel0 `SetMode` is the working entry.
- Still no flash/loader primitive; the flash path remains HTTP-CGI (session11).

## 9. JavaLoader socket attempt

After `SetMode("RIM_JavaLoader")` (reply `0x08`, mode byte becomes `0x06`), raw
`JLPacket` probes (`[socket][size=8][cmd][unknown][param_size]`, Hello `0x64` /
DeviceInfo `0x71` on sockets 0/1/2/8/0xB/0xFFFF, EP `81/01` and `82/02`) got
**no reply** — the JavaLoader socket needs Barry's proper `Socket::Open`
sequence (OPEN_SOCKET `0x0A` + handshake), not a bare command. Selecting a mode
left the vendor session unresponsive to channel0 until a **USB reset** (which
recovered it: ping answered again).

## 9b. OpenSocket works (channel0 framing)

The channel0 commands **are** the classic command bytes (`0x01` ECHO→`0x02`,
`0x07` SELECT_MODE→`0x08`/`0x09`, `0x0A` OPEN_SOCKET, ...). After selecting
`RIM_JavaLoader` (mode byte → `0x06`), sending `0x0A` (OPEN_SOCKET) got real
replies:

```
OPEN 0x0A sock=0 -> cmd 0x10  (OPENED_SOCKET)
OPEN 0x0A sock=1 -> cmd 0x13  (SEQUENCE_HANDSHAKE) data 00000000
OPEN 0x0A sock=2 -> cmd 0x01  (ECHO)
OPEN sock>=3     -> timeouts (session wedged)
```

So the socket protocol is reachable via the bb10mt channel0 framing; the
socket/sequence encoding and the correct open handshake still need pinning
down (Barry's `SocketZero::SendOpen` + `CheckSequence`). Recovered with a USB
`reset()`.

## 9c. Mode byte = socket id; classic protocol live

The byte after the SetMode reply command is the **socket id** of the selected
mode:

```
RIM_JavaLoader -> mode/socket 0x06
RIM_JVMDebug   -> 0x07
RIM Desktop    -> 0x08
```

Opening that socket with `OPEN_SOCKET` (`0x0A`) elicits real classic-protocol
replies: a `SEQUENCE_HANDSHAKE` (`0x13`, body `00000000`) and/or
`OPENED_SOCKET` (`0x10`). e.g. selecting `RIM Desktop` then
`OPEN_SOCKET(socket 8)` produced `... 10 08 00 02` = `OPENED_SOCKET`.

Conclusion: the OS session speaks **RIM's classic socket protocol** (Barry).
Driving it fully (open → password challenge → data socket → JL/HTTP) needs
Barry's `SocketZero::SendOpen`/`CheckSequence`/password logic ported. The
`RIM Desktop` socket (8) is the channel the AppLoader's HTTP `update.cgi`
rides on (session11).

### Working classic client (`tools/bb_classic.py`)

Ported Barry's framing (little-endian): `[outer u16][size u16][cmd u8]
[target u16][seq u8][extra]`. Verified live:

```
SELECT_MODE "RIM Desktop"    -> 0x08 MODE_SELECTED (socket 8)
SELECT_MODE "RIM_JavaLoader" -> 0x08 MODE_SELECTED (socket 6)
OPEN_SOCKET(sock)            -> 0x10 OPENED_SOCKET
ECHO(0x01, 8 bytes)          -> 0x02 ECHO_REPLY (ticks echoed)
HELLO(0x64) on socket 6      -> 0x13 SEQUENCE_HANDSHAKE
FETCH_ATTRIBUTE(0x05)        -> 0x06 FETCHED_ATTRIBUTE
```

Notes:
- The device is **little-endian**; bblink's "mode"/"pkt" are just the classic
  `target socket`/`sequence` bytes.
- **Each SELECT_MODE needs a fresh device state** — selecting again without a
  reboot returns `0x09`/`0x00`. A USB `reset()` clears it.
- JL commands (`0x71` DEVICE_INFO etc.) returned `0x00` on the Desktop socket
  (8); they belong to the JavaLoader socket (6), where HELLO is answered.
- Remaining: implement Barry's sequence/password handling to complete a data
  socket, and identify the tunnel that carries HTTP `update.cgi` on socket 8.

### FETCH_ATTRIBUTE = device properties (socket 8)

`FETCH_ATTRIBUTE(0x05)` on the Desktop socket returns the same property set as
`GetVar` (the `object` field is ignored):

| attr | bytes | content |
|------|-------|---------|
| 1 | 24 | serial `D71FD222…AAF275` |
| 2 | 736 | BRMetrics (HW `0x05001204`, `ec_agent`, `Jul 7 2011`) |
| 3 | 464 | **OS metrics** — `Aug 8 2013`, platform **`5.1.0.699`**, region table |
| 4 | 12 | PIN `0x3321FC37` |
| 7,8,10,11 | 8 | config words |

An HTTP request pushed as a raw data packet on socket 8 was answered with a
`SEQUENCE_HANDSHAKE` (`0x13`) rather than HTTP — so `update.cgi` is **not** a
raw socket-8 tunnel; it rides a higher tunnel (session11) that still needs
reversing.

## 10. Device survived

Rebooted cleanly (`0x04`) and re-enumerated as `8004` in ~5 s after every probe.
Selecting an unsupported socket state made channel0 stop responding; a USB
`reset()` restored it. No bricks, no wipes performed.
