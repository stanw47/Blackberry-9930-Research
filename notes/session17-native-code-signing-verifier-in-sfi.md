# Session 17 — The native module signature verifier **is** in the `.sfi`

Date: 2026-10-04
**Major correction to session13.** The RRT/`Ce_CodeSigning_verify` module
signature verifier is **not** hidden in an unreadable eMMC partition — it is
present in the firmware image we already have (`rim0x05001204.sfi`), as raw ARM
code in the first ~2 MB. Session13's "native code we can't read" conclusion was
wrong: the `.sfi` is not just the modem/CFP image, it contains the
Qualcomm/RIM boot chain **and** the on-device native security/loader/VM code.

---

## 1. `.sfi` is an ARM boot image, not just a CFP container

- First bytes are a small CFP header, then real ARM exception vectors at
  `0x18`, reset at `0x14` -> `0x40`.
- Literal pools fix the **load base = `0x40000000`**:
  `0x120..0x138` = `0x400E3534 .. 0x400E346C` (exception handlers), i.e.
  file offset `O` maps to address `0x40000000 + O`.
- Only **4 ELF** headers exist in the whole file (`0x39E5300` NFC_java,
  `0x3A73B5C`/`0x3F7D094` OlympiaWebKit, `0x472139C` SaaS). The OS/native
  code is raw ARM inside the image, not an ELF.

### OSBL source-file strings found (file `0x42B8..0x8608`)
`osbl_hash.c`, `osbl_nessus_stubs.c` (Nessus = RIM kernel), `osbl_hw_init.c`,
`osbl_mc_target.c`, `osbl_target.c`, `dloadarm.c`, `Fboot_elf_loader.c`,
`boot_elf_loader_if.c`, `boot_sec_elf_loader.c`, `boot_sec_elf_loader_if.c`,
`boot_clobber_prot.c`, `boot_clobber_prot_local.c`, `boot_hash_if.c`,
`boot_auth_if.c`, `boot_dload_if.c`, `osbl_prog_boot_mproc.c`,
`boot_pbl_accessor.c`. Plus `osbl_dload`, `osbl_hash`, `osbl_auth`, `crc.c`
in the module-registration table at `0x1419A4..0x141A64`.

So this is RIM's **OSBL** (Qualcomm-derived boot loader) with secure-ELF
loading and an `osbl_auth` module.

---

## 2. The module code-signing verifier is inline ARM (PC-relative strings)

Strings are referenced with `add rN, pc, #imm` (not absolute), which is why
literal-pool searches failed. The following message strings sit at
`file offset` and are loaded by the code just before them:

| string | file off | enclosing function (Ghidra) |
|---|---|---|
| `verifying hashes` | `0x169854` | |
| `hashes verification failed!` | `0x169868` | `FUN_401697c4` |
| `hashes verified` | `0x169884` | `FUN_401697c4` |
| `%s%s(%d) verifySigsBeforeLoad failed` | `0x16A340` | `FUN_4016A214` |
| `%s%s(%d) invalid sig for 0x%x` | `0x16A368` | `FUN_4016A214` |
| `%s Ce_CodeSigning_verify failed (keyid 0x%x mismatch)` | `0x16ACB0` | `FUN_4016A7A0` |
| `%s%s(%d) hash missing` | `0x16ACE8` | `FUN_4016A7A0` |
| `%s%s(%d) Ce_CodeSigning_verify failed` | `0x16AD00` | `FUN_4016A7A0` |
| `%s%s(%d) no sig from 0x%x` | `0x16AD28` | `FUN_4016A7A0` |
| `bootstrap module not signed by RIM` | `0x1905B0` | `FUN_4019040C` |
| `VM:CVER=%s` | `0x1905D4` | `FUN_4019040C` |

Also present: `SB_AES`, `sb_RSACrypt`, `sb_ECNoHashSign`, `sb_IDLCKeyCreate`,
`hu_RegisterSbECDSAWAPI`, `hu_RegisterSbECCSecp256r1` (Qualcomm crypto-HW
"secure-boot" API).

> Note: sessions 05/13 saw boot logs `CMM: ... no sig from 0x545252` /
> `missing RRT signature`. `0x545252` = `"RRT"` — and it appears verbatim as a
> keyId in `FUN_4016A7A0` below. This ties the live boot failure to this exact
> function.

---

## 3. Verification call graph

```
FUN_4019040C  (bootstrap module init)          // "bootstrap module not signed by RIM"
  -> FUN_40190400 -> FUN_4016AD44
       -> FUN_4016A7A0(ctx, module, keyId=0x33, key=0x404EB631, len=0x80)

FUN_4016A214  verifySigsBeforeLoad(ctx, module, ...)
  -> FUN_401692A8 / FUN_4016925C (enumerate sigs)
  -> FUN_40168E1C
  -> FUN_401EFD70(..., key, sig, ..., &ok)      // real verify
       -> FUN_4021A7D4  (dispatch)
            -> FUN_4021A5F0  (RSA-1024,  keylen=0x80 siglen=0x80)
            -> FUN_4021A4C4  (ECC,       keylen=0x16 siglen=0x2A)
```

### `FUN_4016A7A0` = `Ce_CodeSigning_verify` (address 0x4016A7A0)
Maps a 4-byte **keyId** to a hard-coded RSA public-key blob + bitmask + len:

