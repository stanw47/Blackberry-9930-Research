# Session 07 — BootROM first contact on Linux (protocol findings)

Date: 2026-10-04
Device: BlackBerry Bold 9930 (Montana), MSM8655, BBOS 7.1.0.1066, PIN `0x3321FC37`
Host: Linux (Python 3.13, pyusb, libusb-1.0), device entered BootROM by
**battery-out + USB replug** (the only way to reach it reliably).

First live USB session against the 9930 BootROM after moving off Windows.
Read-only except `SetMode(1)`; **no flash writes**.

---

## 1. Windows blocker resolved

Same device, same code path:

| Host | BootROM claim |
|------|---------------|
| Windows (`recon/bootrom_channel0_test.log`) | `CLAIM: FAILED` — `Operation not supported` |
| Linux | `CLAIM: OK` |

On Linux libusb also reads string descriptors that Windows reported as
unavailable (`manufacturer='Research In Motion\x00'`, `product='RIM Composite
Device'`). No Zadig/WinUSB driver package needed.

## 2. BootROM descriptor (live, Linux)

```
PID=0001 bcd=0107  "BlackBerry"   bDeviceClass=0xFF
  itf0 class=FF sub=01 proto=FF
    EP 81 IN (64)  EP 01 OUT (64)  EP 82 IN (64)  EP 02 OUT (64)
```

- Correct command pipe is **OUT `0x02` / IN `0x82`** (matches `bblink.py` /
  `bb-usbdl`). The other pair `81/01` rejects bulk OUT writes.
- Device does **not** boot on its own while in this state; it stays `PID_0001`
  and waits for the host (consistent with battery-out plug-in).

## 3. The BB10 framing is correct — but ping-first wedges the 9930

Framing (identical in `bblink.py`, `bbusb.pas`, and `bb-usbdl.c`):

```
wire = type(2)=0x0000 | packetSize(2)=len(data)+8 | command(1) | mode(1) | packetId(2) | data
```

Observed:

- **`Ping0` (cmd `0x01`) → replies** `02 ff 0000 1405831900000000`
  (`cmd=0x02` PingResponse, mode `0xff`). So channel0 works.
- **Immediately after, every OUT write NAKs** (`USBTimeoutError`), and the IN
  endpoint streams the same 16-byte ping ACK repeatedly. The device will not
  accept `GetVar` (cmd `0x05`) on the same session.
- One 16-byte packet-buffer/echo survives until a physical replug; the session
  cannot be recovered in software (`libusb_reset_device` → `Entity not found`).

This means the **`bb10mt`/`bblink` order (`Ping0 → GetVar → SetMode`) is wrong
for the 9930's RIM BootROM 5.1.0.699** (2011). It is likely a BB10-specific
warm-up that the older bootrom mishandles.

## 4. The correct order: SetMode first (per `bb-usbdl`)

The clean-room `ivoszbg/bb-usbdl` (2024, GPL-3) calls `SetMode` **first**, then
`GetVar`, and sends **no ping**. Reproduced live on the 9930:

```
TX cmd=07 (SetMode) mode=0xFF data='RIM-BootLoader' padded to 16 + 0x01
RX 49 bytes: 0000 3100 08 01 0000 52494d2d426f6f744c6f61646572 ... fc0700 ...
             type size cmd=0x08(SetModeSuccess) mode=0x01 pkt=0 data...
```

- **`SetMode(1)` is accepted — `command=0x08` (SetModeSuccess).** The 9930 speaks
  the protocol and the bootloader-mode switch works.
- The reply payload includes the mode string echoed plus a table-looking body
  (`01 fc0700 02 fc0700 03 010000 04 010000 …`).
- The **next** command (GetVar, now with `mode=0x01`) still NAKs on the same
  handle.

### Observed wedge behaviour (corrected hypothesis)

Earlier I suspected `SetMode(1)` triggered a re-enumeration to `PID_0004`.
**That was disproven** by scanning all `0FCA` PIDs for 90 s after `SetMode`:
the device stays at `PID_0001` (same address). What actually happens:

- `SetMode(1)` `RIM-BootLoader` → first reply `cmd=0x08` (SetModeSuccess,
  mode `0x01`), **then the device streams `cmd=0x09` (SetModeFailure, mode
  `0xff`) forever** and never services bulk OUT again.
- `SetMode(2)` `RIM-RAMLoader` → only `cmd=0x09` streamed, no `0x08`.
- The `0x09` packets are emitted as fast as the host reads them (infinite
  stream), until the device eventually drops off the bus.
- `GetVar` / repeated `SetMode` / `Ping` all fail with `USBTimeoutError`
  after the first command. `clear_halt` returns `Other error`;
  `libusb_reset_device` returns `Entity not found`; `set_interface_altsetting`
  succeeds but does not re-arm OUT.
- Only a **physical replug (battery out)** recovers the device.

So the `0x09` stream is the device stuck in a retry/failure loop, not a
re-enumeration. The likely missing piece is a **host acknowledgement or the
password exchange** that the real RIM loader performs between `SetMode` and the
next command — note `bb-usbdl`'s `send` path calls `GetPasswordInfo`
(cmd `0x0A`) → `SendPassword` right after `SetMode`, while the `info` path
skips it. Our next test should insert the password exchange (empty password)
immediately after `SetMode`, before `GetVar`.

## 5. Command map (from `bb-usbdl.h`, confirmed by observation)

