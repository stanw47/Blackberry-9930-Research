# Session 19 — Native parser inventory & FASTJPEG audit

Date: 2026-10-04
Pivot to externally-reachable native decoders (the direct code-exec path).
All offsets are **file offsets**; runtime address = `0x40000000 + off`.

---

## 1. Native parsers/decoders present in the `.sfi`

| subsystem | evidence (string @ file off) | notes |
|-----------|------------------------------|-------|
| **FASTJPEG** (custom RIM JPEG) | `FASTJPEG: ...` @ `0x3D6070..0x3D9180` | hand-written, reachable by opening `.jpg` |
| JPGDEC / EXIF | `JPGDEC bad orientation/latref/...` @ `0x3D1816..0x3D2C00`, `JPGDEC %d ms` @ `0x37D5FC` | EXIF/GPS geotag parser |
| JPEGENC | `JPEGENC ...`, `Exif: ...` @ `0x37A...`,`0x2E0...` | encoder |
| **libpng 1.2.44** (2010-06-26) | `libpng version 1.2.44` @ `0x25D7E12`, `0x35B2BCB` | **known-vulnerable** |
| **zlib 1.2.3** | `deflate 1.2.3` @ `0x35F76B6`, `inflate 1.2.3` @ `0x35F7DF0` | old |
| GIF | `GIF87aGIF89a` @ `0x526C14` | |
| TIFF | `Tiffinfo`, `Tiffdec` @ `0x37B8BC`,`0x37BDAC` | |
| TrueType / fonts | `truetype-engine` @ `0x38C97C`, glyph cache @ `0x28C87C` | |
| WebKit | `OlympiaWebKit.elf` @ `0x3A73B38`, `OlympiaWebKitLDLL.ldld` @ `0x3F7D094` | browser, huge |
| NFC | `NFC_java.elf` @ `0x39E52DC` | |
| EGL/UI/graphics | `EGL...`, `GDW...` @ `0x204...` | |

**libpng 1.2.44** is from 2010 and predates several fixes, e.g.
CVE-2011-2690/2692 (`png_do_expand`), CVE-2011-3026
(`png_inflate`/`png_decompress_chunk` heap overflow), CVE-2011-3048,
CVE-2013-6954 (`png_do_expand_palette` OOB). Reachable if the
gallery/browser decodes an attacker PNG. zlib 1.2.3 is likewise old.

## 2. FASTJPEG function map (Ghidra @ base 0x403CC000 slice)

| addr | role |
|------|------|
| `0x403D7704` | marker parser (SOF0/DHT/DQT/DRI/SOS), `FUN_403d7704` |
| `0x403D56E0` | read 2-byte big-endian marker length |
| `0x403D5694` | read next marker |
| `0x403D8E48` | huffman table alloc/build entry |
| `0x403D8D64` | huffman fast-table builder |
| `0x403D8F34` | huffman JIT/table gen |
| `0x403D5AF8` | entropy-scan setup + scanline alloc (`FUN_403d5af8`) |
| `0x403D5A84` | per-restart MCU row decode |
| `0x403D578C` | scanline buffer alloc |
| `0x403D83DC` | `...` |

### What is (probably) safe
- **DHT code-count bound**: DC `sum<=0x10`, AC `sum<=0xff`; the code-value
  destination buffer sits at `sp+0x18` in a `0x124` frame, so 255 bytes stay
  inside the frame — **no stack overflow.**
- **Huffman value copy**: `FUN_403D8E48` allocates `sum+0x90` and copies
  `sum` bytes at `+0x8D` — in bounds.
- **`FUN_403D8D64`** enforces the Kraft inequality (`1<<len <= acc`) and
  rejects malformed tables.
- **Component arrays**: `Ns`/`Nf` checked `<4`, stride `0x24` — in bounds.

### Suspicious
- SOF dimensions are only checked for **non-zero**
  (`FASTJPEG: Image dimensions are out of range` is emitted only when
  width or height == 0). A value up to 0xFFFF passes.
- Scanline size `iVar2 = (maxH*8 >> shift) * MCUcols * 3` is a 32-bit
  multiply feeding `FUN_403D578C` alloc; MCU-loop writes into that buffer
  (`FUN_403d5af8` @ lines ~349-419 of the decompile) are the next place to
  look for a length/allocation mismatch.

## 3. Method / tooling

- Slice: `/tmp/opencode/jpeg/jpeg.bin` (file `0x3CC000..0x3DC000`),
  imported at base `0x403CC000`; project `/tmp/opencode/ghidra_jpeg`.
- Scripts: `/tmp/opencode/ghidra_scripts/{FindRefs,DecompFunc,DisasmRange,FindImmStore,CtxRefs}.java`.
- Decompiles saved: `/tmp/opencode/jpeg/parse7704.txt`, `scan5af8.txt`.

## 4. Next steps (ranked)
1. **FASTJPEG MCU/scanline path** (`FUN_403D5AF8` tail, `FUN_403D5A84`,
   `GetMCU`): compare allocated scanline size vs MCU-loop write extent;
   look for integer overflow in `(maxH*8>>shift) * MCUcols * 3`.
2. **libpng 1.2.44**: locate `png_handle_*` / `png_do_expand*` and check the
   known CVE conditions; identify which app links it (browser vs media) to
   confirm reachability.
3. **JPGDEC EXIF** (`0x3D1xxx`): structured parser (GPS tags, lat/long) —
   string/length handling is often buggy.
4. **TIFF** (`0x37B...`) and **GIF** (`0x526...`) decoders.
5. **zlib 1.2.3** inflate callers (libpng, SigCompartment).

## 5. Assessment

We now have the exact native decoders and their addresses, offline, with a
working Ghidra workflow. The FASTJPEG parser is more careful than expected;
the entropy/scanline path and the old libpng/zlib are the better bets for a
memory-corruption primitive. This remains a large exploit-dev effort.
