#!/usr/bin/env python3
"""Read-only BootROM session for BlackBerry BBOS/BB10 on Windows.

Talks the RIM channel0 handshake (ping0, get_var, set_mode) and reads BootROM
metrics. Does NOT upload a loader and does NOT write flash. Requires the
BootROM (VID 0FCA / PID 0001) interface to be claimable by libusb, i.e. bound
to WinUSB/libusbK (use Zadig). Reuses BBSession from bblink.py.
"""
import sys, time, struct
from bblink import BBSession, PID_BOOTROM


def main():
    sess = BBSession(verbose=True)
    print("waiting for BootROM (PID 0001) - battery-cycle the device...")
    if not sess._open_pid(PID_BOOTROM, timeout=180000):
        print("RESULT: BootROM never appeared / could not open")
        return 1
    print("CLAIM/OPEN OK on BootROM")

    try:
        print("-- ping0 --")
        sess.ping0()

        print("-- get_var(0x0002, 2000) --")
        rom = sess.get_var(2, 2000)
        print("   len:", len(rom))
        print("   hex:", rom[:160].hex())
        if len(rom) >= 20:
            model_id = struct.unpack_from('<I', rom, 16)[0]
            print("   model_id @16: 0x%08X" % model_id)
            print("   ascii:", ''.join(chr(b) if 32 <= b < 127 else '.' for b in rom[:96]))

        print("-- set_mode(1) [RIM-BootLoader] --")
        print("   ok:", sess.set_mode(1))

        try:
            print("-- switch to channel1 + get_metrics --")
            sess.switch_channel()
            m = sess.get_metrics()
            print("   metrics len:", len(m))
            print("   hex:", m[:96].hex())
        except Exception as e:
            print("   metrics error:", repr(e))
    except Exception as e:
        print("SESSION ERROR:", type(e).__name__, e)
        return 2
    finally:
        sess.close()
    print("RESULT: read-only BootROM session complete (no writes performed)")
    return 0


if __name__ == '__main__':
    sys.exit(main())
