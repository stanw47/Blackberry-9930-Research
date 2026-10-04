# Session 04 — Community modding, the flash model, and "custom OS on the JVM"

Date: 2026-10-03
Device: BlackBerry Bold 9930 (MSM8655), BBOS 7.1.0.1066

Question: how far has the community modded the 9930, and can we boot a different
OS *inside* the JVM (a custom "ROM" on top of BBOS), a BB10-style binder, or root?

---

## 1. Extent of community modding (what exists)

| Mod | What it is | Tools |
|-----|-----------|-------|
| Themes | Plazmic/Theme Studio SVG themes as COD | Theme Studio |
| **Hybrid OS** | Recombine `.cod` modules from different official/leaked OS builds | **BBHTool** (Build-A-Hybrid, FileSwapper), manual |
| Shrink-O-Size | Remove unused `.cod` modules to reclaim space | BBHTool Shrink-A-OS, manual |
| Radio swap | Load a different OS version's radio (`.sfi`) with an OS | BBHTool, Loader |
| Apps | Third-party COD/JAD apps (signed for controlled APIs) | JDE/rapc, javaloader, BBSAK, vnbbUtils |
| OTA install | `.jad` + `.cod` install without Desktop Manager | native browser |
| Carrier unlock | `vendor.xml` removal to cross-flash | AppLoader |

**What does *not* exist:**
- No native OS port (no Linux/Android/postmarketOS — see session03).
- No true custom kernel. "Custom OS" in the community = **hybrids only**.
- No Unix-style root. `berryssh` is an SSH *client* app (remote shell), not local root.

## 2. The flash model — and what is (not) checked

The OS installer (`.exe`) unpacks a **Loader Files** tree on the PC:

```
...\Common Files\Research In Motion\Shared\Loader Files\<ver>\
    Java\        <- OS .cod modules (the whole OS, in Java bytecode)
    UMTS\ | CDMA\ <- radio .sfi (+ boot/loader files)
    BlackBerry.alx   <- application descriptor listing the core module set
```

- `Loader.exe` (Application Loader) drives the device's **boot ROM/RAM-loader**
  over USB and installs that `.cod`/`.sfi` set.
- `BlackBerry.alx` (id `net.rim.blackberry`, "Core Applications") is the manifest
  that names the system modules.
- **Hybrids prove the Java module set is user-controllable**: people freely
  add/remove/swap `.cod` modules in `...\Java\` and reflash. The boot chain's
  signature check (the 2014 issue) is the hard gate — *not* per-module Java
  signature enforcement during a Loader install.
- `vendor.xml` only gates carrier matching.

Net: **the Java OS layer is effectively modifiable; the bootloader is the wall.**

## 3. "Custom OS inside the JVM" — YES, and here is the mechanism

The packager supports first-class **autostart system modules**. Verified in the
JDE's own sample project files (`*_autostartup.jdp`):

```
RunOnStartup=1      # starts at device boot
SystemModule=1      # background module, no Home-screen icon
StartupTier=7       # start priority (7 = lowest)
RibbonPosition=0
MidletClass=autostartup
Type=3
```

The JDE even ships ready-made examples:
`ActiveTextFieldsDemo_autostartup`, `CHAPIDemo_autostartup`,
`PersistentStoreDemo_autostartup`, `SyncDemo_autostartup`, etc.

So we can compile a `.cod` that **runs automatically at boot with no icon** —
i.e., our own code becomes part of the boot experience. Combined with the fact
that we can replace/remove system `.cod` modules (hybrids), we can build a
**custom "ROM"** that:
1. autostarts as a system module, and/or
2. replaces the Home screen (`net_rim_bb_ribbon_app` / `net_rim_bb_ribbon_lib`)
   with our own shell.
This is a genuine "different OS personality running on the BBOS JVM" — not a
new kernel, but a complete replacement userland/shell.

**Limit:** it is still Java on the RIM JVM. No native/arbitrary code, no
different kernel. Everything runs with app/system-module privileges inside BBOS.

## 4. A BB10-style "binder"?

BBOS is not QNX, but it has an IPC/service substrate we can build a binder-like
layer on: `ApplicationManager`, global event listeners
(`GlobalEventListener`), the Runtime/Persistent store, and `PersistentObject`.
A Java framework that multiplexes messages between "personality" apps is
feasible. It is a userspace framework, not a kernel binder.

## 5. Root

- BBOS has no POSIX root. "Root" here means **boot-chain control** (write
  system partitions / boot a modified kernel) — i.e., the 2014 loader vuln on
  MSM8655, or a BootROM session.
- The Java path (§3) gives **boot-time code execution as a system module**, which
  is close to "system-level control" but still within BBOS's JVM sandbox.
- Real native root = the bootloader project (in progress).

## 6. What was located / dissected this session

- **ROM**: `9850jAllLang_PBr7.1.0_rel2879_PL5.1.0.699_A7.1.0.1066_Verizon`
  (firmware.center) — same `A7.1.0.1066 / PL5.1.0.699` train as our 9930.
  Contains a 304 MB InstallShield `Setup.exe` → `[0]` InstallShield data (289 MB).
  The device COD dump is itself a full OS set, so the installer mainly adds the
  radio SFI + loader metadata.
- **BBHTool** (`lyricidal/BBHTool`, VB.NET source) — Shrink-A-OS, Build-A-Hybrid,
  FileSwapper (full Java COD swapping), Phone Tools (read/save FS, install/save
  COD, screenshot, wipe).
- **JDE 7.1.0** full tree extracted (10,475 files) — `rapc.exe` **works**;
  ships sample `.jdp`/`.alx` incl. the autostart projects.
- Key device modules for a shell: `net_rim_bb_ribbon_app`,
  `net_rim_bb_ribbon_lib`, `net_rim_bb_ribbon_skin_svg`, `net_rim_app_manager`,
  `net_rim_application_daemon`.

## 7. Concrete experiments (in order)

1. **Prove boot-time code** (low risk): build `ActiveTextFieldsDemo_autostartup`
   with rapc → load via javaloader → reboot → confirm it starts with no icon
   (check event log / its side effect). This is the keystone.
2. **Custom shell**: a minimal `main()`/autostart COD that puts up a full-screen
   `Canvas` — our own "desktop."
3. **Target the Ribbon**: decompile `net_rim_bb_ribbon_*` to learn how the Home
   screen is supplied; prototype replacing/augmenting it.
4. **Hybrid-native module**: drop our COD into a Loader Files `Java\` set and
   install via Loader (this wipes — have the OS installer ready).
5. **Boot chain**: continue the BootROM/RAM-loader work (the only route to
   native/kernel control).

> Caution: system modules load early. A bad autostart COD can cause a boot loop
> (recoverable via wipe + Loader/OS reinstall). Keep the OS installer + full COD
> dump on hand.

## 8. Verdict

- Community modding = **themes + hybrids + shrink + apps**, nothing native.
- **A custom OS-on-JVM is genuinely achievable** via autostart system modules and
  module replacement — this is the most promising, lowest-risk path to a
  "different OS" on the 9930.
- A BB10-style binder is buildable as a Java framework.
- True root/native control still requires the boot-chain exploit.
