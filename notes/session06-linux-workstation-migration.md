# Session 06 — Linux workstation setup & continuation

Date: 2026-10-04
Device: BlackBerry Bold 9930 (Montana), MSM8655, BBOS 7.1.0.1066, PIN `0x3321FC37`

Host moved from Windows to Linux. Reason: on Windows the BootROM
(`VID_0FCA / PID_0001`) was descriptor-readable but **not claimable** by libusb
(`Operation not supported or unimplemented on this platform`) while `RimUsb`
held the interface — see `recon/bootrom_channel0_test.log`. On Linux the kernel
binds the interface to the generic `usb` driver unless a vendor driver claims
it, so `detach_kernel_driver` + `claim_interface` (already in `bblink.py`) work
without any WinUSB/Zadig swap.

This note records the Linux baseline, the re-provisioning of the toolchain
(which was deliberately **not** committed — see README §Toolchain), and the
exact next steps to resume the boot-chain work.

---

## 1. Host baseline (verified on this machine)

| Tool | Present | Notes |
|------|---------|-------|
| Python | 3.13.5 | use `python3`; scripts are py3 |
| pip | 25.1.1 | `pip install --user` if PEP-668 blocks system installs |
| pyusb | installed | `import usb.core` works |
| libusb-1.0 | `/lib/x86_64-linux-gnu/libusb-1.0.so.0` | pyusb finds it automatically |
| Java | OpenJDK 25 | for `coddec` (compiled classes target old bytecode; runs on 25) |
| Rust/Cargo | 1.85.1 | for `bb-tools` |
| Wine | **not installed** | needed only if we insist on the original `javaloader.exe` / `rapc.exe` |

The BootROM scripts import `libusb_package` first and silently fall back to the
system libusb when it is absent:

```python
try:
    import libusb_package
    BACKEND = libusb_package.get_libusb1_backend()
except Exception:
    BACKEND = None   # -> pyusb uses the system libusb
```

So no install is required for the BootROM lane on Linux. Confirm with:

```bash
python3 - <<'PY'
import usb.core
print("pyusb backend:", usb.core.find()._ctx if False else "ok")
PY
```

---

## 2. udev rule (non-root USB access)

Without this, `/dev/bus/usb/...` is root-only and claim fails with a permission
error. Add a rule for the BlackBerry vendor ID:

```bash
sudo tee /etc/udev/rules.d/99-blackberry.rules >/dev/null <<'EOF'
# BlackBerry (RIM) USB - BootROM / RAM-loader / BBOS / BB10
SUBSYSTEM=="usb", ATTR{idVendor}=="0fca", MODE="0666", GROUP="plugdev"
EOF
sudo udevadm control --reload-rules
sudo udevadm trigger
```

Ensure the user is in `plugdev` (`sudo usermod -aG plugdev "$USER"`, re-login),
then replug the device. Verify ownership of the node while the device is in
BootROM mode:

```bash
ls -l /dev/bus/usb/*/*
```

---

## 3. Resume the BootROM lane (safe, read-only first)

Device must be **powered off, battery in, USB plugged in** to expose the ~12 s
BootROM window. Run in `tools/`:

```bash
cd tools

# 1. Passive descriptor watcher — never claims or writes. Confirms PIDs seen.
python3 bb_bootrom_probe.py 120
#    expect: PID=0001 (BootROM) bcd=0107, EPs 01/81 + 02/82, 64B

# 2. Claim-only test. No I/O. Should now print  CLAIM: OK  (unlike Windows).
python3 bb_bootrom_test.py

# 3. Optional: channel0 handshake (read-only get_var). NO flash writes.
#    CAUTION: any loader session on a PASSWORD-PROTECTED device may force a
#    security wipe. Only run on a device known to have no password set.
python3 bb_bootrom_test.py --io

# 4. Read-only BootROM session: ping0, get_var(0x0002), set_mode(RAMLoader),
#    read bootrom metrics. Still no flash writes.
python3 bb_bootrom_session.py
```

Expected on Linux where Windows failed: `set_configuration` and
`claim_interface` succeed, and `--io` / the session print a live channel0
exchange instead of `NotImplementedError`.

Record results back into `recon/` (new log), e.g.
`recon/bootrom_linux_session.log`.

### Pinning the protocol to the 9930

