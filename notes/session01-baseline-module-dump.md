# Session 01 — Baseline backup: full COD module dump

Date: 2026-10-02
Host: Windows, PowerShell 5.1
Device: BlackBerry Bold 9930 (Montana), HW `0x5001204`

**Result: complete read-only OS module archive captured. 548 COD files,
~80.6 MB, SHA-256 hashed. Nothing was written to the device.**

---

## 1. Device identity (authoritative)

From `JavaLoader -u deviceinfo` and the event log `JVM:INFO` line:

```
JVM:INFOp=3321fc37,a='7.1.0.1066',o='5.1.0.699',h=5001204
```

| Field            | Value            | Meaning |
|------------------|------------------|---------|
| PIN              | `0x3321FC37`     | device PIN (identity) |
| App/OS version   | `7.1.0.1066`     | installed host software bundle |
| Bootrom / loader | `5.1.0.699`      | boot ROM metrics version (`o=`) |
| Hardware ID      | `0x5001204`      | 9930 Montana |
| VM version       | `0x0701042A`     | `VM Version Format 0x4` |
| Vendor ID        | `104`            | RIM |
| Active WAFs      | `0x5`            | WAF feature bitmask |
| Usable Flash     | `488 MB`         | reported to javaloader |
| Bootrom date     | `Jul 7 2011 14:31:57` | from bootrom metrics |
| OS build string  | `ec_agent / RIM BlackBerry Device` | |
| OS metrics build | `Aug  8 2013 17:03:26` | |

Device state: shows **"Activation Required"** (no BIS/BES activation). That is
expected and does not affect local research.

## 2. Tooling acquisition (reproducible)

The host had only the BB10 stack (Link/Blend) — **no `javaloader`**. Steps used:

1. Downloaded official **BlackBerry JDE 7.1.0** installer (archive.org,
   `blackberry-jde-7.1.0`). SHA-256 of installer:
   `2BF7117AD26E3E65D8C12032E0A1F90EB7487339169881AC084737E48D30B925`
2. The installer is an MSI bootstrapper (Compound file) with a **302 MB MS
   Cabinet payload** appended at file offset `0x1A5200` (1,724,928).
3. Carved the tail from that offset to EOF → `BlackBerry_JDE_7.1.0_payload.cab`.
4. `7z e` extracted:
   - `JavaLoader.exe` (292,864 bytes, dated 2011-11-24)
   - `rapc.exe`, `SignatureTool.jar`, `net_rim_api.jar`

Local layout:
```
tools\BlackBerry_JDE_7.1.0.exe
tools\BlackBerry_JDE_7.1.0_payload.cab
tools\jde71\JavaLoader.exe
tools\jde71\rapc.exe
tools\jde71\SignatureTool.jar
tools\jde71\net_rim_api.jar
```

**JavaLoader quirk:** this RIM build has **no `-A` / "save all" flag** (that is
a Barry `bjavaloader` extension). Modules must be named explicitly or saved by
group (`save -g <group>`). We enumerated with `dir -1` and saved in batches.

## 3. Backup results

| Artifact | Path | Detail |
|----------|------|--------|
| Module dump | `specimens\cod\*.cod` | 548 files |
| Total saved bytes | — | 80,766,688 |
| SHA-256 manifest | `specimens\cod_manifest_sha256.txt` | 548 lines |
| CSV manifest | `specimens\cod_manifest.csv` | name, bytes, sha256 |
| Parsed index | `specimens\module_index.csv` | name, version, bytes, created |
| Raw module list | `recon\module_list.txt` | `dir` (long form) |
| Name list | `recon\module_names_raw.txt` | `dir -1` |
| Group list | `recon\module_groups.txt` | `dir -g` |
| Event log | `recon\eventlog_initial.txt` | 2,890 lines |
| Save log | `recon\save_all.log` | batch save output |

All 548 hashes are distinct (no duplicate payloads).

