# hale-deps

This repository is a collection of build scripts to build Hale Terminal dependencies for macOS and Windows.

## Windows

Hale Terminal dependencies for Windows can be built via the `Build-Dependencies.ps1` PowerShell script. For best compatibility, it is advised to use a recent version of PowerShell Core (pwsh). Older versions of PowerShell might work, but support for these is not provided.

## macOS

Hale Terminal dependencies for macOS can be built via the `build-deps.zsh` Zsh-script. Zsh is the default interactive shell on macOS starting with macOS 10.15, the minimum version supported for building OBS. Both Intel and Apple Silicon are supported.

## Qt

Qt can be built via the `build-qt.zsh` Zsh-script. Qt can be compiled natively on macOS for Intel and Apple Silicon.

## More Information

Further details can be found in the [Wiki Pages](https://github.com/HaleLP/hale-deps/wiki).
