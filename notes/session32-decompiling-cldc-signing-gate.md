# Session 32 — Decompiling `net_rim_cldc` (patched coddec) and the real signing/controlled-access gate

Date: 2026-10-17
Device: Bold 9930, BBOS 7.1.0.1066 (PL 5.1.0.699), HWID 0x05001204.
Tooling: `tools/coddec` (self-contained COD->source decompiler) run under the Microsoft
JDK 21, plus a few local patches (below). Host-only; no device risk.

Goal: get past coddec's limits, fully decompile the CLDC core, and read the actual
`missing RRT signature` / code-signing / controlled-access logic instead of inferring it.

---

## 1. Patching coddec

`tools/coddec` targets an old BlackBerry VM ("VERSION = 6"). On a BBOS 7.1 COD it aborted
three times. Four local edits fixed it (coddec is gitignored; the edits are listed here so
they are reproducible):

1. **Unknown extended opcodes** — `Code.java` (read loop) `default:` case threw
   `RuntimeException("Unexpected opcode: ...")`, killing the whole file on any opcode coddec
   doesn't know (BB7.1 uses new opcodes in the `0xD8`-prefixed extended page, e.g. 286, 288).
   Changed `default:` to print a warning and treat it as a no-operand instruction:
   ```java
   default:
       System.err.println("WARN: unknown opcode " + _opcode_ + " at offset " + _offset_ + " (treated as no-operand)");
       break;
   ```
2. **`Opcodes.opcodes[]` bounds** — the table only had 286 entries; extended opcodes
   index `256+byte`, so 289 threw `ArrayIndexOutOfBoundsException`. Made the array
   non-final and padded it to 512 with `unkown_<n>` placeholders in a `static` block.
3. **Unresolved static-field fixup** — `DataSection.update_staticFieldsFixupTable` NPEs when
   a `MemberRef.getMember()` can't be resolved (foreign member). Added a null guard
   (`r1 == null || u1 == null || u1.getModule() == null` -> `continue`).
4. **Null routine ref** — `Code.java:1778` (`_source_.append(_routine_3_.getName())`) NPEs on
   a null object ref. Added a null guard.

Rebuild (only the touched classes need recompiling; overlay into the existing `out/`):
```
javac -nowarn -d tools\coddec\out -cp tools\coddec\out ^
  tools\coddec\src\net\rim\tools\compiler\codfile\Code.java ^
  tools\coddec\src\net\rim\tools\compiler\codfile\DataSection.java ^
  tools\coddec\src\net\rim\tools\compiler\vm\Opcodes.java
```
Result: `net_rim_cldc.cod` decompiles cleanly (exit 0) into **4969 `.java` sources**.

## 2. Code-signing crypto — `net.rim.device.api.crypto.RIMSignature`

The signature on a COD is verified by real public-key crypto (module `net_rim_cldc-6`):

- `verify(data,off,len, sig,sigOff, pubkey)` tries a **RIM file-signer signature** (RSA) then
  falls back to **PGP** (RSA or DSA).
