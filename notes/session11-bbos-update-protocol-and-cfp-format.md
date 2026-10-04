# Session 11 — BBOS update protocol = HTTP CGI, and the CFP firmware format

Date: 2026-10-04

Reversing `RIMDeviceManager.exe` (Ghidra) revealed how RIM actually updates /
flashes a BBOS 7 device — and it is **not** the BootROM channel0 protocol.

---

## 1. The update path is HTTP over the device link

Class `DeviceIPControlChannel` implements `sendWebRequest` with the Windows
**WinHTTP** API (`WinHttpOpen` → `WinHttpConnect` → `WinHttpOpenRequest` →
`WinHttpSendRequest` → `WinHttpReceiveResponse` → `WinHttpQueryDataAvailable` →
`WinHttpReadData`). It talks to the device's embedded web server
(`User-Agent: RQNXWebClient/1.0`; `Content-type: application/octet-stream` for
image upload; `multipart/` for form uploads).

### Endpoints (UTF-16 strings)

```
/cgi-bin/            login.cgi        dynamicProperties.cgi        update.cgi
Auth/  AuthChallenge/  Auth/Smb/  DynamicProperties/
DeviceStatus/  DeviceVolumes/Volume  DeviceStatus/IsFullyBooted
RimTabletResponse/
```

### Commands / flow (from the strings and decompilation)

| Phase | Endpoint | Command | Notes |
|-------|----------|---------|-------|
| Login | `login.cgi` | `AuthenticationChallenge` → device returns challenge | `CUSBChannel::_deviceLogin` sends "desktop version" first |
| Auth | `login.cgi` | `ChallengeResponse` (hex-encoded) | device password challenge; `challenge_data`, `PasswdChallenge` |
| Info | `dynamicProperties.cgi` | `DynamicProperties` | returns device properties (`<DeviceStatus>`, `<DeviceVolumes>`) |
| Flash | `update.cgi` | `UpdateStart` | begins an upload |
| Flash | `update.cgi` | `UpdateSend` | uploads the image (`Uploading bar file: %S`) |
| Flash | `update.cgi` | `UpdateEnd` | commit / verify |

Password prompt UI: `Please enter the password for your device (%d/%d).` and
`Please enter your device password (%1!d!/%2!d!).` — matches the PlaidCTF
password path (session02).

`DeviceIPControlChannel` is reached via `RIMDeviceManager` → `RIMDesktopChannel`
→ `IControlChannelConnection`; i.e. HTTP is tunnelled over RIM's USB Desktop
Channel (the "Tunnel Manager"/"NCM Driver" pair seen in the host software list).

## 2. The CFP firmware engine (namespace `RIM_CFP`)

`RIMDeviceManager.exe` contains RIM's **CFP** ("Common Firmware Package"?)
parser/writer. Classes:

```
Bootrom  MemoryConfigTable  MemoryMap  MemoryRegion  Mapping
FileImage  OSFileImage  RamImageFileImage  SignedFileImage  AppFileImage
FileImageEncryption  FileSystemHeader  HWVersioning  HardwareSpecifics
HWVInterface  FilteredHWV  HWVAdapter  RamImageMetrics  DSPOS
```

Format strings:

```
CFP Version:       0x%X
Format Version:    %d.%d.%d.%d
RamImage (Format Version %d.%d)
Code signature table has %d entries.
Checksum:   0x%08x  Time Stamp: 0x%08x
API Checksum:      0x%08X
RAMIMAGE_LIB_VERSION mismatch or decompression failure
(STP ramimage)
```

`RamImage` matches the `rim0x05001204.sfi` we extracted (session08/09): the
`.sfi` **is a CFP/RamImage file**, with a **code signature table** and a
`SignedFileImage` class doing the verification. This is the "bootloader of the
kernel" signature boundary named in the 2014 advisory.

## 3. The actual flasher: `rimprogram.dll`

`FUN_004c9e10` reads `HKLM\Software\Research In Motion\AppLoader\Path` and
resolves **`rimprogram.dll`** (and `Loader.exe`). `rimprogram.dll` is RIM's
low-level flash programmer (host side), driven by the AppLoader. It is **not**
in the OS-installer's `AppLoader/` folder here — it ships with the BlackBerry
Desktop Software / device manager stack. The `RIM_CFP` code above is the
format/partition layer used to build the images `rimprogram.dll` writes.

## 4. Flash partition map (session10)

`MCT_BOOT0_MMC`, `MCT_BOOT1_MMC`, `MCT_BOOTROM_{START,RESERVED,SEC_NAND,NAND}`,
`MCT_EFS_APPS_PARTITION`, `MCT_EFS_MODEM_PARTITION`, `MCT_OS_NV_NAND`,
`MCT_FS_{FIXED,DYNAMIC}[_NAND]`, `MCT_INSTALLER`, `MCT_PASSWORD`,
`MCT_HWV_{NAND,ENTRY}`, `MCT_CAL_{BACKUP,WORKING}`, … — boot code lives in
`MCT_BOOT0_MMC`/`BOOT1_MMC`.

## 4b. CFP signature record format + verifier (the wall)

The CFP image carries up to three signature records, each located by a 32-bit
tag; `FUN_004a75f0(payload, tag, out)` extracts them, `FUN_004a7990(this,type,..)`
verifies, returning 0 = valid:

| type | tag | record size | algorithm |
|------|-----|-------------|-----------|
| 0 | `0xD7C82D1F` | 0x80 | RSA |
| 1 | `0xC6B71C0E` | 0x88 | EC521-SHA-256 |
| 2 | `0xB5A60BFD` | 0x88 | EC521-SHA-512 |

