# BlackBerry 9930 Research

Working archive for a BlackBerry Bold 9930 (Sprint, BBOS 7.1.0.1066,
MSM8655 / Snapdragon S2, PIN `0x3321FC37`).

Focus: reverse engineering, the boot/flash chain, code-signing boundaries, and
the (u)nexplored paths to running custom code.

## Sessions

- `notes/session00-recon-device-identity.md` — USB/device identity baseline
- `notes/session01-baseline-module-dump.md` — full COD module backup (548 modules)
- `notes/session02-bbos7-attack-surface-and-prior-art.md` — prior art, 2014
  bootloader disclosure, PlaidCTF simulator, tooling bootstrap
- `notes/session03-linux-port-feasibility.md` — Linux-port feasibility
- `notes/session04-community-modding-and-custom-os-options.md` — hybrids,
  flash model, custom-OS-on-JVM options
- `notes/session05-code-signing-wall.md` — **[key result]** why custom code
  cannot run at boot (RRT signature enforcement)
- `notes/session06-linux-workstation-migration.md` — Linux host setup,
  udev/libusb, toolchain re-provision, resume the BootROM lane
- `notes/session07-bootrom-protocol-first-contact.md` — live BootROM session;
  claim fixed on Linux, `SetMode(1)` accepted, ping-first wedges the 9930
- `notes/session08-firmware-acquisition.md` — Sprint 9930 OS 7.1.0.163 image
  obtained + extracted (Java CODs, `rim0x05001204.sfi`, embedded ARM ELFs)
- `notes/session09-apploader-and-firmware-toolchain.md` — RIM `Loader.exe` /
  `RIMDeviceManager.exe` / `RimUsb.sys` acquired; `.sfi` container format;
  RAMLoader command reference
- `notes/session10-reversing-rim-device-manager.md` — host stack uses the
  OS-session Desktop Channel (not BootROM channel0); recovered the RIM **MCT
  flash partition map**
- `notes/session11-bbos-update-protocol-and-cfp-format.md` — **[key result]**
  BBOS update = HTTP CGI (`login/dynamicProperties/update.cgi`) over the device
  link; CFP/RamImage image format + `SignedFileImage` signature boundary
- `notes/session12-os-session-probing.md` — live OS session: classic socket
  protocol, mode map (explains the BootROM wedge), GetVar/attributes
- `notes/session13-offline-decompile-trust-bug-hunt.md` — coddec fix; the RRT
  signing wall is native, not in the Java CODs
- `notes/session14-hardware-and-software-surface-map.md` — **[map]** complete
  hardware inventory (`.sfi` build flags) + software surfaces + autoloader +
  ranked opportunities
- `notes/session15-module-audit-sbinjector-autolaunch.md` — module audit:
  `sbinjector`=resource bundle; `AutoLauncher` reads SD-card backup into
  DeviceSwitch; app-delivery/FUMO push path

## Layout

```
notes/        session write-ups (markdown)
recon/        module lists, event logs, USB boot traces
specimens/    COD module dump + manifests + decompiled output
experiments/  custom module builds (rapc source + .rapc + .cod)
tools/        scripts written for this research (Python / PowerShell)
docs/         supporting docs
```

## Key findings (short)

1. 9930 BootROM enumerates as USB `VID_0FCA / PID_0001` for ~12 s on every
   power-up; protocol matches `bblink.py` (bulk EPs `0x02/0x82`, 64 B).
2. The OS is Java (CLDC/MIDP) as removable `.cod` modules; the "custom ROM"
   community practice is **hybrid OS** (recombining RIM-signed modules).
3. Autostart / system-module / controlled APIs require the **RIM Runtime (RRT)
   code signature**. Unsigned modules are denied. RIM's signing servers are
   offline, so offline signing is not possible.
4. Therefore privileged/custom code requires the **boot chain** (2014 class of
   bootloader weakness), not the Java layer.

## Toolchain (NOT committed — re-create per machine)

- **JavaLoader** = `JavaLoader.exe` extracted from the BlackBerry JDE 7.1.0
  installer (archive.org `blackberry-jde-7.1.0`; carve the CAB payload).
- **rapc** = JDE 7.1.0 `rapc.exe`. Needs a Java 6 `javac` (we used Azul Zulu
  6, `zulu6.22.0.3-jdk6.0.119-win_x64`) because rapc passes `-source 1.3`.
- **coddec** (decompiler): github.com/george-hopkins/coddec — `javac` all
  sources, run `net.rim.tools.a.coddec <module>.cod`.
- **bb-tools** (modern COD parser): github.com/waltermin/bb-tools (Rust).
- **BBHTool** (hybrid/shrink): github.com/lyricidal/BBHTool.
- **bblink.py** (BootROM/RAM-loader link): original in
  github.com/stanw47/Blackberry-Research, patched here for Windows libusb.

## Windows USB note

libusb can read descriptors but not claim the device while `RimUsb` is bound.
A WinUSB package for `0FCA 0001` is built by
`tools/install_bootrom_winusb.ps1`. On Linux no driver swap is needed.
