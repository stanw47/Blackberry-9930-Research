# Session 14 — Complete hardware + software surface map

Date: 2026-10-04
Device: BlackBerry Bold 9930 (Montana), HW `0x05001204`, BBOS 7.1.0.1066,
platform 5.1.0.699.

Full inventory assembled from the `.sfi` **build flags**, the 548-module COD
dump, the event log, and the autoloader Loader Files.

---

## 1. Hardware (from `recon/sfi_build_flags.txt` — the `.sfi` compiler defines)

| Block | Evidence (build flag) | Notes |
|-------|----------------------|-------|
| SoC | `PROCESSOR_MSM7X30`, `PROCESSOR_FAMILY_QSD8K`, `CORE_SCORPION`, `NDK_ARCH=SCORPION` | MSM8655 = Snapdragon S2 / MSM7x30 family |
| CPU | `ARM_ARCH_VERSION=7`, `SoftVFP+VFPv3`, `L1/L2 cache` | single Scorpion |
| GPU | `DRIM_GRAPHICS`, `DRIM_EGL`, `DRIM_EGL_QCT8655`, `Adreno` | Adreno 205 |
| RAM | `RAM_768MB`, `DRIM_LPDDR2`, `DRIM_VIRTUAL_MEMORY`, `MMU_BASE_PID=40` | 768 MB LPDDR2 |
| Kernel | `NESSUS_KERNEL`, `NESSUS_KERNEL_VERSION=3`, `KERNEL_DATA_PROTECTION`, `NUM_SYSTEM_PROCESSORS=2`, `REXUSS` | RIM "Nessus" kernel (REX heritage) |
| Storage (eMMC) | `MMC_FLASH`, `SUPPORT_MMC_4_4_FEATURES`, `SUPPORT_MMC_PARTITIONS`, `DRIM_FS_DEVICE_MMC(_SECONDARY)` | 8 GB eMMC, boot0/boot1 partitions |
| microSD | `DRIM_SDCARD`, `SDCARD_USE_MMC/SDIO/SDMEM`, `DRIM_FS_DEVICE_SDCARD`, `DRIM_FATFS` | hot-swappable |
| Flash/NAND | `NAND_FLASH`, `NAND_MEMPOOL`, `DRIM_BLOCK_FS` | block device / FS layer |
| Filesystem | `DRIM_VFS`, `DRIM_FS`, `DRIM_FS_DEVICE_RAM_DISK`, `DRIM_FS_DEVICE_CACHE` | VFS + cache |
| Display | `DRIM_LCD_HW_CBABC`, `DRIM_BACKLIGHT`, `DRIM_GRAPHICS` | 640x480 |
| Touch | `DRIM_TOUCHSCREEN`, `DRIM_USB_TOUCHSCREEN_CHANNEL` | capacitive |
| Input | `DRIM_KEYPAD`, `DRIM_TRACKBALL`(?) | QWERTY + optical pad |
| PMIC | `DRIM_PMIC`, `DRIM_PMIC_RPC_API`, `DRIM_PMIC_REMOTE=0`, `DRIM_PMJET`, `DRIM_CRYPTO_BATTERY`, `DRIM_FUEL_GAUGE`, `DRIM_ANIMATED_BATTERY_...` | Qualcomm PMIC + PMJET |
| Sensors | `LIGHTSENSOR_HW_ISL29011`, `DRIM_PROXIMITYSENSOR`; modules `net_rim_bb_compass`, `net_rim_bb_magnetometercalibration_app` | ambient light (ISL29011), prox, accel, magnetometer |
| Audio | `QUALCOMM_AUDIO`, `DRIM_AUDIO_SOFTWARE`, `FORCE_DSP_AUDIO_LIB=30k` | Qualcomm DSP codec |
| Camera | `DRIM_CAMERA_NESSUS8K`; module `net_rim_bb_camera` | "Nessus8K" camera |
| Video | `QUALCOMM_VIDEO`, decoders H263/H264/MPEG4/WMV | Adreno/DSP |
| Audio codecs | `QUALCOMM_DECODER_*` AAC/AMR/EVRC/QCELP/FLAC/GSM610/MIDI/MP3/OGG/WAVE/WMA | |
| **WiFi + BT combo** | `DRIM_WLAN_TI`, `DRIM_WLAN_TI_TNETW127X`, `DRIM_BLUETOOTH_HW_TI`, `DRIM_BLUETOOTH_TI_127x_PG2_0`, `UART_HIGH_RATE=3686400` | **TI WiLink 127x (WL127x)** |
| WiFi bands | `DRIM_WLAN_BAND_A`, `DRIM_WLAN_BAND_BG`, `DRIM_WLAN_MHS`, `DRIM_WIFI_VOICE` | dual-band |
| **NFC** | `DRIM_NFC`, `DRIM_NFC_IC`, `RIM_NFC_IC_OPEN_NFC_PATH=4_3_0_1`, `RIM_NFC_IC_MIFARE_ULC_FORMAT_SUPPORT`, `FEATURE_RIM_NFC_SIM_POWER` | Open NFC stack + MIFARE controller |
| GPS | `gpsoffsets.bin` in `.sfi`; `net_rim_bb_gps_ee`; GNSS strings | integrated GNSS |
| **Modem/radio** | `DUALMODE_CDMA_GSM`, `FEATURE_RIM_CDMA`, `DRIM_EVDO_MODEM`, `RADIOCODE_QUALCOMM`, `DRIM_RADIO_FAMILY_DENALI`, `REMOTE_THREADS=QC_MODEM` | **dual-mode CDMA/GSM (Denali)** |
| USB | `DRIM_USB`, `DRIM_HS_USB`, `DRIM_USB_MS`, `DRIM_USB_MTP`, `DRIM_USB_SERIAL_FOR_QC`, `USB_CORE_MSM_CI`, `DRIM_USB_DETECT_HOST_TYPE` | HS USB peripheral |
| NV/secure | `BSN_USES_NVRAM`, `DRIM_ENCRYPT_NV_RECORDS`, `DRIM_NVRAM_CROSS_CORE_API`, `RIM_RO_CHKSUM`, `MSM8K_BOOTROM_BINDING`, `BOOTROM_LINK_ADDRESS=0x80000000` | NV records **encrypted**; signed boot binding |
| Crypto/RNG/DRM | `DRIM_PKCS11`, `DRIM_RNG`, `DRIM_JANUS_DRM`, `NESSUS_TLS`, `VPN_SBIPSEC_VER=3_2` | PKCS#11, RNG, DRM, TLS, IPSec VPN |
| Smartcard | modules `net_rim_smartcard_{piv,datakey,gsacac}`, `net_rim_bb_smartcardreader_microSD` | CAC/PIV/SafeNet drivers (`self-upgrade`) |
| Vibrator/TTS/VAD | `DRIM_VIBRATOR`, `DRIM_TTS`, `DRIM_VAD` | |

