#!/usr/bin/env python3
"""Passive BootROM descriptor watcher for BlackBerry BBOS/BB10 devices.

Reads USB descriptors only - it never claims an interface or sends vendor
commands. Safe to run while the device boots. Use it to capture the descriptor
of PID_0001 (BootROM) and PID_8001 (RAM-loader) during the ~12s window.
"""
import sys, time
import usb.core

try:
    import libusb_package
    BACKEND = libusb_package.get_libusb1_backend()
except Exception:
    BACKEND = None

VID = 0x0FCA
TARGETS = {0x0001: 'BootROM', 0x8001: 'RAM-loader', 0x8017: 'BB10-OS', 0x8004: 'BBOS-OS'}


def dump(d):
    tag = TARGETS.get(d.idProduct, '?')
    print("VID=%04X PID=%04X (%s) bcd=%04X bus=%s addr=%s" %
          (d.idVendor, d.idProduct, tag, d.bcdDevice, d.bus, d.address))
    try:
        print("  manufacturer: %r" % (d.manufacturer,))
        print("  product     : %r" % (d.product,))
        print("  serial      : %r" % (d.serial_number,))
    except Exception as e:
        print("  string err: %s" % e)
    try:
        for cfg in d:
            print("  cfg %d" % cfg.bConfigurationValue)
            for itf in cfg:
                print("   itf %d alt %d class=%02X sub=%02X proto=%02X" %
                      (itf.bInterfaceNumber, itf.bAlternateSetting,
                       itf.bInterfaceClass, itf.bInterfaceSubClass, itf.bInterfaceProtocol))
                for ep in itf:
                    print("    ep %02X attr=%02X maxpkt=%d interval=%d" %
                          (ep.bEndpointAddress, ep.bmAttributes, ep.wMaxPacketSize, ep.bInterval))
    except Exception as e:
        print("  descriptor err: %s" % e)


def main():
    seconds = float(sys.argv[1]) if len(sys.argv) > 1 else 240.0
    print("watching VID_%04X for %ds (descriptor-only, no I/O)..." % (VID, int(seconds)))
    seen = set()
    end = time.time() + seconds
    while time.time() < end:
        try:
            devs = list(usb.core.find(find_all=True, idVendor=VID, backend=BACKEND))
        except Exception as e:
            print("scan err: %s" % e)
            time.sleep(0.3)
            continue
        for d in devs:
            key = (d.idProduct, d.bus, d.address)
            if key not in seen:
                seen.add(key)
                print("\n== NEW device @ %s ==" % time.strftime('%H:%M:%S'))
                dump(d)
                sys.stdout.flush()
        time.sleep(0.12)
    print("\nwatch ended; saw PIDs: %s" % sorted({k[0] for k in seen}))


if __name__ == '__main__':
    main()
