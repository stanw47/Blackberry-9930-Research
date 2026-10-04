# Session 09 — RIM AppLoader acquired + firmware/toolchain inventory

Date: 2026-10-04

While extracting the Sprint 9930 OS installer (session08) under Wine, the
installer also installed RIM's **AppLoader** and USB drivers into the prefix.
Together with the extracted firmware, we now have RIM's own host-side tooling
and the signed image set locally.

---

## 1. RIM AppLoader now on disk

Source (Wine prefix):
```
.../drive_c/Program Files (x86)/Common Files/Research In Motion/AppLoader/
.../drive_c/Program Files/Common Files/Research In Motion/USB Drivers/
```
Copied to `rom/apploader/` (41 MB, gitignored):

| File | Size | Role |
|------|------|------|
| `Loader.exe` | 11.2 MB | AppLoader GUI (host flashing app) |
| `LoaderClient.dll` | 633 KB | RPC client to the Device Manager |
| `DeviceUpdate.dll` | 1.7 MB | update engine (`LoaderOperationModelRpc`, `IDeviceImpl::bootrom_metrics`) |
| `CE.dll` | 512 KB | common engine |
| `Device.xml` | 30 KB | model table |
| `Vendor.xml` | 607 KB | carrier table |
| `RIMDeviceManager/RIMDeviceManager.exe` | 2 MB | USB/bootrom transport (`CVBootrom@RIM_CFP`, `MCT_BOOTROM_*`, `RimUsb`) |
| `USB Drivers/RimUsb.sys`, `RimUsb_AMD64.sys` | 64 KB | kernel USB driver |

`Device.xml` confirms our device:
```
<os model="9930" radio="CDMA-WLAN" series="Montana" ...>0x05001204</os>
```

### Protocol markers found (static)

- `Loader.exe`: header magic `D7D32D1F` ×1 (validated with an x86 `CMP` in the
  loader-tag check), signature magic `D7C82D1F` ×3, strings `LDRAppend.bin`,
  `RIM-APPLOADER-{1D18DEB0-...}`, `RIM Loader Console`.
- `RIMDeviceManager.exe`: `D7D32D1F` ×1, `D7C82D1F` ×3, `Bootrom` ×12, `RimUsb`
  ×4 — this is where the bootrom/signature path lives.
- `bblink.py`'s `dummy_sig()`/`load_loader()` already use `D7D32D1F`/`D7C82D1F`,
  so its framing matches RIM's real tag format.

## 2. The `rim0x05001204.sfi` container format

`rom/9930AllLang_v7.1.0.163_P5.1.0.137/CDMA/rim0x05001204.sfi` (78,194,852 B)
is the signed **modem/radio** firmware (CDMA + GSM). Structure observed:

- File header: checksum `0x59AB797D`, then an ARM image with the RIM magic
  **`D7A82D1F`** at `0x34`, load address `0x40000000`, entry `0x40000150`.
- RIM component magics (little-endian `??2D1F`) and counts:

  | Magic | Count | Meaning (inferred) |
  |-------|-------|--------------------|
  | `D7A82D1F` | 2 | loadable code block (load addr + entry) |
  | `D7B02D1F` | 1 | address/offset table |
  | `D7CC2D1F` | 1 | address table (0x40146f18, 0x404e867c, 0x40b403a0) |
  | `D7C82D1F` | 6 | signature record ("RIMOS-ECC-SHA512") |

- **Named components** e.g. at `0x39E52D8`: `"NFC_java.elf"` followed by an
  ELF at `0x39E5300`; a `RIMOS-ECC-SHA512` signature record precedes it at
  `0x39E5086`/`0x39E52B8`.
- **Embedded ARM ELF executables** (stripped, static):

  | Offset | Size | Entry |
  |--------|------|-------|
  | `0x39E5D40` | 583,772 | `0x5fac9` |
  | `0x3A74C5C` | 5,281,080 | `0x6588d` |
  | `0x3F7EB14` | 8,012,552 | `0x0` |
  | `0x4720C1C` | 3,609,864 | `0x1238d` |

- Contents are modem/radio: `qct/modem/gps/gnss/.../aries_gpsdiag.c`,
  `RimPostMessageModemToApp`, `SBLIsInBlackList`, `setModemModePPPActive`,
  `VIDC_720P_BOOTCODE`, `LoaderDriverUSB`.
- Qualcomm SBL1 signature at `0x60DE0` (likely false positive; values bogus).

`file` reports generic `data`; not parsed by `binwalk` beyond false positives.

## 3. Reference: RAMLoader command set

From `bb10.root.sx/downloads/ramloader.txt` (Oleksandr's BB10 notes; the BBOS
loader is the same family used by `bblink`):

```
20 get persistent data       E4 CREAD INIT
21 bootrom log               E5 CREAD addr size(<=0x3FA0)
B4 flash regions info        E7 get PIN
B5 flash info                E8 WIPE_SECURITY
BF DRAM info                 EA get BSN
C0 40 COMPLETE (checks QCFM signature)
C8 GRS_WIPE                  EE ERASE_SECTOR
DE BOOT_MODE                 EF 80 Reboot
F7/F8 write data             F9 40 SIGNATURE_TRAILER
```

BB10 lesson (Oleksandr): `0xF7` writes flash and hashes; `0xC040` verifies the
QCFM signature and, if invalid, sets a global "won't boot" flag; because the
flag is global, one can flash modified data then restore original to clear it —
but only the **user** partition, since `rfs_validator` + the bootloader protect
radio/OS. The BB10 root came from the user partition + PathTrust, not a
signature bypass.

## 4. Tooling now available

| Tool | State |
|------|-------|
| `rom/apploader/` | RIM Loader.exe / DeviceUpdate.dll / RIMDeviceManager.exe / RimUsb.sys |
| `rom/9930AllLang_v7.1.0.163_P5.1.0.137/` | full OS 7.1.0.163 Loader Files + `rim0x05001204.sfi` |
| Wine flatpak (`org.winehq.Wine`, wow64-25.08) | run Windows BlackBerry installers (extraction only; no USB) |
| `unshield`, `binwalk`, `cabextract`, `7z`, `iss_extract` | firmware/package tooling |
| `/tmp/opencode/*.py` + `tools/` | BootROM probes (session07) |

## 5. Critical path & next steps

The blocker is still a **working loader session** on the device (session07:
`SetMode(1)` → device streams `0x09` and stops servicing OUT). Options, in
order:

1. **Battery-in test** — all prior attempts used battery-out. The `0x09` loop
   may be a PMIC/bootloader-load failure. Retry `SetMode(1)` + `GetVar` during
   the ~12 s BootROM window with the battery inserted (device powered off, then
   powered on with USB attached). Script: `tools/bb_bringup.py`.
2. **Reverse `RIMDeviceManager.exe`** (this session's new asset) to recover the
   exact bootrom sequence — confirm whether it is ping→setmode or
   setmode→password, and the loader tag format.
3. Once a session works: dump the boot partition (the vulnerable AP bootloader
   is in device flash, not in the modem `.sfi`), then reverse it for the
   2014-class bug.
4. Keep the Sprint image as the recovery path (Windows-side flashing).
