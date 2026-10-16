# Session 30 — PSIRT 000036557 (tethered-boot flaw) + the OSBL boot-auth/hash interface

Date: 2026-10-17
Subject: BlackBerry Bold 9930 (Sprint), BBOS 7.1.0.1066, MSM8655 — live on USB.
Specimen: `CDMA\rim0x05001204.sfi` (78,314,612 B), plus `Loader.exe` (session29).
Tools: capstone 5.0.7 + raw scan scripts; `tools\jde71\JavaLoader.exe` (live).

Goal: characterise the one device-specific opening found so far — the **PSIRT
000036557** "tethered jailbreak" bootloader flaw — and map the on-device
boot/OS-image authorisation path in the boot image to judge whether it is a real
route to a modified (kernel) image.

---

## 1. The advisory (PSIRT 000036557)

- KB: `https://support.blackberry.com/kb/articleDetail?articleNumber=000036557`
  (also `/pkb/s/article/36557`), *"BlackBerry response to reports of tethered
  jailbreak vulnerabilities"*.
- **Affected (Qualcomm BBOS 7.1 and earlier)** include **Bold 9650 / 9930 / 9900**,
  Curve 8530/8830/9310/9330/9350/9370, Pearl 8230/8130/8130m. **9930 explicitly listed.**
- Vulnerability "located in the **bootloader of the BlackBerry kernel**"; the
  bootloader "loads the core of the operating system, before this core loads the
  remainder". Under **specific conditions** it could allow: **load a modified
  kernel, make changes persistent between boots, access any data, access any
  hardware**. Attacker **must have physical access to the USB port**.
- This is the classic **tethered boot** shape: the host supplies/patches the
  kernel each boot; persisted changes survive. Exactly the OSBL stage mapped below.
- Dates: page shows *First Published 2017-04-26* / modified 2020-08-24; local
  session02 note claims initial publication **2014-12-26**. Keep both in mind.

## 2. Prior art — none usable

- No public exploit/tool; CrackBerry's *"Exploiting vulnerability to run Linux"*
  thread concluded *"This never amounted to anything."*
- Nearest precedents are all **BB10/QNX or hardware**:
  - Oleksandr's modded-autoloader root (`bb10.root.sx`) — root is gained in the
    **user partition**; the OS stays signed (`rfs_validator` checks radio/os).
  - Passport/Priv: unlock only by **physical eMMC swap** (prototype bootloader).
  - KEY2 (TCL): **CVE-2021-1931** (Qualcomm fastboot buffer overflow) → `kibo`.
- `bootloader-unlock-wall-of-shame` (TCL page): *"even the oldest of BlackBerry's
  devices don't have a bootloader unlock exploit."*

## 3. Live device facts (this session)

`JavaLoader deviceinfo` (read-only), device connected:

```
Hardware Id:  0x5001204      PIN: 0x3321fc37     Usable Flash: 488 MB
VM Version:   0x701042a      Vendor ID: 104      Active WAFs: 0x5
OS metrics:   build "Aug  8 2013 17:03:26", tokens "ec_agent", "RIM BlackBerry Device"
Boot metrics: loader "5.1.0.699", build "Jul  7 2011 14:31:57"
```

## 4. Boot-chain auth is a pluggable OSBL interface (new)

The `.sfi` boot image is ~`0x40000000..0x401d5000` (1:1 file↔VA). It contains the
**full module manager + JVM**, and the kernel/OS-image authorisation is an
**interface layer**, not inline crypto:

| interface | string (VA) | install/setter | getter | default impl |
|---|---|---|---|---|
| `boot_hash_if.c` | `0x40007f5c` | `0x40007e98` | `0x40007ed8` | `0x4000431c` |
| (if2) | — | `0x40007f6c` | `0x40007ff0` | `0x40004540` |
| `boot_auth_if.c` | `0x40008030` | `0x40008040` | `0x40008080` | `0x400041a0` |
| (if4) | — | `0x400080c4` | — | — |

- Each object is a RAM struct `{ +0: const, +4: ops-table, +8/+9: state, +0x20: arg }`.
- The **loader's kernel-image verify is an indirect call** (session28,
  `0x400078d4: bl 0x40007ed8 → ldr [r0,#4] → ldr [r0,#0x10] → blx`) — i.e. it
  resolves through these interfaces; the image's *structure* is checked only.
- Boot init at **`0x40005020`** installs the default hash/auth impls if unset:
  `auth_isset 0x400080b0`→`auth_install` at `0x40005044`; `hash_isset 0x40007f08`
  →`0x4000431c` at `0x40005058`.