Processor family: `PROCESSOR_MSM7X30` / QSD8K. `.sfi` is the **AMSS modem**
image (`RIM_IMAGE_FOR_AMSS=1`, "camcdg08/elchara.qualcomm.com" build hosts).

## 2. Software surfaces we can touch

**USB (host side):**
- BootROM `0001` (channel0; ~1 cmd then locks), bootloader `0004` (rarely
  enumerates), OS `8004` (classic socket protocol, full read of properties).
- Classic ops verified: `SELECT_MODE`, `OPEN_SOCKET`, `ECHO`,
  `FETCH_ATTRIBUTE` (serial/metrics/PIN), + raw `data`/`DB` available.
- No flash primitive; HTTP update behind the proprietary **Patriot tunnel**
  (`SRIM`/`SRPClient`); RIM AppLoader available locally.

**Java / app layer:**
- Install **unsigned apps** via `javaloader`/Barry (run with permission
  prompts; **no** autostart/system/controlled APIs — RRT wall).
- App-facing APIs present: `net_rim_accessory_api`, `net_rim_bb_framework_api`,
  `net_rim_bb_phone_api`, `net_rim_contentsharing_api`, `net_rim_convenience_key_api`,
  `net_rim_bb_lbs_api_3` (location), `net_rim_bb_maps_api`, `net_rim_bb_toolkit_api`,
  `net_rim_bb_payment_lib`, `net_rim_bb_crypto_api`, `net_rim_bb_web_jse_api`,
  `net_rim_wlan_apps_api`, `net_rim_bb_bbid_api`, …

