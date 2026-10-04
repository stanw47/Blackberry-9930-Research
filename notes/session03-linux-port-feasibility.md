# Session 03 — Can we port Linux to the Bold 9930? (feasibility)

Date: 2026-10-03
Device: BlackBerry Bold 9930 (MSM8655), BBOS 7.1.0.1066

Question raised: the 2014 advisory says the bootloader flaw lets an attacker
"load a modified kernel." Could we use that to run Linux on the 9930, and has
anyone done it?

---

## 1. Prior art: none

- No postmarketOS device for MSM8655 / Bold 9900/9930.
- No XDA / CrackBerry / blog port. 2012 Nixers thread asking exactly this:
  *"It's not possible. Trust me... I searched high and low to no avail."*
- The CrackBerry "bootrom/bootload unlock" + U-Boot discussion is about the
  **PlayBook** (QNX, OMAP/Tegra-class), not the 9930.
- `maxnet/berryboot` is a Raspberry Pi boot selector — unrelated.

**Conclusion: unexplored. No prior art to build on.**

## 2. The SoC is the problem: MSM8655 (Snapdragon S2)

From the official Qualcomm mainline status tracker (`linux-msm`):
- Mainline SoC coverage effectively **begins at MSM8x60 (Snapdragon S3)** and
  newer: MSM8x60, APQ8064, MSM8974, MSM8916, MSM8996, SDM845, etc.
- **MSM7x30 / MSM8x55 (S2, which MSM8655 belongs to) is NOT in mainline.**

What does exist:
- Downstream CAF kernels: `arch/arm/mach-msm` with `ARCH_MSM7X30`,
  `MACH_MSM8X55_SURF/FFA` (2.6.35 / 3.0 era).
- HTC trees for the same family: `CyanogenMod/htc-kernel-msm7x30`
  (Vision/Ace/Glacier = Desire HD/Desire S). Ancient; HTC board-specific.

So a port would start from a ~2011 downstream 2.6.35/3.0 kernel and a custom
device tree, not from mainline.

## 3. Hardware blocks that need drivers (all RIM-specific glue)

| Block | Notes / likely part |
|-------|---------------------|
| CPU | ARMv7-A Scorpion, 1.2 GHz, VFP |
| GPU | Adreno 205 (A2xx) — mainline `drm/msm` has thin A2xx/legacy paths |
| PMIC | PM8058/PM8901-class (Qualcomm) |
| Display | 640x480 TFT; MDDI or parallel/DSI panel — RIM panel init unknown |
| Touch | Capacitive controller (I2C) |
| Input | QWERTY matrix + optical trackpad + nav keys |
| Storage | eMMC (8 GB) |
| WiFi/BT/FM | WCN1314-class or Broadcom (needs confirmation) |
| NFC | likely NXP PN544-class |
| Audio | PMIC codec |
| Modem | **integrated in MSM8655** (CDMA/EV-DO + GSM/UMTS); SVLTE on 9930 |

The modem is the big one: running mainline Linux means **no calls/SMS** unless
the baseband is driven — a project unto itself.

## 4. The bootloader gate (the real blocker)

- The BBOS loader accepts only **RIM-signed** images (see session02 §3.1).
- The 2014 flaw is the enabling primitive: code execution + persistence + full
  hardware access. But "load a modified kernel" most plausibly means RIM's
  **BBOS/JVM kernel**, not arbitrary Linux.
- To boot Linux you must first defeat the signed-image check (the 2014 bug), or
  find an MSM8655 signed RAM-loader to bootstrap from. **So the Linux port and
  the bootloader research are the same project.**

## 5. Milestone ladder (realistic)

1. **BootROM / RAM-loader session** — in progress (BootROM = PID_0001, ~12 s
   window; protocol matches `bblink.py`: EPs 0x01/0x81 + 0x02/0x82, 64 B).
2. **Signature bypass** (2014 class) OR obtain MSM8655 RAM-loader.
3. **Tiny custom payload** over the loader that prints to UART/USB → proves
   arbitrary code execution.
4. **Minimal Linux**: msm7x30 defconfig + hand-written DTS → console + eMMC.
5. **Display, PMIC/power, input, WiFi, audio.**
6. **Userland** (postmarketOS/Alpine or Buildroot).

## 6. Expectation

- **Novel and publishable**: first-ever Linux on a BlackBerry Bold (BBOS).
- **Large**: months of reverse engineering; the S2 has no mainline support and
  RIM wrote the board support.
- **End state**: best case a research/cyberdeck device, not a daily driver
  (768 MB RAM, old WiFi, no modem). The keyboard + Linux + a terminal could
  still be a compelling "BlackBerry Linux deck."

## 7. Immediate relevance to current work

The 12 s BootROM window + the `bblink.py` protocol match means the *first*
milestone is close. Everything downstream depends on defeating the image
signature — which is precisely the Class-of-2014 problem on this device.
