#!/usr/bin/env python3
"""bb_ch0_enum.py - enumerate the RIM channel0 command space on the live OS
session (0FCA:8004).

Channel0 framing (verified session07/session12, tools/bb_bootrom_test.py):
    wire = u16le(0x0000) + u16le(len(body)+4) + body
    body = cmd(1) + mode(1) + u16be(pkt) + data
Response = u16le(chan) + payload; payload[0]=reply cmd, payload[1]=mode.

Usage:
    python3 bb_ch0_enum.py [start] [end]      # default 0x00..0x40
    python3 bb_ch0_enum.py --all              # 0x00..0xFF (careful)
"""
import sys, time, struct
import usb.core, usb.util

PID = 0x8004
EP_IN, EP_OUT = 0x82, 0x02
VID = 0x0FCA

def p16(v): return struct.pack('<H', v)

def open_dev():
    d = usb.core.find(idVendor=VID, idProduct=PID)
    if d is None:
        return None
    try: d.set_configuration()
    except Exception: pass
    try:
        if d.is_kernel_driver_active(0): d.detach_kernel_driver(0)
    except Exception: pass
    usb.util.claim_interface(d, 0)
    return d

def reset_dev():
    d = usb.core.find(idVendor=VID, idProduct=PID)
    if d is None: return
    try: d.reset()
    except Exception: pass
    time.sleep(1.5)

class Ch0:
    def __init__(self, dev):
        self.d = dev; self.mode = 0xFF; self.pkt = 0
    def cmd(self, cmd, data=b'', tmo=1200):
        body = bytes([cmd, self.mode & 0xFF]) + struct.pack('>H', self.pkt) + data
        wire = p16(0) + p16(len(body) + 4) + body
        self.d.write(EP_OUT, wire, timeout=tmo)
        try:
            raw = bytes(self.d.read(EP_IN, 0x10000, timeout=tmo))
        except usb.core.USBTimeoutError:
            return None
        self.pkt = (self.pkt + 1) & 0xFFFF
        if len(raw) >= 4:
            ch = struct.unpack_from('<H', raw, 0)[0]
            payload = raw[4:]
            if len(payload) >= 2:
                self.mode = payload[1]
            return (ch, payload)
        return (None, raw)

# Commands observed to reboot/power-off or wedge the OS session. Do NOT send
# these unless you can physically power-cycle the phone.
#   0x00 -> device dropped off USB entirely (no re-enumeration; needs replug)
#   0x03 -> reboot (session12)
#   0x0C -> wedges the session (session12)
DANGEROUS = {0x00, 0x03, 0x0C}

def main(argv):
    lo, hi = 0x00, 0x40
    if '--all' in argv: lo, hi = 0x00, 0x100
    elif '--force' in argv:
        argv = [a for a in argv if a != '--force']
        DANGEROUS.clear()
    if len(argv) >= 3:
        lo, hi = int(argv[1], 0), int(argv[2], 0)
    d = open_dev()
    if d is None: sys.exit("device not present")
    c = Ch0(d)
    print("probing channel0 commands 0x%02X..0x%02X (mode=0x%02X)" % (lo, hi - 1, c.mode))
    try:
        for cmd in range(lo, hi):
            if cmd in DANGEROUS:
                print("  cmd 0x%02X : SKIPPED (dangerous: reboot/power-off)" % cmd)
                continue
            r = c.cmd(cmd)
            if r is None:
                print("  cmd 0x%02X : TIMEOUT" % cmd)
                # try a reset to recover
                usb.util.release_interface(d, 0)
                reset_dev()
                d = open_dev()
                if d is None:
                    print("  device lost after cmd 0x%02X" % cmd); return
                c = Ch0(d)
            else:
                ch, payload = r
                print("  cmd 0x%02X : ch=%s len=%d %s" % (cmd, ch, len(payload), payload[:48].hex()))
    finally:
        try: usb.util.release_interface(d, 0)
        except Exception: pass

if __name__ == '__main__':
    main(sys.argv)
