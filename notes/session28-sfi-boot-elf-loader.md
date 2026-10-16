# Session 28 — SFI boot ELF loader (OSBL): structural checks + pluggable verify

Date: 2026-10-17
Device: BlackBerry Bold 9930 (Montana), MSM8655, BBOS 7.1.0.1066.
Image: `rim0x05001204.sfi` (78,314,612 B) — the **exact device build**, obtained
by the Windows method below (session08 extracted the earlier 7.1.0.163 image
under Wine).

Goal: locate where a **modified boot/OS image is rejected**, by disassembling the
`boot_elf_loader` / `boot_sec_elf_loader` code inside the `.sfi` (OSBL, the
Qualcomm-derived boot loader identified in session17).

> Relationship to session17: session17 pinned the **module** verifier
> (`Ce_CodeSigning_verify`, `FUN_4016A7A0`) inside the `.sfi`. This session maps
> the **boot-chain** ELF loader that runs before the VM, and shows its
> verification is *indirect* (a callback), not inline.

---

## 1. Getting the exact-build Loader Files (Windows)

Installer `9930jAllLang_PBr7.1.0_rel2879_PL5.1.0.699_A7.1.0.1066_Sprint.exe`
(301,493,176 B, InstallShield 2010 self-extractor).

- Offline extraction is **blocked**: the 300,466,504-byte overlay `[0]` is the
  literal `InstallShield\0` + a file table + one proprietary-compressed blob
  (no `ISc(`/`MSCF`/OLE-MSI cab), so `7z`, `i6comp`, `IsXunpack`, `MsiX` and
  `setup.exe /extract_all` all fail (`/extract_all` → exit 1155).
- **Working method (Windows):** silent install `/S /v/qn`, launched elevated,
  with a watchdog that killed the Application Loader UI spawn
  (`...\AppLoader\Loader.exe`) so the connected device was never touched;
  installer exit `0`.
