#!/usr/bin/env python3
"""bb_loader.py - open a named USBPort channel on the 9930 OS session and speak
the Application Loader packet protocol.

Derived from:
  * Barry (NetDirect/barry) src/controller.cc SelectMode + m_raw_channel.cc:
      - SelectMode(name): send SB_COMMAND_SELECT_MODE on socket 0 with
        mode.name = <channel name>; reply MODE_SELECTED gives the data socket.
      - OpenSocket(socket): open that socket (password challenge handled).
      - ChannelPacket = [socket u16][size u16][data].
  * Loader.exe exports (session24): packet framing = 4-byte header, u16 length
    at +2; opcodes e.g. 0x71 DeviceInfo, 0x91 ResetToFactory, 0x92 NvStoreDump.

USAGE (when the phone is back on USB as 0FCA:8004):
    python3 bb_loader.py selftest                 # select+open each candidate name
    python3 bb_loader.py open DesktopMgr          # select+open one name
    python3 bb_loader.py cmd DesktopMgr 0x71      # open then send opcode 0x71
    python3 bb_loader.py nvdump DesktopMgr        # opcode 0x92 (NvStoreDump)
    python3 bb_loader.py raw DesktopMgr 71 00 00 00  # send exact 4-byte header

SAFETY: do NOT send channel0 cmd 0x00/0x03/0x0C (phone drops off USB). This
tool only uses the classic socket protocol (SELECT_MODE/OPEN_SOCKET).
"""
import sys, time, struct
import usb.core, usb.util

PID = 0x8004
EP_IN, EP_OUT = 0x82, 0x02

SB_CMD_SELECT_MODE      = 0x07
SB_CMD_MODE_SELECTED    = 0x08
SB_CMD_MODE_NOT_SELECTED= 0x09
SB_CMD_OPEN_SOCKET      = 0x0A
SB_CMD_OPENED_SOCKET    = 0x10
SB_CMD_SEQUENCE_HANDSHAKE = 0x13

CANDIDATES = ["DesktopMgr", "RIMDeviceConfig", "RIMDeviceFileAccess",
              "BlackBerry_Backup", "BBPIN", "RIM Desktop"]

_seq = [0]

def pkt(target, command, extra=b'', outer=0):
    seq = _seq[0]; _seq[0] = (_seq[0] + 1) & 0xFF
    size = 8 + len(extra)
    return (struct.pack('<HHB', outer, size, command)
            + struct.pack('<H', target) + bytes([seq]) + extra)

def ch_packet(sock, data):
    """ChannelPacket [socket u16][size u16][data] (Barry)."""
    return struct.pack('<HH', sock, 4 + len(data)) + data

def _open_dev():
    d = usb.core.find(idVendor=0x0FCA, idProduct=PID)
    if d is None: sys.exit("device 0FCA:8004 not present")
    try: d.set_configuration()
    except Exception: pass
    try:
        if d.is_kernel_driver_active(0): d.detach_kernel_driver(0)
    except Exception: pass
    usb.util.claim_interface(d, 0)
    return d

def tx(d, p, tag):
    print("TX[%s] %s" % (tag, p.hex()))
    d.write(EP_OUT, p, timeout=2000)

def rx(d, tag, tmo=2000):
    try:
        raw = bytes(d.read(EP_IN, 0x10000, timeout=tmo))
        print("RX[%s] %s" % (tag, raw.hex()))
        return raw
    except usb.core.USBTimeoutError:
        print("RX[%s] timeout" % tag); return None

def select_mode(d, name):
    nm = name.encode().ljust(16, b'\x00')
    tx(d, pkt(0x00FF, SB_CMD_SELECT_MODE, nm), "select:" + name)
    r = rx(d, "select:" + name)
    if r is None: return None
    if len(r) >= 8 and r[4] == SB_CMD_MODE_NOT_SELECTED:
        print("  -> NOT SELECTED (channel does not exist)"); return None
    if len(r) >= 8 and r[4] == SB_CMD_MODE_SELECTED:
        sock = struct.unpack_from('<H', r, 5)[0]
        print("  -> SELECTED, data socket = 0x%04X" % sock)
        # sequence handshake may follow
        rx(d, "select-seq", 800)
        return sock
    print("  -> unexpected reply"); return None

def open_socket(d, sock):
    tx(d, pkt(sock, SB_CMD_OPEN_SOCKET), "open:0x%04X" % sock)
    r = rx(d, "open")
    if r and len(r) >= 5 and r[4] == SB_CMD_SEQUENCE_HANDSHAKE:
        r = rx(d, "open-seq")
    if r and len(r) >= 5 and r[4] == SB_CMD_OPENED_SOCKET:
        print("  -> OPENED")
        return True
    print("  -> open failed/needs password")
    return False

def send_loader(d, sock, header, payload=b''):
    """4-byte header (opcode,flags,u16 size) + payload, as a ChannelPacket."""
    if len(header) != 4: raise ValueError("header must be 4 bytes")
    body = header + payload
    tx(d, ch_packet(sock, body), "loader")
    rx(d, "loader-reply", 3000)

def main(argv):
    d = _open_dev()
    try:
        cmd = argv[1] if len(argv) > 1 else "selftest"
        if cmd == "selftest":
            for name in CANDIDATES:
                s = select_mode(d, name)
                if s is not None:
                    open_socket(d, s)
        elif cmd == "open":
            name = argv[2] if len(argv) > 2 else "DesktopMgr"
            s = select_mode(d, name)
            if s is not None: open_socket(d, s)
        elif cmd in ("cmd", "nvdump"):
            name = argv[2] if len(argv) > 2 else "DesktopMgr"
            op = int(argv[3], 0) if cmd == "cmd" and len(argv) > 3 else 0x92
            s = select_mode(d, name)
            if s is not None and open_socket(d, s):
                send_loader(d, s, bytes([op, 0, 0, 0]))
        elif cmd == "raw":
            name = argv[2]
            hdr = bytes(int(x, 16) for x in argv[3:7])
            s = select_mode(d, name)
            if s is not None and open_socket(d, s):
                send_loader(d, s, hdr)
        else:
            print(__doc__)
    finally:
        try: usb.util.release_interface(d, 0)
        except Exception: pass

if __name__ == '__main__':
    main(sys.argv)
