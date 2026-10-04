# Session 00 — Recon: device identity & connection

Date: 2026-10-02
Host: Windows (win32), PowerShell 5.1
Device: BlackBerry Bold 9930 (BBOS 7.x, Qualcomm MSM8655)

This note is the first-contact baseline. Nothing was written to the device.
Goal: capture identity, USB topology, installed host tooling, and the gap
between what is present and what a full backup requires.

---

## 1. Live USB enumeration

The device is attached and present now. Filtering the full PnP tree to
`VID_0FCA` shows a large *stale* cache from previously-connected BlackBerries
(Priv `STV100-1`, KEYone `BBB100-3`, etc.). The only **PresentOnly** node is:

| Property            | Value |
|---------------------|-------|
| Friendly name       | USB Composite Device |
| Hardware ID         | `USB\VID_0FCA&PID_8004&REV_0232` |
| Also                | `USB\VID_0FCA&PID_8004` |
| BusReportedDeviceDesc | `RIM Composite Device` |
| Driver service      | `usbccgp` (USB Common Class Generic Parent) |
| Location            | `Port_#0001.Hub_#0002` |
| Composite serial    | `D71FD222C5B89768F713901F6BDD313509AAF275` |

Child functions:

| MI  | Friendly name            | Class      | Driver |
|-----|--------------------------|------------|--------|
| 00  | BlackBerry Smartphone    | `RIMUSBBB` | RimUsb |
| 01  | USB Mass Storage Device  | `USB`      | (MSC)  |

Notes:
- `PID 0x8004` is the classic **BBOS "RIM Composite Device"** (pre-BB10).
  Contrast: BB10 enumerates as `0x8017` (present in the stale cache).
- `REV_0232` is the USB bcdDevice revision, not an OS build.
- The composite instance serial ends `...AAF275`. The two USB disks derive from
  the same base (`...AAF2`) with trailing `71` and `70`.

## 2. Model confirmation

The installed BlackBerry LiNK/AppLoader `Device.xml` contains the model table.
Entry matching the hardware:

```
<os model="9930" radio="CDMA-WLAN" series="Montana" ...>0x05001204</os>
```

- Codename: **Montana** (matches public "Bold Touch 9930" / RDU71CW).
- Hardware ID: `0x05001204`.
- For contrast, the 9900 is `series="Dakota"`, `0x07001204`.

## 3. Storage exposed over USB

Windows sees two RIM USB disks, both **No Media / RAW / size 0**:

| Disk | Friendly name        | Rev  | Serial                       | Status |
|------|----------------------|------|------------------------------|--------|
| 1    | RIM BlackBerry SD    | 0003 | `...AAF270`                  | No Media |
| 2    | RIM BlackBerry         | 1003 | `...AAF271`                  | No Media |
| —    | RIM BlackBerry (MSC) | —    | `...AAF275` (composite)      | — |

Implication: BBOS **mass-storage mode is not currently exposing the 8 GB
internal store** (and/or no SD card is present). This does *not* affect
`javaloader`, which talks the RIM USB protocol directly.

## 4. Host software inventory (relevant)

Installed (BB10-era stack):
- BlackBerry 10 Desktop Software (Blend, Link, Drivers) `1.2.0.52`
- BlackBerry Link `1.2.4.39`
- BlackBerry Device Drivers `8.0.0.143`
- BlackBerry Communication Drivers `8.0.0.143`
- BlackBerry Blend `1.2.0.50`

On-disk RIM trees:
- `C:\Program Files (x86)\Common Files\Research In Motion\AppLoader\` — `Loader.exe`, `Device.xml`, `LoaderClient.dll`, `CE.dll`, language resources
- `...\USB Drivers\` — `RimUsb.sys`, `RimUsb_AMD64.sys`, `RimUsbNT.inf`
- `...\RIMDeviceManager\`, `...\Tunnel Manager\`, `...\NCM Driver\`, `...\Modem Drivers\`
- `C:\Program Files (x86)\Research In Motion\BlackBerry Link\`
- `C:\Program Files (x86)\BlackBerry\BlackBerry Blend\`

Available host tools:
- Python 3.11 (`python`), JDK 21 (`java`), `git`, 7-Zip, `curl`, `tar`, `winget`

**Missing tooling (blocker for backup):**
- `javaloader.exe` — not present anywhere under the RIM trees. This is the
  canonical BBOS module read/backup tool (`dir`, `deviceinfo`, `save -A`,
  `eventlog`, `wipe`). It ships with the classic BlackBerry JDE / Desktop
  Software, not with the BB10 Link stack.
- `adb` — not present (irrelevant to BBOS, noted for completeness).

## 5. Blockers & next steps

1. **Obtain `javaloader.exe`.** Options, in order of preference:
   - BlackBerry JDE 7.1.0 (archive.org) → extract `bin\javaloader.exe`
   - BBSAK / vnbbUtils (bundle javaloader)
   - Barry `bjavaloader` (open source, needs libusb)
2. Run `javaloader -u deviceinfo` → confirm model/PIN/OS/JVM version.
3. `javaloader -u dir -s` then `save -A` → full COD module dump into
   `specimens/cod/` (hash everything).
4. `javaloader -u eventlog` → baseline log.
5. Archive the matching `7.1.0.xxx` autoloader / OS installer before any
   experiment, since recovery depends on RIM's signed installers.

## 6. Identity values to reuse in scripts

```
VID=0x0FCA
PID=0x8004
HDW=0x05001204              # 9930 Montana
SERIAL_BASE=D71FD222C5B89768F713901F6BDD313509AAF2
COMPOSITE_SERIAL=D71FD222C5B89768F713901F6BDD313509AAF275
SERIAL_DISK=...AAF271
SERIAL_SD=...AAF270
```
