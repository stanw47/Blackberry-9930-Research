# Session 18 — The signing gate is the JVM "secure" flag

Date: 2026-10-04
Follow-on from session17. Traced *what* the enforcement gate
(`FUN_40161B9C`) actually reads, and how it is provisioned.

---

## 1. The gate is the "JVM secure" state

`FUN_40161B9C` (session17) is exactly the value logged as **`JVM: secure %d`**
and **`JVM: secure dev=%d app=%d`**
(strings at file `0x15E0B8` / `0x15E0CC`). Recap:

```c
char FUN_40161B9C(void){                       // "secure"
  if (*(char*)(ctx+0x64) == 0) return *(char*)(ctx+0x6C);
  return 1;
}
// ctx = *0x473003C0 ; ctx base = 0x473003C8
```

In `Ce_CodeSigning_verify` (`FUN_4016A7A0`), when `FUN_40161B9C()==0` the
module is accepted **without any valid signature** (`local_198 =
FUN_4016A754()` returns 1). So:

```
secure = (persistent property 0x32 != 0) || (ctx+0x6C != 0)
accept unsigned  <=>  property 0x32 == 0  &&  ctx+0x6C == 0
```

- `FUN_40161C2C` ("app"): `secure || ctx+0x6D != 0` (`ctx+0x6D` from token
  pair `0x4A4ADCD7:0x6E436E26`).
- `FUN_40161B68`: `(ctx+0x64==0) && (ctx+0x6C!=0)` — a secondary check.

## 2. Where the flags are read/set

### `FUN_4015DC00` — JVM startup / secure-mode init
This is the AP "start the JVM" path (`JvmOSReset`, `JvmLoadCode - %d cods`,
`JVM: start thread`). Relevant excerpt:

```c
FUN_401657E8(param_1);                       // init ctx = 0x473003C8
*ctx = func_0x404a8f90();
... *(char*)(ctx+0x19) = (local_3c != 0);    // some boot flag
*(char*)(ctx+0x65) = local_78[0];
...
// read persistent property id 0x32 (8 bytes) into ctx+0x64
iVar6 = FUN_40205FC0(0, 0x32, ctx + 0x64);
if (iVar6 == 0) {                            // property absent -> CLEAR
    *(u32*)(ctx+0x64) = 0; *(u32*)(ctx+0x68) = 0;
    FUN_402067D8(0, 0x32, 0, 0);
}
...
uVar7 = FUN_40161B9C();                      // "secure"
uVar5 = FUN_40161C2C();                      // "app"
FUN_40161F24("JVM: secure dev=%d app=%d", uVar7, uVar5);
```

So **`ctx+0x64` = config property id `0x32`**, read from persistent store via
`FUN_40205FC0` (property API). No writer of property `0x32` with a non-zero
value exists anywhere in the analysed AP image — the only literal-`0x32` write
is the "absent -> clear to 0" branch above. Therefore property `0x32` is
provisioned **outside the AP JVM** (factory tooling / SBL / a fused secure-boot
state), or via the indexed config-write API not using a literal.

### `FUN_401593E4` — Nessus debug/RCP command dispatcher (cmd 0x00..0x54)
Sets `ctx+0x6C`:
```
0x4015A47C  movw r1,#0x3c0
0x4015A480  movt r1,#0x4730        ; r1 = 0x473003C0
0x4015A484  ldr  r1,[r1]           ; r1 = ctx
0x4015A488  strb r0,[r1,#0x6c]     ; ctx+0x6C = (byte)cmd_arg
```
Jump-table index => **command `0x3C` / `0x3D`** of the dispatcher sets it.
The dispatcher's other cases are debug/engineering commands
("Attach Debugger After Reset Enabled", "Breakpoint not supported",
"Event log cleared", "All persistent data cleared",
"Native profiling not supported", "Logged stacks dumped", ...). This is the
Nessus kernel debug shell, not a normal user interface.

### Property API (persistent config store)
```
read : FUN_40205FC0 / FUN_40205F04 / FUN_40205E00 / FUN_402053D8
write: FUN_402067D8 / FUN_402067A8 / FUN_402066E8 / FUN_4020545C
       FUN_40205994(id) rejects id >= 0x4c
```
Property ids seen: `0x01` flags, `0x22` 32-byte blob, `0x32` = JVM secure,
`0x47/0x48/0x4b` attack/recovery flags, `0x49` state.

## 3. Interpretation

- RIM's own verifier has an explicit **"secure == 0 -> accept unsigned"**
  branch, selected by a persistent config property plus a kernel-debug
  command bit. This is the developer/engineering-build bypass.
- On a retail 9930 the boot log shows `RRT` enforcement (session05), so
  `secure == 1` there — i.e. property `0x32` is provisioned nonzero on retail.
- The only ways to reach `secure==0` seen so far:
  1. Clear persistent property `0x32` (need write access to the config store).
  2. Issue debug command `0x3C`/`0x3D` to the Nessus debug dispatcher
     (`FUN_401593E4`) with arg 0.
- Both require a privilege we don't yet have, so this is the *target state*,
  not yet the entry primitive.

## 4. Next steps
1. Identify the config store backing `FUN_40205FC0` (which flash partition/NV
   region?) and whether it is the same store exposed to host tools
   (`RIM_JavaLoader` / backup / OTA). Trace `FUN_402058F8` / `FUN_40205960`.
2. Determine how property `0x32` is provisioned at factory / by SBL: search the
   OSBL/PBL for writes to the same store, and for a "secure boot fused" flag.
3. Determine reachability of Nessus debug command `0x3C`/`0x3D`: is
   `FUN_401593E4` dispatched from any USB/JVMDebug/backdoor path?
4. Check the DeviceSwitch `BackdoorKeyListener` key sequence (session16) — it
   may arm an engineering/debug state.
5. Cross-check the live device: whether `secure` can be read/observed via the
   OS session (channel0 `GetVar` or a debug query).

## 5. New addresses
```
FUN_40161C2C  "app" = secure || ctx+0x6D
FUN_40161B68  secondary check (ctx+0x64, ctx+0x6C)
FUN_4015DC00  JVM startup; reads property 0x32 -> ctx+0x64
FUN_401593E4  Nessus debug cmd dispatcher; cmd 0x3C/0x3D writes ctx+0x6C
FUN_40205FC0  config read (property id 0x32)
FUN_402067D8  config write
FUN_402067A8  config write (id,val)
FUN_402066E8  config write (id,buf,len)
FUN_40205994  property id validity (id < 0x4c)
```
See `recon/osbl_verifier_functions.txt` for the full map.
