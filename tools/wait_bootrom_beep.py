#!/usr/bin/env python3
"""Beep when the BlackBerry BootROM (VID 0FCA / PID 0001) is present.

Run this in one window, open Zadig in another. Each beep means the ~12s
BootROM window is open - click the Zadig device dropdown now and select the
BlackBerry device, then Install/Replace driver with WinUSB.

Descriptor-only; it never opens or drives the device.
"""
import sys, time
import usb.core

try:
    import libusb_package
    BACKEND = libusb_package.get_libusb1_backend()
except Exception:
    BACKEND = None

try:
    import winsound
    def beep():
        winsound.Beep(1200, 120)
        winsound.Beep(1600, 120)
except Exception:
    def beep():
        print('\a', end='', flush=True)

seconds = float(sys.argv[1]) if len(sys.argv) > 1 else 120.0
print("beeping while PID_0001 is present for %ds..." % int(seconds))
end = time.time() + seconds
was = False
while time.time() < end:
    try:
        d = usb.core.find(idVendor=0x0FCA, idProduct=0x0001, backend=BACKEND)
    except Exception:
        d = None
    if d is not None:
        if not was:
            print("  [%s] PID_0001 PRESENT" % time.strftime('%H:%M:%S'))
            was = True
        beep()
        time.sleep(0.35)
    else:
        if was:
            print("  [%s] PID_0001 gone" % time.strftime('%H:%M:%S'))
            was = False
        time.sleep(0.1)
print("done")
