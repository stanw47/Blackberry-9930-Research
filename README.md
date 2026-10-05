# BlackBerry Bold 9930 (9930) — Research

> Reverse-engineering, boot/flash-chain, code-signing-boundary, and custom-code
> research on the BlackBerry **Bold 9930** (BBOS 7.1, MSM8655).
>
> Part of the **[Blackberry-Research](https://github.com/stanw47/Blackberry-Research)**
> collection · [Williamson Security Solutions](https://williamsonsecuritysolutions.com)

---

## Disclaimer

> **Research aid, not a flashing guide.** Flashing/editing boot or firmware
> partitions can **permanently brick** the device. For educational / defensive
> research on a device the author owns. **At your own risk.**

---

## Device Details

| Field | Value |
|---|---|
| Model | BlackBerry Bold **9930** |
| Codename | `9930` |
| SoC | Qualcomm **MSM8655** (Snapdragon S2) |
| OS / software | **BBOS 7.1** (Java CLDC/MIDP) |
| Current build | 7.1.0.1066 (device) / 7.1.0.163 (Sprint firmware acquired) |
| Previous builds | — |
| Carrier / unlock | **Sprint** (device is carrier-relevant; no bootloader unlock) |
| SIM | single |
| PIN | `0x3321FC37` |

---

## Current Status

Recon complete and the **code-signing boundary mapped**: BBOS runs as removable
RIM-signed Java `.cod` modules gated by the **RIM Runtime (RRT) signature**;
RIM's signing servers are offline, so unsigned/privileged modules cannot be
installed. The BootROM (`bblink`) protocol has been reached, and firmware + the
OS update protocol decoded. The only remaining door to custom code is the
**boot chain** (2014-class bootloader weakness), not the Java layer.

---

## Completed

- **Device identity + full module dump** (548 COD modules).
- **Prior-art survey** (2014 bootloader disclosure, PlaidCTF simulator).
- **Code-signing wall mapped** (RRT enforcement is native, not in the Java CODs).
- **BootROM (`bblink`) first-contact** on Linux; `SetMode(1)` accepted.
- **Firmware acquired + extracted** (Java CODs, `rim0x05001204.sfi`, ARM ELFs).
- **OS-session protocol** (Desktop Channel) + **MCT flash partition map**.
- **BBOS update protocol** (`HTTP CGI`) + CFP/`SignedFileImage` format.

## Achieved

- ✅ **RRT signing wall documented** — why custom code cannot run at boot.
- ✅ **BootROM protocol reached** (`bblink`-compatible, bulk EPs `0x02/0x82`).
- ✅ **Complete hardware/software surface map** with ranked opportunities.
- ✅ **Firmware + update pipeline decoded** end-to-end.

## In Progress

- **BootROM lane** — resume live BootROM sessions toward a boot-chain path.

## Failed

- **Java-layer custom code** — RRT signature required; signing servers offline.
- **Offline signing** — not possible (private RIM keys).
- **Hybrid "custom ROM" as root** — the community practice only recombines
  RIM-signed modules; it does not yield privileged code.

## Future Plans

1. Continue the **BootROM / boot-chain** lane (the only custom-code door).
2. Linux-port feasibility assessment.

---

## Community Activity

- The BBOS community's "custom ROM" practice is **hybrid OS** — recombining
  RIM-signed modules; no root/unlock has been achieved in the Java layer.
- The **2014 bootloader disclosure** and the **PlaidCTF simulator** are the key
  prior art; no public bootloader exploit exists for the 9930.

---

## Repository layout

```
notes/        session write-ups (markdown)
recon/        module lists, event logs, USB boot traces
specimens/    COD module dump + manifests + decompiled output
experiments/  custom module builds (rapc source + .rapc + .cod)
tools/        scripts written for this research (Python / PowerShell)
docs/         supporting docs
```

### Session index

- `notes/session00-recon-device-identity.md` — USB/device identity baseline
- `notes/session01-baseline-module-dump.md` — full COD module backup (548 modules)
- `notes/session02-bbos7-attack-surface-and-prior-art.md` — prior art, 2014 bootloader disclosure, PlaidCTF simulator
- `notes/session03-linux-port-feasibility.md` — Linux-port feasibility
- `notes/session04-community-modding-and-custom-os-options.md` — hybrids, flash model, custom-OS-on-JVM
- `notes/session05-code-signing-wall.md` — **[key result]** RRT signature enforcement
- `notes/session06-linux-workstation-migration.md` — Linux host, udev/libusb, toolchain
- `notes/session07-bootrom-protocol-first-contact.md` — live BootROM session
- `notes/session08-firmware-acquisition.md` — Sprint OS 7.1.0.163 image + extraction
- `notes/session09-apploader-and-firmware-toolchain.md` — `Loader.exe` / `.sfi` / RAMLoader
- `notes/session10-reversing-rim-device-manager.md` — OS-session Desktop Channel + MCT map
- `notes/session11-bbos-update-protocol-and-cfp-format.md` — **[key result]** HTTP CGI update + CFP format
- `notes/session12-os-session-probing.md` — OS session socket protocol
- `notes/session13-offline-decompile-trust-bug-hunt.md` — coddec; RRT wall is native
- `notes/session14-hardware-and-software-surface-map.md` — **[map]** full inventory + ranked opportunities
- `notes/session15-module-audit-sbinjector-autolaunch.md` — module audit

### Toolchain (NOT committed — re-create per machine)

- **JavaLoader** — `JavaLoader.exe` from the BlackBerry JDE 7.1.0 installer.
- **rapc** — JDE 7.1.0 `rapc.exe` (needs Java 6 `javac`, e.g. Azul Zulu 6).
- **coddec** — https://github.com/george-hopkins/coddec.
- **bb-tools** — https://github.com/waltermin/bb-tools (Rust COD parser).
- **BBHTool** — https://github.com/lyricidal/BBHTool (hybrid/shrink).
- **bblink.py** — BootROM/RAM-loader link (original in this collection; patched here for Windows libusb).

---

## Related repos

- **Hub:** [Blackberry-Research](https://github.com/stanw47/Blackberry-Research)

---

## Citations & Acknowledgements

| Source | URL | Relevance |
|---|---|---|
| BlackBerry JDE 7.1.0 | archive.org `blackberry-jde-7.1.0` | JavaLoader / rapc toolchain |
| george-hopkins / coddec | https://github.com/george-hopkins/coddec | COD decompiler |
| waltermin / bb-tools | https://github.com/waltermin/bb-tools | modern COD parser |
| lyricidal / BBHTool | https://github.com/lyricidal/BBHTool | hybrid/shrink |

Thanks to the BBOS modding community.

---

## License

Research notes and original scripts are provided for educational purposes;
third-party code retains its own license.
