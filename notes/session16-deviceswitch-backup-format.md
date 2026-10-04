# Session 16 — DeviceSwitch SD-card backup format & crypto

Date: 2026-10-04
Reverse of the session15 §2 lead: `net_rim_bb_deviceswitch_app` +
`net_rim_device_switch_service_impl` + the `MediaCardBackup` SD-card format.

## 0. Tooling fix (coddec)

Two more null-member NPEs in `DataSection.java` blocked the DeviceSwitch
modules. Extended `tools/coddec-null-routine.patch`:

- `_foraBIV` (DataSection.java:857) — `MemberRef.getMember()` null.
- `update_staticFieldsFixupTable` (DataSection.java:1000) — same.
- Guard: `if (r1 == null) continue;` before dereference.

Rebuilt under `/tmp/opencode/coddec/out`. `net_rim_bb_deviceswitch_app`,
`net_rim_device_switch_service_impl`, `net_rim_device_switch_service_api`
now decompile.

## 1. Top-level storage is PLAINTEXT

`AutoLauncher.launch()` (net_rim_bb_autolaunchhandler_app):

```
type = 2 (NULL_TRANSCODER), mode = 1, key = null
sd   = StorageSystemFactory.create(1, DeviceSwitchControl.SD_CARD_ROOT_DIR, tran)
if (MediaCardBackup.doesBackupExist(sd) && !alreadyRestored(sd, DeviceInfo.getDeviceId()))
    launchDeviceSwitch()      // runs net_rim_bb_deviceswitch_app
else
    launchTC()                // BISClientInvoke BBIDLOGIN
```

`DeviceSwitchControlImpl.getStorageSystem()` also uses
`SecurityController.getNullTranscoder()`. So the outer storage system is
**unencrypted**.

## 2. `MediaCardBackup` on-disk (plaintext) format

All via the NullTranscoder `StorageSystem` at `SD_CARD_ROOT_DIR`:

- `backup.info`
  - `int len`, `byte[len] sessionSummary`, `byte flag`,
    `if flag==1: int deviceId`
  - read by `isBackupFromThisDevice`, `readSessionSummary`.
- `restored.info`
  - zero or more records: `byte type (==2)`, `int deviceId`
  - `alreadyRestored()` treats it as a set of restored device IDs;
    `restoreComplete()` appends `type=2, deviceId` if not present.
- backup payload files: written by the session via the backup transcoder.

There is no MAC on `backup.info`/`restored.info`; only the payload is
encrypted.

## 3. Payload crypto (`SecurityController`)

Backup session:
```
_backupKey        = KeyFactory.createRandomKey(1)      // 32 random bytes
_backupTranscoder = TranscoderFactory.create(1, 2, _backupKey)  // key-based, AES
_salt             = RandomSource.getBytes(32)
_passwordTranscoder = createPasswordTranscoder(userPassword, _salt)
   -> createPasswordKey(1, pw, salt) -> PBKDF1(SHA-256, 20000 iters)
   -> TranscoderFactory.create(1, 3, derived)
```
Security file (hard-coded name literal `"597f3b8af817088b"`), via
`writeToStream`:
```
byte 1
int  saltLen, byte[] salt
int  encKeyLen, byte[] passwordTranscoder.encode(_backupKey)
```

Restore session (`readFromStorage`):
```
fields = readFromStream(secFile)          // salt + wrapped backup key
loop:
  pw  = AuthorizationSource.getPassword() // user dialog
  pt  = createPasswordTranscoder(pw, salt)
  ok  = pt.decode(wrappedKey)             // CRC32 check only
  if ok: _backupKey = pt; _backupTranscoder = create(1,2,_backupKey); done
  else: reprompt
```
`TranscoderImpl.encode/decode` -> `EncryptionUtilities.encrypt/decrypt`
(native RIM crypto, keyed AES-like) with an `IntHashtable` carrier holding a
CRC32 for the retry check.

## 4. Authorization is always interactive

`AuthorizationFactory.create(1)` is the only case ->
`AuthorizationSourceImplFromUser`, which raises
`DeviceSwitchPasswordDialog` (`createBackupPassword`/`requestBackupPassword`).
There is **no** non-interactive/device-key authorization source.

## 5. Restore target = `SyncManager` SyncCollections

`BackupRestoreController` is a thin wrapper over
`net.rim.device.api.synchronization.SyncManager`
(`getOTAEnabledSyncCollectionNames`, `getPLRestrictedSyncCollectionNames`,
`getMemoryRequiredForBackup`). The payload records are fed to the same
`SyncCollection` interfaces Desktop Manager uses (PIM, options, etc.).

## 6. Assessment

- The outer container (`backup.info`, `restored.info`) is unauthenticated
  plaintext, but only gates the launcher.
- The encrypted payload key is wrapped by a password-derived PBKDF1 key and
  the restore path **always prompts for a user password**. An attacker who
  controls the SD card can pick the password (victim must type it), so a
  crafted backup can inject arbitrary **data** into SyncCollections.
- Those collections are **Java** (memory-safe). So this is a
  data-injection/settings-tamper path requiring social engineering, **not a
  code-execution primitive**.
- Verdict: deprioritise for root. Keep as a secondary "signed app imports
  attacker data" case study; the crypto itself is sound (PBKDF1-20000,
  random per-backup key, CRC32 is non-security only).

## 7. Artifacts

- Decompiled:
  `/tmp/opencode/decomp/.../net_rim_bb_deviceswitch_app/...`
  `/tmp/opencode/decomp/.../net_rim_device_switch_service_impl/...`
- Key classes: `MediaCardBackup`, `SecurityController`, `TranscoderImpl`,
  `KeyFactory`, `AuthorizationFactory`, `AuthorizationSourceImplFromUser`,
  `DeviceSwitchControlImpl`, `BackupRestoreController`,
  `SessionControl`, `AutoLauncher`.
- Patch: `tools/coddec-null-routine.patch` (updated).