- Output tree:
  `...\Shared\Loader Files\9930AllLang_v7.1.0.1066_P5.1.0.699\` —
  `BlackBerry.alx` (784,153 B), `Platform.alx` (74,996 B), ~48 per-app `.alx`,
  `CDMA\rim0x05001204.sfi` (**78,314,612 B**), `Java\` (2,320 files, 307,562,712 B).
- Staged locally to `rom/os9930/LoaderFiles/` (gitignored).

## 2. SFI header (little-endian)

| off  | value | note |
|------|-------|------|
| 0x00 | `0x59ab797d` | SFI magic (`7d 79 ab 59` on disk) |
| 0x04 | `0x00010008` | version |
| 0x08 | `2` | |
| 0x0c | `0x039f168c` | points near the first embedded ELF |
| 0x10 | `0x050102bb` | platform / software id |
| 0x14 | `0xea000009` | ARM `b` to the boot stub |
| 0x18 | `0xe59ff100` ×4 | ARM exception vectors (`ldr pc,[pc,#0x100]`) |
| 0x34 | `0xd7a82d1f` | second RIM magic (`D7A82D1F`, session09) |
| 0x38 | `0x40000000` | load address |
| 0x3c | `0x40000150` | |
| 0x40 | `mov r0,#0xd3; msr cpsr …` | boot stub (IRQ/FIQ off) |
| 0x1e0 | `05001204 050102bb` | HWID (matches `Device.xml`) + platform id |

Multi-image container: boot stub @0x0 (phys `0x40000000`) → **second-stage boot
image** @0x25333E2 (magic `1F 2D A8 D7`, loads at `0x495d0000`) → **4 embedded
ARM ELFs** @ 0x39f16d0, 0x3a81f2c, 0x3f8d464, 0x473c76c.

**File offset ↔ address: `VA = 0x40000000 + file_offset`** (1:1 in the boot
image's address space).

## 3. The boot ELF loader (VA base `0x40000000`)

| VA | role |
|----|------|
| `0x40006304`… | `boot_elf_loader` entry/registration region |
| `0x40006694` | ELF header validator — `\x7fELF`, class/data/version, `e_phoff==0x34` |
| `0x40006e3c` | loader-context init (`ctx`, buffer at `ctx+0x8000`) |
| `0x400078a0` | program-header walk — phdr count at `ctx+0x54`, builds a segment table at `ctx+0x8000+0x9f0` |
| `0x4000797c` | loader-object init; clears verified flags `ctx+0x9e4…0x9e7` |
| `0x40007b9c` | segment predicate: `type==1 (PT_LOAD)` and `flags&0x100000`, or `flags&0x7000000∈{0x2000000}` / `flags&0xe00000∈{0x600000,0x800000}` |
| `0x40007bf4` | register region (max 6) |
| `0x40007c54` | range/overlap check |
| `0x40007d70` / `0x40007dd0` | register region (max 4) / overlap check |

Source-name strings sit inline right after the code: `boot_elf_loader.c`
(file `0x6930`), `boot_sec_elf_loader.c` (file `0x73c0`) — matching the session17
OSBL inventory.

### Verification is reached through an indirect callback

At `0x400078d4` the loader does **not** call RSA/ECC directly:

```
bl   #0x40007ed8        ; returns a global struct ptr
ldr  r0, [r0, #4]
ldr  r0, [r0, #0x10]
blx  r0                 ; INDIRECT verify callback
```

So the boot loader only holds an **opaque verify callback** wired in at run time.
This is exactly why flat string / `/r` xref analysis over the boot image finds no
verifier: the loader validates **structure** (ELF magic, phdrs, PT_LOAD flags,
overlap), and delegates **authenticity** to the callback — which resolves into
the crypto/trailer machinery (session17: `boot_sec_elf_loader`, `osbl_auth`,
`findTrailerData`, `sb_RSACrypt`).

### Trailer / signing scheme (VA `0x41axxxxx`)

| item | offset(s) |
|------|-----------|
| `findTrailerData(%d,%d,%d)` parser | code `0x401ac61c`; wrapper `0x401ac7a0` (accepts trailer size 4…0x84); caller `0x401ac7ec` |
| `bootstrap module not signed by RIM` | `0x1d4878` |
| `%s%s(%d) is attempting to replace a 0x33 signed module` | `0x1ae9dc` |
| `sb_RSACrypt` | `0x1bd7ac` |
| signer `RIMOS-ECC-SHA512` | `0x39f1460`, `0x3a81cbc`, `0x4aafa34` |
| signer `RIMOS-ECC-SHA256` | `0x39f151c`, `0x3a81d78`, `0x4aafaf0` |
| signer `RIMOSSA1` | `0x39f15d8`, `0x3a81e34`, `0x4aafbac` |
| signed-image trailer magic `a9 a1 70 57` | data table at file `0x2a0a0` (data, not code) |
| `.note.rim` magic `44 aa 12 34` | `0x3a7c714`, `0x3f8cf70`, `0x473c4a8`, `0x4aaf7b0` |

## 4. Conclusion

A modified image is rejected by the **crypto callback + trailer parser** behind
the boot loader, not by the loader's own ELF checks. The boot stub/loader only
validates structure. The likely payoff (session17 / 2014-class) is if the
trailer "not signed → skip" behaviour is shared device-side; that is the next
thing to confirm, and delivery remains the blocker (session27).

## Artifacts
- `recon/loader_exe_strings.txt` — full ASCII+UTF-16 strings of `Loader.exe`
- Scratch scripts: `%TEMP%\opencode\bb9930\` (`sfi_parse.py`, `sfi_struct.py`,
  `sfi_elfs.py`, `sfi_trailers.py`, `sfi_disasm*.py`, `sig_search.py`)
- `rom/os9930/LoaderFiles/` (gitignored): the exact-build Loader Files