`bblink.py` is a faithful port of the **BB10 (MSM8960)** protocol
(`bbusb.pas` / `bbloader.pas` / `ramloader.pas`) and its default loader path is
`/tmp/opencode/bb10mt/loaders/loader_9700270A-00.bin` — a BB10 RAM-loader we do
**not** have for MSM8655. Treat `bblink.py` as the framing/crypto reference for
now; the 9930 BootROM work is `bb_bootrom_*.py` (channel0) until a
device-matching loader is found. The 2014 disclosure is in RIM's bootloader
*after* BootROM, so capturing the BootROM → bootloader transition
(`0001` → `0004` → `8004`, already seen in `recon/bootrom_descriptors.log`) is
the immediate target.

---

## 4. Re-provision the (uncommitted) toolchain on Linux

These were gitignored and live only on the Windows disk. Re-create as needed:

### 4.1 coddec (cross-platform Java) — highest value, no Wine

```bash
git clone https://github.com/george-hopkins/coddec /tmp/opencode/coddec
cd /tmp/opencode/coddec
# compile all sources, then run the decompiler entry point directly:
javac -d out $(find src -name '*.java')
java -cp out net.rim.tools.a.coddec \
  /home/stanw47/Blackberry-9930-Research/specimens/cod/net_rim_bb_securitymonitor.cod
```

Output lands under `specimens/decompiled/decompiled/<module>/`. This is how the
existing 18 `.java` files were produced. Known gap: `trust_application_manager`
and `application_permissions_proxy` throw a `NullPointerException` in
`Code.disassemble` (null routine name) — retry on JDK 25, otherwise dump only
constants/method signatures.

### 4.2 bb-tools (Rust: modern COD parser, cod2jar, fs-inspector)

```bash
git clone https://github.com/waltermin/bb-tools /tmp/opencode/bb-tools
cd /tmp/opencode/bb-tools && cargo build --release
```

### 4.3 JavaLoader / rapc (Windows PE) — only if needed

The classic `javaloader.exe` and `rapc.exe` are 32-bit Windows binaries. Two
options:

- **Barry** (`bjavaloader` / `bcharge`) — native Linux/protocol replacement for
  `javaloader` (device backup, eventlog, module ops). Preferred for reading the
  device from Linux.
- **Wine** — install the JDE 7.1.0 tree and Zulu JDK 6 into a prefix and run
  `rapc.exe`/`javaloader.exe` there. Needed only to rebuild
  `experiments/autostart/WSSBootTest`. The built artefacts are already
  committed, so this is not on the critical path.

If the JDE installer is re-downloaded (archive.org `blackberry-jde-7.1.0`), the
carve/extract recipe is in `notes/session01-baseline-module-dump.md` §2.

---

## 5. Immediate next steps (ordered)

1. **udev rule + replug**, confirm BootROM node ownership (§2).
2. **Claim test on Linux** — `python3 bb_bootrom_test.py`; success flips the one
   result that blocked Windows.
3. **Read-only BootROM session** — `bb_bootrom_session.py`; capture ping0 /
   get_var(0x0002) / set_mode(1) / metrics into a new `recon/` log. This is the
   first real wire-protocol capture from the 9930.
4. **Map the loader transition** — extend the descriptor watcher to timestamp
   `0001 → 0004 → 8004` and note the window length; start characterising the
   RIM bootloader handshake (the layer the 2014 advisory names).
5. **Source the exact 9930 OS installer** (`A7.1.0.1066 / PL5.1.0.699 Sprint`)
   — still open from session01; required before any write/flash experiment.
6. **Decompiler gap** — retry `trust_application_manager` /
   `application_permissions_proxy` with coddec on JDK 25, or use `bb-tools`
   `cod2jar` for a structural view.
7. Only after 1–5: the **write/exploit** phase (loader upload / signature
   bypass). Keep the full COD dump and a recovery installer on hand.

---

## 6. Safety notes carried over

- Loader/RAM-loader sessions can **force a security wipe on password-protected
  devices** (`bb_bootrom_test.py` docstring). Confirm no password is set, or
  accept the wipe, before step 3 `--io`.
- A bad autostart/system module can **boot-loop** the device; recovery is
  wipe + OS reinstall via Loader. `WSSBootTest` is currently installed on the
  device as a harmless manual-launch app; remove with (Linux/Barry or Wine)
  `javaloader -u erase -f WSSBootTest`.
- Nothing in the current tool set writes flash. Keep it that way until an OS
  installer and a device-matching loader are in hand.
