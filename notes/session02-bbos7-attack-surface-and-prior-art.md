# Session 02 — BBOS 7 attack surface, prior art, and tooling

Date: 2026-10-02
Device: BlackBerry Bold 9930, **Sprint** variant, PIN `0x3321FC37`, OS `7.1.0.1066`

This session is desk research + tooling bootstrap. Nothing was written to the
device. Goal: understand the platform, find prior art, and stand up a working
reverse-engineering pipeline for the Java OS layer.

---

## 1. Sprint variant confirmed

The module dump contains Sprint-specific modules (all `7.1.0.1066`):

```
net_rim_sprint_slateclient_lib      1,988 B
net_rim_sprint_dss_lib              3,808 B   (Device Self Service client API)
net_rim_sprint_dss_app            109,560 B
```

Also note the bundled help modules are `net_rim_bb_help_9900_series__*`
(version `5.0.0.26`) — 9900/9930 share the 640x480 platform image.

## 2. Platform background (BBOS 7)

- **SoC**: Qualcomm MSM8655 (Snapdragon S2), single Scorpion core, Adreno 205.
- **OS model**: not QNX. The OS is a **Java ME (CLDC 1.1 / MIDP 2.1)** stack
  running on a RIM JVM. The radio/OS core is signed; applications are signed
  `.cod` modules. RIM's compiler strips debug info and collapses member names,
  so reversing relies on the COD container structure.
- **Boot chain (BBOS-era)**: Qualcomm PBL (BootROM, has EDL) → RIM bootloader
  → signed OS/radio. (The BB10 `boot0`/BBSS/RAMLoader chain is *later* silicon;
  MSM8655 predates it and needs its own mapping.)

## 3. Prior art — the important findings

### 3.1 The 2014 "tethered jailbreak" disclosure (Qualcomm BBOS 7)

