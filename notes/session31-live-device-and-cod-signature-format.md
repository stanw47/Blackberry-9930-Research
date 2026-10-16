# Session 31 — Live 9930 device access, event-log mining, and the COD signature format

Date: 2026-10-17
Device: BlackBerry Bold 9930 (Sprint), BBOS 7.1.0.1066 / PL 5.1.0.699, PIN 0x3321FC37,
HWID 0x05001204 — connected live on USB (`VID_0FCA&PID_8004`, MI_00 RIMUSBBB, MI_01 MSC).
Tools: `tools\jde71\JavaLoader.exe` (live), `tools\jde71_full\` (full JDE 7.1),
Azul Zulu JDK 6, capstone/py scripts.

Goal: while the PSIRT/boot-auth workstream continues, extract useful data points
from the *live* device and re-confirm the platform security boundary end-to-end.

---

## 1. Device is fully readable over JavaLoader (read-only)

Working commands confirmed live: `deviceinfo`, `dir [-g]`, `enum`, `langid`,
`eventlog`, `logstacktraces`, `screenshot`, `save`, `erase`, `load`,
`backupgroups`, `restoregroups`, `recoverflash`, `debugmode`, `radio`,
`resettofactory`, `cleareventlog`.

- `enum` → `0x3321fc37` (our PIN).
- `dir` (flat) → **564 modules**; `dir -g` lists application groups.
- `screenshot active` → valid 1,228,854-byte BMP.
- `save` pulled signed modules: `net_rim_cldc` (3,039,134 B — the CLDC/JVM core),
  `net_rim_services_impl` (49,020 B), `net_rim_app_manager` (2,036 B),
  `net_rim_bb_trust_application_manager` (4,360 B).

## 2. Event log (426 KB) — what a live BBOS7 looks like

App histogram (top): `net.rim.wlan.link` 2455, `System` 200, `HomeScreen` 132,
`net.rim.wlan.scan` 130, `net.rim.vpn` 97, `net.rim.ribbon.coverage` 66,
`net.rim.device.api.io.nfc` 63, `net.rim.tunnel` 45, `net.rim.ribbon.systemstatus` 44,
`RootRegister` 43, `AMS` 37, `net.rim.ipmodem` 27, `net.rim.hrtRT` 26.

Notable lines:
- Boot marker: `JVM:INFOp=3321fc37,a='7.1.0.1066',o='5.1.0.699',h=5001204`.
- **Internal VFS is real**: `RootRegister ... fs 4 already mounted as system/`,
  `fs 2 already mounted as store/` — BBOS7 has named mount roots, surfaced over
  USB as the two RIM MSC disks.
- `RootRegister ... _usbConStatChg: .. IN_Production flag is set to false`.
- **The RRT gate, live**: `AppManager data:module WSSBootTest missing RRT signature`
  (confirms session05's finding on a freshly booted OS).
- Crypto init: `net.rim.crypto.CryptoBlock data:OSCR (by id/by name)`,
  `SCRS (by id/by name)`; `Security data:NFaB`.
- `net.rim.vpn`, `net.rim.tunnel`, `net.rim.ipmodem`, `BbiAuthTokenManagerImpl`
  are all active — this is a VPN/IP-modem/BIS-capable stack.

## 3. COD module format — the signature section (new)

All single-module CODs begin with the identical 12-byte header
`de c0 ff ff 00 00 00 00 00 00 00 00`, then the compressed code body. **RIM-signed
CODs carry an appended signature section**: a sequence of records of the form

```
[01 00] [len u16 LE = 0x0084] [ 4-byte key id ] [ 128-byte signature ]
```

observed in `net_rim_bb_trust_application_manager.cod`:

| key id | meaning | offset |
|--------|---------|--------|
| `RBB`  | Apps    | 0x0e60 |
| `RCI`  | ?       | 0x0ee8 |
| `RCR`  | Crypto  | 0x0f70 |
| `RRT`  | Runtime | 0x0ff8 |
| `3\0\0\0` (0x33) | ? | 0x1080 |

- `0x84` = 132 = 4 (name) + 128 (signature) → **128-byte (1024-bit) signatures**.
- The unsigned `WSSBootTest.cod` (2,292 B) contains **no** such records — matching
  the `missing RRT signature` decision.
- Session05's log tokens decode to these key ids: `0x545252` = `RRT`, `0x33` = `3`.
- Practical consequence: a record is trivially *shaped* (name + 128 bytes). Whether
  the device merely checks *presence* of an `RRT` record or actually *verifies* the
  128 bytes cryptographically is the open question (see §5) — a forged-`RRT` test
  is the natural next experiment.

## 4. Toolchain is complete (build recipe re-confirmed)

- `tools\jde71`: `rapc.exe`, `net_rim_api.jar`, `SignatureTool.jar`, `JavaLoader.exe`.
- `tools\jde71_full`: full JDE 7.1 component pack (docs, samples incl.
  `*_autostartup.jdp`, `rapc`, `preverify.exe`, `UpdateJad.exe`, signature tooling).
- JDK 6 required (rapc hardcodes `javac -source 1.3 -target 1.3`).
- Build: `rapc -cr -codename=WSSBootTest WSSBootTest.rapc -import=net_rim_api.jar
  -quiet -nodebug WSSBootTest.java` then `javaloader -u load WSSBootTest.cod`.
- Autostart flag byte (`.rapc`): `RIM-MIDlet-Flags-1: 1` (0x01 run-on-startup tier 7;
  0x02 system module).

## 5. Re-confirmed boundary + realistic options for the device

Live evidence matches session05 exactly: **unsigned modules install and run when
launched by hand, but are denied autostart, system-module status, and controlled
APIs** — the `missing RRT signature` decision.

What is actually achievable with this handset:
- **Custom UI apps** compiled with the JDE: installable, manually launchable, limited
  to uncontrolled APIs and user-data permissions (prompts).
- **Hybrid OS**: swap in RIM-signed modules only (signature covers content).
- **Not** achievable without RIM's private keys or a boot-chain bypass: autostart,
  system modules, controlled APIs, or any unsigned native/boot code.

Open avenues (data-point driven, in rough order of promise):
1. **Forged-`RRT` COD** — append a syntactically valid `RRT` record (dummy 128 B) to
   `WSSBootTest.cod` and observe the AppManager decision. If presence-only → the
   module-signing wall falls. Needs the COD header's reference to the sig section
   decoded first (§3).
2. **CMM signature-parser RE** — decompress `net_rim_cldc.cod` / `net_rim_app_manager`
   and map the routine that emits "missing RRT signature" (does it parse-only or
   verify?). Same target as the OSBL `Ce_CodeSigning_verify` workstream (session30).
3. **JDWP/VM debug** — `debugmode`/`-d1` + `jdwp.bat` to attach a debugger to the
   on-device JVM (runtime introspection of the loaded module set).
4. **Boot-chain** — PSIRT 000036557 (session30) remains the only route to a modified
   kernel; everything in the Java layer funnels through the same signature wall.

## Artifacts
- `recon/device/eventlog.txt` (426 KB), `eventlog2.txt`, `modlist_flat.txt` (564),
  `modlist_g.txt`, `langid.txt`, `device/screen.bmp` (1.2 MB),
  `device/modules/*.cod` (net_rim_cldc, services_impl, app_manager,
  bb_trust_application_manager), `device/wssboottest_sibling.txt`
- Scratch: `%TEMP%\opencode\bb9930\cod_sig_dump.py`, `cod_dump2.py`
- Related: `session05` (signing wall), `session30` (PSIRT + OSBL auth),
  `session25` (JavaLoader working)