- `verifyRIMFileSignerSignature` parses a fixed header and RSA-verifies a **SHA1** digest:
  - magic bytes asserted: `0x1F 0x2D 0xC8 0xD7` (`1F2DC8D7`), then a 4-byte date, then a
    key id / length field.
  - `DEFAULT_RSA_E = {3}` → **RSA exponent 3** (legacy RIM).
  - `RSA_PKCS1_SHA1_DIGEST_PREFIX = 30 21 30 09 06 05 2b 0e 03 02 1a 05 00 04 14`
    (PKCS#1 v1.5 SHA-1 DigestInfo); `RSA_PKCS1_MD5_DIGEST_PREFIX` for PGP-MD5.
  - `verifyRSASignature` calls native `NativeRSA.publicKeyOperation(len*8, ...)` and compares.
  - returns `date*1000` on success, `0` on failure.
- `net.rim.device.api.crypto.MIDletSecurityCrypto` wraps a platform `_impl.checkMIDletSignature(
  Digest, signerId, signers[], data, sig )` (SHA-1 digest via `getMIDletSignatureDigest`) and
  exposes an ECC `CURVE_NAME`.

=> The COD signature is a genuine ~1024-bit RSA (e=3) / SHA-1 signature. It cannot be
   forged without RIM's private key.

## 3. The controlled-access gate — `net.rim.device.api.system.ControlledAccess`

This is the **public API** that gates privileged behaviour (module `net_rim_cldc.cod`,
class 21). Key members:

- `verifyCodeModuleSignature(int moduleHandle, int signerId)` and
  `verifyCodeModuleSignature(int moduleHandle, CodeSigningKey key)` -> both delegate to a
  library routine `net_rim_cldc-10.class#34.routine_24764` (the native verify).
- `verifySignatures(boolean all, int signerId)` -> checks the current module and (optionally)
  every loaded module.
- Public convenience wrappers that hard-code the signer ids:
  - `verifyRRISignature` / `assertRRISignature` -> signer id **51 (0x33)**.
  - `verifyRCISignatures` / `assertRCISignature` -> signer id **0x494352 = "RCI"**.
  - (`assert*` throw `ControlledAccessException` on failure.)
- Holds `CodeSigningKey _readKey` / `_replaceKey` (public/private key material for controlled
  access) and implements `Persistable`.

**Signer id = 4-byte ASCII tag** (little-endian int constants):
`"RRI"`=RIM master **0x33 (51)**, `"RCI"`=`0x494352`, `"RRT"`=`0x545252`,
plus `"RBB"`/`"RCR"` seen as COD signature records (session31).

## 4. The `missing RRT signature` gate — `ApplicationManagerImpl`

`net.rim.device.api.system.ApplicationManagerImpl` (module `net_rim_cldc.cod`) computes which
modules get to autostart. The relevant branch (decompiled bytecode):

```
iload 9 ; bipush 51 ; invokestatic ControlledAccess.verify... (signerId=51/RIM)
ifne trusted                                   ; RIM-signed -> trusted, skip
    if tier <= 5 -> log "module <name> missing RRI signature" ; skip
    else:
        verify... (signerId = 0x545252 "RRT")
        ifne trusted                           ; has RRT -> trusted
        if module.<flag>() (already signed) -> trusted
        else log "module <name> missing RRT signature" ; skip (no autostart)
```

So a module is "signed" iff it is signed by RIM (0x33) **or** carries an `RRT` signature
(plus a couple of special-cased tiers/flags). Otherwise the AppManager logs
`missing RRI/RRT signature` and does **not** grant autostart / controlled APIs — exactly the
behaviour observed live in session05/31.

`ApplicationManagerImpl` also implements the tier scheduler (`startTier`/`waitForTier`,
`_startupTiersRun`, `_startupTierInProgress`).

## 5. Conclusion

The module-signing wall is now characterised end-to-end at the source level:

- COD signature records (`RBB`/`RCI`/`RCR`/`RRT`, vendor `0x33`) are **RSA-1024 (e=3) /
  SHA-1** signatures verified against a `CodeSigningKey` public modulus.
- `net.rim.device.api.system.ControlledAccess` is the public gate
  (`verifyCodeModuleSignature(handle, signerId)`), used both by `ApplicationManagerImpl`
  (autostart) and by every controlled API (ITPolicy, connections, GPS, MIDlet, ...).
- Without RIM's private key there is no way to make an arbitrary module "signed", so no
  autostart and no controlled-API access. This matches the decades-long absence of a
  software-only bypass and confirms session05/session30.

Remaining true bypass routes are unchanged: a boot-chain/kernel tamper (PSIRT 000036557,
session30) or abusing a runtime bug in the verifier itself.

## Artifacts
- Key decompiled sources saved to `recon/cldc-sources/`:
  `RIMSignature.java`, `MIDletSecurityCrypto.java`, `ControlledAccess.java`,
  `ApplicationManagerImpl.java` (excerpt region), `net_rim_cldcRIMResources.java`.
- Full decompile (4969 files) kept only in scratch: `%TEMP%\opencode\bb9930\dec_root\decompiled\net_rim_cldc\`.
- coddec patches: `Code.java`, `DataSection.java`, `Opcodes.java` under `tools/coddec/src/`
  (gitignored; diffs described in §1).