| keyId | ASCII | key blob | bit |
|---|---|---|---|
| `0x00000033` | '3'   | `0x404EB631` | 0x400 |
| `0x424252`   | RBB   | `0x404EB2B1` | 0x8 |
| `0x434352`   | RCC   | `0x404EB331` | 0x10 |
| `0x524352`   | RCR   | `0x404EB3B1` | 0x20 |
| `0x545252`   | **RRT** | `0x404EB531` | 0x100 |
| `0x41534242` | BBSA  | `0x404EB1B1` | 0x2 |
| `0x44494242` | BBID  | `0x404EB131` | 0x1 |
| `0x494352`   | RCI   | `0x404EB6B1` | 0x800 |
| `0x414252`   | RBA   | `0x404EB831` | 0x4000 |
| `0x524352`...| ...   | ... | ... |

Key blobs are **128-byte RSA-1024** values at `0x404EB131..0x404EBA31`
(file offset = addr − 0x40000000).

Verified state is cached per module: struct at `*0x473003C0` (ctx), fields
`+0x78/+0x7c/+0x80` = (module, keyId, len), `+0x84` = 128-byte key, and two
bitmask arrays at `+0x108`/`+0x10c`.

### `FUN_401EFD70` -> `FUN_4021A7D4` (verify dispatch)
```
if (key==0 || sig==0 || hash==0) return 0;
*out = 0;
if (keylen==0x16 && siglen==0x2A) r = FUN_4021A4C4(ECC);   // 21-byte values
else if (keylen==0x80 && siglen==0x80) r = FUN_4021A5F0(RSA-1024);
return r;
```

### `FUN_4021A5F0` (RSA-1024 / PKCS#1 v1.5, SHA-1) — **strict**
Recovers the padded block `m = sig^e mod n`, then requires:
`00 01 FF..FF 00 || DigestInfo(SHA-1,15B) || SHA1(msg,20B)`
with >=8 `FF` bytes, separator `0x00` at offset `0x5D` (93), DigestInfo at
`0x5D` compared to `0x404F1675`, and the 20-byte hash at `0x6C` compared to
the caller's hash. Sets `*out=1` only on full match. The Bleichbacher-'06 /
BERserk lax-parsing condition does **not** apply here. (`FUN_4021A4C4` is the
ECC path via `0x40346...`.)

---

## 4. THE GATE: unsigned modules are accepted when a policy flag is 0

Inside `FUN_4016A7A0`, after the per-signature verify loop:

```c
iVar3 = FUN_40161B9C();
if (iVar3 == 0)
    local_198 = FUN_4016A754(ctx);      // <-- returns 1, sets ok=1
if ((char)local_198 == '\0') {          // "no sig from 0x%x"
    ... return 0;                       // reject
}
... return 1;                           // accept
```

and

```c
char FUN_40161B9C(void) {
    if (*(char *)(ctx + 0x64) == '\0')
        return *(char *)(ctx + 0x6c);
    return 1;
}
```

`ctx = *0x473003C0`, initialised to base `0x473003C8` by `FUN_401657D4`.
So:

- `ctx+0x64 != 0`  -> enforcement ON (must present a valid RRT/etc. sig).
- `ctx+0x64 == 0 && ctx+0x6c == 0` -> `FUN_40161B9C()` returns 0 ->
  `local_198 = FUN_4016A754()` = 1 -> **module accepted with NO valid sig.**

`FUN_4016A754` is the "bootstrap fallback": it calls `FUN_401EFD70` with the
hard-coded RBB key/sig pair (`0x404EB2B1` / `0x404EBAC5`) but returns 1
regardless. This is the exact shape of a **developer/engineering-build
signature bypass**.

The two flags at `ctx+0x64` / `ctx+0x6C` are set at runtime (not by
`FUN_401657E8`), so the next task is to find their initialiser — it should read
a persistent security policy / build descriptor. If a writable persistent
field (or an input path) controls them, unsigned modules become loadable.

`FUN_4019040C` separately enforces that the **bootstrap** module is signed
(else `"bootstrap module not signed by RIM"`, returns `0x4d`), using keyId
`0x33` / key `0x404EB631`.

---

## 5. Why this matters

- We can now do **offline static analysis of the real signature wall** — no
  flash read or chip-off needed.
- The scheme is RSA-1024 + SHA-1 PKCS#1 v1.5 (cryptographically weak by 2026
  standards, but the implementation is strict) plus an ECC path and a
  Qualcomm secure-boot HW path.
- The enforcement decision is a **global policy flag** with an explicit
  "signing disabled -> accept" branch. That is the natural root primitive:
  find/force the flag, then load an unsigned COD.

## 6. Next steps
1. Trace writers of `ctx+0x64` and `ctx+0x6C` (search for stores with offsets
   0x64/0x6C on `*0x473003C0`; likely a policy-init function reading a
   build descriptor / NV item / `MCT_*` partition).
2. Identify the keyId `0x33` bootstrap key owner and whether any stored key is
   a debug/test key (compare moduli to known RIM/dev keys).
3. Follow the Qualcomm `osbl_auth` / `boot_sec_elf_loader` path (ELF signature
   verification) for the boot-chain equivalent.
4. Re-examine the live-boot `RRT` failure (session05) against this code to
   confirm which policy flag is active on the retail 9930.

## 7. Artifacts
- Slices: `/tmp/opencode/osbl/osbl_0x40000000.bin` (0x200000 B),
  `/tmp/opencode/osbl/osbl_big.bin` (0x300000 B).
- Ghidra projects: `/tmp/opencode/ghidra_osbl`, `/tmp/opencode/ghidra_big`.
- Helper scripts: `/tmp/opencode/ghidra_scripts/{FindRefs,DecompFunc}.java`.
- Function map: `recon/osbl_verifier_functions.txt`.
- Full string dump: `/tmp/opencode/osbl_strings.txt`.
