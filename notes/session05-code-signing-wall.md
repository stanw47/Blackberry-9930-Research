# Session 05 — The code-signing wall (why custom OS-on-JVM fails)

Date: 2026-10-03
Device: BlackBerry Bold 9930, BBOS 7.1.0.1066, PIN 0x3321FC37

Experiment: build an unsigned **autostart** module and see if it runs at boot.
Result: it installs and runs when launched by hand, but the OS **refuses it
autostart privileges** because it is not signed with RIM's Runtime key.

---

## 1. The build (recipe captured for reuse)

Toolchain: JDE 7.1.0 `rapc.exe` (32-bit) + **Azul Zulu JDK 6**
(`zulu6.22.0.3-jdk6.0.119-win_x64`). JDK 6 is required because rapc hardcodes
`javac -source 1.3 -target 1.3`.

`.rapc` manifest is a JAD-like file; autostart is a flag byte:

```
MIDlet-Name: WSSBootTest
MIDlet-Version: 1.0.2
MIDlet-Vendor: Williamson Security Solutions
MIDlet-Jar-URL: WSSBootTest.jar
MIDlet-Jar-Size: 0
MicroEdition-Profile: MIDP-2.0
MicroEdition-Configuration: CLDC-1.1
MIDlet-1: WSSBootTest,,
RIM-MIDlet-Flags-1: 1        # 0x01 = run-on-startup (tier 7); 0x02 = system module
```

Build / install:
```
rapc -cr -codename=<out>\WSSBootTest <out>\WSSBootTest.rapc \
     -import=<jde>\net_rim_api.jar -quiet -nodebug <WSSBootTest.java>
javaloader -u load WSSBootTest.cod
```
Flag math (from BBCore/blackberry tooling):
`flags = (run_on_startup ? 0xE1 - ((2*tier)<<4) : 0) | (system_module ? 0x02 : 0)`
tier 7 ⇒ `0x01`; +system module ⇒ `0x03`.

## 2. Result: installs, runs manually, does NOT autostart

- `javaloader -u dir` shows `WSSBootTest 1.0.2`.
- Opening it manually works (after granting permissions).
- After reboot it does **not** start (even with all permissions = "All", and
  auto-shutdown of background apps disabled).

## 3. Why — the event log says it exactly

```
CMM: add WSSBootTest(5004)
CMM: WSSBootTest(5004) no sig from 0x33
VM:LINK WSSBootTest
CMM: WSSBootTest(5004) no sig from 0x545252      # <-- 0x52 0x52 0x54 = "RRT"
CMM: WSSBootTest(5004) no sig from 0x43505443
AppManager: module WSSBootTest missing RRT signature
```

- `0x545252` little-endian = **"RRT"** = RIM Runtime code-signing key.
- `AppManager: module ... missing RRT signature` is the decision that denies
  autostart.
- Our `EventLogger.logEvent` produced nothing → EventLogger is a **controlled
  API** that also requires signing.

So: **unsigned modules are denied autostart, system-module status, and
controlled APIs.** This is a deliberate platform security boundary, not a bug.

## 4. The signing model (why we can't just "sign it")

From the `MartinMReed/signingserver` config and BlackBerry docs:
- Signatures come from **RIM signing authorities** — `RRT` (Runtime), `RBB`
  (Apps), `RCR` (Crypto), etc.
- The developer's `sigtool.csk` / `sigtool.db` hold their **client identity**
  (salt + private key + clientId/password), used to authenticate to RIM's
  servers:
  `<signerId>RRT</signerId> <url>http://www.rim.net/Websigner/servlet/Runtime</url>`
- The actual signing key is **RIM's private key**; it is not in the developer
  files. **Servers are offline**, so the RRT/RBB/RCR signature can no longer be
  obtained.
- Therefore a developer CSK/DB (even the leaked Hacking-Team one,
  `RCSBlackBerry/sign/sigtool.csk`) is **not sufficient for offline signing**.

## 5. Consequences for the "custom OS on the JVM" plan

| Idea | Status |
|------|--------|
| Autostart our own module | **Blocked** — needs RRT signature |
| Run our code as a *system module* | **Blocked** — needs RRT signature |
| Use controlled APIs (binder, EventLogger, ApplicationManager, networking) | **Blocked** — needs RRT/RBB/RCR |
| UI app (manual launch) | Works, with permission prompts, limited APIs |
| Hybrid OS (swap/filter modules) | **Works — but only with RIM-signed modules** |
| Inject our own code into a signed system module | Blocked — signature covers the module |

**Everything privileged in the Java layer routes through the same signature
wall as the bootloader.** Hybrids work only because all swapped modules are
RIM-signed.

## 6. So the two real paths are

1. **Native / bootloader** — defeat the boot chain (the 2014 class of bug) to
   run unsigned code / patch CMM's signature check. This is the same project as
   the BootROM/RAM-loader work.
2. **Obtain RIM signing keys** — RIM's RRT/RBB/RCR private keys (not developer
   CSK), or an equivalent offline signer. Not publicly available; effectively
   dead.

## 7. Device state / cleanup

- `WSSBootTest` 1.0.2 remains installed as a normal app (harmless).
  Remove later with: `javaloader -u erase -f WSSBootTest`.
- Toolchain for custom modules now works end-to-end (rapc + JDK6 + javaloader),
  which is reusable for any future **signed** or **native** work.

## 8. Key takeaway

The 9930's Java OS is **code-signing enforced at the module level**. There is no
unsigned path to boot-time code, a custom shell, or a binder. The "different OS
on the JVM" idea is real *architecturally* (hybrids prove the module set is
swappable) but **not achievable without RIM's signing keys or a boot-chain
bypass.** Root/native is not optional — it is the prerequisite.
