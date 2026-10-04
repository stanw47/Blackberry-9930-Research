#!/usr/bin/env python3
"""Fresh boot: SetMode(1), read reply, then watch for PID/address changes.

If the device re-enumerates after SetMode (BootROM -> RIM-BootLoader), open the
new PID and continue with GetVar using the same protocol.
"""
import sys, time, struct
import usb.core, usb.util

VID = 0x0FCA
EP_IN = 0x82
EP_OUT = 0x02
T0 = time.time()
MODE_STR = b'RIM-BootLoader'.ljust(16, b'\x00') + b'\x01'


def ts():
    return "%7.3f" % (time.time() - T0)


def p16(v):
    return struct.pack('<H', v)


def all_rim():
    try:
        return sorted({(int(d.idProduct), d.address) for d in
                       usb.core.find(find_all=True, idVendor=VID)})
    except Exception as e:
        return [("err", str(e))]


def find_pid(pid):
    return usb.core.find(idVendor=VID, idProduct=pid)


def wait_fresh(old):
    print("%s UNPLUG now..." % ts(), flush=True)
    end = time.time() + 200
    while time.time() < end:
        if not [d for d in usb.core.find(find_all=True, idVendor=VID, idProduct=0x0001)]:
            print("%s disappeared. REPLUG now..." % ts(), flush=True)
            break
        time.sleep(0.1)
    else:
        print("abort")
        return None
    end = time.time() + 120
    while time.time() < end:
        l = [d for d in usb.core.find(find_all=True, idVendor=VID, idProduct=0x0001)]
        if l and l[0].address not in old:
            return l[0]
        time.sleep(0.05)
    return None


def read(d, tag, timeout=2000):
    try:
        raw = bytes(d.read(EP_IN, 0x10000, timeout=timeout))
        print("%s [%s] RX %2d: %s" % (ts(), tag, len(raw), raw.hex()))
        return raw
    except usb.core.USBTimeoutError:
        print("%s [%s] timeout" % (ts(), tag))
        return None
    except Exception as e:
        print("%s [%s] %s: %s" % (ts(), tag, type(e).__name__, e))
        return None


def main():
    old = {d.address for d in usb.core.find(find_all=True, idVendor=VID, idProduct=0x0001)}
    d = wait_fresh(old)
    if d is None:
        return 1
    print("%s FRESH addr=%s  all=%s" % (ts(), d.address, all_rim()))
    d.set_configuration()
    usb.util.claim_interface(d, 0)

    mode = [0xFF, 0]

    def send(dev, command, data=b'', tag=""):
        header = struct.pack('<HHBBH', 0x0000, len(data) + 8, command, mode[0] & 0xFF, mode[1])
        try:
            dev.write(EP_OUT, header + bytes(data), timeout=2000)
            mode[1] = (mode[1] + 1) & 0xFFFF
            print("%s [%s] TX OK cmd=%02X mode=%02X" % (ts(), tag, command, mode[0]))
            return True
        except Exception as e:
            print("%s [%s] TX FAIL cmd=%02X: %s" % (ts(), tag, command, type(e).__name__))
            return False

    print("%s -- SetMode(1) --" % ts())
    if send(d, 0x07, MODE_STR, "setmode"):
        r = read(d, "setmode-rx")
        if r and len(r) >= 5 and r[4] == 0x08:
            mode[0] = 0x01

    print("%s PIDs right after setmode: %s" % (ts(), all_rim()))

    print("%s watching PIDs for 90s (setmode may trigger a long bootloader load)..." % ts())
    seen = set()
    end = time.time() + 90
    last = None
    while time.time() < end:
        curp = all_rim()
        if curp != last:
            print("%s   PIDs: %s" % (ts(), curp))
            last = curp
        for p, a in curp:
            if (p, a) not in seen:
                seen.add((p, a))
                print("%s   NEW PID=%04X addr=%s" % (ts(), p, a))
        time.sleep(0.2)

    for target_pid in (0x0004, 0x8001, 0x8004, 0x8017):
        d4 = find_pid(target_pid)
        if d4 is None:
            continue
        print("%s -- found PID %04X addr=%s; trying GetVar --" % (ts(), target_pid, d4.address))
        try:
            d4.set_configuration()
            usb.util.claim_interface(d4, 0)
            if send(d4, 0x05, p16(2048) + p16(2), "getvar-%04X" % target_pid):
                r = read(d4, "getvar-%04X-rx" % target_pid, timeout=4000)
                if r and len(r) >= 28:
                    print("%s Hardware ID: 0x%08X" % (ts(), struct.unpack_from('<I', r, 8 + 16)[0]))
        except Exception as e:
            print("%s %04X error: %s: %s" % (ts(), target_pid, type(e).__name__, e))

    try:
        usb.util.release_interface(d, 0)
    except Exception:
        pass
    print("%s done; final all=%s" % (ts(), all_rim()))
    return 0


if __name__ == '__main__':
    sys.exit(main())
