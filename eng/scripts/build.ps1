param(
    [string] $BuildNumber,
    [string] $Output,
    [string] $BuildPreviewVersion
)

$ErrorActionPreference = 'Stop'

. "$PSScriptRoot/helpers.ps1"

[bool]$BuildPreviewVersion = ConvertTo-Bool($BuildPreviewVersion)

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
    Set-Location "$RepoRoot/typespec-extension"
    invoke "npm ls --all"

    Set-Location $RepoRoot
}
finally {
    Pop-Location
}