BlackBerry PSIRT article **000036557** ("response to reports of tethered
jailbreak vulnerabilities"):

- Affected: **Qualcomm-based BBOS 7.1 and earlier**, explicitly including the
  **Bold 9930** (plus 9900, 9650, Curve/Storm/Pearl/Torch Qualcomm models).
  Non-Qualcomm models (9700/9780/9790) are **not** affected.
- Vulnerability location: **"the bootloader of the BlackBerry kernel."**
- Impact: load a **modified kernel**, make changes **persistent**, **access all
  device data**, **access all hardware** (camera/mic). Requires **physical USB
  access**.
- **Change log: "12-26-2014 Initial publication"** — the disclosure dates to
  **2014**, not 2020 (2020 was just a PSIRT rebrand of the KB article).

Status of public tooling:
- CrackBerry thread "Exploiting vulnerability to run Linux"
  (`forums.crackberry.com/blackberry-os-f298/...-1197148`) asks how to exploit
  it; the on-page consensus is **"This never amounted to anything."**
- `bootloader-unlock-wall-of-shame` (TCL/BlackBerry): **no bootloader unlock
  exploit** for any pre-TCL BlackBerry; BB10 root (Oleksandr) is the only
  software root. It separately notes **CVE-2021-1931** (a Qualcomm bug) as an
  entrypoint toward an untethered unlock on some BlackBerry.
- **Conclusion: a public, reproducible BBOS 7 tethered-jailbreak tool does not
  exist.** Reproducing the 2014 finding on the 9930 would be a genuine,
  publishable contribution — and it maps directly onto your existing
  loader/boot-partition methodology from BB10.

### 3.2 PlaidCTF 2014 "bbos" — the 9930 simulator precedent

Two independent writeups (fail0verflow/Eindbazen as 0xffa; VXRL). Key facts for
us:

- The **9930 simulator** (`fledge.exe` + device DLL `fledge9930.dll`) is **not
  an ARM emulator** — it runs the **RIM JVM natively on x86**, with RIM APIs
  implemented in plain x86. So the simulator is a *dynamic-analysis target*:
  the OS can be run and idb/Ghidra-debugged.
- Native password path: `RimGetPasswordFailureCount`, `RimVerifyPassword(s)`,
  `RimVerifyPasswordChallenge`, `RimResetPassword`, `RimInitiateResetWithCode`.
- Password check reads **NV record `0x2801`** via `NvGetRecordCopy`, then does a
  **0x14-byte (SHA-1) memcmp**. The record in memory after load:

  ```
  02 00 01 00 3C 00 00 00  <20-byte SHA1>  FF FF FF FF ...
  ```

- NV record framing in a raw NAND/NV dump: search for `00 01 01 28`
  (`00 01` type, `01` version, `28 01` = record ID **0x2801**, little-endian
  0x0128). The SHA-1 digest sits at **+0x18** into the record body:

  ```
  0000053000: 00 01 01 28 03 00 00 00 10 CF FF EF 00 00 00 00
  0000053010: 00 10 00 00 3C 00 00 00 6F 4A 98 6F 02 00 01 00
  0000053020: 3C 00 00 00 3E 27 0F 54 C6 EB 31 75 B4 EF 8B 20   <- SHA1 @ +0x18
  0000053030: 08 07 95 EF 2E E1 55 89 FF FF FF FF FF FF FF FF
  0000053040: FF FF FF FF 00 00 00 00 0A 00 00 00 CF 2C B0 00
  0000053050: E9 97 92 B2 F0 F8 18 00 4E 56 52 45 FF FF FF FF   <- "NVRE"
  ```

  (`4E 56 52 45` = ASCII `NVRE` — an NV record trailer.)

- This gives us a concrete, reproducible way to parse BBOS NV/password data
  once we can read the device's NV region (ISP/eMMC), and ties to the NV work
  in your BB10 repo.

### 3.3 RAMLoader / USB download protocol

`ivoszbg/bb-usbdl` reverses the BlackBerry **RAMLoader** recovery protocol used
by BB10 (MSM8960): PBL → BBSS → BOOT0 (RIM's SBL replacement, contains
RAMLoader) → STARTUP.BIN → IFS. Command header:

```c
typedef struct ControlMessageHeader {
    unsigned short type;
    unsigned short packetSize;
    unsigned char  command;
    unsigned char  mode;
    unsigned short packetId;
} __attribute__((packed));
```

Access: on boot with USB attached there is a 5–10 s window for a mode command
(LED red); otherwise normal boot proceeds. The tool can `info` and `reboot`, but
does not yet send a payload. **This is BB10, not BBOS 7**, but it is the closest
BlackBerry-specific protocol reversing and a template for the 9930's loader.

### 3.4 Qualcomm EDL / Sahara / Firehose

- Aleph Research ("Exploiting Qualcomm EDL Programmers", Firehorse) — PBL EDL,
  Sahara/Firehose, and undocumented `peek`/`poke` giving EL3 code execution on
  some programmers; PBL dumps obtained for MSM8974 etc.
- Practical tool: `bkerler/edl` (Sahara/Firehose client). Requires an OEM-signed
  **firehose programmer** matching the SoC fuses; black-box devices often lack
  one. Unknown whether a BlackBerry/MSM8655 programmer is obtainable.

### 3.5 Code signing / key material

- BlackBerry OS Cryptographic Kernel: FIPS 140-2 validated firmware crypto
  module; RSA public key verifies firmware integrity. Code signing uses RIM's
  signing authority; **servers are offline**, so new signed apps can no longer
  be produced (see §4 tooling note).
- `elfland/HackTeam-core-blackberry` contains an old, leaked `sigtool.csk`
  secure-storage blob and `sigtool.db` material — historical signing-key
  research artifact (handle with care; likely long dead).

## 4. Tooling bootstrap (this session)

Built and working locally under `tools/`:

| Tool | Source | Status |
|------|--------|--------|
| `jde71/JavaLoader.exe` | BlackBerry JDE 7.1.0 (archive.org, carved CAB) | works; used for the dump |
| `jde71/rapc.exe`, `SignatureTool.jar`, `net_rim_api.jar` | same | available |
| `coddec` | Dr. Bolsen's decompiler (Java) | **compiled with javac → 262 classes**, works |
| `bb-tools` | waltermin (Rust: `bb-cod`, `cod2jar`, `bb-debug`, `fs-inspector`) | cloned; **not built (no Rust)** |

`coddec` usage:
```
java -cp tools\coddec\out net.rim.tools.a.coddec <module>.cod
# writes specimens\decompiled\decompiled\<module>\<package>\<class>.java
```
Note: the Gradle `mainClassName` (`...compiler.Compiler`) is the compiler, not
the decompiler; call `net.rim.tools.a.coddec` directly.

### Decompilation results (samples)

Decompiled successfully into `specimens/decompiled/`:

- `net_rim_sprint_dss_lib` → `DSSClientAPI.java` (14 KB) — clean, name-resolved.
- `net_rim_bb_securitymonitor` → `SecurityMonitor$SecurityMonitorImpl.java`
  (67 KB) — **high value**, see §5.
- `net_rim_bb_models` → `BodyModelImpl.java` (29 KB) etc.
- `net_rim_bb_trust_application_manager` → **empty**; coddec throws
  `NullPointerException` in `Code.disassemble` (null routine name). Tooling gap.
- `net_rim_bb_application_permissions_proxy` → **empty** (same class of failure).

## 5. First real finding: SecurityMonitor (OS 7.1.0.1066)

`SecurityMonitor$SecurityMonitorImpl` (implements `SystemListener`,
`GlobalEventListener`, `ITPolicyChangedListener`, `RealtimeClockListener`, and
`DelayedWipeManager`) exposes the device's **automatic-wipe state machine**:

```
private Security _security;
private String LOCK_WIPE, IT_POLICY_WIPE, DELAYED_WIPE;
private boolean _lowBatteryWipe;
private long _itPolicyWipeDelay, _lockWipeDelay, _itPolicyTimestamp;
private int _lockCounter, _unlockCounter;
private ApplicationDescriptor _itPolicyWipeApplicationDescriptor, ...
private PersistentObject _persistentObject;
```

Fields of interest for security research: password-failure/lock wipe counters,
IT-policy wipe delay, and a `Security` (internal) instance. This is the module
to study for the "10/10 password attempts" behavior and for the interaction
between lock, IT policy, and delayed wipe.

## 6. Attack surface map (ranked)

1. **Bootloader / RAMLoader lane** — the 2014 disclosure lives here; no public
   tool. Next concrete step: observe the 9930's USB enumeration in
   loader/BootROM mode and capture the RIM download protocol (mirror your
   `bblink.py`/`listen_flash.py` approach).
2. **eMMC ISP + NV parsing** — chip-off/ISP read of the 8 GB eMMC; parse NV
   records (`00 01 01 28` framing, `NVRE` trailer, record `0x2801` = password)
   per the PlaidCTF data. Directly extends your BB10 dump work.
3. **Qualcomm EDL** — check for an MSM8655 firehose programmer; if found, raw
   read/write.
4. **Java OS security model** — decompile `net_rim_crypto*`, `net_rim_bb_crypto_api`,
   `net_rim_bb_trust_application_manager`, `net_rim_bb_application_permissions_proxy`;
   map code-signing/trust enforcement.
5. **Simulator dynamic analysis** — if the **9930 simulator 7.1.0.355** can be
   sourced, the OS runs natively on x86 and can be debugged (per PlaidCTF).

## 7. Tooling gaps / TODOs

- Fix or work around the coddec `Code.disassemble` NPE (null routine name) for
  `trust_application_manager` / `application_permissions_proxy`.
- Build `bb-tools` (needs Rust) for a modern COD parser + `cod2jar` + flash
  `fs-inspector`.
- Source the **9930 simulator 7.1.0.355** (dynamic OS analysis).
- Try to enter **EDL (9008)** and probe for a firehose programmer.
- Hunt the exact **9930 A7.1.0.1066 Sprint OS installer** (still open from
  session01).

## 8. References

- BlackBerry PSIRT 000036557 — tethered jailbreak (Qualcomm BBOS 7.1)
- PlaidCTF 2014 "bbos": fail0verflow (marcan et al.) + CTFtime VXRL writeup;
  task `ctftime.org/task/1097`
- `ivoszbg/bb-usbdl` — RAMLoader protocol reversing
- Aleph Research — Qualcomm EDL/Firehose ("Firehorse"), `bkerler/edl`
- `george-hopkins/coddec`, `waltermin/bb-tools`
- `bootloader-unlock-wall-of-shame` (TCL/BlackBerry), CVE-2021-1931
- BlackBerry FIPS 140-2 security policies (Cryptographic Kernel / Java Module)
