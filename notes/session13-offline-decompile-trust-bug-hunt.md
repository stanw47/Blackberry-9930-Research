# Session 13 — coddec fix + offline trust/permission audit

Date: 2026-10-04
Goal: offline hunt for a signed-module trust/sandbox bug (the BBOS analogue of
the BB10 root) using the COD dump.

---

## 1. Decompiler toolchain fixed (coddec)

`coddec` (george-hopkins) is the COD→Java decompiler. It built cleanly with
`javac` (JDK 25, 254 sources) but crashed (`NullPointerException`) on several
security modules. Root cause: `Code.disassemble` dereferenced a **null
`Routine`** object (`getObjectRef` returned null for an obfuscated member).

Fix (2 lines in `src/net/rim/tools/compiler/codfile/Code.java`, disassemble
`case 1`): null-guard the routine before use. After the patch, the previously
empty modules decompile:

```
net_rim_bb_application_permissions_proxy  -> ApplicationPermissionsProxy*
net_rim_bb_trust_application_manager       -> TrustApplicationManager*
net_rim_bb_application_daemon              -> ok
net_rim_bb_ams_enforcement_impl            -> ok (ApplicationBanEnforcer …)
net_rim_app_manager / bb_application_monitor -> ok
```

Build:
```
git clone https://github.com/george-hopkins/coddec
javac -nowarn -d out $(find src -name '*.java')
java -cp out net.rim.tools.a.coddec <module>.cod
```

## 2. What the trust/permission modules actually are

- **`ApplicationPermissionsProxy`** (`net_rim_bb_application_permissions_proxy`)
  — the *permissions UI/screen*: uses `ApplicationRegistry`,
  `ControlledAccess(<descriptor>, CodeSigningKey.getBuiltInKey(51))`,
  `BugReportManager`. It is the dialog that grants per-app permissions; not an
  enforcement bypass.
- **`TrustApplicationManager`** (`net_rim_bb_trust_application_manager`) — the
  *"trust this application?" startup dialog*: reads `ApplicationTrustData` via
  `ApplicationTrustLevelManager.getAndRemoveApplicationStartup()` and calls
  `setApplicationTrustLevel` / `ApplicationManager.runApplication`. It decides
  whether an app may start / run a UI, not whether it is RIM-signed.
- `ApplicationBanEnforcer` (AMS) — bans/allows apps per policy; also not the
  signature check.

## 3. Key conclusion — the signing wall is not in the Java CODs

The RRT enforcement seen at boot (`CMM: module ... no sig from 0x545252` /
`missing RRT signature`, session05) is in the **native** code-management module
(CMM/VM), which lives in the **OS/boot partitions**, not in any `.cod`. The Java
"trust" modules only implement app-level permission/trust **dialogs**.

Therefore:
- A Java-only audit can find **permission/app-trust** weaknesses, but **cannot**
  reveal a bypass of the RRT module-signature check.
- Reversing the actual wall needs the **native** AP image — which we do not have
  (only the Java CODs and the modem `.sfi`). Getting it needs a flash read
  (loader session — blocked) or a physical/eMMC method (ruled out).

This closes the "offline signed-module trust bug → root" idea for the signing
wall: the bug, if any, is in native code we can't currently read.

## 4. Artifacts

- coddec patch noted above; decompiled output under
  `/tmp/opencode/decomp/decompiled/...`.
- `bb-tools` (Rust `cod2jar`) does not build on rustc 1.85 (needs ≥1.95), so
  coddec (patched) is the working decompiler here.