**Protocol/service surfaces (external input):**
- Browser/WebKit (`net_rim_bb_browser_*`, `OlympiaWebKit` in `.sfi`), media
  codecs (Qualcomm decoders), Bluetooth (`net_rim_bluetooth`), WiFi
  (`net_rim_wlan_*`), NFC (`net_rim_nfc`, Open NFC), GPS/LBS, smartcard
  (CAC/PIV), microSD/FAT, BIS/BES/BBID, VPN/IPSec, MAP/OBEX, DRM (Janus).
- Event log (read), `ApplicationRegistry`, `PersistentStore`.

**Filesystem (OS mode):** user partition (writable, unsigned), microSD.

## 3. Autoloader / Loader Files inventory

`rom/9930AllLang_v7.1.0.163_P5.1.0.137/`:
- `Java/` — **2108** `.cod` modules; `CDMA/rim0x05001204.sfi` (signed radio).
- `.alx` manifests (core `BlackBerry.alx`), `PkgDBCache.xml` — **106 packages**
  (5 **system**, 25 **required**, 67 **library**; flags `hidden/required/
  library/system/self-upgrade`), `specification.pkg`.
- Everything flashed is **signed**: Java CODs (**RRT**), radio `.sfi`
  (**RIMOS-ECC-SHA512/256**, session11). No unsigned executable payload exists
  in the Loader Files; the `.alx`/`PkgDBCache` are host-side metadata only.

## 4. Ranked opportunities (current best assessment)

1. **Unsigned-app install + a JVM/native or trust bug** — the only
   *software* route to privilege. Candidate weak spots to audit next:
   `net_rim_bb_sbinjector_lib` (**encrypted `*.sbr.ykz` resources** — a
   resource/logic injection mechanism), `net_rim_bb_autolaunchhandler_app`,
   `net_rim_bb_autostartselector`, `net_rim_bb_appworld_*` (installer),
   `net_rim_bb_applicationdelivery`, `net_rim_bb_safe_mode`.
2. **External-input parsers** (browser/WebKit, media codecs, NFC, BT, MAP/OBEX,
   smartcard) — memory-corruption bugs reachable without signing. WebKit is the
   richest; the `OlympiaWebKit` binary is even in our `.sfi` for offline RE.
3. **Modem/AMSS (Denali)** — the baseband is a separate, historically
   exploitable CPU; `RIM_IMAGE_FOR_AMMS`, `RADIOCODE_QUALCOMM`. Reversing the
   `.sfi` ELFs (session09) is offline and possible.
4. **Writable user partition** — persist data; matters only if a signed module
   trusts it (see #1).
5. **Bootloader (2014)** — still the direct root path, but the loader session is
   blocked (BootROM locks; HTTP behind tunnel).

## 5. Artifacts
- `recon/sfi_build_flags.txt` (385 hardware/platform defines).
- `.sfi` component map: `recon/sfi_structure.txt` (session09) +
  `OlympiaWebKit`, `NFC_java`, RAM/bus init `.bin`s, modem decoders.
- Coddec patched (`tools/coddec-null-routine.patch`) for module decompilation.
