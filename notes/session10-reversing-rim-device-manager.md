# Session 10 — Reversing RIM Device Manager (host stack architecture + flash map)

Date: 2026-10-04

Goal: find how RIM's own BBOS tooling drives the device, to get a working
loader/flash session (the BootROM channel0 path stalls after one write).

Tooling: Ghidra 12.0.4 headless on `rom/apploader/` + the RIM Device Manager
(`RIMDeviceManager.exe`, `rim_serial.dll`, `CE.dll`, `DeviceUpdate.dll`).

---

## 1. Key negative result: RIM's BBOS tools do **not** use BootROM channel0

Searched **every** RIM host binary (`*.exe`/`*.dll`) for the channel0 mode
strings `RIM-BootLoader` / `RIM-RAMLoader` / `RIM REINIT` / `RIM UPL`:

```
(no hits)
```

So the `bblink`/`bb10mt` channel0 protocol (SetMode/ping/GetVar) is a
**BB10-era** host protocol. RIM's BBOS 7 AppLoader never drives the BootROM that
way — which is consistent with the session07 finding that the 9930's BootROM
answers one command then stalls.

What RIM's BBOS tools *do* use:

- `rim_serial.dll` — "RIM VSP"/modem layer (`RIM_VSPLib*`), uses
  `SetupDi*` + `CreateFileA` + `DeviceIoControl`/`ReadFile`/`WriteFile`; exposes
  the device as a **virtual serial / modem port**. = the OS-session transport.
- `RIMDeviceManager.exe` — the COM service managing the device, volumes,
  password requests, and the `RIMDesktopChannel`; its `ReadFile`/`WriteFile`
  are the `\\.\pipe\RIM_LogPipe` log stream (verified: the reader normalises
  CRLF/0x1A — it is text, not the USB protocol).
- `CE.dll`, `DeviceUpdate.dll` — AppLoader engines (`LoaderOperationModelRpc`,
  `[DeviceIPControlChannel::update_device_software]`).

**Conclusion:** BBOS 7 is updated/flashed over the **OS-session Desktop
Channel** (VSP/modem port), not the raw BootROM. The 2014 "bootloader of the
kernel" bug lives on *that* path / the partition update, not in BootROM
channel0.

## 2. The CFP engine is inside `RIMDeviceManager.exe`

RTTI/decompilation shows namespace **`RIM_CFP`**: `Bootrom`, `RamImageMetrics`,
`HWVAdapter`, `HWVInterface`, `FilteredHWV`, `HardwareSpecifics`,
`FileImage`, `AppFileImage`, `FileImageEncryption`, `FileSystemHeader`,
`Mapping`, `DSPOS`. Ghidra decompiled 34 functions referencing these; they
parse/validate bootrom metrics, hardware-version (HWV) entries, MCT partitions,
and CFP file images.

## 3. RIM MCT flash partition map (recovered)

RIM's Memory Configuration Table partition names, recovered verbatim:

```
MCT_BOOT0_MMC            MCT_BOOT1_MMC          MCT_BOOTROM_NAND
MCT_BOOTROM_RESERVED     MCT_BOOTROM_SEC_NAND   MCT_BOOTROM_START
MCT_FLASH_CHIP           MCT_FLASH_CHIP_NAND    MCT_RAM_CHIP
MCT_NAND_CFG             MCT_ENHANCED_NAND      MCT_UMP_FIXED_NAND
MCT_MBR_NAND             MCT_MFG_NAND           MCT_BRANDING_NAND
MCT_CAL_BACKUP           MCT_CAL_WORKING        MCT_HWV_NAND
MCT_TEST_NAND            MCT_FS_NATIVE_NAND     MCT_FAT_FS_NAND
MCT_FS_FIXED / MCT_FS_FIXED_MINSTART / MCT_FS_FIXED_NAND
MCT_FS_DYNAMIC / MCT_FS_DYNAMIC_MINSTART / MCT_FS_DYNAMIC_NAND
MCT_OS_FIXED / MCT_OS_FIXED_005 / MCT_OS_FIXED_NAND
MCT_OS_DYNAMIC / MCT_OS_DYNAMIC_NAND
MCT_EFS_APPS_PARTITION   MCT_EFS_MODEM_PARTITION  MCT_OS_NV_NAND
MCT_OS_EXTENDED          MCT_DSP_OS               MCT_INSTALLER_NAND
MCT_INSTALLER            MCT_APPSTORE             MCT_BRANDING
MCT_BSN_REGION           MCT_BUGDISP              MCT_PASSWORD
MCT_HWV_ENTRY            MCT_MAPPING              MCT_ENTRIES
```

Notes for the boot-chain work:
- The **boot code** lives in `MCT_BOOT0_MMC` / `MCT_BOOT1_MMC` (eMMC boot
  partitions) plus `MCT_BOOTROM_*`.
- OS and radio are the `MCT_EFS_APPS_PARTITION` / `MCT_EFS_MODEM_PARTITION`
  filesystems; user data in `MCT_FS_DYNAMIC*`; `MCT_PASSWORD` holds auth.

## 4. Implications & next reversing steps

1. The productive attack surface is the **Desktop Channel update path** (how
   the AppLoader writes partitions), not BootROM channel0.
2. Reverse the `RIM_CFP` update/write functions in `RIMDeviceManager.exe` and
   `DeviceUpdate.dll` (the `LoaderOperationModelRpc` / `IDeviceImpl` methods)
   to recover the partition read/write commands — where a signature/verify
   weakness (the 2014 class) would live.
3. Cross-reference the recovered MCT names with `bblink`'s flash-region
   commands (`B4` flash regions, `D9` MCT, `F7` write, `C0 40` complete) to
   map which partition a given loader command targets.
4. The BootROM channel0 dead end can be parked unless we find the BBOS-specific
   first command (brute-force) — it is not the path RIM uses.

## 5. Artifacts

- Ghidra project / decompilation: `/tmp/opencode/ghidra_dm*`, script
  `ghidra_scripts/DumpRefs.java`.
- RIM host binaries: `rom/apploader/` (gitignored).