(The tags appear in the decompiler as signed immediates `-0x2837d2e1`,
`-0x3948e3f2`, `-0x4a59f403`.) Verification hashes the image (SHA-256 or
SHA-512) and calls the ECDSA verify helper; there are status strings
`... signature: Valid! / Invalid! / Not signed. / Not supported by build.`
`SignedFileImage` owns the public keys.

**This matches `bblink.dummy_sig()` exactly** — it already seeds `0xD7C82D1F`,
`0xC6B71C0E`, `0xB5A60BFD` at their record offsets. So the host-side byte
layout is known; the wall is the RSA/ECDSA verification itself (and whatever
the *device* enforces at boot).

Record layout (`FUN_004a75f0`): at the tag offset `T`, `[T] = tag`, `[T-4] =
tag` again, `[T-0xc] = record size` (`0xbc` for EC521, `0xb4` for RSA); the
record body begins at `T-4-size`. Verification path:
`FUN_004a7990(type)` → locate record → hash image (`FUN_004aef50` = point/
public-key decompress) → ECDSA verify (`FUN_004aee00`, a P-521 bignum routine).
The initial format checks (`image len < 0xb8`, `> 0x173`, `0x22f`) bound the
signature-table region.

### Gate semantics (suspicious by design)

- `FUN_004a7360(type)` = "is this record signed?": returns **1** if the
  signature bytes (`key+0x28`, `0x80`/`0x88` long) contain any non-`0xFF` byte,
  else **0** ("not signed" = all `0xFF`).
- `FUN_004a7990`: if **not forced** (`arg2==0`) and `FUN_004a7360` says "not
  signed", it **skips verification** and falls through (`goto default`).
- Top-level CFP gates `FUN_004a2620` / `FUN_004a5240` call
  `FUN_004a7990(this, 4, 1)` — forced, and **type 4** is a fallback chain:
  verify EC521-SHA512; if it yields `0x1b`, try EC521-SHA256; if that yields
  `0x1b`, try RSA.

So the scheme is "one of RSA / EC521-SHA256 / EC521-SHA512 must verify", with a
"not signed" (all-`0xFF`) escape path that skips the check entirely unless the
caller forces it. This is exactly the kind of logic where the 2014 "load a
modified kernel" weakness would sit — worth a focused audit against the device's
own boot-time check.

## 4c. `rim0x05001204.sfi` component inventory (parser output)

`tools/parse_cfp.py` decodes the CFP structure (saved to
`recon/sfi_structure.txt`):

- 2× code/load blocks (`D7A82D1F`), a `D7B02D1F` table, a `D7CC2D1F` address
  table, 6× `D7C82D1F` signature records (size `0xB4`, ver `0x00010001`).
- Signature algorithms present: **`RIMOS-ECC-SHA512`** and
  **`RIMOS-ECC-SHA256`** at `0x39E5090`, `0x3A738EC`, `0x4A92664` (+256 twins).
- Named components (30): RAM/bus init tables (`d.load.bin`, `ebi0/1_cs0/1.bin`,
  `imem.bin`, `iram.bin`, `mdspram{a,b,c,i}.bin`, `mdspregs.bin`,
  `adspram{a,b,c,i}.bin`), runtime bits (`xtra.bin`, `gpsoffsets.bin`,
  `timers.bin`, `hdr_heap.bin`, `qpimscommon.bin`, `qdi_oem.dll`,
  `qpdplcommon.bin`, `vscr_res.bin`), and ELF payloads **`NFC_java.elf`**,
  `NFC_java.nometrics.elf`, **`OlympiaWebKit.elf`**, **`OlympiaWebKitLDLL.ldll`**,
  `SaaS.elf`.

So the radio image is a signed container of named ELF/BIN components, each
covered by the CFP signature records.

## 5. Why this matters for the goal

- The **real, RIM-blessed flashing path** is HTTP-CGI `update.cgi` + CFP images,
  not the BootROM. Our BootROM channel0 dead end is a side quest.
- The 2014 "load a modified kernel" weakness should live in this path:
  `SignedFileImage` verification / the CFP code-signature table, or the
  `update.cgi` UpdateStart/Send/End handling.
- The `.sfi` we already have is a CFP/RamImage — so we can parse/emit CFP and
  compare the signature table against what the device/`rimprogram` enforces.

## 6. Concrete next steps

1. **Parse the CFP `.sfi`** using the recovered layout (header magics
   `D7A8/D7B0/D7CC/D7C82D1F`, signature records "RIMOS-ECC-SHA512",
   `Code signature table`) — build a CFP reader and dump the signature table.
2. **Recover `rimprogram.dll`** (BlackBerry Desktop Software / AppLoader
   package) and reverse the actual flash-write + verify sequence.
3. **Reach the HTTP server**: determine how the Desktop Channel tunnel is
   framed over USB (vendor iface `ff/01/ff`, EPs `81/01`,`82/02`) — mirror the
   `barry` tunnel implementation — so `login.cgi`/`update.cgi` can be driven
   from Linux.
4. Cross-check the CFP signature check vs the 2014 advisory ("modified kernel"
   allowed) — find the exact weakening.

## 7. Artifacts

- `/tmp/opencode/rim_flash.out`, `rim_bootrom.out` (Ghidra decompilation)
- Ghidra project `/tmp/opencode/ghidra_dm` + `ghidra_scripts/DumpKey.java`
- RIM binaries: `rom/apploader/` (gitignored)
