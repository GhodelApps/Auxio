<p align="center"><img src="fastlane/metadata/android/en-US/images/icon.png" width="150"></p>
<h1 align="center"><b>Auxio</b></h1>
<h4 align="center">A simple, rational music player for android.</h4>
<p align="center">
    <a href="https://github.com/oxygencobalt/Auxio/releases/">
        <img alt="GitHub release" src="https://img.shields.io/static/v1?label=Tag&message=v2.2.0&color=0D5AF5">
    </a>
    <a href="https://www.gnu.org/licenses/gpl-3.0">
        <img src="https://img.shields.io/badge/License-GPL%20v3-blue.svg">
    </a>
    <img alt="Minimum SDK" src="https://img.shields.io/badge/API-21%2B-32B5ED">
</p>
<h4 align="center"><a href="/CHANGELOG.md">Changelog</a> | <a href="/info/FAQ.md">FAQ</a> |  <a href="/info/LICENSES.md">Licenses</a> | <a href="/.github/CONTRIBUTING.md">Contributing</a> | <a href="/info/ARCHITECTURE.md">Architecture</a>
<p align="center">
    <a href="https://f-droid.org/app/org.oxycblt.auxio"><img src="https://fdroid.gitlab.io/artwork/badge/get-it-on.png" width="170"></a>
</p>

## About

Auxio is a local music player with a fast, reliable UI/UX without the many useless features present in other music players. Built off of <a href="https://exoplayer.dev/">Exoplayer</a>, Auxio has a much better listening experience compared to other apps that use the native MediaPlayer API. In short, **It plays music.**

I primarily built Auxio for myself, but you can use it too, I guess.

**The default branch is the development version of the repository. For a stable version, see the master branch.**

## Screenshots

<p align="center">
    <img src="fastlane/metadata/android/en-US/images/phoneScreenshots/shot0.png" width=200>
    <img src="fastlane/metadata/android/en-US/images/phoneScreenshots/shot1.png" width=200>
    <img src="fastlane/metadata/android/en-US/images/phoneScreenshots/shot2.png" width=200>
    <img src="fastlane/metadata/android/en-US/images/phoneScreenshots/shot3.png" width=200>
    <img src="fastlane/metadata/android/en-US/images/phoneScreenshots/shot4.png" width=200>
    <img src="fastlane/metadata/android/en-US/images/phoneScreenshots/shot5.png" width=200>
    <img src="fastlane/metadata/android/en-US/images/phoneScreenshots/shot6.png" width=200>
    <img src="fastlane/metadata/android/en-US/images/phoneScreenshots/shot7.png" width=200>
</p>

## Features

- [ExoPlayer](https://exoplayer.dev/) based playback
- Customizable UI & Behavior
- Advanced media indexer that prioritizes correct metadata
- Reliable playback state persistence
- ReplayGain support (On MP3, MP4, FLAC, OGG, and OPUS)
- Material You (Android 12+ only)
- Edge-to-edge
- Embedded covers support
- Search Functionality
- Audio/Headset focus
- Completely private and offline
- No rounded album covers (Unless you want them. Then you can.)

## To possibly come in the future:

- Playlists
- Liked songs
- More notification actions
- And other things, probably

## Permissions

- Storage (`READ_EXTERNAL_STORAGE`): to read and play your media files
- Services (`FOREGROUND_SERVICE`, `WAKE_LOCK`): to keep the music playing even if the app itself is in background

## Building

Auxio relies on a custom version of ExoPlayer that enables some extra features. So, the build process is as follows:

1. `cd` into the project directory
2. Run `python3 prebuild.py`, which installs ExoPlayer and it's extensions.
    - The pre-build process only works with \*nix systems. On windows, this process must be done manually.
3. Build the project normally in Android Studio.

## Contributing

Auxio accepts most contributions as long as they follow the [Contribution Guidelines](/.github/CONTRIBUTING.md).

However, feature additions and major UI changes are less likely to be accepted. See [Accepted Additions](/info/ADDITIONS.md) for more information.

## License

[![GNU GPLv3 Image](https://www.gnu.org/graphics/gplv3-127x51.png)](http://www.gnu.org/licenses/gpl-3.0.en.html)

Auxio is Free Software: You can use, study share and improve it at your
will. Specifically you can redistribute and/or modify it under the terms of the
[GNU General Public License](https://www.gnu.org/licenses/gpl.html) as
published by the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.
