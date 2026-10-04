# Session 20 — `.sfi` component map + libpng 1.2.44 function map

Date: 2026-10-04
This unblocks accurate static analysis of the app/library native code.

---

## 1. Load-base / component map (the missing piece)

The `.sfi` is not one flat image: it contains multiple `code/load`
components, each with its own load base. Parsing the `0xD7A82D1F` headers:

```
file_offset   load_addr    entry        covers
0x00000034    0x40000000   0x40000150   boot/OSBL/JVM/native-OS   (ARM)
0x024F10FA    0x49610000   0x496100E0   APP/LIBRARY component     (Thumb-2)
```
Mapping for the second component:
```
runtime_addr = 0x49610000 + (file_offset - 0x24F10FA)
```
e.g. libpng version string at file `0x25D7E12` -> **`0x496F6D18`**.

**Why this matters:** the earlier "no xrefs" results were because the app
strings are linked for `0x49610000`, not `0x40000000+off`. With the correct
base, ADR/literal refs resolve.

## 2. Code vs data

- `0x000000`–`0x4C0000`: boot/OSBL + native OS/JVM — **ARM**.
- `0x24F10FA`+: app/library component — **Thumb‑2** (dominated by
  `push {r4-r7,lr}` = `F0 B5`).
- Most of the 78 MB is the app component(s) plus compressed/flash data; large
  Thumb‑2 ranges: `0x0B80000`–`0x2000000`, `0x24C0000`–`0x3500000`,
  `0x3A00000`–`0x3B80000`, `0x3F80000`–`0x45C0000`, `0x4640000`–`0x4A80000`.
- `FASTJPEG` (`0x3D0000`) is ARM (session‑19 audit stands).

## 3. Ghidra workflow for Thumb components

Raw import defaults to ARM and decodes Thumb as garbage. Working recipe:
1. slice the component, `analyzeHeadless ... -import slice -processor
   "ARM:LE:32:v7" -loader BinaryLoader -loader-baseAddr <load_addr>`.
2. add `-preScript SetThumbPre.java`
   (`/tmp/opencode/ghidra_scripts/SetThumbPre.java`) which sets the `TMode`
   context register to 1 over the whole range **before** analysis.
3. analysis then disassembles/references correctly.

(Failed variants: `-postScript` that sets TMode + `AutoAnalysisManager`
did not persist; `r2/rizin -a arm -b 16` finds functions but no ADR xrefs;
rizin `anal.armthumb` key does not exist in 5.9.8.)

## 4. libpng 1.2.44 function map (component @0x49610000)

| addr | role (by strings) |
|------|-------------------|
| `0x496F6350` / `0x496F6398` | reference the PNG signature constant (`png_sig_cmp`) |
| `0x496F63CC` | "Potential overflow in png_zalloc()" (`png_zalloc`) |
| `0x496F6B4E` | "Width is too large for libpng to process pixels" (`png_check_IHDR`) |
| `0x496F7090` | libpng error handler ("libpng error no. %s: %s") |
| `0x496F71A6` | warning handler |
| `0x496F941C` / `0x496F960E` | version checks (`png_access_version_number`, `png_check_IHDR`) |
| `0x496F97C4` | **`png_read_info` chunk dispatcher** (IHDR/PLTE/IDAT/... via 4-byte chunk tags) |
| `0x496FA7B4` | "Image is too high to process with png_read_png()" |
| `0x496FEA8C`,`0x496FEB32`,`0x496FEFEE` | "PNG unsigned integer out of range." (chunk length / IHDR checks) |
| `0x496FEE02` | "png_inflate logic error" (`png_inflate` / `png_decompress_chunk`) |
| `0x496FE532` | **`png_do_read_transformations`** (expand/gray/dither/pack pipeline) |
| `0x496FF120` | "Ignoring PLTE chunk in grayscale PNG" (`png_handle_PLTE`) |
| `0x496FF272` | `png_handle_IHDR` (called for `0x4b977f50` = "IHDR") |

