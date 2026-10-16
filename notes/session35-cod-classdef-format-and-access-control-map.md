# Session 35 — COD class-def format RE + controlled-access map

Goal (user-requested, from session34): dig into the COD class/routine/field records to
find the **per-member** secure flags — i.e. extend `coddec --secure` beyond the
class-level `secureIndex` to enumerate exactly which methods/fields are protected and by
which signer.

Result: **there is no per-member security field in the COD format.** Access control is
per-**class** via `secureIndex` (a `u16` at class-def `+0x0E`), plus module-level signer
requirements. This corrects the session34 hypothesis that the runtime gate is
member-level. Method below, then a full class-def layout, then a corrected model.

## Method

1. Read the RIM compiler sources that coddec ships (decompiled) under
   `tools/coddec/src/net/rim/tools/compiler/codfile/*` and `.../types/*` — these are the
   actual rapc serialisers/deserialisers.
2. Hex-diff the raw class-def records of a **secure** class vs a **non-secure** class in
   `net_rim_cldc.cod` (each module of the multi-module COD is a separate JAR entry
   `net_rim_cldc-N.cod`; per-entry `dataSegmentOffset = 44 + codeSize`).
3. Re-ran `coddec --secure` with per-class data-section offsets added.

## COD file (single-module entry) header

```
+0x00 i32 flashId            = 0xFFFFC0DE  (bytes DE C0 FF FF)
+0x04 i32 section_number     = 0
+0x08 i32 vtable_pointer     = 0
+0x0C i32 timeStamp
+0x10 i32 userVersion
+0x14 i32 fieldref_pointer
+0x18 i16 maxTypeListSize
+0x1A i16 reserved           = -1
+0x1C i32 data_section       = -1
+0x20 i32 module_info        = -1
+0x24 u16 version            (>=74)
+0x26 u16 codeSize
+0x28 u16 dataSize
+0x2A u16 flags              (IsLibrary 1, IsMidlet 2, IsParseable 4, IsBrittle 0x10, IsPlatform 0x20)
+0x2C ...  code section (codeSize bytes)
          data section (dataSize bytes) at 0x2C + codeSize
```
The 12-byte prologue `DE C0 FF FF 00 00 00 00 00 00 00 00` is `flashId + section + vtable`.

## Class-def record (data section, little-endian, `off` = data-section-relative)

Confirmed by `ClassDefLocal.readClass()` (authoritative) and by byte-diff:

```
off     size  field                    notes
+0x00   u16   packageName id           identifier (obfuscated string) offset
+0x02   u16   className id
+0x04   u8    superClass byte0         findClassDef(b0,b1)
+0x05   u8    superClass byte1
+0x06   u16   staticStart
+0x08   u16   <clinit> routine off     (0 = none)
+0x0A   u16   <init>  routine off       (0 = none)
+0x0C   u16   createSize
+0x0E   u16   secureIndex   <-- THE security field (0..255; 255 = unrestricted)
+0x10   u16   index
+0x12   u16   codestart
+0x14   u16   codeend
+0x16   u16   attributes
+0x18   u16   offsetVirtualRoutines        (relative to class-def offset)
+0x1A   u16   offsetNonVirtualRoutines
+0x1C   u16   offsetStaticRoutines
+0x1E   u16   offsetFieldsDefinitions
+0x20   u16   offsetStaticFieldsDefinitions
+0x22   u16   offsetInterfaces
+0x24   u16   offsetFieldDefinitionAttributes
+0x26   u16   offsetStaticFieldDefAttributes
```
`ClassDefLocal.read()` skips exactly `+0x04..+0x0D` (10 bytes: super, staticStart,
clinit, init, createSize) and then reads `secureIndex` — consistent with the layout above.

**Attributes word** (`classattributes.java`) carries only visibility/inner/persistence
bits — **no security bit**:
`0x200` IsInner, `0x100` IsUnGroupable, `0x80` IsPersistable, `0x40` HasVerifyError,
`0x20` IsInterface, `0x10` IsAbstract, `1` IsPublic, `2` IsPrivate, `4` IsProtected,
`8` IsFinal.

### Byte-diff evidence (net_rim_cldc)

```
CodeModuleManager  (+0x0E) = 04 00   secureIndex = 4      attrs=0x0209 (Inner|Final|Public)
EventLogger        (+0x0E) = ff 00   secureIndex = 255    attrs=0x0209
ApplicationManager (+0x0E) = 04 00   secureIndex = 4      attrs=0x0209
ControlledAccess   (+0x0E) = ff 00   secureIndex = 255    attrs=0x0089 (Persistable|Final|Public)
CodeSigningKey     (+0x0E) = ff 00   secureIndex = 255    attrs=0x0089
```
Only `secureIndex` differs in a security-relevant way; the attributes words carry no
security meaning.

