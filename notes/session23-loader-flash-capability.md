# Session 23 — Application Loader has full flash/partition capability

Date: 2026-10-04
Survey of the host Application Loader stack (`rom/apploader/`) for a
write primitive that would let us flip NVS property `0x32` (signing bypass)
or write a modified image.

---

## 1. The stack we have

`rom/apploader/` (from the BBOS installer):
- `Loader.exe` (11 MB) — Application Loader UI + operations.
- `LoaderClient.dll` — COM/RPC client (`LoaderRpc*`).
- `DeviceUpdate.dll` — device/transport layer.
- `CE.dll` — contains `ECDSA_Verify_Message` (host-side signature verify).
- `USB Drivers/RimUsb.sys` (64 KB) + `RimUsb_AMD64.sys` + `RimUsbNT.inf`.
- `Device.xml` / `Vendor.xml`.

## 2. Loader capabilities (from `Loader.exe` strings)

Full factory/engineering flash tooling:
```
PagePartition, PageErase, PartitionCtrl, RestoreEmmcFileOverwriteDlg
RIM_CFP::UMPFilePartition        (CFP image/partition writer)
Asynchronous Flash Read/Write Test, Block Erase Error
BOOT_FLASHID, Boot0 MMC / Boot1 MMC block ranges
ACTIVE MCT NAND: 0x%08X-0x%08X
CRYPTED_FLASH_DUMP (and CDUMP_ERROR_CODE)
Could not resize OS partition of MCT / FS partition resize
Could not set patriot flash image length
```
COM interfaces (`LoaderClient.dll`): `LoaderRpcDevicePartitionOptions`,
`LoaderRpcDeviceProvisionOptions`, `LoaderRpcDeviceSaveOptions`,
`LoaderRpcDeviceUpdateOptions`, `LoaderRpcModule`, `LoaderRpcPasswordRequest`.

=> The loader can **read/write/erase partitions, dump flash, and resize
FS/OS partitions**. That is exactly the write primitive needed.

## 3. Transport (the blocker)

`DeviceUpdate.dll` implements two transports:
- `usb_transport` / `usb_device` / `usb_manager` (`desktop_device_connection`).
- `DeviceIPControlChannel` — HTTP-CGI control channel (login/challenge/
  dynamicProperties/update) reached over the **Patriot tunnel** (session 11).

`RimUsb.sys` source path: `...\driver\rimusbbulkrwr.c` — a **bulk read/write**
driver. The framing/protocol lives in `Loader.exe` and the device firmware,
not in the driver.

So the loader operations ride either:
1. the **IP control channel** (HTTP CGI) over the proprietary Patriot USB
   tunnel (blocked on Linux, session 11), or
2. a **direct USB bulk protocol** (RimUsb) whose framing is in `Loader.exe`.

## 4. Implications

- If we reverse `Loader.exe`'s USB bulk framing (the `rimusbbulkrwr`
  protocol), we get a **flash read/write primitive from Linux** without the
  Patriot tunnel. That would let us:
  - read the OS native image and NVS (analysis), and
  - write the NVS to set property `0x32 = 0` -> **unsigned COD loading**
    (session-17 bypass), or write a modified partition.
- The device-side CFP/`.sfi` signature still applies to OS images, but the
  **NVS is not signed**, so an NVS write is a viable root path.

## 5. Recommendation

Two self-contained fronts remain; both are multi-session:
- **A. Browser exploit** (WebKit/JSC): deterministic trigger via SD
  `file://`, all engine internals mapped; needs a bug + weaponization.
- **B. Loader USB protocol** (`Loader.exe` + `RimUsb.sys`): bounded RE that,
  on success, yields a flash/NVS write primitive and thus the signing bypass
  directly.

B is more deterministic in outcome (a working loader = write primitive),
A is more self-contained (no host USB RE). Given the fully-understood
post-exploit step, **B has the shorter path to root** if the USB framing is
reversible; A is the fallback.

## 6. Artifacts
- `rom/apploader/` (gitignored) — Loader.exe, LoaderClient.dll,
  DeviceUpdate.dll, CE.dll, `USB Drivers/RimUsb*.sys`.
