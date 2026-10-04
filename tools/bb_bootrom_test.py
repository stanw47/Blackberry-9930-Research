#!/usr/bin/env python3
"""BootROM channel0 test for BlackBerry BBOS/BB10 on Windows.

Phase 1 (always): open the BootROM (VID 0FCA / PID 0001) and try to claim
interface 0. Reports exactly how Windows/libusb behaves.

Phase 2 (only with --io): send the RIM channel0 handshake (ping0) and a
read-only get_var, to confirm the wire protocol works from Windows.

Phase 2 does NOT write flash. But per bblink/listen_flash notes, ANY loader
session on a PASSWORD-PROTECTED device can force a security wipe. Only use
--io on a device you are certain has no password set.
"""
import sys, time, struct
import usb.core
import usb.util

try:
    import libusb_package
    BACKEND = libusb_package.get_libusb1_backend()
except Exception:
    BACKEND = None

VID = 0x0FCA
PID_BOOTROM = 0x0001
EP_IN = 0x82
EP_OUT = 0x02


def p16(v):
    return struct.pack('<H', v)


def u16(b):
    return struct.unpack('<H', b[:2])[0]


def find_bootrom(timeout=180):
    end = time.time() + timeout
    while time.time() < end:
        try:
            d = usb.core.find(idVendor=VID, idProduct=PID_BOOTROM, backend=BACKEND)
        except Exception as e:
            print("scan err:", e)
            d = None
        if d is not None:
            return d
        time.sleep(0.1)
    return None


def main():
    do_io = '--io' in sys.argv
    print("looking for BootROM (VID %04X PID %04X)..." % (VID, PID_BOOTROM))
    dev = find_bootrom()
    if dev is None:
        print("RESULT: BootROM never appeared")
        return 1
    print("found: PID=%04X bcd=%04X bus=%s addr=%s" % (dev.idProduct, dev.bcdDevice, dev.bus, dev.address))

    # ---- phase 1: claim test ----
    claimed = False
    try:
        try:
            dev.set_configuration()
        except Exception as e:
            print("set_configuration: %s" % e)
        itf = usb.util.find_descriptor(dev.get_active_configuration(), bInterfaceNumber=0)
        print("interface 0 present:", itf is not None)
        usb.util.claim_interface(dev, 0)
        claimed = True
        print("CLAIM: OK  <-- libusb can drive this device")
    except Exception as e:
        print("CLAIM: FAILED  %s: %s" % (type(e).__name__, e))
        print("RESULT: descriptor-readable but not I/O-capable under current driver")

    if not do_io:
        print("(phase 2 skipped; pass --io to send channel0 handshake)")
        return 0

    if not claimed:
        print("RESULT: cannot do I/O without claim")
        return 2

    # ---- phase 2: channel0 handshake ----
    state = {'mode': 0xFF, 'pkt': 0}

    def read_payload(chk=0x10000):
        raw = bytes(dev.read(EP_IN, chk, timeout=2000))
        if len(raw) < 4:
            return 0, b''
        return u16(raw), raw[4:]

    def channel0(cmd, data=b''):
        pkt = bytes([cmd, state['mode'] & 0xFF]) + struct.pack('>H', state['pkt']) + data
        wire = p16(0) + p16(len(pkt) + 4) + pkt
        dev.write(EP_OUT, wire, timeout=2000)
        ch, payload = read_payload()
        if len(payload) >= 2:
            state['mode'] = payload[1]
        state['pkt'] = (state['pkt'] + 1) & 0xFFFF
        return payload

    try:
        print("ping0 ->", channel0(1, bytes([0x14, 0x05, 0x83, 0x19, 0, 0, 0, 0])).hex())
        print("get_var(0x0002,2000) ->", channel0(5, p16(2000) + p16(2)).hex())
        print("RESULT: channel0 I/O WORKED")
    except Exception as e:
        print("IO ERROR: %s: %s" % (type(e).__name__, e))
        return 3
    finally:
        try:
            usb.util.release_interface(dev, 0)
        except Exception:
            pass
    return 0


if __name__ == '__main__':
    sys.exit(main())