## Routine record (`RoutineLocal.read()`)

Fields: `name id`, `protoTypeList`, `typeList`, bytecode size, `attributes`, maxStack /
maxLocals / numStack, code bytes, and (only if `attributes & 0x40`) exception handlers.
The `attributes` word is `u8` in the short form or `u16` in the long form and carries
only: `0x10` static, `0x20` abstract, `0x40` IsExceptional, `0x80` IsInit, `0x100`
IsClinit, `1/2/4/8` public/private/protected/final. **No secure/controlled bit.** Field
records are likewise plain (name/proto/offset + Java modifiers). ⇒ **no per-member secure
storage exists.**

## How the signer requirement is actually built (compiler RE)

- Each class with `secureIndex != 255` is reported to its module:
  `ClassType._aCompilervV()` → `Module._aCompilerV(compiler, class, secureIndex)`
  (`types/TypeModule.java:163`), which does
  `s = z_spVector.elementAt(secureIndex)` then warns
  `"Reference to class: X requires signing with key: <name>"`.
- `z_spVector` (index → `"hexkeyid=keyname"`) is loaded **from the API library's `.csl`
  file** (`Compiler._ifStringIV`, order of lines = the index). `z_stVector` accumulates
  the set of required keys.
- `Compiler._ifvV()` then writes two host-side text lists:
  - `<codename>.csl` = required signature keys,
  - `<codename>.cso` = key list, **always** appending
    `52525400=RIM Runtime API` and `52424200=RIM Blackberry Apps API`, and
    `33000000=RIMAPPSA2` if any native methods are invoked.
  `SignatureTool` consumes these and appends the signature trailers to the COD.
- `_forIZ()` compares against the `warnkey` compiler property (just controls a warning).
- `FileHelper.ext_csl = ".csl"`, `ext_cso = ".cso"`.

### Embedded key-list blob found in signed app CODs

Not present in `net_rim_cldc.cod` (the API library) but present verbatim in several app
CODs (e.g. `net_rim_bb_appworld_lib.cod` @ `0xbd247`):
```
33000000=RIMAPPSA2\r\n
52435200=RIM Crypto API - RIM\r\n
52525400=RIM Runtime API\r\n
52424200=RIM Blackberry Apps API\r\n
```
i.e. key ids (ASCII-LE): `RIMAPPSA2 0x33000000`, `RCR 0x52435200`, `RRT 0x52525400`,
`RBB 0x52424200`. The `.csl`/`.cso` text files are not shipped with the JDE, so the exact
canonical `secureIndex`→key order cannot be read directly; the legend below is inferred
from class categories.

## secureIndex distribution (net_rim_cldc, 14,586 entries)

```
index   0: 2947   base public APIs (location, math, lcdui, …)      -> RIM Runtime API (RRT)
index   1:   17   HomeScreen, SMS, SpellCheckEngine, KeyHandlerRegistry -> BlackBerry Apps API (RBB)
index   2:   21   crypto kernel/natives, RIMSignature, FIPS self-test  -> RIM Crypto API (RCR)
index   3:   44   digests/HMAC/tokens, user-authenticator, SocketConnectionEnhanced -> RCR
index   4:  100   File I/O, Bluetooth, GPS, PersistentStore, notifications, sync,
                  ApplicationManager/CodeModuleManager, EventInjector  -> device/system key
index 255:  705   unrestricted (no signer)
```
**Which indices are exported.** Cross-referencing the public `net_rim_api.jar` against the
map: index 0 and index 2 are **internal-only** (0 of 2947 / 0 of 21 classes are in the
public jar) — third-party apps cannot reference them. The public API exports only
indices **255** (unrestricted), **1**, **3**, **4**.
`EventLogger`, `Arrays`, `Fixed32`, `StringUtilities` = 255;
`ControlledAccess`/`CodeSigningKey` = 255.

**Key ids** (ASCII-LE, recovered from rapc output + embedded COD blobs):
`52525400`=RIM Runtime API (RRT), `52424200`=RIM Blackberry Apps API (RBB),
`52435200`=RIM Crypto API - RIM (RCR), `52434900`=RIM Crypto API - Internal (RCI),
`33000000`=RIMAPPSA2.

**`.csl`/`.cso` (rapc output, found in `experiments/jvmprobe/build/`):**
- `.cso` is a **constant template** emitted for every module:
  `33000000=RIMAPPSA2 / 52424200=RIM Blackberry Apps API / 52434900=RIM Crypto API - Internal / 52435200=RIM Crypto API - RIM`.
