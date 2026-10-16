# Session 33 — JVM track: link-time "secure API" enforcement

Goal (user-selected): use the Java VM / debugger to our advantage on the live 9930.
We built unsigned probe CODs, installed them over `JavaLoader`, and read the device
event log. Result: the signing wall has a **second, independent layer — link-time
API-access control** — enforced by the VM the moment a module is loaded. Plus we now
have a COD parser flag (`coddec --secure`) that dumps each class's `secureIndex`.

## 1. Toolchain fix: use `jde71_full\rapc.exe`

`tools\jde71\rapc.exe` cannot build: it launches
`java ... net.rim.tools.compiler.Compiler` and **`rapc.jar` is not next to it**, so you
get `Could not find or load main class net.rim.tools.compiler.Compiler`. The complete
compiler ships in `tools\jde71_full\` (`rapc.exe` + `rapc.jar`). Recipe:

```
$env:JAVA_HOME = tools\zulu6\zulu6.22.0.3-jdk6.0.119-win_x64 ; $env:Path = "$JAVA_HOME\bin;$Path"
tools\jde71_full\rapc.exe -cr -codename=<out>\<Name> <out>\<Name>.rapc \
    -import=tools\jde71_full\net_rim_api.jar -quiet -nodebug <Name>.java
```

JDK 6 (Zulu) is still required. `.rapc` = JAD-like manifest. Install with
`tools\jde71\JavaLoader.exe -u load <Name>.cod`.

## 2. What the device does at `load` (event log)

Installing a COD does **not** just store it — the VM **eagerly links the entry class**
and emits `VM:LINK <module>`. Two probes:

### JvmProbe v1 — references `CodeModuleManager` (and ControlledAccess/CodeSigningKey)

```
CMM: add JvmProbe(4916)
CMM: JvmProbe(4916) no sig from 0x33
VM:LINK JvmProbe
CMM: JvmProbe(4916) no sig from 0x545252
module 4916 cannot reference net.rim.device.api.system.CodeModuleManager
Module 'JvmProbe' attempts to access a secure API.
Linker error: 'VerifyError' for JvmProbe
```

→ Hard failure. The class linker **refuses to resolve a reference to a controlled
("secure") API** from an unsigned module and raises a `VerifyError`. `0x33` = RIM
master signer; `0x545252` = "RRT".

### JvmProbe2 v2 — references only class-`secureIndex`==255 types
(`EventLogger`, `ControlledAccess`, `CodeSigningKey`) and does all work in `<clinit>`:

```
CMM: add JvmProbe2(4905)
CMM: JvmProbe2(4905) no sig from 0x33
VM:LINK JvmProbe2
CMM: JvmProbe2(4905) no sig from 0x545252
```

→ **Links cleanly** (no VerifyError). But **no `JP2 clinit` marker appears** ⇒ the VM
does **not** run `<clinit>` (or `main`) at link time; load ∶= link only. Executing code
still requires the module to be launched (or autostarted, which is RRT-gated).

Still, JvmProbe2 logs `no sig from 0x33` — referencing `ControlledAccess` /
`CodeSigningKey` triggers a **method-level** RIM (0x33) requirement even though the
class-level `secureIndex` is 255. So class flags are necessary-but-not-sufficient;
individual methods can be protected.

### WSSBootTest (baseline, UI + EventLogger only)
```
CMM: WSSBootTest(5004) no sig from 0x545252
AppManager: module WSSBootTest missing RRT signature        (at boot only)
```
No `0x33` check — so `EventLogger`/UI classes impose no RIM requirement.

## 3. COD format: the per-class `secureIndex`

`net.rim.tools.compiler.codfile.ClassDefLocal` reads a 16-bit `_secureIndex` in the
class-def record (`read()`: names, `skipBytes(10)`, `secureIndex`), and
`ClassType._secureIndex` defaults to **255 = unrestricted**. Non-255 = the class
requires signing (the value selects the authority/slot). This is the on-disk marker
the linker consults.

### New tool mode: `coddec --secure <file.cod>`
Added `dumpSecure()` to `tools\coddec\src\net\rim\tools\a\coddec.java` (gitignored tool)
and wired `main` to accept `--secure`. Rebuild:

```
& "<jdk21>\bin\javac.exe" -nowarn -d tools\coddec\out -cp tools\coddec\out \
    tools\coddec\src\net\rim\tools\a\coddec.java
& "<jdk21>\bin\java.exe" -cp tools\coddec\out net.rim.tools.a.coddec --secure <file.cod>
```

Output: `<module>|<pkg>.<class>|secure=<n>`.

### Results for `net_rim_cldc.cod`
Distribution over 14,586 classes:

| secureIndex | count | meaning |
|------|------|---------|
| 255 | 705 | unrestricted |
| 0 | 2947 | protected (group 0) |
| 1 | 17 | protected |
| 2 | 21 | protected (e.g. `RIMSignature`) |
| 3 | 44 | protected |
| 4 | 100 | protected (e.g. `CodeModuleManager`, `ApplicationManager`) |

Selected classes:

| class | secureIndex |
|---|---|
| `net.rim.device.api.system.EventLogger` | **255** |
| `net.rim.device.api.system.ControlledAccess` | **255** |
| `net.rim.device.api.system.CodeSigningKey` | **255** |
| `net.rim.device.api.system.CodeModuleManager` | **4** |
| `net.rim.device.api.system.ApplicationManager` | **4** |
| `net.rim.device.api.system.CodeModuleGroup(Manager)` | **4** |
| `net.rim.device.api.crypto.RIMSignature` | **2** |
| `net.rim.device.internal.system.MIDletSecurity` | 0 |

Full dump saved to `recon/device/cldc_secure.txt`.

## 4. Interpretation

- The signing wall is **not only** a boot/autostart gate; the VM's class linker performs
  **API access control** at module load. Unsigned modules cannot even resolve a
  reference to a controlled class, let alone call it.
- The required-signer id is checked per referenced element (`0x33` RIM / `0x545252`
  RRT / …). This is the same signer-id namespace used by the COD signature trailers
  (session31/32).
- `ControlledAccess` / `CodeSigningKey` are (class-level) referenceable, so an unsigned
  app *links*, but its protected methods still demand RIM signing (0x33 logged) — the
  checks are also enforced per-method.
- No headless primitive: load-time work is limited to linking. Running unsigned code
  needs a launch, which the RRT gate denies for autostart.

## 5. Status / next

- **Done:** rapc toolchain fix; probes built/installed; link-time enforcement proven;
  `coddec --secure` map produced; artefacts committed.
- **Blocked without user interaction:** executing `JvmProbe2` (needs the app launched
  from the device UI) to capture *runtime* behaviour of `ControlledAccess`.
- **Options:** (a) user taps `JvmProbe2` → pull event log; (b) pursue the JDWP bridge
  (`tools\jde71_full\JDWP.jar`, `net.rim.ide.JDWPUI`, `TransportUSB` + `RIMUsbJni.dll`)
  which would run in a trusted context and allow method invocation; (c) extend
  `--secure` to method/field level for a complete controlled-access map.
