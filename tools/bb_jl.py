#!/usr/bin/env python3
"""bb_jl.py - working RIM JavaLoader client for the 9930 OS session.

Verified live (session25):
  select "RIM_JavaLoader" -> socket
  OPEN_SOCKET -> OPENED
  HELLO(0x64) -> HELLO_ACK(0x65)
  SET_UNKNOWN1(0x70,psize=1)+data -> ACK(0x64)
  DEVICE_INFO(0x71) -> ACK(expect=40) + 40-byte payload (contains the PIN)
  GOODBYE(0x8d) -> ACK ; CLOSE_SOCKET -> CLOSED

JavaLoader packet = [socket u16][size u16][cmd u8][unknown u8][param_size u16][data]
Command response = [socket u16][size u16][respcmd u8][unknown u8][expect u16]
   then `expect` bytes of data (possibly split across packets).

NOTE: a mode select persists on the device; re-selecting the same mode fails
(0x09). Use `d.reset()` (USB reset, does not lose OS state) before re-selecting,
or select once and run everything in one session.

Usage:
  python3 bb_jl.py probe                 # select/open/handshake, then a few cmds
  python3 bb_jl.py cmd 0x71              # send one command, print response
  python3 bb_jl.py cmds 0x71 0x78 0x79 0x92
"""
import sys, struct, time
import usb.core, usb.util

PID = 0x8004
EP_IN, EP_OUT = 0x82, 0x02
_seq = [0]

SB_SELECT_MODE = 0x07
SB_OPEN_SOCKET = 0x0A
SB_CLOSE_SOCKET = 0x0B
SB_SEQUENCE_HANDSHAKE = 0x13

JL_HELLO = 0x64
JL_HELLO_ACK = 0x65
JL_SET_UNKNOWN1 = 0x70
JL_GOODBYE = 0x8d
JL_ACK = 0x64

def pkt(target, command, extra=b''):
    seq = _seq[0]; _seq[0] = (_seq[0] + 1) & 0xFF
    return struct.pack('<HHB', 0, 8 + len(extra), command) + struct.pack('<H', target) + bytes([seq]) + extra

def jlcmd(sock, cmd, unknown=0, psize=0):
    return struct.pack('<HHBBH', sock, 8, cmd, unknown, psize)

def jldata(sock, data):
    return struct.pack('<HH', sock, 4 + len(data)) + data

def open_dev():
    d = usb.core.find(idVendor=0x0FCA, idProduct=PID)
    if d is None: sys.exit("device 0FCA:8004 not present")
    try: d.set_configuration()
    except Exception: pass
    try:
        if d.is_kernel_driver_active(0): d.detach_kernel_driver(0)
    except Exception: pass
    usb.util.claim_interface(d, 0)
    return d

def drain(d):
    while True:
        try: d.read(EP_IN, 0x10000, timeout=200)
        except usb.core.USBTimeoutError: return

def readpkt(d, tmo=4000, verbose=True):
    while True:
        try: raw = bytes(d.read(EP_IN, 0x10000, timeout=tmo))
        except usb.core.USBTimeoutError:
            if verbose: print("  timeout")
            return None
        if len(raw) >= 5 and raw[4] == SB_SEQUENCE_HANDSHAKE:
            if verbose: print("  (seq handshake)")
            continue
        return raw

def read_response(d, tmo=8000, verbose=True):
    ack = readpkt(d, tmo, verbose)
    if ack is None or len(ack) < 8: return ack, b''
    resp = ack[4]; expect = struct.unpack_from('<H', ack, 6)[0]
    if verbose: print("  resp=0x%02X expect=%d" % (resp, expect))
    data = b''
    while len(data) < expect:
        p = readpkt(d, tmo, verbose)
        if p is None: break
        # data packets are [socket u16][size u16][payload...]; strip header
        data += p[4:] if len(p) >= 4 else p
    return ack, data

