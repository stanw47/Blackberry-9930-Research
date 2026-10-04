#!/usr/bin/env python3
"""bb_bringup.py - 9930 BootROM -> RAM-loader bring-up probe (read-mostly).

Tests the battery-in hypothesis for the session07 wedge: with the battery IN,
power the device on while USB is attached and catch the ~12s BootROM window.

Flow (bb-usbdl / bb10mt family):
    SetMode(1) "RIM-BootLoader"  ->  GetVar(2,2048)  ->  GetPasswordInfo(0x0A)
    ->  SwitchChannel  ->  GetMetrics
No flash writes. --ping-first reproduces the bb10mt order (which wedged).

If the device re-enumerates (PID changes) the script reopens it and continues.
"""
import sys, time, struct, argparse
import usb.core, usb.util

VID = 0x0FCA
BOOTROM = 0x0001
RAMS = 0x8001
T0 = time.time()
MODE_STR = b'RIM-BootLoader'.ljust(16, b'\x00') + b'\x01'


def ts():
    return "%8.3f" % (time.time() - T0)


def p16(v):
    return struct.pack('<H', v)


def all_rim():
    try:
        return sorted({(int(d.idProduct), d.address) for d in
                       usb.core.find(find_all=True, idVendor=VID)})
    except Exception as e:
        return [("err", str(e))]


def find(pid):
    return usb.core.find(idVendor=VID, idProduct=pid)


def main():
    ap = argparse.ArgumentParser()
    ap.add_argument('--ping-first', action='store_true',
                    help='bb10mt order (ping0 before SetMode)')
    ap.add_argument('--wait', type=float, default=180, help='seconds to wait for PID 0001')
    ap.add_argument('--full', action='store_true',
                    help='continue: password info, switch channel, metrics')
    args = ap.parse_args()

    def bootrom_list():
        try:
            return [x for x in usb.core.find(find_all=True, idVendor=VID, idProduct=BOOTROM)]
        except Exception:
            return []

    old_addrs = {x.address for x in bootrom_list()}
    if old_addrs:
        print("%s PID_0001 present at addr(s) %s -> UNPLUG the device now..." %
              (ts(), old_addrs), flush=True)
        end = time.time() + args.wait
        while time.time() < end and bootrom_list():
            time.sleep(0.1)
        if bootrom_list():
            print("%s RESULT: device never disappeared" % ts())
            return 1
        print("%s device gone. PLUG IT BACK IN / power on now..." % ts(), flush=True)
    else:
        print("%s waiting for PID_0001 (plug in / power on)..." % ts(), flush=True)

    end = time.time() + args.wait
    d = None
    while time.time() < end:
        for x in bootrom_list():
            if x.address not in old_addrs:
                d = x
                break
        if d is not None:
            break
        time.sleep(0.05)
    if d is None:
        print("%s RESULT: PID_0001 never appeared" % ts())
        return 1
    print("%s found FRESH PID=0001 addr=%s  all=%s" % (ts(), d.address, all_rim()), flush=True)

    try:
        d.set_configuration()
    except Exception as e:
        print("%s set_configuration: %s" % (ts(), e))
    usb.util.claim_interface(d, 0)
    print("%s claimed iface0" % ts(), flush=True)

    st = {'mode': 0xFF, 'pkt': 0}

    def reopen():
        nonlocal d
        try:
            usb.util.release_interface(d, 0)
        except Exception:
            pass
        for pid in (BOOTROM, 0x0004, RAMS):
            nd = find(pid)
            if nd is not None:
                try:
                    nd.set_configuration()
                    usb.util.claim_interface(nd, 0)
                    d = nd
                    print("%s reopened PID=%04X addr=%s" % (ts(), pid, nd.address), flush=True)
                    return pid
                except Exception as e:
                    print("%s reopen %04X: %s" % (ts(), pid, e))
        return None

    def rx(tag, tmo=1500):
        try:
            raw = bytes(d.read(0x82, 0x10000, timeout=tmo))
            print("%s [%s] RX %2d: %s" % (ts(), tag, len(raw), raw.hex()), flush=True)
            return raw
        except usb.core.USBTimeoutError:
            print("%s [%s] timeout" % (ts(), tag), flush=True)
            return None
        except Exception as e:
            print("%s [%s] %s: %s" % (ts(), tag, type(e).__name__, e), flush=True)
            return None

    def ch0(cmd, data=b'', tag=""):
        body = bytes([cmd, st['mode'] & 0xFF]) + struct.pack('>H', st['pkt']) + bytes(data)
        wire = p16(0) + p16(len(body) + 4) + body
        print("%s [%s] TX cmd=%02X mode=%02X pkt=%d data=%s" %
              (ts(), tag, cmd, st['mode'], st['pkt'], bytes(data).hex()), flush=True)
        try:
            d.write(0x02, wire, timeout=1500)
            st['pkt'] = (st['pkt'] + 1) & 0xFFFF
        except Exception as e:
            print("%s [%s] TX FAIL: %s" % (ts(), tag, type(e).__name__), flush=True)
            return None
        raw = rx(tag + "-rx")
        if raw and len(raw) >= 6:
            payload = raw[4:]
            st['mode'] = payload[1]
            return payload[0], payload
        return None

    print("%s -- initial drain --" % ts())
    rx("pre", tmo=300)

    if args.ping_first:
        print("%s -- Ping0 (bb10mt order) --" % ts())
        ch0(1, bytes([0x14, 0x05, 0x83, 0x19, 0, 0, 0, 0]), "ping")

    print("%s -- SetMode(1) --" % ts())
    r = ch0(7, MODE_STR, "setmode")
    print("%s setmode -> %s" % (ts(), r and hex(r[0])), flush=True)
    if r and r[0] == 0x08:
        st['mode'] = 0x01

    print("%s -- GetVar(2,2048) --" % ts())
    r = ch0(5, p16(2048) + p16(2), "getvar")
    if r and r[0] == 0x06:
        info = r[1][4:]
        if len(info) >= 20:
            print("%s   Hardware ID: 0x%08X" % (ts(), struct.unpack_from('<I', info, 16)[0]), flush=True)

    if args.full:
        print("%s -- GetPasswordInfo(0x0A) --" % ts())
        ch0(0x0A, b'', "pw")

    print("%s PIDs now: %s" % (ts(), all_rim()), flush=True)
    try:
        usb.util.release_interface(d, 0)
    except Exception:
        pass
    print("%s RESULT: bring-up probe complete (no writes)" % ts())
    return 0


if __name__ == '__main__':
    sys.exit(main())
