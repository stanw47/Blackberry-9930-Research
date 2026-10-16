# Session 29 — `Loader.exe` (RIM_CFP): RAM-flash command set + OS signature-verify decision

Date: 2026-10-17
Host tool: `...\Common Files\Research In Motion\AppLoader\Loader.exe`
(13,467,896 B). PE32 i386, PDB `R:\Src\AppLoader\Loader\Release\Loader.pdb`,
built **May 22 2015**; sections `.text 0x401000`, `.rdata 0x94c000`,
`.data 0xa55000`, `.rsrc`, `.reloc`; ~0x1478 B overlay. Disassembled with
radare2 6.2.4 + capstone 5.0.7.

Goal: (a) recover the flash/RAM **command set** and (b) locate the **OS-image
signature-verification decision** and its bypass paths — complementing
session23 (loader capability) and session27 (opcode map + USB transport).

---

## 1. Flash/RAM command set (recovered)

A command-name formatter at `0x5fa000` (switch → display strings) exposes the
internal RIM_CFP command enum:

```
CMD_PING  CMD_READ_METRICS  CMD_EXIT  CMD_FRESHNESS_SEAL
CMD_WRITE_RAM  CMD_EXECUTE_RAM  CMD_PASSWORD  CMD_CHANGE_BPS
CMD_DEVICE_NUKE  CMD_WRITE_RAM_SETUP  CMD_WRITE_RAM_VERIFY   (CMD_Unknown!!!)
```

Device status codes (same table):

```
OK  UNKNOWN COMMAND  BAD CRC  BAD PACKET  BAD LENGTH  BAD ADDRESS
BAD BPS  MISSING WRITE RAM SETUP  MISSING WRITE RAM VERIFY
WRITE OUTSIDE RANGE  INVALID RAM IMAGE
```

Response codes: `ACK`, `NAK`, `PASSWORD_REQUIRED`.

Device-info dump routine at `0x615900` prints `CFP Version`, `Patriot tunnel`,
`BlockMap Version`, `RamImage` (`str.RamImage` @ `0x96fa28`, ref `0x615978`).

> This is the **host-side** RAM-programmer command model. session27 recovered the
> *transport* (Barry `ChannelPacket [socket][total_size][data]`) and the RIM
> Device Manager opcode map; the names above are the higher-level RIM_CFP
> operations (`RamImage` upload → `CMD_EXECUTE_RAM`) referenced in session23.

## 2. OS load / signature-verify decision

Function cluster `0x5d1c00`–`0x5d2440`. Decision block at `0x5d22a0`:

```
0x5d22a2  call 0x5bc440             ; ecx = [esi+0x4c]; returns mode obj (at +0x2c)
0x5d22c6  cmp byte [esp+0x810], 0    ; caller "skip verify" flag
         je  0x5d230c
         push "Skipping OS Signature verification as requested be caller."
0x5d230c  cmp [modeobj], 3           ; 3 == insecure mode
         je  ...
         push "Insecure mode, Skipping OS Signature verification."
0x5d2322  push "Verifying OS Signature."
         call 0x5e0f60              ; <-- THE VERIFIER
         cmp eax, 0 / je success
         push "Could not verify OS signature."   ; -> abort
```

So there are **two host-side bypasses**:
- a caller-supplied flag `[esp+0x810]` ("skip as requested"), and
- **mode value `3` = "insecure mode"**, read from the object at `[esi+0x78]`.
  The mode getter `0x5bc440` is `return *(ecx+0x2c)`; the setter/allocator
  `0x5bc450` itself **returns `3` on failure** (permissive fallback).

The full OS-load error-string table sits at `0x962f40`, incl.
`Verifying OS Signature.`, `Could not verify OS signature.`,
`Insecure mode, Skipping OS Signature verification.`,
`Skipping OS Signature verification as requested be caller.`,
`Could not set mappings on OS image.`, `Not connected to a ramimage.`,
`Flash image not valid.`, `Loading flash image from memory image.`,
`Verification of UMPStore failed: …`, `Flash verification failed.`,
`File CRC:` / `Device CRC:`.

## 3. Verifier `0x5e0f60`

- early-out if `byte [obj+0x59] == 0` → returns 2;
- computes image end via vtable `[+0x38]`, then repeatedly calls vtable `[+0x40]`
  to **find tagged sections**:
  - magic `0xd7c82d1f` (same family as the SFI header's second magic `0xd7a82d1f`),
  - magic `0xc6b71c0e`;
- requires the located structures to be ≥ `0xb8` (184) and ≥ `0x174` (372) bytes;
- then runs the actual RSA/ECC signature check.

This is the **host-side** OS image verify. Whether the **device-side** path
re-verifies (SBL `boot_auth_if`, session17) is still open; the host-only skip
does not by itself remove the on-device check — matching session26's note that
the `.sfi` "not signed → skip" behaviour is host-side (session11).

## 4. Conclusion

`Loader.exe` exposes a complete RAM-programmer command model
(`CMD_WRITE_RAM_SETUP` → `CMD_WRITE_RAM` → `CMD_WRITE_RAM_VERIFY` →
`CMD_EXECUTE_RAM`) and its own OS-image verification (`0x5e0f60`), which can be
skipped by caller flag or insecure mode `3`. Reaching this from a non-Windows
host is still gated by the transport (session27: BbDevMgr channel layer), and the
device-side image signature remains the wall.

## Artifacts
- `recon/loader_exe_strings.txt` — full ASCII+UTF-16 strings of `Loader.exe`
- Scratch scripts: `%TEMP%\opencode\bb9930\` (`loader_scan.py`, `loader_xref*.py`,
  `loader_refs.py`, `loader_izz.txt`)
