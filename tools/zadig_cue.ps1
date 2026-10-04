param([int]$Seconds = 180)

$wsh = New-Object -ComObject WScript.Shell
$end = (Get-Date).AddSeconds($Seconds)
$was = $false
Write-Output "cue: bring Zadig to front + beep when BootROM (0001) appears..."
while ((Get-Date) -lt $end) {
    $p = Get-PnpDevice -PresentOnly -ErrorAction SilentlyContinue |
         Where-Object { $_.InstanceId -match 'VID_0FCA&PID_0001' }
    $now = ($null -ne $p)
    if ($now) {
        if (-not $was) {
            try { [console]::beep(1500, 150); [console]::beep(1800, 150) } catch {}
            foreach ($t in 'Zadig', 'Zadig 2.9', 'Zadig 2.8') {
                try { if ($wsh.AppActivate($t)) { break } } catch {}
            }
            Write-Output ("[{0}] BOOTROM UP" -f (Get-Date -Format 'HH:mm:ss'))
        }
        $was = $true
    } else {
        $was = $false
    }
    Start-Sleep -Milliseconds 200
}
Write-Output "cue done"
