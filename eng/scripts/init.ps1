param(
    [string] $UseTypeSpecNext
)

$ErrorActionPreference = 'Stop'

. "$PSScriptRoot/helpers.ps1"

[bool]$UseTypeSpecNext = ConvertTo-Bool $UseTypeSpecNext

Push-Location $RepoRoot
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
  $env:path = $env:path = "$RepoRoot/node_modules/.bin;$env:path"
}
finally {
    Pop-Location
}
