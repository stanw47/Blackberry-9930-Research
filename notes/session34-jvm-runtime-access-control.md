# Session 34 — JVM track: launching an unsigned module (runtime access control)

Follow-up to session33. The user launched the two installed unsigned modules from the
device UI. Result: unsigned code **does run**, but the runtime **controlled-access gate**
fires immediately: an uncaught `IllegalArgumentException` and a trust prompt, and
`EventLogger` produces nothing for an unsigned app. `EventLogger`'s class-level
`secureIndex` is 255, so this proves the gate is also enforced **per member (method)**,
not only per class.

## Timeline (device event log)

```
15:45:39  AMGF WSSBootTest(261)            <- user launched WSSBootTest (UI ran)
15:45:41  AMRF WSSBootTest(261)
15:45:41  AMFD WSSBootTest(261)
15:45:47  AMOS net_rim_bb_trust_application_manager(262)
15:45:47  UI  GS+Q5 ... TrustApplicationDialog      <- OS trust/access prompt shown
15:45:49  UI  GS-D ...
15:45:49  CMM: JvmProbe2(4905) no sig from 0x424252  <- "RBB" signer check
15:45:49  [Java Exception] IllegalArgumentException / "No detail message"
              JvmProbe2.<clinit>  +0x254
              JvmProbe2.main      +0x54
15:45:49  AMGF JvmProbe2(263)
```

- `AMGF`/`AMRF`/`AMFD` = ApplicationManager grant-foreground / remove-foreground /
  foreground-done. `AMOS` = ApplicationManager open-something. `AMSF` = switch-foreground.
- **`TrustApplicationDialog`** (`net.rim.device.internal.ui.security.component`) — the OS
  raised its interactive "application is trying to…" trust prompt when the unsigned app
  touched a protected API.
- New signer id observed at launch: **`0x424252` = "RBB"**.

## The exception

`severity:1 type:3 app:Java Exception`:
```
IllegalArgumentException
No detail message
 JvmProbe2.<clinit>  0x254
 JvmProbe2.main      0x54
```
The static initializer (which touched `ControlledAccess`/`CodeSigningKey`) threw, and the
throwable propagated out through `main`. The VM reports the fault offset inside `<clinit>`
and inside `main`. This is the VM's runtime "protected access" fault for an unsigned
caller. (It is raised at the protected call site and escapes the Java-level
`catch(Throwable)` — i.e. the check is imposed by the VM, not by ordinary Java code.)

## EventLogger is unusable unsigned

Across both launches (WSSBootTest and JvmProbe2) there is **not one** event-log record
from either app's `EventLogger.logEvent(...)` calls (searched by GUID and by registered
app name). Yet `net.rim.device.api.system.EventLogger` reports class-`secureIndex = 255`
(not secure) in `coddec --secure`. Conclusion:

- The link-time controlled-access check keys on the **class** `secureIndex`.
- The **runtime** gate is finer-grained (member/method-level) — an unsigned app can link
  against `EventLogger`/`ControlledAccess`/`CodeSigningKey` (all 255) but cannot actually
  *use* the protected members.

## Consolidated model of the access-control wall (sessions 32-34)

1. **Module signature (CMM)** — RIM `0x33`, RRT `0x545252`, RBB `0x424252`, … checked at
   add/link; unsigned ⇒ "no sig from 0x…" logged.
2. **Link-time API access control** — the class linker refuses references to classes with
   `secureIndex != 255` (`CodeModuleManager`=4, `ApplicationManager`=4, `RIMSignature`=2):
   `attempts to access a secure API` → `Linker error: 'VerifyError'`; the module never
   runs.
3. **Runtime member access control** — even referenceable (255) APIs have protected
   members; first use by an unsigned caller raises `IllegalArgumentException`,
   accompanied by a system `TrustApplicationDialog`.
4. **Autostart / trust tier** — `AppManager: module … missing RRT signature` (session05),
   so unsigned modules cannot autostart.

Net: there is no software-only path to use a privileged API from an unsigned Java module;
the gate is enforced by the VM at link and run time, in addition to the COD signature
trailers.

## Artifacts
- `recon/device/eventlog5.txt` (full log with the launch + exception).
- `experiments/jvmprobe/JvmProbe2.java` (the runtime probe).

## Queued (user-requested)
Produce a **complete controlled-access map of the OS** by digging into the COD
class/routine/field records — i.e. extend `coddec --secure` beyond the class-level
`secureIndex` to the per-member flags so we can enumerate exactly which methods/fields
are protected and for which signer. See session33 §3 for the current dumper.