- The auth **ops tables live in RAM** (`0x4610519c` auth, `0x461051b4` hash) —
  platform-provided, *not in the `.sfi`*. A getter tail-call wrapper:
  `0x400040a8: ... bl 0x40008080; ldr [r0,#4]; ldr [r0]; bx r0` (callers
  `0x4000414c`, `0x40004168`).
- **Disassembler gotcha:** the OSBL builds absolute addresses with **MOVW/MOVT**
  (ARM/Thumb mixed), so literal-pool/xref scans return nothing. Use Ghidra (as
  session17) — linear capstone on this region is only partly reliable.

## 5. `Ce_CodeSigning_verify` — the real verifier

Function `0x401adf00`–`0x401ae210` (references the failure strings). It is **real
verification**, not a stub:

- context obtained via `0x401a9bfc`, which is simply `return 0x4730466c` — a static
  **RAM context struct**.
- **keyid check**: `cmp r6,r0; cmpeq r5,sl` → on mismatch emits
  `"%s Ce_CodeSigning_verify failed (keyid 0x%x mismatch)"` (`0x401ae214`) and
  fails; a second form `"%s%s(%d) Ce_CodeSigning_verify failed"` at `0x401ae264`.
- on match, stores the key at `[ctx+0x78]` then calls the concrete crypto at
  **`0x404b8bec` / `0x404b89d4`** (in the OS region, beyond the boot image).
- success ⇒ `return 1` (`0x401ae1b0`); failure ⇒ `return 0` (`0x401ae208`).
- special-case: **`"bootstrap module not signed by RIM"`** (`0x401d4878`) ⇒ error
  `0x4d` — the bootstrap module is the only module with an alternate path.

Context struct `0x4730466c` (observed field map):

```
+0x18..+0x38  array of 8 module-table pointers
+0x70/+0x71/+0x78/+0x79/+0x39/+0x3b/+0x4284  "secure" policy bytes
+0x78/+0x7c/+0x80/+0x84  key identity + key blob (0x84 checked via 0x404b89d4)
+0x108/+0x10c  per-module bitmask tables
```

- Hash phase: `0x401acd08` logs `"verifying hashes"` (`0x401acd98`), loops modules
  (`0x401acc6c` getModuleInfo / code-link check), ending `"hashes verification
  failed!"` (`0x401acdac`) or `"hashes verified"` (`0x401acdc8`).
- The `"JVM: secure %d(%d)"` (`0x401a0e28`) and `"JVM: secure dev=%d app=%d"`
  (`0x401a0e3c`) readouts are produced by an **obfuscated helper `0x40193070`** on
  hard-coded constant pairs → the secure bits are **derived, not plaintext**.

## 6. Delivery (session29 recap)

`Loader.exe` (RIM_CFP) exposes the RAM programmer:
`CMD_WRITE_RAM_SETUP → CMD_WRITE_RAM → CMD_WRITE_RAM_VERIFY → CMD_EXECUTE_RAM`
(+ `CMD_DEVICE_NUKE`, `CMD_PASSWORD`). Its **host-side** OS verify
(`0x5d22a0`/`0x5e0f60`) can be skipped by caller flag or **mode `3`** ("insecure")
— but that alone does not remove the **device-side** `Ce_CodeSigning_verify`.

## 7. Assessment / next steps

- On-device OS/kernel auth is genuine: interface layer → `Ce_CodeSigning_verify`
  → keyid + key blob + external crypto. **No build-time "insecure" switch** in the
  OSBL analogous to the host `mode==3`. This matches "never amounted to anything".
- A tethered modified-kernel route must therefore (a) drive the derived secure
  policy bytes to a skip state, or (b) abuse the **"specific conditions"** in the
  load/transport, not flip a static flag.
- Next: resolve the policy-byte producer (`0x40193070` + the `0x4731xxxx` globals),
  and map the `0x404b8xxx` crypto (keyid constants vs. our HWID `05001204`).

## Artifacts
- Scratch (new): `%TEMP%\opencode\bb9930\` — `sfi_strref.py`, `sfi_strmap.py`,
  `sfi_verdis.py`, `sfi_pol.py`, `sfi_auth.py`, `sfi_authdis.py`, `sfi_ctx.py`,
  `sfi_ctxdis.py`, `sfi_thumb.py` (+ `strmap.txt`)
- Related notes: `session17` (native verifier), `session28` (boot ELF loader),
  `session29` (Loader.exe verify), `session26` (Sachesi), `session02` (prior art)
