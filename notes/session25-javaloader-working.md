# Session 25 — The RIM JavaLoader is WORKING (live)

Date: 2026-10-04
Breakthrough: after the phone was power-cycled, the classic OS session accepted
the full JavaLoader handshake and commands. We now have a live, privileged
device-management channel from Linux.

---

## 1. Working flow (verified live)

`tools/bb_jl.py` (new) implements it end-to-end:

```
1. (optional) usb reset for a fresh mode state  (d.reset(), ~3 s)
2. SELECT_MODE "RIM_JavaLoader"  -> MODE_SELECTED, data socket (varies, 5/6)
3. OPEN_SOCKET(socket)           -> OPENED
4. HELLO (0x64)                  -> HELLO_ACK (0x65)
5. SET_UNKNOWN1 (0x70, psize=1) + 1 data byte -> ACK (0x64)
6. commands: send [socket u16][size u16][cmd u8][unknown u8][psize u16][data]
   response:  [socket u16][size u16][resp u8][unknown u8][expect u16]
              + `expect` bytes of data
   (device interleaves SEQUENCE_HANDSHAKE 0x13 packets; consume them)
7. GOODBYE (0x8d) -> ACK ; CLOSE_SOCKET -> CLOSED
```

A mode select **persists**; re-selecting the same mode returns 0x09
NOT_SELECTED. Use `d.reset()` (USB reset, does not lose OS state) before a
new select, or select once and run everything in one session.

## 2. Verified commands / results

| cmd | name | result |
|-----|------|--------|
| 0x71 | DEVICE_INFO | 44-byte payload, contains **PIN 0x3321FC37** |
| 0x78 | OS_METRICS | 464 B: `ec_agent`, `Aug  8 2013`, `RIM BlackBerry Device` |
| 0x79 | BOOTROM_METRICS | 736 B: `ec_agent`, `Jul  7 2011` |
| 0x6d | GET_DIRECTORY | 1098 B: root entry-ID table |
| 0x6e | GET_DATA_ENTRY | module metadata: `net_rim_m2g` v`7.1.0.1066` |
| 0x92 | (loader NvStoreDump) | resp 0x6F (unsupported on the JavaLoader path) |

GET_DATA_ENTRY response example (entry 0x0003):
```
0600 2b00 8c e0 5204 01 6b00 0b "net_rim_m2g" 00 0a "7.1.0.1066" 00 04 8ce0 00000000
```
=> name length-prefixed + version + metadata.

## 3. JavaLoader command set (Barry `protocol.h`)

```
0x64 HELLO/ACK   0x65 HELLO_ACK   0x8d GOODBYE
0x70 SET_UNKNOWN1                0x80 SET_COD_FILENAME
0x67 SET_COD_SIZE (BE)           0x68 SEND_DATA
0x7e SAVE_MODULE                 0x69 ERASE  0x7b FORCE_ERASE
0x6a WIPE_APPS   0x6b WIPE_FS     0x91 RESET_FACTORY
0x6d GET_DIRECTORY               0x6e GET_DATA_ENTRY
0x7f GET_SUBDIR  0x7d GET_SUBDIR_ENTRY
0x73 GET_LOG     0x74 GET_LOG_ENTRY  0x88 CLEAR_LOG  0x8e LOG_STRACES
0x71 DEVICE_INFO 0x78 OS_METRICS  0x79 BOOTROM_METRICS
0x7c SET_TIME    0x87 GET_SCREENSHOT
```

## 4. What this gives us

A **privileged device-management channel from Linux** (the same one the
BlackBerry Desktop Manager / Application Loader uses):
- enumerate and read the module filesystem,
- **install** modules (`SET_COD_FILENAME`/`SET_COD_SIZE`/`SEND_DATA`/`SAVE_MODULE`),
- erase modules, wipe apps/FS, reset factory,
- device info / metrics / event logs.

## 5. Next steps toward root
1. Confirm full-module **read** (SEND_DATA on a data entry).
2. **Signature-bypass test**: install a *modified/unsigned* COD via the
   JavaLoader and see whether the device's CMM accepts it. If it does ->
   arbitrary code. (The loader's `0x92` NV command is on a different channel,
   so the JavaLoader install path is the direct route.)
3. If install is signature-checked, use the JavaLoader's read/write to look
   for other primitives, and keep the loader-channel (0x92) route in reserve.

## 6. Artifacts
- `tools/bb_jl.py` (working client), `recon/loader_protocol_recon.txt`.
- Live logs: `/tmp/opencode/nvdump*.log`, `/tmp/opencode/entry*.log`.
