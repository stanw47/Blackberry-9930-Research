param(
    [int]$Seconds = 180,
    [string]$Log = 'usb_watch.log'
)

# Passive USB enumerator for BlackBerry (VID_0FCA) and Qualcomm (VID_05C6).
# Does NOT open or drive the device - only observes Windows PnP state changes.

$base = Split-Path -Parent $MyInvocation.MyCommand.Path
$logPath = Join-Path $base $Log

function Get-Snapshot {
    Get-PnpDevice -PresentOnly -ErrorAction SilentlyContinue |
        Where-Object { $_.InstanceId -match 'VID_0FCA|VID_05C6' } |
        ForEach-Object { '{0}|{1}|{2}|{3}' -f $_.Class, $_.Status, $_.FriendlyName, $_.InstanceId }
}

Set-Content -Path $logPath -Value ("usb_watch start {0} seconds={1}" -f (Get-Date -Format o), $Seconds) -Encoding utf8
Add-Content $logPath '--- initial present ---'

$prev = @{}
foreach ($line in Get-Snapshot) {
    $prev[$line] = $true
    Add-Content $logPath ("          INIT    {0}" -f $line)
}

$end = (Get-Date).AddSeconds($Seconds)
while ((Get-Date) -lt $end) {
    Start-Sleep -Milliseconds 250
    $cur = @{}
    $snap = Get-Snapshot
    foreach ($line in $snap) { $cur[$line] = $true }
    foreach ($line in $cur.Keys) {
        if (-not $prev.ContainsKey($line)) {
            Add-Content $logPath ("{0}  +ARRIVE {1}" -f (Get-Date -Format 'HH:mm:ss.fff'), $line)
        }
    }
    foreach ($line in $prev.Keys) {
        if (-not $cur.ContainsKey($line)) {
            Add-Content $logPath ("{0}  -REMOVE {1}" -f (Get-Date -Format 'HH:mm:ss.fff'), $line)
        }
    }
    $prev = $cur
}

Add-Content $logPath ("usb_watch end {0}" -f (Get-Date -Format o))
Add-Content $logPath '--- final present ---'
foreach ($line in Get-Snapshot) { Add-Content $logPath ("          FINAL   {0}" -f $line) }
Write-Output "done -> $logPath"