```
0x01 Ping (OUT)              0x02 PingResponse (IN)      <- 9930 replies, then wedges
0x03 Reboot (OUT)            0x04 RebootResponse (IN)
0x05 GetVariable (OUT)       0x06 GetVariableResponse (IN)
0x07 SetMode (OUT)           0x08 SetModeSuccess (IN)    <- 9930: 0x08 observed
0x0A GetPasswordInfo         0x0E GetPasswordInfoResponse
0x0F SendPassword            0x10 SendPasswordCorrect
0x13 ReadyForDataTransfer (IN)
```

Boot modes: `0 RIM REINIT, 1 RIM-BootLoader, 2 RIM-RAMLoader, 3 RIM UPL,
4 RIM-BootNUKE`. Mode string is 16 chars + `\x01` (17 bytes).

## 6. Next experiment

`SetMode(2)` was tested and also wedges (pure `0x09` stream). `clear_halt`,
alt-setting, padded 64-byte writes and a 90 s re-enumeration watch were all
tried and do not recover OUT.

The password-exchange variant was tested and **also wedges**: after the
`SetMode(1)` reply, `GetPasswordInfo(0x0A)` (tried with mode `0x01` and
`0xff`) and `GetVar` all time out. So the skip-step theory is not it either —
the 9930 simply stops servicing bulk OUT after the first command.

### Definitive: one OUT write per boot, then dead (2026-10-04, continued)

Reproduced on many fresh battery-out boots, including writing a second command
**before** reading the first reply:

- `SetMode(1)` write **always accepted**; reply `0x08` (SetModeSuccess) then a
  `0x09` (SetModeFailure) packet stream.
- The **second** bulk-OUT write **always** NAKs (`USBTimeoutError`), whether it
  is `GetVar`, `GetPasswordInfo`, another `SetMode`, or a channel1 packet.
  Not caused by reading, by `mode`/`packetId`, or by battery-out power.
- No USB re-enumeration (PID/address stable for 90 s); reopening the handle
  does not help; no Qualcomm EDL (`05c6:9008`) is exposed on the bus.
- So the unit's BootROM accepts exactly **one** host command and then enters a
  state where it no longer reads OUT until a physical replug.

Implication: the `bblink`/bb10mt channel0 flow (ping→getvar→setmode→password→
loader) is a **BB10** protocol. The 9930's RIM BootROM 5.1.0.699 (2011)
responds once and then stalls — consistent with `SetMode` failing to hand off
(the `0x09`), i.e. it never reaches the RAM-loader upload stage. RIM's own
AppLoader does not contain the `RIM-BootLoader` mode strings, so it almost
certainly uses the **OS-session** update path, not this BootROM path.

Options from here (recorded in session09 §5): brute-force the first command
across replugs; reverse `RIMDeviceManager.exe` further; or bypass USB entirely
via **eMMC ISP/chip-off** to dump the boot partitions (the reliable route to
the vulnerable bootloader, and the same methodology as `priv-research/
classic-emmc`).

### Update (2026-10-04, sessions 12+): BootROM mode names + flakiness

- The BootROM's `SetMode` **does** accept the name `RIM-BootLoader` — reply
  `0x08` (MODE_SELECTED) with the same mode table as the OS session. Every
  other name (`RIM_JavaLoader`, `RIM Desktop`, `RIM_JVMDebug`, `RIM UPL`,
  `RIM REINIT`, `RIM-BootNUKE`, …) returns `0x09` NOT_SELECTED.
- So the only accepted BootROM mode is `RIM-BootLoader`; after it the device
  streams a `0x09`/echo and stops servicing OUT (the session07 "wedge").
- **Flakiness**: during one boot-window catch, the same session accepted
  `ping` + 3 `SetMode`s before locking; on battery-out static BootROM it locks
  after the first `ping` (which streams its `ECHO_REPLY` forever). Same framing
  (bb10mt `mode`/`pkt` ≡ classic `socket`/`sequence`), so this is device-side
  timing/state, not our protocol.
- Net: the BootROM reliably yields ~1 command; there is no evidence of a usable
  loader-upload path over USB on this unit. The classic/OS session is the only
  stable USB channel, and it exposes no flash primitive (sessions 10–12).

Two remaining cheap variants worth trying:

1. **Battery IN.** All tests so far used battery-out to enter BootROM. With no
   battery the PMIC/bootloader-load state may differ, which could explain the
   `0x09` loop after `SetMode`. Try: battery in, device powered off, plug USB,
   catch the ~12 s `PID_0001` window, and fire `SetMode(1)`+`GetVar` fast.
2. **Normal boot-up transition.** Catch `PID_0004` (RIM-BootLoader) directly on
   a normal power-up (battery in) and speak the protocol to it — the 2014 bug
   is in the *bootloader*, not necessarily the BootROM.

If neither works, fall back to **capturing what RIM's own loader does**:
install Wireshark + USBPcap on a Windows host, run `Loader.exe` / Desktop
Software against the 9930 in BootROM, and record the exact control/bulk
sequence. That (or reversing `Loader.exe` / `RimUsb.sys`) is the reliable way
to get the 9930's precise BootROM handshake.

## 7. Device state

`WSSBootTest` 1.0.2 remains installed (session05); remove with
`javaloader -u erase -f WSSBootTest` (Barry/Wine on Linux) when convenient.

## 8. Tooling added this session (`tools/`)

| Script | Purpose |
|--------|---------|
| `bb_usbdl_info.py` | `bb-usbdl`-style SetMode→GetVar info read |
| `bb_usbdl_step.py` | SetMode then PID re-scan (re-enumeration test) |
| `bb_bootrom_cycle_run.py` | strict unplug/replug detection + handshake |

Reference copies live in `/home/stanw47/priv-research/bb10mt-src/` (Pascal) and
upstream `ivoszbg/bb-usbdl` (C, GPL-3).
