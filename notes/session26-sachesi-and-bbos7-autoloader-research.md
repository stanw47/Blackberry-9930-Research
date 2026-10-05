# Session 26 — Sachesi & BBOS 7 autoloader research

Date: 2026-10-05
Goal: understand the Sachesi "modify userland, still installs" technique and
whether an equivalent exists for BBOS 7.

---

## 1. Sachesi (BB10 / Playbook) — what it actually does

Source: github.com/xsacha/Sachesi (GPL3, released 2014, "Dingleberry" lineage).

- **Splits autoloaders** (`splitter.cpp`): a BB10 autoloader `.exe` is a
  container with a **cap** boot part, a separator, an 80-byte password
  placeholder, an **offset table**, then N images. Each image has a `pfcq`
  header and a type char:
  - `5` = **PACKED_FILE_USER  (userland — UNSIGNED)**
  - `6` = PACKED_FILE_OS      (signed)
  - `12` = PACKED_FILE_RADIO  (signed)
  - `8` = PACKED_FILE_IFS
  - else PINList
- **Repackages autoloaders** (`autoloaderwriter.h`): writes cap + separator +
  password placeholder + offset table + the chosen images. This is the
  "re-sign" (repackaging, *not* re-signing with RIM keys).
- **No developer mode needed**: it mimics the official tool's commands over
  the device's USB/network channel (`installer*.cpp`), including an
  **AES-128-CBC** authenticated session (`installer_auth.cpp`: `AESEncryptSend`
  with a session key, `authorise()` sends a hashed password, keep-alive,
  challenge).
- **The key property**: the device verifies the **signed** images (OS/Radio)
  but **not** the **User/userland** image — so the userland can be modified and
  flashed while the autoloader still installs.

## 2. BBOS 7 autoloader — structure (we have one)

`~/Downloads/9930cmpttAMEA_PBr7.0.0_rel1739_PL5.0.0.552_A7.0.0.374.exe`
(198 MB, PE32 self-extracting installer):
- PE sections end at `0xF8C00`; the remaining ~197 MB is the packed firmware.
- The appended data is **encrypted/packed** (no plaintext `net_rim_*`, `.cod`,
  `.sfi`, `pfcq`, or AllLang strings). One stray `DEC0FFFF` at `0xAD335C`.
- At `0xF8C00`: `NB10` magic + a PDB path `...\Setup___Win32_Release\setup.pdb`
  (the installer's own code), so the firmware blob follows/embeds later.
- The **extracted** content is what we already have in
  `rom/9930AllLang_v7.1.0.163_P5.1.0.137/`: `Java/` (2108 CODs), `CDMA/
  rim0x05001204.sfi`, and `apploader/` (Loader.exe + DeviceUpdate.dll +
  BbDevMgr.exe + USB drivers).

=> Unlike BB10, the BBOS 7 autoloader has **no `User`/userland image**. Its
   two signed artefacts are the Java CODs (signature-checked at install;
   confirmed `0x6F`) and the CFP `.sfi` (ECDSA P-521).

## 3. Does the Sachesi trick map to BBOS 7?

- The BB10 `User` image is a whole **userdata partition**; BBOS 7 has no such
  flashed image — user data lives in NVS/FS partitions that the autoloader
  preserves (not carries).
- The nearest BBOS 7 analogue of "userland" is the **third-party app CODs**
  (DocsToGo, Facebook, App World plugins, games) that ship alongside the OS
  CODs in `Java/`. If the device treats those as userland and does not
  RIM-signature-check them, a modified third-party COD would install.
- Live test in progress (needs one clean session per boot): install a modified
  `MobileMarket_LibPlugin.cod`. Result so far inconclusive (session desync).

## 4. Other BBOS 7 observations
- The autoloader's `Java/` set includes third-party apps; the modding community
  ("hybrid OS") historically only mixed **RIM-signed** CODs from different OS
  versions, which does not bypass signing.
- The `.sfi` is a CFP/RamImage signed with ECDSA P-521; the host-side CFP
  verifier has a "not signed -> skip" path (session 11), but the device-side
  behaviour (SBL `boot_auth_if`) is unconfirmed.

## 5. Next tests
1. Clean session: install MODIFIED third-party COD (`MobileMarket_LibPlugin`,
   `DocsToGo`) -> `0x64` = userland unchecked (root), `0x6F` = checked.
2. If checked: unpack the autoloader `.exe` to look for any unsigned region.
3. Revisit the `.sfi` SBL verifier for the "not signed -> skip" flaw.

---

## 6. Third-party app test result (live)

Modified `MobileMarket_LibPlugin.cod` (third-party, 1288 B) via the JavaLoader:
SET_COD_SIZE ACK, SEND_DATA -> **0x6F** (signature rejected), same as a RIM
system module.

=> BBOS 7 signature-checks **all** CODs (system and third-party); the
   "userland app" analogue is closed. The Sachesi `User`-image trick has no
   BBOS 7 equivalent because BBOS 7 autoloaders carry no unsigned image.

### Remaining autoloader-related angles
1. The `.sfi` (CFP/RamImage) is signed ECDSA P-521; the **host-side** CFP
   verifier has a "not signed -> skip" path (session 11). If the **device-side**
   SBL (`boot_auth_if`) shares it, a modified `.sfi` (all-0xFF signature
   records) would boot -> custom native code in the `.sfi` app component.
   Delivery is the blocker (update.cgi / Patriot tunnel).
2. Unpack the autoloader `.exe` to check for any unsigned region.
