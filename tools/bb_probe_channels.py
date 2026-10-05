#!/usr/bin/env python3
"""bb_probe_channels.py - try candidate USBPort channel names on the 9930 OS
session (0FCA:8004) via SELECT_MODE, to find the Application Loader's channel.

Context (session24 recon): Loader.exe opens a named device channel over the
classic socket protocol. Candidate names seen in the host stack:
  DesktopMgr, RIMDeviceConfig, RIMDeviceFileAccess, BlackBerry_Backup, BBPIN
plus the known mode names (RIM Desktop, RIM_JavaLoader, RIM_JVMDebug).

Each SELECT_MODE needs a fresh device state -> USB reset before each name.
A reply cmd 0x08 = MODE_SELECTED (channel exists); 0x09 = NOT_SELECTED.

Usage:  python3 bb_probe_channels.py            # default candidate list
        python3 bb_probe_channels.py Name1 Name2
"""
import sys, time, struct
import usb.core, usb.util

VID, PID = 0x0FCA, 0x8004
EP_IN, EP_OUT = 0x82, 0x02
SB_SELECT_MODE = 0x07

DEFAULT = [
    "DesktopMgr",
    "RIMDeviceConfig",
    "RIMDeviceFileAccess",
    "BlackBerry_Backup",
    "BBPIN",
    "RIM Desktop",
    "RIM_JavaLoader",
    "RIM_JVMDebug",
]


def find():
    d = usb.core.find(idVendor=VID, idProduct=PID)
    return d


def reset_and_open(wait=3.0):
    d = find()
    if d is None:
        return None
    try:
        d.reset()
    except Exception:
        pass
    time.sleep(wait)
    for _ in range(10):
        d = find()
        if d is not None:
            break
        time.sleep(0.5)
    if d is None:
        return None
    try:
        d.set_configuration()
    except Exception:
        pass
    try:
        if d.is_kernel_driver_active(0):
            d.detach_kernel_driver(0)
    except Exception:
        pass
    usb.util.claim_interface(d, 0)
    return d


def drain(d, n=8, tmo=150):
    for _ in range(n):
        try:
            d.read(EP_IN, 0x10000, timeout=tmo)
        except usb.core.USBTimeoutError:
            return


def select(d, name):
    payload = name.encode()[:16].ljust(16, b'\x00')
    p = struct.pack('<HHB', 0, 8 + len(payload), SB_SELECT_MODE) + struct.pack('<H', 0x00FF) + b'\x00' + payload
    d.write(EP_OUT, p, timeout=2000)
    # read up to 3 replies (mode reply + possible seq handshake)
    out = []
    for _ in range(3):
        try:
            out.append(bytes(d.read(EP_IN, 0x10000, timeout=800)))
        except usb.core.USBTimeoutError:
            break
    return out


def main(argv):
    names = argv[1:] or DEFAULT
    for name in names:
        print("=== %-22s ===" % name)
        d = reset_and_open()
        if d is None:
            print("   device not found after reset (needs replug?)")
            return 2
        try:
            drain(d)
            replies = select(d, name)
            if not replies:
                print("   no reply")
            for r in replies:
                cmd = r[4] if len(r) >= 5 else None
                sock = struct.unpack_from('<H', r, 5)[0] if len(r) >= 7 else None
                tag = {0x08: "MODE_SELECTED", 0x09: "NOT_SELECTED",
                       0x13: "SEQUENCE_HANDSHAKE"}.get(cmd, "")
                print("   cmd=0x%02X %-18s socket=%s  raw=%s"
                      % (cmd, tag, ("0x%04X" % sock) if sock is not None else "-", r.hex()))
        except Exception as e:
            print("   error: %r" % (e,))
        finally:
            try:
                usb.util.release_interface(d, 0)
            except Exception:
                pass
        time.sleep(0.5)
    return 0


if __name__ == '__main__':
    sys.exit(main(sys.argv))
