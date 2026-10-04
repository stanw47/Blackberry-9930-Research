#!/usr/bin/env python3
"""parse_cfp.py - structural parser for RIM CFP/RamImage firmware images (.sfi).

Derived from reversing RIMDeviceManager.exe (RIM_CFP namespace), sessions 10-11.

Layout facts used:
  * code/image blocks carry magic 0xD7A82D1F (load address + entry follow)
  * signature records carry one of:
        0xD7C82D1F  RSA            record size 0xB4
        0xC6B71C0E  EC521-SHA-256  record size 0xBC
        0xB5A60BFD  EC521-SHA-512  record size 0xBC
    at tag T: [T]=tag, [T-4]=tag, [T-8]=size; body starts at T-4-size.
  * components are named (*.elf/.ldll/.bin/.dll), signed "RIMOS-ECC-SHAxxx".
"""
import sys, struct, re

SIG_TAGS = {0xD7C82D1F: ('RSA', 0xB4),
            0xC6B71C0E: ('EC521-SHA-256', 0xBC),
            0xB5A60BFD: ('EC521-SHA-512', 0xBC)}
CODE_TAGS = {0xD7A82D1F: 'code/load', 0xD7B02D1F: 'table', 0xD7CC2D1F: 'addrtable'}


def u32(d, o):
    return struct.unpack_from('<I', d, o)[0]


def main(path):
    d = open(path, 'rb').read()
    print("file: %s\nsize: %d\n" % (path, len(d)))

    print("== RIM magic map ==")
    for m in re.finditer(rb'\x1f\x2d(.)\xd7', d, re.S):
        val = 0xD7000000 | (m.group(1)[0] << 16) | 0x2D1F
        lbl = SIG_TAGS.get(val, (CODE_TAGS.get(val, '?'),))[0]
        print("  0x%08X  0x%08X  %s" % (m.start(), val, lbl))

    print("\n== named components ==")
    seen = set()
    for m in re.finditer(rb'[A-Za-z0-9_][A-Za-z0-9_.-]{3,}(?:\.elf|\.ldll|\.bin|\.dll|\.mbn)', d):
        s = m.group().decode('latin1')
        if s not in seen:
            seen.add(s)
            print("  0x%08X  %s" % (m.start(), s))
    print("  total: %d" % len(seen))

    print("\n== signature algorithms ==")
    for m in re.finditer(rb'RIMOS-[A-Z0-9-]+', d):
        print("  0x%08X  %s" % (m.start(), m.group().decode()))

    print("\n== signature records ==")
    for tag, (algo, sz) in SIG_TAGS.items():
        pat = b'\x1f\x2d' + bytes([(tag >> 16) & 0xFF]) + b'\xd7'
        for m in re.finditer(re.escape(pat), d):
            o = m.start()
            size = u32(d, o - 8)
            ver = u32(d, o - 4)
            body = o - 4 - size
            print("  tag@0x%08X %-14s size=%d ver=0x%08X body@0x%08X"
                  % (o, algo, size, ver, body))


if __name__ == '__main__':
    main(sys.argv[1] if len(sys.argv) > 1 else
         '/home/stanw47/Blackberry-9930-Research/rom/9930AllLang_v7.1.0.163_P5.1.0.137/CDMA/rim0x05001204.sfi')
