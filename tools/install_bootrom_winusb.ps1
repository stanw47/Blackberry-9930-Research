# install_bootrom_winusb.ps1
# Installs a WinUSB driver package for the BlackBerry BootROM (VID_0FCA / PID_0001)
# so libusb can claim it on every future power-up. Self-elevates.
# Uses only built-in Windows tooling: New-FileCatalog + Set-AuthenticodeSignature + pnputil.

$ErrorActionPreference = 'Stop'

# ---- self-elevate ----
$id = [Security.Principal.WindowsIdentity]::GetCurrent()
$pr = New-Object Security.Principal.WindowsPrincipal $id
if (-not $pr.IsInRole([Security.Principal.WindowsBuiltInRole]::Administrator)) {
    Write-Host 'Elevation required - accepting UAC...'
    Start-Process -FilePath 'powershell.exe' -Verb RunAs -ArgumentList @(
        '-NoProfile','-ExecutionPolicy','Bypass','-File',"`"$PSCommandPath`""
    )
    exit
}

$logPath = 'C:\Users\Stanley Williamson\Desktop\Blackberry 9930 Research\tools\bootrom_winusb_install.log'
New-Item -ItemType Directory -Path (Split-Path $logPath) -Force | Out-Null
try { Start-Transcript -Path $logPath -Force | Out-Null } catch {}

$base = 'C:\Users\Stanley Williamson\Desktop\Blackberry 9930 Research'
$dir = Join-Path $base 'tools\bootrom_winusb'
New-Item -ItemType Directory -Path $dir -Force | Out-Null
$infName = 'blackberry_bootrom.inf'
$infPath = Join-Path $dir $infName
$catName = 'blackberry_bootrom.cat'
$catPath = Join-Path $dir $catName

$inf = @'
; BlackBerry BootROM WinUSB (libwdi-style, hand-rolled)
[Strings]
DeviceName = "BlackBerry BootROM"
VendorName = "Research In Motion, Ltd."
SourceName = "BlackBerry BootROM Install Disk"
DeviceID   = "VID_0FCA&PID_0001"
DeviceGUID = "{5C5BB035-3807-4565-8480-0E7106CED1F4}"

[Version]
Signature   = "$Windows NT$"
Class       = "USBDevice"
ClassGuid   = {88bae032-5a81-49f0-bc3d-a4ff138216d6}
Provider    = "libwdi"
CatalogFile = blackberry_bootrom.cat
DriverVer   = 06/02/2012, 6.1.7600.16385

[ClassInstall32]
Addreg = WinUSBDeviceClassReg

[WinUSBDeviceClassReg]
HKR,,,0,"Universal Serial Bus devices"
HKR,,Icon,,-20

[Manufacturer]
%VendorName% = libusbDevice_WinUSB,NTx86,NTamd64,NTarm64

[libusbDevice_WinUSB.NTx86]
%DeviceName% = USB_Install, USB\%DeviceID%
[libusbDevice_WinUSB.NTamd64]
%DeviceName% = USB_Install, USB\%DeviceID%
[libusbDevice_WinUSB.NTarm64]
%DeviceName% = USB_Install, USB\%DeviceID%

[USB_Install]
Include = winusb.inf
Needs   = WINUSB.NT

[USB_Install.Services]
Include    = winusb.inf
AddService = WinUSB,0x00000002,WinUSB_ServiceInstall

[WinUSB_ServiceInstall]
DisplayName   = "WinUSB - Kernel Driver 06/02/2012 6.1.7600.16385"
ServiceType   = 1
StartType     = 3
ErrorControl  = 1
ServiceBinary = %12%\WinUSB.sys

[USB_Install.Wdf]
KmdfService = WINUSB, WinUsb_Install

[WinUSB_Install]
KmdfLibraryVersion = 1.11

[USB_Install.HW]
AddReg = AddDeviceInterfaceGUID

[AddDeviceInterfaceGUID]
HKR,,DeviceInterfaceGUIDs,0x10000,"{5C5BB035-3807-4565-8480-0E7106CED1F4}"
'@
Set-Content -Path $infPath -Value $inf -Encoding ascii
Write-Host "INF written: $infPath"

# ---- catalog ----
# keep only the INF in the folder so the catalog hashes just it
Get-ChildItem $dir -File | Where-Object { $_.Name -ne $infName } | Remove-Item -Force -ErrorAction SilentlyContinue
if (Test-Path $catPath) { Remove-Item $catPath -Force }
New-FileCatalog -Path $dir -CatalogFilePath $catPath -CatalogVersion 2.0
Write-Host "Catalog created: $catPath"

# ---- self-signed code-signing cert ----
$cert = Get-ChildItem 'Cert:\LocalMachine\My' | Where-Object { $_.Subject -eq 'CN=libwdi BlackBerry Research' } | Select-Object -First 1
if (-not $cert) {
    $cert = New-SelfSignedCertificate -Type CodeSigningCert `
        -Subject 'CN=libwdi BlackBerry Research' `
        -CertStoreLocation 'Cert:\LocalMachine\My' `
        -KeyUsage DigitalSignature `
        -TextExtension @('2.5.29.37={text}1.3.6.1.5.5.7.3.3') `
        -NotAfter (Get-Date).AddYears(10)
}
Write-Host "Cert thumbprint: $($cert.Thumbprint)"

# ---- sign catalog ----
$sig = Set-AuthenticodeSignature -FilePath $catPath -Certificate $cert -HashAlgorithm SHA256
Write-Host "Catalog signature status: $($sig.Status)"

# ---- trust cert ----
$cer = Join-Path $dir 'cert.cer'
Export-Certificate -Cert $cert -FilePath $cer -Force | Out-Null
foreach ($store in 'Cert:\LocalMachine\Root','Cert:\LocalMachine\TrustedPublisher') {
    try { Import-Certificate -FilePath $cer -CertStoreLocation $store | Out-Null; Write-Host "trusted -> $store" }
    catch { Write-Host "trust import failed ($store): $_" }
}

# ---- install driver package ----
Write-Host '--- pnputil ---'
& pnputil /add-driver $infPath /install 2>&1 | Write-Host
Write-Host '--- verify ---'
& pnputil /enum-drivers 2>&1 | Select-String -Pattern 'blackberry_bootrom|0FCA&PID_0001' -Context 2,1
Write-Host 'DONE'
