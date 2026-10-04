# Session 08 — 9930 Sprint firmware acquired + extracted

Date: 2026-10-04
Device: BlackBerry Bold 9930 (Montana), MSM8655, HW `0x05001204`

Obtained and unpacked a genuine **Sprint BlackBerry 9930 OS image** — the first
complete, signed, model-matching firmware in the project. This gives us a
recovery path and the 9930 radio/boot firmware for the boot-chain work.

---

## 1. Source artifact

On the Ventoy USB drive:

```
9930jAllLang_PBr7.1.0_rel457_PL5.1.0.137_A7.1.0.163_Sprint_L.P.exe
  257,023,880 bytes   PE32 InstallShield 2008 bootstrapper ("BlackBerry 9930")
  A = 7.1.0.163     PL = 5.1.0.137     carrier = Sprint
```

It is a BlackBerry **desktop OS installer**, not a BB10-style autoloader: it
installs `BlackBerry 9930.msi` (plus `instmsiw.exe`, `Setup.ini`) and drops the
OS **Loader Files** on disk.

Note vs device: the phone runs `A7.1.0.1066 / PL5.1.0.699`; this image is the
earlier `A7.1.0.163 / PL5.1.0.137`. Same model + carrier (hardware ID
`0x05001204`), a valid recovery/source image, but a platform downgrade.

## 2. Extraction recipe (Linux, no root)

The `[0]` setup stream uses InstallShield's proprietary compression, so
`7z` / `unshield` / `iss_extract` / `cabextract` cannot unpack the MSI.
Working method: run the installer under **Wine** and let it lay down Loader
Files.

```bash
# user-scoped Wine flatpak
flatpak remote-add --user --if-not-exists flathub \
  https://dl.flathub.org/repo/flathub.flatpakrepo
flatpak install --user -y flathub org.winehq.Wine/x86_64/wow64-25.08
flatpak override --user --filesystem=/media/stanw47/Ventoy org.winehq.Wine

WINEDEBUG=-all flatpak run org.winehq.Wine \
  '/media/stanw47/Ventoy/9930jAllLang_PBr7.1.0_rel457_PL5.1.0.137_A7.1.0.163_Sprint_L.P.exe' \
  /s /v"/qn"
```

(The command "hangs" after the silent install finishes — the files are already
written; Ctrl-C / timeout is fine.)

Output prefix (Wine):
```
~/.var/app/org.winehq.Wine/data/wine/drive_c/Program Files (x86)/Common Files/
    Research In Motion/Shared/Loader Files/9930AllLang_v7.1.0.163_P5.1.0.137/
```

Copied to the repo at the gitignored path:
```
rom/9930AllLang_v7.1.0.163_P5.1.0.137/     (315 MB)
```

## 3. Contents

| Path | Detail |
|------|--------|
| `Java/*.cod` | 2,108 COD modules (the full 7.1.0.163 Java OS + apps) |
| `CDMA/rim0x05001204.sfi` | **78,194,852 B** 9930 CDMA radio/firmware image |
| `BlackBerry.alx` | core OS module manifest (779 KB) |
| `Platform.alx`, `CJK.alx`, `*.alx` | per-component manifests |
| `PkgDBCache.xml`, `specification.pkg` | package DB / build metadata |

SHA-256:
```
4d8cd6cf66b980dd97838fa72b0490c33b0fe2804a43b730c16099c0c01bfb6c  CDMA/rim0x05001204.sfi
```

## 4. Inside the `.sfi` (first look)

`file` → generic `data`; it is a RIM firmware container:

- Starts with **ARM code** (vector table `f1 9f e5 …` at `0x10`).
- Contains `MSM8655` strings and 827 `RIM` markers.
- **Loader footer magic `D7C82D1F`** (`bbusb`/`bblink` loader trailer) at 6
  offsets, incl. `0x4A…` and file-size-24. Header magic `D7D32D1F` not found —
  the loader segments are wrapped in RIM's container, not a standalone `.bin`.
- **4 embedded ARM ELF executables** (stripped, static):

  | Offset | Size | Notes |
  |--------|------|-------|
  | `0x39E5D40` | 583,772 | ARM EABI5 EXEC, entry `0x5fac9` |
  | `0x3A74C5C` | 5,281,080 | entry `0x6588d` |
  | `0x3F7EB14` | 8,012,552 | entry `0x0` |
  | `0x4720C1C` | 3,609,864 | entry `0x1238d` |

  These are most likely modem/baseband firmware blobs for the MSM8655.

## 5. Why this matters

1. **Recovery**: a complete signed Sprint 9930 image (Java OS + CDMA `.sfi`) to
   restore the device if boot-chain experiments brick it.
2. **Boot-chain material**: the `.sfi` is the signed image the boot chain
   accepts; its container format + embedded ARM ELFs are targets for the
   2014-class bootloader work.
3. **Radio/boot files**: unlike the 9850 same-train package, this is 9930
   (`0x05001204`) specific.
4. **Wine is now available** (`org.winehq.Wine` flatpak) — reusable for
   `Loader.exe` / other Windows BlackBerry tooling (extraction; device USB I/O
   still won't pass through Wine).

## 6. Open items

- Find a `A7.1.0.1066 / PL5.1.0.699` 9930 image (exact device match) if one
  surfaces; the `7.1.0.163 / 5.1.0.137` image remains the working baseline.
- Map the `.sfi` container: locate the embedded loader segment (footer
  `D7C82D1F`) and determine whether it is a signed RAM loader usable with
  `bblink`/`bb-usbdl` for the 9930.
- Disassemble the 4 embedded ARM ELFs (modem firmware) with Ghidra.
- Keep `rom/` uncommitted (gitignored), but hash-manifest it locally.