Chunk tags are compared as 32-bit big-endian constants, e.g.
`0x4b977f50` = `IHDR`, `0x4b977f5a` = `IDAT`? (dispatcher at
`FUN_496f97c4`).

## 5. CVE candidates for libpng 1.2.44 (shipped 2010-06-26)

- **CVE-2011-2690** — `png_do_expand`/`png_rgb_to_gray` overflow (fixed 1.2.45).
- **CVE-2011-2692** — `png_handle_sBIT` OOB.
- **CVE-2011-3026** — integer overflow -> heap overflow in
  `png_inflate`/`png_decompress_chunk` (fixed 1.2.46).
- **CVE-2011-3048** — buffer overflow (`png_set_PLTE`).
- **CVE-2013-6954** — OOB read in `png_do_expand_palette` (fixed 1.2.50).

The most promising for code exec is CVE-2011-3026 (heap overflow) or
CVE-2011-2690 (transform overflow). `FUN_496FEE02` and `FUN_496FE532` are the
functions to audit first.

## 6. Candidate bug: IHDR width overflow -> rowbytes integer overflow

`png_check_IHDR` = `FUN_496F6B4E`. Each validation issue calls a callback and
sets the "invalid" flag `bVar1`, except the large-width check:

```c
if (0x1fffff7e < width) {                      // 536870782
    FUN_496F7182(png, "Width is too large for libpng to process pixels");
    // NOTE: bVar1 = true is NOT set here
}
```
`FUN_496F7182` is the **warning** path: it reaches the callback at
`png_ptr+0x184` (warning_fn); the fatal path (`FUN_496F706C`, `FUN_496F7084`)
reaches `png_ptr+0x180` (error_fn). So an over-large width is only warned.

`png_handle_IHDR` = `FUN_496FEFEE` then does:

```c
width = be32(ihdr); if (width > 0x7fffffff) error("PNG unsigned integer out of range.");
bpp   = bit_depth * channels;
rowbytes = (bpp < 8) ? ((width*bpp + 7) >> 3) : (width * (bpp >> 3));   // 32-bit
*(png + 0x218) = rowbytes;
```
For RGBA/8-bit (`bpp=32`) a width in `(0x3fffffff, 0x7fffffff]` makes
`rowbytes` wrap (e.g. width `0x40000000` -> rowbytes `0`), while later row
decode writes `width*4` bytes per row -> heap overflow **if** no downstream
overflow check. The guard threshold `0x1fffff7e` is only correct for 8-bit
and is non-fatal anyway.

This matches the class of libpng integer-overflow fixes (CVE-2011-2690 /
2011-3328 family). **Next:** verify `png_read_start_row` /
`png_calculate_rowbytes` (`FUN_496F7C08` region) — if it lacks the
`rowbytes/pixel_depth == width` overflow check, this is a clean heap
overflow primitive.

## 7. Next steps
1. Verify the row-allocation overflow check in
   `png_read_start_row`/`png_calculate_rowbytes` (`FUN_496F7C08` + callers).
   If absent -> craft PNG with `width≈0x40000001`, 8-bit RGBA -> rowbytes=4,
   heap overflow.
2. Audit `FUN_496FEE02` (`png_inflate`/`png_decompress_chunk`, CVE-2011-3026)
   and `FUN_496FE532` (`png_do_read_transformations`, CVE-2011-2690).
3. Identify which app loads this component (browser vs media/gallery) to
   confirm reachability (open a PNG).
4. Continue the component map (WebKit, GIF/TIFF, media) for more targets.

## 7. Artifacts
- Slice `/tmp/opencode/png/comp.bin` (file `0x24F10FA..0x2600000`),
  Ghidra project `/tmp/opencode/ghidra_png5` at base `0x49610000` (Thumb).
- `SetThumbPre.java` in `/tmp/opencode/ghidra_scripts`.