Validation: `JavaLoader info -v specimens\cod\net_rim_cldc.cod` parses cleanly —
`net_rim_cldc 7.1.0.1066`, code 1,898,396 / data 1,105,392 / literal 638,536 /
3834 classes / size 3,034,796.

## 4. Module version distribution

| Count | Version |
|-------|---------|
| 489 | `7.1.0.1066` (core OS) |
| 21  | `3.0.0.221` |
| 11  | `72.12.0921.1132` |
| 10  | `4.0.0.63` |
| 6   | `1.1.0.47` |
| ... | (bundled third-party apps) |

Largest modules:
```
net_rim_theme_BlackBerry7_640x480_b     6,100,320
net_rim_theme_BlackBerry7_640x480_bs1   3,963,324
net_rim_font_times                      3,099,720
net_rim_cldc                            3,034,796
net_rim_font_latin_truetype             3,023,268
net_rim_font_arial                      2,916,568
net_rim_font_courier                    2,686,932
net_rim_bb_cmas                         2,609,096
net_rim_bb_help_9900_series__en         1,497,880
net_rim_bb_help_9900_series__vi         1,494,524
```

Note: help modules are labeled `9900_series`, consistent with 9900/9930 sharing
the 640x480 platform image.

## 5. Groups (from `dir -g`)

Examples: `net.rim.platform`, `net.rim.platform.lang.en_GB`,
`net.rim.platform.lang.en_US`, … Used for `save -g` if a group-level backup is
preferred later.

## 6. Reproduce

```powershell
$jl = '...\tools\jde71\JavaLoader.exe'
& $jl -u deviceinfo
& $jl -u dir -1                 # one-column module names
& $jl -u eventlog               # 2,890-line baseline
# save all (batched; no -A in this build):
$names = Get-Content recon\module_names_raw.txt | ? { $_ -match '^\S+$' }
for ($i=0; $i -lt $names.Count; $i+=60) {
  & $jl -u save @($names[$i..([Math]::Min($i+59,$names.Count-1))])
}
```

## 7. Open items / next

1. **Archive the matching OS installer** — exact target is the 9930 desktop OS
   package carrying the same release train as the device:

   ```
   A7.1.0.1066  (applications)
   PL5.1.0.699  (platform)   <-- matches device bootrom 5.1.0.699
   9930jAllLang_PBr7.1.0_rel####_PL5.1.0.699_A7.1.0.1066_<carrier>
   ```

   Search results:
   - **Closest confirmed match**: `firmware.center/firmware/BlackBerry/` hosts
     `9850jAllLang_PBr7.1.0_rel2879_PL5.1.0.699_A7.1.0.1066_Verizon.rar`
     (304,282 KB) — *same A/PL train, wrong model (Torch 9850)*. Not usable as a
     9930 recovery image.
   - archive.org advancedsearch for `9930jAllLang` and `blackberry 9930
     firmware`: **0 hits**. Official RIM servers are offline.
   - phoneDB lists other 9930 builds (7.1.0.649 China Telecom, 7.1.0.755
     Verizon) but not .1066.

   Status: **target string pinned; exact 9930 package not yet located.** Because
   the `.1066 / 5.1.0.699` release train clearly covered 9850 and 9930 together
   (Verizon), the 9930 file very likely exists as `9930jAllLang_PBr7.1.0_rel2879_
   PL5.1.0.699_A7.1.0.1066_Verizon.rar` — worth a targeted hunt on CrackBerry
   archives / mirror forums before any boot-chain experiment.
2. Optional byte-for-byte storage image: enable mass-storage mode on device, or
   pursue eMMC ISP/EDL for a raw dump (the COD dump is the OS layer, not raw
   flash).
3. Map the boot chain: does MSM8655 eMMC carry the same permanent `BOOT_WP`
   (`B_PERM_WP_EN`) seen on the BB10 units?
4. Java layer: decompile selected COD modules (`coddec`) and map the OS/security
   model; compare signed-module enforcement to BB10.
