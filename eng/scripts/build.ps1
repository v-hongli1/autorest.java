param(
    [string] $BuildNumber,
    [string] $Output,
    [string] $BuildAlphaVersion
)

$ErrorActionPreference = 'Stop'

. "$PSScriptRoot/helpers.ps1"

[bool]$BuildAlphaVersion = ConvertTo-Bool($BuildAlphaVersion)

Push-Location $RepoRoot
try {
    invoke "mvn -f pom.xml -P local,tsp -T 1C --no-transfer-progress clean verify package install"

    Push-Location "./typespec-extension"
    try {
      Write-Host "Installing dependencies for TypeSpec Java"
      invoke "npm install"
    
      Write-Host "Building TypeSpec Java"
      invoke "npm run build"
    
      Write-Host "Linting TypeSpec Java"
      invoke "npm run lint"
    
      Write-Host "Checking TypeSpec Java format"
      invoke "npm run check-format"
    
      Write-Host "Packing TypeSpec Java"
      invoke "npm pack"
    } finally {
        Pop-Location
    }

    Write-Host "`n`n====================================="
    Write-Host "Print Package Dependencies"
    Write-Host "====================================="
    
    Write-Host "Dependencies of typespec-java"
    Set-Location typespec-extension
    invoke "npm ls --all"
    
    Write-Host "Dependencies of typespec-java-tests"
    Set-Location typespec-tests
    invoke "npm ls --all"

    Set-Location $RepoRoot

    Write-Host "`n`n====================================="
    Write-Host "Revert package.json"
    Write-Host "====================================="
    invoke "git checkout package.json typespec-extension/package.json typespec-tests/package.json"
    
    Write-Host "`n`n====================================="
    Write-Host "Git Diff"
    Write-Host "====================================="
    invoke "git status"
    invoke "git diff"
}
finally {
    Pop-Location
}
