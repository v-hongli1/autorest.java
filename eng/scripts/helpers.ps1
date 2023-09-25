$RepoRoot = (Resolve-Path "$PSScriptRoot/../..").Path.Replace('\', '/')

function ConvertTo-Bool($value) {
  if($value -in 'true', '1', 'yes', 'y') {
    return $true
  } elseif($value -in 'false', '0', 'no', 'n') {
    return $false
  } else {
    throw "Unable to convert '$value' to a boolean. Value must be one of 'true', '1', 'yes', 'y', 'false', '0', 'no', 'n'"
  }
}

function Invoke-LoggedCommand($Command, $ExecutePath, [switch]$GroupOutput)
{
    $pipelineBuild = !!$env:TF_BUILD
    $startTime = Get-Date

    if($pipelineBuild -and $GroupOutput) {
        Write-Host "##[group]$Command"
    } else {
        Write-Host "> $Command"
    }

    if($ExecutePath) {
      Push-Location $ExecutePath
    }

    try {
      if ($IsLinux -or $IsMacOs)
      {
          sh -c "$Command 2>&1"
      }
      else
      {
          cmd /c "$Command 2>&1"
      }

      $duration = (Get-Date) - $startTime

      if($pipelineBuild -and $GroupOutput) {
        Write-Host "##[endgroup]"
      }

      if($LastExitCode -ne 0)
      {
          if($pipelineBuild) {
              Write-Error "##[error]Command failed to execute ($duration): $Command`n"
          } else {
              Write-Error "Command failed to execute ($duration): $Command`n"
          }
      }
      else {
          Write-Host "Command succeeded ($duration)`n"
      }
    }
    finally {
      if($ExecutePath) {
        Pop-Location
      }
    }
}

Set-Alias -Name invoke -Value Invoke-LoggedCommand