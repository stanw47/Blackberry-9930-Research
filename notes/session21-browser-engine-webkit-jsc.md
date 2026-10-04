# Session 21 — The BBOS 7 browser: WebKit + JavaScriptCore, as clean ELFs

Date: 2026-10-04
Strongest external-attack surface found so far.

---

## 1. Two native browser ELFs inside the `.sfi`

| component | file range | ELF | load vaddr | size |
|-----------|-----------|-----|-----------|------|
| `OlympiaWebKit.elf` | `0x3A73B5C .. 0x3F7D04C` | ELF32 ARM, EXEC, stripped | `0x2000` | CODE `0x5038A4` + DATA/BSS |
| `OlympiaWebKitLDLL.ldll` | `0x3F7D094 .. 0x4721378` | ELF32 ARM, EXEC, stripped | `0x630000` | RO `0x794B14` + RW/ZI |

Both are single-segment (RWE) non-PIE images — directly importable into
Ghidra as ELF (ARM/Thumb) with correct segment mapping and entry point.

- `OlympiaWebKit.elf` = **WebKit/WebCore** (RIM "Olympia" port; source paths
  `R:\bbnsl\players\webkit\src\Olympia*.cpp`,
  `R:\bbnsl\webkitsupport\platform\BlackBerryPlatform*.cpp`,
  `BlackBerry::Runtime::Player`, `ScriptBridge`, `WebKitThread/Message`).
- `OlympiaWebKitLDLL.ldll` = **JavaScriptCore (JSC)** (source paths
  `/olympia/JavaScriptCore/wtf/*`, `JavaScriptCore::Sampler`,
  `FastMalloc.cpp`, `WTFString.cpp`). This is the JS engine (JSC, not V8).

## 2. Bundled third-party libraries (from the WebKit acknowledgements)

`libpng 1.2.45` (July 7, 2011), **GIFLIB**, **HarfBuzz**, **libxml2**,
**PCRE**, **IJG JPEG**, zlib. (Note: the app-component libpng is 1.2.44;
the browser bundles 1.2.45.)

## 3. Why this is the best target

- The BBOS browser is a full WebKit+JSC stack and is **remote-reachable**
  (open a URL / load a page).
- There is a **known, demonstrated RCE against BlackBerry WebKit**:
  **CVE-2011-1290** — integer overflow in WebKit "CSS style handling,
  nodesets, length value", exploited by Iozzo / Pinckaers / Weinmann at
  Pwn2Own 2011 against BlackBerry Torch 9800 (BBOS 6), fixed via KB26132.
  BBOS 7.1.0.1066 (Aug 2013) *should* have that specific fix, but the
  codebase is the same lineage and carries many 2011–2013 JSC/WebCore bugs.
- JSC has a large corpus of public 2011–2013 CVEs with PoCs (also ported to
  Android's WebKit-era browsers), which are adaptable here.

## 4. Reachability & testing

- Device is rooted at the USB/app layer? No — but the browser can be driven
  by opening a local `file:///SDCard/...html` or a hosted page; we control
  the SD card via USB mass storage. That gives a deterministic trigger with
  no network needed.
- The browser runs as its own process; a JSC/WebCore bug gives native code
  exec in that process, from which we can pursue the NVS/config write or
  kernel escalation.

## 5. Next steps
1. Import both ELFs into Ghidra (ARM/Thumb ELF loader) and rebuild function
   maps; use the acknowledgement strings to anchor library code.
2. Identify the WebKit/JSC revision (grep for `WebKitVersion`, JS feature
   strings, `JSGlobalData` layout) to pick the matching CVE/PoC.
3. Prioritise **JavaScriptCore JIT bugs** (2011–2013) and the CVE-2011-1290
   WebCore nodeset integer overflow.
4. Build a local `file://` PoC page on the SD card and iterate on-device.

## 6. Artifacts
- `/tmp/opencode/OlympiaWebKit.elf` (5.28 MB, WebKit/WebCore)
- `/tmp/opencode/OlympiaWebKitLDLL.bin` (8.01 MB, JavaScriptCore)
- libpng sources/changelogs under `/tmp/opencode/` (for the parser audit).