- `.csl` is the per-module **required-signature set**. `JvmProbe.csl` (the module that
  referenced `CodeModuleManager`, index 4) = `52525400=RIM Runtime API`; `JvmProbe2.csl`
  (only 255-classes) is absent. ⇒ referencing a secureIndex class pulls its key into
  `.csl`; **index 4 requires RRT**. (RRT is *not* in the `.cso` template — it is
  requirement-driven.)

## Corrected model of the wall (replaces session34 §"member-level")

1. **Module signature (CMM)** — RIM `0x33`, RRT `0x545252`, RBB `0x424252`, RCR/RCI …,
   checked when a module is added/linked; unsigned ⇒ `CMM: <id> no sig from 0x…`.
2. **Class-level API access control** — a referencing module must be signed for the key
   at the referenced class's `secureIndex` (index 4 reference by JvmProbe2 produced the
   observed `no sig from 0x424252` = RBB). This is the only *encoding* of controlled
   access in the COD.
3. **Autostart / trust tier** — `AppManager: module … missing RRT signature`.

There is **no per-member secure flag**: the session34 `IllegalArgumentException` cannot be
a member-level secure check. Two live hypotheses remain for it:
   - (a) class-level access control is **deferred to first active use** (execution), so
     `JvmProbe2.<clinit>` faulted on first use of a secure class; or
   - (b) it is app/native-level (e.g. `EventLogger.register(...)` returning false for an
     untrusted app, then `logEvent` rejecting).
Disambiguating needs a probe that reports step-by-step results on **screen** (read via
`JavaLoader -u screenshot`), since `EventLogger` output is unavailable to unsigned code.

## Artifacts

- `recon/device/cldc_secure.txt` — 14,586 lines `module|class|secure=N|off=hex`
  (now with data-section-relative class-def offsets).
- `recon/device/cldc_secure_summary.txt` — distribution + full class lists for every
  non-bulk index (1/2/3/4).
- `tools/coddec/.../coddec.java` — `dumpSecure()` now also emits `off=`.

## Native-method gate (new finding)

The COD data section has a dedicated **native routine table**
(`DataSection._nativeRoutines`, `"native routine table"`: a list of `u16` routine
offsets, read at `DataSection.java:745-762`). The compiler warns
`"Invocation of native methods requires signing with key: RIMAPPSA2"`
(`Compiler.java:2569`) and adds `33000000=RIMAPPSA2` to the module's key lists.
This is a **separate gate** from the class `secureIndex`:

- **Link-time, class-level**: any reference to a class with `secureIndex != 255`
  (`VerifyError`; JvmProbe → `CodeModuleManager`).
- **Run-time, native-method**: invoking a native method from an unsigned module is
  denied (JvmProbe2 called the *native* `ControlledAccess.verifySignatures` /
  `CodeSigningKey.get` on 255-classes and got `IllegalArgumentException`; `EventLogger.logEvent`
  is also native ⇒ no output). Every module (even an empty probe) gets
  `RIMAPPSA2` in its `.cso`.

This is a coherent explanation of everything observed to date and is the leading
candidate for the session34 runtime fault (rather than any per-member flag).

## JvmProbe3 (built)

`experiments/jvmprobe/JvmProbe3.java` (+ `.rapc`) — references **only** 255-classes so
the module links, then runs step-by-step from a worker thread and renders each outcome
**on screen** (read back with `JavaLoader -u screenshot`), since `EventLogger` is
unavailable to unsigned code. Steps: S1 pure Java, S2 `Integer.toHexString`, S3
`EventLogger.register` (return value), S4 `EventLogger.logEvent`, S5
`CodeSigningKey.get`, S6 `ControlledAccess.verifySignatures`. Each is wrapped in
`try/catch(Throwable)` and reports the exception class+message; the ">> Sn" line is
written *before* the call so a hard fault still shows how far it got.

Built clean: `experiments/jvmprobe/build/JvmProbe3.cod` (3588 B), no `.csl`, same
`.cso` as JvmProbe2. Install/launch:
`tools\jde71\JavaLoader.exe -u load experiments\jvmprobe\build\JvmProbe3.cod`
then launch from the UI and `tools\jde71\JavaLoader.exe -u screenshot screen.bmp`.

## Next

- Install + launch JvmProbe3; screenshot the result. If S1/S2 succeed and S3–S6 fault
  with `IllegalArgumentException`, the native-method gate is confirmed. If S3
  `register` returns false, that additionally explains the missing EventLogger output.
- (Optional) Recover the exact `secureIndex`→key order: locate `net_rim_api.csl`
  (not shipped in our JDE trees) — the `.csl`/`.cso` mapping experiment here was
  inconclusive because a bare reference did not register a requirement.
