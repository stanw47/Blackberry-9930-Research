# Session 22 — Campaign assessment & recommended path

Date: 2026-10-04
Consolidates sessions 00–21 into a state-of-the-project summary after the
offline static-analysis breakthroughs.

---

## 1. Device / constraint recap
- BlackBerry Bold 9930 (Montana), MSM8655, BBOS 7.1.0.1066 / PL 5.1.0.699.
- Software-only (no chip-off/ISP). Host: ParrotOS.
- Repo: github.com/stanw47/Blackberry-9930-Research (all work pushed).

## 2. What we can read offline (all of it)
`rim0x05001204.sfi` (78 MB) is a multi-component image:
- **ARM** boot/OS component @ `0x40000000`: OSBL secure boot
  (`osbl_auth`, `boot_sec_elf_loader`), the **native module verifier**
  `Ce_CodeSigning_verify`, JVM startup, NVS/config, crypto.
- **Thumb-2** app component @ `0x49610000`: libpng 1.2.44, media, UI.
- **`OlympiaWebKit.elf`** (WebKit/WebCore, ARM ELF, stripped, Dec-2011 build).
- **`OlympiaWebKitLDLL.ldll`** (JavaScriptCore/JSC, ARM ELF, stripped,
  Dec-2011 build, JIT present).
- Other ELFs: `NFC_java`, `SaaS`; plus named DSP/radio bins.
- Gadget/load-base rule: component @ `0x49610000`:
  `addr = 0x49610000 + (file_off - 0x24F10FA)`.
- Tooling: patched coddec (Java CODs), Ghidra 12 with raw+ELF + Thumb
  (`SetThumbPre.java`), rizin, curl for upstream sources.

## 3. The signing wall (solved logically, not yet bypassed)
`Ce_CodeSigning_verify` (`0x4016A7A0`) accepts an **unsigned** module iff:
```
NVS property 0x32 ("JVM secure") == 0  &&  ctx+0x6C == 0
```
- `ctx+0x64` = property 0x32, read at JVM start (`FUN_4015DC00`) from the
  **NVS** store; provisioned outside the JVM (factory / SBL).
- `ctx+0x6C` set only by Nessus debug command `0x3C/0x3D`
  (`FUN_401593E4`), reachable only via the VM BORK path.
- Random 32-byte per-backup key wrap + PBKDF1; RSA-1024 PKCS#1 v1.5
  verification is strict (no forgery shortcut).

=> Need a **write primitive** to NVS/config (or a kernel code-exec) to flip
the flag, then any unsigned COD loads.

## 4. USB / protocol state
- OS session (`0FCA:8004`) speaks channel0 (GetVar/Ping/SetMode); modes
  `RIM Desktop`/`RIM_JavaLoader`/`RIM_JVMDebug` selectable.
- BootROM (`0001`) locks after ~1 command; `RIM-BootLoader`/`RIM-RAMLoader`
  do not exist (answer `0x09`).
- Firmware flash path = HTTP CGI over the proprietary **Patriot tunnel**
  (needs reimplementation) / `rimprogram.dll`.
- JavaLoader socket handshake unsolved (no reply).

## 5. Exploit surfaces ranked
1. **WebKit / JavaScriptCore browser** — *best*. Native ARM ELFs,
   remote/file reachable, WebKit-534.11+ lineage built Dec-2011, JSC JIT.
   Large corpus of public 2011–2013 JSC/WebCore CVEs; a demonstrated RCE
   against BlackBerry WebKit exists (CVE-2011-1290, Pwn2Own 2011).
   Deliver a PoC as `file:///SDCard/x.html` (SD is host-writable over USB).
2. **libpng 1.2.44** (app component) — CVE-2011-3026 heap-overflow path is
   real but needs a ~4 GB zip-bomb expansion; CVE-2011-3048 needs a malloc
   failure. Weak.
3. **Custom FASTJPEG / GIF / TIFF / EXIF** — parser audit so far shows
   careful bounds; not exhausted (entropy/color paths remain).
4. **NVS/loader write path** — would directly enable the signing bypass,
   but protocol RE is unsolved.

## 6. Recommended plan
1. **Browser exploitation track (primary):**
   a. Build Ghidra projects for `OlympiaWebKit.elf` / `OlympiaWebKitLDLL`
      (ELF loader, ARM/Thumb).
   b. Pin the exact WebKit/JSC revision (string/feature anchors; UA
      `534.11+`, build Dec-2011).
   c. Select a matching public JSC JIT/type-confusion CVE with a known PoC.
   d. Port the PoC, deliver via SD `file://`, iterate (crash -> primitive ->
      PC control).
2. **Post-exploitation:** from browser-process code exec, read/modify the
   NVS property 0x32 or patch the running verifier, then install an unsigned
   COD (the session-17 bypass), and/or escalate to the kernel.
3. **Parallel cheap wins:** finish the FASTJPEG entropy / GIF decoders;
   keep the JavaLoader protocol RE as a stretch.

## 7. Honest scope
Turning a 2011-era WebKit/JSC bug into a reliable BBOS 7 exploit on a
stripped ARM build is a multi-week effort (revision ID, bug selection, heap
grooming, ROP/JIT-spray, on-device iteration). The groundwork — readable
native engine, component/load map, trigger mechanism, and the post-exploit
signing bypass — is done and committed.

---

## 8. Browser audit progress (post-assessment)

- JavaScriptCore function map: `recon/jsc_functions.txt` (17,746 fns).
- RTTI typeinfo+vtable map: `recon/webkit_rtti_vtables.txt` (2,275 classes).
- Array builtin atom anchors: `recon/jsc_functions.txt` tail.
- **Audited the array length guard** (function containing `ADR "Invalid array
  length."` @ `0x6872EE`, string @ `0x687688`):
  ```
  0x6872DC  vmov  s2, r6
  0x6872E0  vcvt.f64.u32 d1, s2      ; d1 = (double)(uint32)len
  0x6872E4  vcmp.f64 d0, d1          ; d0 == exact length?
  0x6872E8  vmrs  APSR_nzcv, fpscr
  0x6872EC  beq   0x687328           ; ok
  0x6872EE  adr   r1, "Invalid array length."
  ```
  => the length check is **correct** (rejects fractional / >2^32 lengths).
  Negative result: the easy "push length overflow" primitive is not present
  in this routine.
- Next audit targets (still open): `arrayProtoFuncSort`/`Splice` butterfly
  growth, `JSArray::sort` comparator reentrancy, `arguments`/`CallFrame`,
  Yarr regex, and `JSArrayBuffer`/TypedArray length handling.

## 9. Status
All reconnaissance/infrastructure is committed. Remaining work is sustained
exploit development (bug identification -> primitives -> ROP/JIT-spray ->
on-device iteration), which is a multi-session effort. Post-exploitation
(the session-17 signing bypass) is already fully understood.
