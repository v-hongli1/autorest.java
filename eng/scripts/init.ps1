param(
    [string] $UseTypeSpecNext
)

[bool]$UseTypeSpecNext = $useTypeSpecNext -in 'true', '1', 'yes', 'y'

$ErrorActionPreference = 'Stop'

$root = (Resolve-Path "$PSScriptRoot/../..").Path.Replace('\', '/')

function invoke($command) {
    Write-Host "> $command"
    Invoke-Expression $command
    if ($LASTEXITCODE -ne 0) {
        Write-Host "Command failed: $command"
        exit $LASTEXITCODE
    }
}

Push-Location $root
try {
  #  TODO: pull tool versions from package.json
  invoke "npm install -g @typespec/compiler@next"

  if ($UseTypeSpecNext ) {
    invoke "npx @azure-tools/typespec-bump-deps typespec-extension/package.json typespec-tests/package.json --add-npm-overrides"
  }
  
  Write-Host "typespec-extension/package.json"
  Get-Content typespec-extension/package.json -Raw
  
  Write-Host "typespec-tests/package.json"
  Get-Content typespec-tests/package.json -Raw

  npm install
  $env:path = $env:path = "$root/node_modules/.bin;$env:path"
}
finally {
    Pop-Location
}
