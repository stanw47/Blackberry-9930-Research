param([int]$Seconds = 240)

Add-Type -AssemblyName System.Windows.Forms
Add-Type -AssemblyName System.Drawing

$form = New-Object System.Windows.Forms.Form
$form.Text = 'BlackBerry BootROM watch'
$form.Width = 640
$form.Height = 150
$form.TopMost = $true
$form.StartPosition = 'Manual'
$form.Left = 60
$form.Top = 60

$lbl = New-Object System.Windows.Forms.Label
$lbl.Dock = 'Fill'
$lbl.Font = New-Object System.Drawing.Font('Segoe UI', 18, [System.Drawing.FontStyle]::Bold)
$lbl.TextAlign = 'MiddleCenter'
$form.Controls.Add($lbl)

$state = @{ wasPresent = $false; end = (Get-Date).AddSeconds($Seconds) }

$timer = New-Object System.Windows.Forms.Timer
$timer.Interval = 250
$timer.Add_Tick({
    if ((Get-Date) -gt $state.end) { $form.Close(); return }
    $p = Get-PnpDevice -PresentOnly -ErrorAction SilentlyContinue |
         Where-Object { $_.InstanceId -match 'VID_0FCA&PID_0001' }
    $now = ($null -ne $p)
    if ($now) {
        $lbl.Text = "BOOTROM UP - CLICK ZADIG DROPDOWN NOW (0FCA 0001)"
        $form.BackColor = [System.Drawing.Color]::LimeGreen
        $lbl.ForeColor = [System.Drawing.Color]::Black
        if (-not $state.wasPresent) {
            try { [console]::beep(1200, 150); [console]::beep(1700, 150) } catch {}
        }
        $state.wasPresent = $true
    } else {
        $lbl.Text = "waiting for BootROM 0001 ... do a BATTERY cycle now"
        $form.BackColor = [System.Drawing.Color]::DimGray
        $lbl.ForeColor = [System.Drawing.Color]::White
        $state.wasPresent = $false
    }
})
$timer.Start()
[System.Windows.Forms.Application]::Run($form)
Write-Output 'alert window closed'
