#!/usr/bin/env python3
"""bb_jl_install.py - JavaLoader module read + unsigned-COD install test.

ONE clean session per phone boot.

Steps:
 1. select/open/handshake
 2. read <module> to a backup file (SAVE_MODULE + SEND_DATA loop)
 3. flip one byte in the middle of the COD (breaks the signature)
 4. install it (SET_COD_SIZE + SEND_DATA chunks) and print the device response

If the device rejects (signature error) -> no harm. If it accepts -> the
modified module is installed (use a non-critical resource module).

Usage: python3 bb_jl_install.py [module] [backup_file]
"""
import sys, struct, time, usb.core, usb.util
sys.path.insert(0, '/home/stanw47/Blackberry-9930-Research/tools')
import bb_jl as J

def main(argv):
    name = (argv[1] if len(argv) > 1 else "net_rim_bis_client_res").encode()
    out = argv[2] if len(argv) > 2 else "/tmp/opencode/backup.cod"
    jl = J.JL(reset=False)
    sock = jl.select_open()
    print("JavaLoader socket=0x%04X" % sock)
    d = jl.d

    def send(cmd, data=b'', unknown=0):
        if data:
            d.write(J.EP_OUT, J.jlcmd(sock, cmd, unknown, len(data)), timeout=2000)
            d.write(J.EP_OUT, J.jldata(sock, data), timeout=2000)
        else:
            d.write(J.EP_OUT, J.jlcmd(sock, cmd, unknown, 0), timeout=2000)

    def ack(tmo=6000):
        return J.readpkt(d, tmo, verbose=False)

    # ---- read backup ----
    send(0x80, name); time.sleep(0.3)
    a = ack(); mid = None
    if a and a[4] == 0x64 and struct.unpack_from('<H', a, 6)[0] == 2:
        dd = ack(); mid = struct.unpack_from('>H', dd, 4)[0]
    print("module id = %s" % (hex(mid) if mid else None))
    if not mid: return
    send(0x7e, struct.pack('>H', mid)); time.sleep(0.3)
    a = ack(); size = None
    if a and a[4] == 0x64:
        dd = ack(); size = struct.unpack_from('>I', dd, 4)[0]
    print("module size = %s" % size)
    if not size: return
    got = b''
    for i in range(2000):
        send(0x68); time.sleep(0.2)
        a = ack()
        if a is None: print("read timeout at %d" % len(got)); break
        if a[4] == 0x64: break
        if a[4] == 0x6e:
            n = struct.unpack_from('<H', a, 6)[0]
            c = ack()
            if c is None: break
            got += c[4:4 + n]
        else:
            print("read resp 0x%02X at %d" % (a[4], len(got))); break
    open(out, 'wb').write(got)
    print("backup read %d/%d bytes -> %s" % (len(got), size, out))

    # ---- modify one byte and install ----
    if len(got) < 16: print("too short to modify"); return
    mod = bytearray(got)
    pos = len(mod) // 2
    print("flipping byte at 0x%X: 0x%02X -> 0x%02X" % (pos, mod[pos], mod[pos] ^ 0xFF))
    mod[pos] ^= 0xFF
    data = bytes(mod)
    print("== SET_COD_SIZE %d ==" % len(data))
    send(0x67, struct.pack('>I', len(data)), 1); time.sleep(0.3)
    a = ack(); print("   resp:", a.hex() if a else None)
    if not (a and a[4] == 0x64):
        print("   SET_COD_SIZE rejected"); return
    CH = 0x7F8
    off = 0
    while off < len(data):
        chunk = data[off:off + CH]; off += len(chunk)
        send(0x68, chunk)
        time.sleep(0.15)
        a = ack()
        if a is None:
            print("   send timeout at %d" % off); break
        if a[4] != 0x64:
            print("   send resp 0x%02X at %d" % (a[4], off)); break
    print("install attempt finished at %d/%d" % (off, len(data)))
    print("RESULT: if no signature error above, the unsigned COD was accepted")

try:
    usb.util.release_interface(jl.d, 0)
except Exception:
    pass

if __name__ == "__main__":
    main(sys.argv)
