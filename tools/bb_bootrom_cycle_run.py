#!/usr/bin/env python3
"""Wait for the CURRENT (wedged) PID_0001 to disappear, then catch the fresh
BootROM on the next plug-in and run the read-only channel0 sequence."""
import sys, time, struct
import usb.core, usb.util

VID = 0x0FCA
PID = 0x0001
EP_IN = 0x82
EP_OUT = 0x02
PING = bytes([0x14, 0x05, 0x83, 0x19, 0, 0, 0, 0])
T0 = time.time()


def ts():
    return "%7.3f" % (time.time() - T0)


def p16(v):
    return struct.pack('<H', v)


def cur():
    return [d for d in usb.core.find(find_all=True, idVendor=VID, idProduct=PID)]


def read(d, tag, timeout=1500):
    try:
        raw = bytes(d.read(EP_IN, 0x10000, timeout=timeout))
        print("%s [%s] RX %2d: %s" % (ts(), tag, len(raw), raw.hex()))
        return raw
    except usb.core.USBTimeoutError:
        print("%s [%s] RX timeout" % (ts(), tag))
        return None
    except Exception as e:
        print("%s [%s] RX %s: %s" % (ts(), tag, type(e).__name__, e))
        return None


def main():
    old = cur()
    oldaddr = old[0].address if old else None
    print("%s current PID_0001 addr=%s" % (ts(), oldaddr))
    print("%s unplug the phone now; waiting for it to disappear..." % ts())
    end = time.time() + 120
    while time.time() < end:
        if not cur():
            print("%s device disappeared at %s" % (ts(), time.strftime('%H:%M:%S')))
            break
        time.sleep(0.1)
    else:
        print("still present; abort")
        return 1

    print("%s now replug (battery out) -> waiting for fresh PID_0001..." % ts())
    d = None
    end = time.time() + 120
    while time.time() < end:
        lst = cur()
        if lst:
            d = lst[0]
            break
        time.sleep(0.02)
    if d is None:
        print("fresh BootROM never appeared")
        return 1
    print("%s FRESH PID=%04X bcd=%04X addr=%s" % (ts(), d.idProduct, d.bcdDevice, d.address))

    try:
        d.set_configuration()
    except Exception as e:
        print("%s set_configuration: %s" % (ts(), e))
    usb.util.claim_interface(d, 0)
    print("%s claimed iface0" % ts())

    state = {'mode': 0xFF, 'pkt': 0}

    def ch0(cmd, data=b'', tag=""):
        body = bytes([cmd, state['mode'] & 0xFF]) + struct.pack('>H', state['pkt']) + bytes(data)
        wire = p16(0) + p16(len(body) + 4) + body
        print("%s [%s] TX cmd=%02X mode=%02X pkt=%d data=%s" %
              (ts(), tag, cmd, state['mode'], state['pkt'], bytes(data).hex()))
        try:
            d.write(EP_OUT, wire, timeout=1500)
        except Exception as e:
            print("%s [%s] TX FAIL: %s" % (ts(), tag, type(e).__name__))
            return None
        state['pkt'] = (state['pkt'] + 1) & 0xFFFF
        raw = read(d, "%s-rx" % tag)
        if raw and len(raw) >= 6:
            payload = raw[4:]
            state['mode'] = payload[1]
            return payload[0], payload
        return None

    print("%s -- pre-read --" % ts())
    read(d, "pre", timeout=400)

    print("%s -- ping0 --" % ts())
    r = ch0(1, PING, "ping")
    print("%s ping result: %s" % (ts(), r))

    if r is not None:
        print("%s -- get_var(2,2000) --" % ts())
        r2 = ch0(5, p16(2000) + p16(2), "getvar")
        print("%s getvar: %s" % (ts(), r2))
        if r2:
            info = r2[1][4:]
            if len(info) >= 20:
                print("%s model_id @16: 0x%08X" % (ts(), struct.unpack_from('<I', info, 16)[0]))

    read(d, "tail1", timeout=300)
    read(d, "tail2", timeout=300)
    try:
        usb.util.release_interface(d, 0)
    except Exception:
        pass
    print("%s done (read-only)" % ts())
    return 0


if __name__ == '__main__':
    sys.exit(main())
