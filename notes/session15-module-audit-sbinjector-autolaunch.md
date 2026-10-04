# Session 15 — Module audit: sbinjector, autolaunch, app-delivery

Date: 2026-10-04
Offline audit of the top-ranked candidate modules (session14 §4), using the
patched coddec (session13).

---

## 1. `net_rim_bb_sbinjector_lib` — resource bundle, not an injector

The `.cod` (615 KB) contains **only** `com.rim.resources.
net_rim_bb_sbinjector_libRIMResources` + `RIMResourcesPopulator0..9`. No logic
classes. It registers resources named like `3701248.sbr.ykz`,
`1073745968.sbr.ykz` (address-shaped) whose values are encrypted blobs.

Referenced by `net_rim_bb_browser_lib` (and itself). So "sbinjector" is a
**resource supply** for the browser ("sbr" = sub-resource), not a
code/resource-injection primitive. **Not a promising vector.**

## 2. `net_rim_bb_autolaunchhandler_app` — device-switch / SD-backup launcher

`AutoLauncher.launch()`:
- creates a `Transcoder` (crypto) StorageSystem rooted at
  `DeviceSwitchControl.SD_CARD_ROOT_DIR`,
- if `MediaCardBackup.doesBackupExist(sd)` && `!alreadyRestored(sd, DeviceInfo.getDeviceId())`
  → `launchDeviceSwitch()` → runs **`net_rim_bb_deviceswitch_app`** via
  `ApplicationManager.runApplication(...)`,
- else → `launchTC()` → `BISClientInvoke.runBackgroundClient(["BBIDLOGIN"])`.

So a **signed system module parses an unsigned backup from the SD card** at
boot. If the **DeviceSwitch restore** path trusts/installs content from that
backup without verification, it is a candidate entry (malicious SD backup →
restore). Next: reverse `net_rim_bb_deviceswitch_app` + `MediaCardBackup`
format. Note the same pattern as the BB10 root (signed code consuming unsigned
user content).

## 3. `net_rim_bb_applicationdelivery` — push-install service + test dialog

- `ApplicationDeliveryBackdoorDialog` (the name is RIM's internal test UI, not
  a hidden backdoor): sets the "Application Install Delay" via
  `ApplicationDeliveryTransmissionService.testSetInstallDelay(...)`; only
  active when that service is running.
- The service (`ApplicationDeliveryTransmissionService`) is the app-push
  transport (`TransmissionServiceManager`, token `-4198074063353182686`). This
  is the OMA-DM/FUMO "app delivery" lane (`net_rim_bb_fumoPokeLib`,
  `net_rim_bb_omadmcertificate`). Candidate for an install/trust bug, but
  delivery is normally signed.

## 4. Ranked next targets (updated)

1. **`net_rim_bb_deviceswitch_app` + SD-card backup format** — the concrete
   "signed app imports unsigned content" lead (session15 §2).
2. **`net_rim_bb_applicationdelivery` / FUMO / OMA-DM** — app-push/install
   trust path.
3. **External parsers** — WebKit (`OlympiaWebKit` ELF in `.sfi`, offline),
   media codecs, NFC, BT/MAP.
4. Modem/AMSS (Denali) `.sfi` ELFs.

## 5. Artifacts
- Decompiled modules under `/tmp/opencode/decomp/decompiled/...`.
- `AutoLauncher`, `AutoLaunchHandler`, `ApplicationDeliveryBackdoorDialog`
  reviewed above.
