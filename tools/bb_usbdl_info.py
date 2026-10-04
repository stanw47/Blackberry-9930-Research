#!/usr/bin/env python3
"""Replicate bb-usbdl 'info': SetMode(1) FIRST, then GetVar. No ping0.

Framing (bbusb / bb-usbdl ControlMessageHeader):
  type(2)=0x0000, packetSize(2)=len(data)+8, command(1), mode(1), packetId(2), data
  bulk OUT 0x02, bulk IN 0x82.
"""
import sys, time, struct
import usb.core, usb.util

VID = 0x0FCA
PID = 0x0001
EP_IN = 0x82
EP_OUT = 0x02
T0 = time.time()

CMD_SETMODE = 0x07
CMD_GETVAR = 0x05
MODE_STR = b'RIM-BootLoader'.ljust(16, b'\x00') + b'\x01'  # 17 bytes


def ts():
    return "%7.3f" % (time.time() - T0)


def p16(v):
    return struct.pack('<H', v)


def cur():
    return [d for d in usb.core.find(find_all=True, idVendor=VID, idProduct=PID)]


def wait_fresh(old):
    print("%s UNPLUG now..." % ts(), flush=True)
    end = time.time() + 90
    while time.time() < end:
        if not cur():
            print("%s disappeared. REPLUG now..." % ts(), flush=True)
            break
        time.sleep(0.1)
    else:
        print("abort")
        return None
    end = time.time() + 120
    while time.time() < end:
        l = cur()
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
    mode = {'v': 0xFF, 'pkt': 0}
    old = {d.address for d in cur()}
    d = wait_fresh(old)
    if d is None:
        return 1
    print("%s FRESH addr=%s" % (ts(), d.address))
    d.set_configuration()
    usb.util.claim_interface(d, 0)

    def send(command, data=b'', tag=""):
        header = struct.pack('<HHBBH', 0x0000, len(data) + 8, command, mode['v'] & 0xFF, mode['pkt'])
        wire = header + bytes(data)
        print("%s [%s] TX cmd=%02X mode=%02X pkt=%d len=%d data=%s" %
              (ts(), tag, command, mode['v'], mode['pkt'], len(data), bytes(data).hex()))
        try:
            d.write(EP_OUT, wire, timeout=2000)
            mode['pkt'] = (mode['pkt'] + 1) & 0xFFFF
            return True
        except Exception as e:
            print("%s [%s] TX FAIL: %s" % (ts(), tag, type(e).__name__))
            return False

    print("%s -- SetMode(1) RIM-BootLoader --" % ts())
    if send(CMD_SETMODE, MODE_STR, "setmode"):
        r = read(d, "setmode-rx")
        if r and len(r) >= 5:
            print("%s   response command=0x%02X" % (ts(), r[4]))
            if r[4] == 0x08:
                mode['v'] = 0x01
                print("%s   -> mode set to 0x01" % ts())

    print("%s -- GetVar(2, 2048) --" % ts())
    if send(CMD_GETVAR, p16(2048) + p16(2), "getvar"):
        r = read(d, "getvar-rx", timeout=4000)
        if r and len(r) >= 8:
            data = r[8:]
            print("%s   response command=0x%02X payload=%d" % (ts(), r[4], len(data)))
            if len(data) >= 20:
                pin = struct.unpack_from('<I', data, 16)[0]
                print("%s   Hardware ID: 0x%08X" % (ts(), pin))

    try:
        usb.util.release_interface(d, 0)
    except Exception:
        pass
    print("%s done" % ts())
    return 0


if __name__ == '__main__':
    sys.exit(main())
