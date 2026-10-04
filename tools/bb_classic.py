#!/usr/bin/env python3
"""bb_classic.py - minimal classic BlackBerry socket-protocol client for the
9930 OS session (PID 8004), derived from Barry (netdirect/barry) structs and
verified live (session12).

Wire format (little-endian):
    [outer_socket u16][size u16][command u8]
    [target_socket u16][sequence u8][extra...]
size = 8 + len(extra).

Flows verified on the device:
    SELECT_MODE(0x07,"RIM Desktop") -> MODE_SELECTED(0x08) socket 8
    SELECT_MODE(0x07,"RIM_JavaLoader") -> MODE_SELECTED(0x08) socket 6
    OPEN_SOCKET(0x0A) -> OPENED_SOCKET(0x10)
    ECHO(0x01) -> ECHO_REPLY(0x02)  (ticks echoed)
    HELLO(0x64) -> SEQUENCE_HANDSHAKE(0x13) + JL_READY(0x01)
    FETCH_ATTRIBUTE(0x05,socket 8) -> device properties (serial/metrics/PIN)

Two framings share the endpoint:
    socket protocol (pkt())  - SELECT_MODE / OPEN_SOCKET / ECHO / attributes
    JavaLoader     (jl())    - HELLO / GET_DIRECTORY / COD load on an open socket
The device enforces sequence numbers via SEQUENCE_HANDSHAKE (0x13); the host
must sync (reset_seq()) and, for full JL, implement Barry's password/sequence
state machine. Each SELECT_MODE needs a fresh device state (USB reset).

Each mode selection needs a fresh device state (USB reset) first.

Usage:
    python3 bb_classic.py select "RIM_JavaLoader"
    python3 bb_classic.py open 6
    python3 bb_classic.py hello
    python3 bb_classic.py echo
    python3 bb_classic.py info
"""
import sys, time, struct
import usb.core, usb.util

PID = 0x8004
EP_IN, EP_OUT = 0x82, 0x02
_seq = [0]

CMDS = {
    'echo': 0x01, 'reset': 0x03, 'fetch': 0x05, 'select': 0x07,
    'open': 0x0A, 'close': 0x0B, 'password': 0x0F, 'hello': 0x64,
    'device_info': 0x71, 'os_metrics': 0x78, 'bootrom_metrics': 0x79,
    'get_directory': 0x6D, 'modules': 0x8D,
}


def pkt(target, command, extra=b'', outer=0):
    """Socket protocol: [outer][size][cmd][target][seq][extra] (seq auto)."""
    seq = _seq[0]
    _seq[0] = (_seq[0] + 1) & 0xFF
    size = 8 + len(extra)
    return (struct.pack('<HHB', outer, size, command)
            + struct.pack('<H', target) + bytes([seq]) + extra)


def jl(sock, command, unknown=0, param_size=0, data=b''):
    """JavaLoader data packet on an opened socket:
       [sock][size][cmd][unknown][param_size][data]."""
    return (struct.pack('<HHBBH', sock, 8 + len(data), command, unknown, param_size)
            + bytes(data))


def reset_seq():
    """Call after a device SEQUENCE_HANDSHAKE (cmd 0x13)."""
    _seq[0] = 0


def _open():
    d = usb.core.find(idVendor=0x0FCA, idProduct=PID)
    if d is None:
        sys.exit("device 0FCA:8004 not present")
    try:
        d.set_configuration()
    except Exception:
        pass
    try:
        if d.is_kernel_driver_active(0):
            d.detach_kernel_driver(0)
    except Exception:
        pass
    usb.util.claim_interface(d, 0)
    return d


def tx(d, p, tag):
    print("TX[%s] %s" % (tag, p.hex()))
    d.write(EP_OUT, p, timeout=1500)


def rx(d, tag, tmo=1500):
    try:
        raw = bytes(d.read(EP_IN, 0x10000, timeout=tmo))
        print("RX[%s] %s" % (tag, raw.hex()))
        return raw
    except usb.core.USBTimeoutError:
        print("RX[%s] timeout" % tag)
        return None


def main(argv):
    d = _open()
    cmd = argv[1] if len(argv) > 1 else "echo"
    try:
        if cmd == "select":
            name = (argv[2] if len(argv) > 2 else "RIM Desktop").encode().ljust(16, b'\x00')
            tx(d, pkt(0x00FF, CMDS['select'], name), "select")
            rx(d, "select")
            rx(d, "select-seq", 600)
        elif cmd == "open":
            sock = int(argv[2]) if len(argv) > 2 else 6
            tx(d, pkt(sock, CMDS['open']), "open")
            r = rx(d, "open")
            if r and len(r) >= 5 and r[4] == 0x13:
                rx(d, "open-seq")
        elif cmd == "echo":
            tx(d, pkt(8, CMDS['echo'], struct.pack('<Q', 0x1122334455667788)), "echo")
            rx(d, "echo")
        else:
            tx(d, pkt(6, CMDS.get(cmd, 0x64)), cmd)
            rx(d, cmd)
    finally:
        try:
            usb.util.release_interface(d, 0)
        except Exception:
            pass


if __name__ == '__main__':
    main(sys.argv)