class JL:
    def __init__(self, reset=False):
        if reset:
            d = usb.core.find(idVendor=0x0FCA, idProduct=PID)
            if d is not None:
                try: d.reset()
                except Exception: pass
                time.sleep(3)
        self.d = open_dev(); self.sock = None
    def select_open(self):
        drain(self.d); _seq[0] = 0
        self.d.write(EP_OUT, pkt(0x00FF, SB_SELECT_MODE, b"RIM_JavaLoader".ljust(16, b'\x00')), timeout=2000)
        r = readpkt(self.d)
        if not (r and len(r) >= 8 and r[4] == 0x08): raise RuntimeError("select failed: %s" % (r.hex() if r else None))
        self.sock = struct.unpack_from('<H', r, 5)[0]
        drain(self.d)
        self.d.write(EP_OUT, pkt(self.sock, SB_OPEN_SOCKET), timeout=2000)
        r = readpkt(self.d)
        if not (r and len(r) >= 5 and r[4] == 0x10): raise RuntimeError("open failed: %s" % (r.hex() if r else None))
        drain(self.d); time.sleep(0.3)
        # HELLO (retry up to 3x)
        ack = None
        for _ in range(3):
            self.d.write(EP_OUT, jlcmd(self.sock, JL_HELLO), timeout=2000)
            ack, _ = read_response(self.d, verbose=False)
            if ack and ack[4] == JL_HELLO_ACK: break
            time.sleep(0.4); drain(self.d)
        if not (ack and ack[4] == JL_HELLO_ACK): raise RuntimeError("hello failed: %s" % (ack.hex() if ack else None))
        # SET_UNKNOWN1 (cmd + 1 data byte)
        time.sleep(0.2)
        ack = None
        for _ in range(3):
            self.d.write(EP_OUT, jlcmd(self.sock, JL_SET_UNKNOWN1, 0, 1), timeout=2000)
            self.d.write(EP_OUT, jldata(self.sock, b'\x00'), timeout=2000)
            ack, _ = read_response(self.d, verbose=False)
            if ack and ack[4] == JL_ACK: break
            time.sleep(0.4); drain(self.d)
        if not (ack and ack[4] == JL_ACK): raise RuntimeError("unknown1 failed: %s" % (ack.hex() if ack else None))
        return self.sock
    def cmd(self, cmd, data=b'', unknown=0, verbose=True):
        if data:
            self.d.write(EP_OUT, jlcmd(self.sock, cmd, unknown, len(data)), timeout=2000)
            self.d.write(EP_OUT, jldata(self.sock, data), timeout=2000)
        else:
            self.d.write(EP_OUT, jlcmd(self.sock, cmd, unknown, 0), timeout=2000)
        return read_response(self.d, verbose=verbose)
    def close(self):
        try:
            self.d.write(EP_OUT, jlcmd(self.sock, JL_GOODBYE), timeout=2000)
            read_response(self.d, verbose=False)
            self.d.write(EP_OUT, pkt(self.sock, SB_CLOSE_SOCKET), timeout=2000)
            readpkt(self.d, verbose=False)
        except Exception: pass
        try: usb.util.release_interface(self.d, 0)
        except Exception: pass

def main(argv):
    cmd = argv[1] if len(argv) > 1 else "probe"
    jl = JL(reset=True)
    try:
        sock = jl.select_open()
        print("JavaLoader socket=0x%04X" % sock)
        if cmd == "probe":
            for c in (0x71, 0x78, 0x79, 0x92):
                print("== cmd 0x%02X ==" % c)
                ack, data = jl.cmd(c)
                print("   data(%d): %s" % (len(data), data[:120].hex()))
        elif cmd in ("cmd", "cmds"):
            args = [a for a in argv[2:] if not a.startswith("+")]
            payload = b''
            for a in argv[2:]:
                if a.startswith("+"):
                    payload = bytes.fromhex(a[1:])
            for a in args:
                c = int(a, 0)
                print("== cmd 0x%02X%s ==" % (c, (" +" + payload.hex()) if payload else ""))
                ack, data = jl.cmd(c, payload)
                print("   data(%d): %s" % (len(data), data[:300].hex()))
        elif cmd == "dir":
            ack, data = jl.cmd(0x6d)
            ids = [struct.unpack_from('>H', data, i)[0] for i in range(4, len(data) - 1, 2)]
            print("root entry ids (%d): %s" % (len(ids), ' '.join('%04X' % i for i in ids)))
        elif cmd == "entry":
            eid = int(argv[2], 0)
            ack, data = jl.cmd(0x6e, struct.pack('>H', eid))
            print("entry 0x%04X data(%d): %s" % (eid, len(data), data[:400].hex()))
        elif cmd == "subdir":
            eid = int(argv[2], 0)
            ack, data = jl.cmd(0x7d, struct.pack('>H', eid))
            print("subdir 0x%04X data(%d): %s" % (eid, len(data), data[:400].hex()))
        jl.close()
    finally:
        try: usb.util.release_interface(jl.d, 0)
        except Exception: pass

if __name__ == '__main__':
    main(sys.argv)
