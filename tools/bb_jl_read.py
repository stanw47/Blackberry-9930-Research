#!/usr/bin/env python3
"""bb_jl_read.py - read a module from the device via the JavaLoader.

ONE clean session per phone boot (the device locks into the selected mode).
Run after a phone restart.

Usage: python3 bb_jl_read.py <module_name> <out_file>
       python3 bb_jl_read.py net_rim_m2g /tmp/m2g.cod
"""
import sys, struct, time, usb.core, usb.util
sys.path.insert(0, '/home/stanw47/Blackberry-9930-Research/tools')
import bb_jl as J

def main(argv):
    name = (argv[1] if len(argv) > 1 else "net_rim_m2g").encode()
    out = argv[2] if len(argv) > 2 else "/tmp/module.cod"
    jl = J.JL(reset=False)
    sock = jl.select_open()
    print("JavaLoader socket=0x%04X" % sock)
    d = jl.d

    def send(cmd, data=b''):
        if data:
            d.write(J.EP_OUT, J.jlcmd(sock, cmd, 0, len(data)), timeout=2000)
            d.write(J.EP_OUT, J.jldata(sock, data), timeout=2000)
        else:
            d.write(J.EP_OUT, J.jlcmd(sock, cmd, 0, 0), timeout=2000)

    def ack(tmo=6000):
        return J.readpkt(d, tmo, verbose=False)

    # SET_COD_FILENAME -> id
    send(0x80, name); time.sleep(0.3)
    a = ack(); mid = None
    if a and a[4] == 0x64 and struct.unpack_from('<H', a, 6)[0] == 2:
        dd = ack(); mid = struct.unpack_from('>H', dd, 4)[0]
    if mid is None:
        print("module not found / no id (resp=%s)" % (a.hex() if a else None)); return
    print("module id = 0x%04X" % mid)

    # SAVE_MODULE -> size
    send(0x7e, struct.pack('>H', mid)); time.sleep(0.3)
    a = ack(); size = None
    if a and a[4] == 0x64:
        dd = ack(); size = struct.unpack_from('>I', dd, 4)[0]
    print("module size = %s" % size)
    if not size: return

    # SEND_DATA loop
    got = b''
    for i in range(2000):
        send(0x68); time.sleep(0.2)
        a = ack()
        if a is None:
            print("timeout at %d/%d" % (len(got), size)); break
        if a[4] == 0x64:
            print("done"); break
        if a[4] == 0x6e:
            n = struct.unpack_from('<H', a, 6)[0]
            c = ack()
            if c is None: break
            got += c[4:4 + n]
        else:
            print("resp 0x%02X at %d" % (a[4], len(got))); break
    open(out, 'wb').write(got)
    print("read %d/%d bytes -> %s (magic %s)" % (len(got), size, out, got[:4].hex()))

try:
    usb.util.release_interface(jl.d, 0)
except Exception:
    pass
