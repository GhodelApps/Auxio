# Changelog

## dev [v2.2.1 or v2.3.0]
- Updated chinese translations [courtesy of cccClyde]

## v2.2.0
#### What's New:
- Added Arabic translations [Courtesy of hasanpasha]
- Improved Russian translations [Courtesy of lisiczka43]
- Added option to reload the music library

#### What's Improved:
- Songs now show their specific artist name instead of the name of the
artist they are grouped up in
- Artists are now grouped up case-insensitively
- Songs of different file formats are now grouped up into a single album
- Reworked typography slightly
- Invalid track numbers [i.e 0] will now be shown as a generic song icon

#### What's Fixed:
- Fixed crash on some devices configured to use French or Czech translations
- Malformed indices should now be corrected when the playback state is restored
- Fixed issue where track numbers would not be shown in the native language's numeric format
- Fixed issue where the preference view would apply the M3 switches inconsistently
- Fixed issue where the now playing indicator on the playback screen would use an internal name

#### Dev/Meta:
- Removed 1.4.X compat
- Added new changelog document
- Reworked contribution info and templates

## v2.1.0
#### What's New:
- Switched to a single queue system [i.e Play Next/Add to queue]
- Added ReplayGain support [Experimental]
- New russian translations [Courtesy of Vladimir Kosolapov]
- New chinese translations [Courtesy of cccClyde]
- Android 12L support
- Added option to round album covers for visual cohesion
- Added FLAC support for devices on Android Oreo and lower
- Added edge-to-edge support on devices on Android Oreo and lower

#### What's Improved:
- Increased mosaic quality
- Enabled black theme on Android 12+
- Content now fades when the playback view is expanding
- Improved layouts on small and large screens
- Improved how the app handles audio focus
- Improved how invalid years and durations are handled
- Use Material 3 switches in the settings menu

#### What's Fixed:
- Fixed issue where the playback view would be hard to swipe up
to when using gesture navigation
- Band-aided completely broken layouts in split screen mode
- Fixed crash in the playback view when a song's duration was 0
- Fixed issue where apps like GadgetBridge would not detect Auxio

#### Dev/Meta:
- ExoPlayer is now a local dependency
- Added ExoPlayer metadata support for Ogg Vorbis and Opus

## v2.0.1
#### What's Fixed:
- Fixed problem where the compact playback controls would not work
- Fixed unusable playback layout on small screens

## v2.0.0
#### What's New:
- Auxio has a new look derived from Material 3
- Material You support on Android 12
- Library and song view have been merged into a unified view
- Shuffle can now be accessed everywhere
- Media indexer now supports album artists
- Accents are now more vibrant and varied
- One can now slide up the compact playback view to reveal the full playback view
- Redesigned widgets to respect album art and increase visual cohesion
- Added song sorting [#16]
- Added default tab customization [#12]
- Added album, artist, and year sorting options
- Added descending order to all sorting options
- Added czech translations [Courtesy of Fjuro]
- Fast scroller has been replaced with a scrollbar with fast scroll capabilities

#### What's Improved:
- Improved playback persistence [State will be wiped]
- Improved accessibility everywhere
- Streamlined the search UI
- Improved queue UI
- Improved detail UI
- Unified appbar behavior
- Songs with accented characters will now show up in search when using their non-accented counterparts
- Removed loading screen
- Artist/Genre images now respect the "Ignore MediaStore Covers" setting
- Ascending order now works properly with years
- Fixed poor UI on Lollipop devices

#### What's Fixed:
- Switched to a new play icon [Fixes seam/alignment issues]
- Fixed issue where notifications would not be colored on samsung phones
- Re-added the german translations that were accidentally removed in 1.4.2
- Fixed issue where links could not be opened on Android 11+
- Fix crash that would occur when rotating the dialog
- Fixed issue where cover art could not be loaded at all on some devices [#51]
- Fixed issue where widgets would have unusable UIs on certain device configurations
- Fixed issue where older launchers will not show a widget preview on android 12
- Fixed duplicate songs appearing on some devices

#### What's Changed:
- Removed colorize notification option
- Removed deep orange and blue grey accents

#### Dev/Meta:
- Migrated to material entirely
- Reworked UI dimensions to line up with material design
- Use color selectors in more places
- Eliminated legacy size classifiers
- Created new architecture document

## v1.4.2
#### What's New:
- Added Widgets
- Android 12 support

#### What's Improved:
- Fast scroller now truncates more aggressively when there is not enough space
- Minor improvements to layout hierarchy
- Detail text/track numbers will no longer shrink
- Loading screen has been tweaked to line up with the rest of Auxio

#### What's Fixed:
- Fixed issue where the new about screen would be cut off in landscape mode
- Fixed issue where songs from two albums with the same year would be incorrectly shown in the artist view

#### Dev/Meta:
- Added license boilerplate

## v1.4.1
#### What's New:
- Added black dark theme
- Added a fast-scroller to the library view
- Redesigned the about screen
- Added full spanish translations [Courtesy of tesphil]
- Added an option to pause when a song repeats [#29]

#### What's Improved:
- Article sort is now used everywhere
- Improved german translations [Courtesy of qwerty287]

#### What's Fixed:
- Fixed problem where cover art would disappear on the lock screen
- Fixed problem where playback controls would not work on the lock screen [#20]
- Fixed issue where fast-scroller indicators would not line up for titles starting with "An"

#### Dev/Meta:
- Updated ExoPlayer to 2.14.2
- Completely refactored UI styling
- Added permission documentation [#22]
- Removed the `ACCESS_NETWORK_STATE` permission [#22]
- Added icon to metadata [#25]

## v1.4.0
#### What's New
- Artist view now shows a list of songs
- Loop functionality now has a new, more sensible behavior
- Dialogs have been revamped with a new style
- Added complete dutch translation [Courtesy of [timnea](https://github.com/timnea)]

#### What's Improved
- Changed the header font to be cleaner
- Completely rolled custom dialog system
- Blacklisted directories are now chosen through the built-in file picker
- Improved opening links in the about dialog
- Restore system now uses unique identifiers, increasing reliability and speed [Will wipe previous state]
- Grey accent in dark mode has been made more visible
- The queue will now reflect the current album/artist/genre sort
- Album/artist/genre sort is now remembered when the app restarts

#### What's Fixed
- Fixed issue where the scroll thumb would briefly display on the Songs UI
- Fixed issue where fast scrolling could be triggered outside the bounds of the indicators
- Fixed issue where the wrong playing item would be highlighted if the names were identical
- Fixed a crash when the thumb was moved above the fast scroller [Backported to 1.3.3, included in this release officially]

#### Dev/Meta
- Migrated fully to material design
- Int preferences are now used everywhere
- Upgraded ExoPlayer to 2.13.3
- Eliminated dependence on JCenter
- Eliminated Material Dialogs and Browser dependencies

## v1.3.3
#### What's Fixed
- Fixed crash that would occur when the app would shut down, preventing the playback state from being saved

#### Dev/Meta
- Explicitly declared dependencies
- Completely integrated fast-scroller code into codebase

## v1.3.2
#### What's New
- Added the ability to exclude directories from indexing [#6]
- Accents have been redone to improve visibility and UI simplicity
- Enabled wake lock functionality

#### What's Improved
- Queue UI no longer navigates away when playing from a file
- Songs UI no longer keeps scroll momentum when fast scrolling
- Improved handling of old genre names
- Changed the header font to be cleaner
- Improved mosaic quality

#### What's Fixed
- Fixed issue where prominent genre would display incorrectly on artist view 
- Fixed issue where AudioFocus would begin playback spontaneously
- Fixed issue where AudioFocus would not restore volume to 100% after ducking
- Fixed issue where the last item in the queue would be behind the navigation bar in edge-to-edge mode
- Fixed issues with the playback restore process (Current state will be wiped on update)
- Fixed buggy behavior when shuffle is toggled inside queue UI

#### Dev/Meta
- Updated exoplayer to 2.13.2
- Updated navigation to 2.3.4

## v1.3.1
#### What's New
- Added the ability to play a song from a file
- Added ability to manually save the playback state

#### What's Improved
- Optimized icons
- Updated the animation of the compact controls to be faster
- Songs without genres are now placed into an unknown genre

#### What's Fixed
- Fixed issue where the music load would fail from repeated genre applications [#4]
- Fixed crash that would occur on the songs UI due to bad music loading [#5]

#### Dev/Meta
- New tagline and description
- Rewrote loading UI
- Rewrote notification code

## v1.3.0
#### What's New:
- Added west-european translations [German, Spanish, French, Italian, Dutch, Portugese]
- Added east-european translations [Romanian, Greek, Russian, Ukranian, Polish, Hungarian]
- Added asian translations [Hindi, Indonesian, Chinese, Korean]
- Added middle-eastern translations [Turkish]

#### What's Improved:
- Optimized image loading even further
- Improved the UI on smaller tablets
- Updated the playback UIs to look better on all devices
- Improved the look of the play/pause button
- Compact controls slide up instead of fade in

#### What's Fixed:
- Fixed RTL layout issues
- Fixed elevation problems on the compact controls
- Fixed issue where a seam would show up on the play icon on certain displays
- Fixed issue where you could still collapse the toolbar on the search view with no results
- Fixed issue where an album would not show up as playing if played from the artist UI

#### Dev/Meta:
- Added fastlane metadata
- Updated Exoplayer to 2.12.3
- Updated Coil to 1.1.1
- Updated support libraries to 1.3.0
- Added architecture document
- Simplified themes

## v1.2.0
#### What's New
- The detail UIs have been redesigned to show the Play and Shuffle options front-and-center
- The Toolbars on the detail UIs have been made more visually appealing
- Images on the detail UIs now have a shadow applied to them
- Albums now have a "Go to artist" option in their menu
- Navigation has been made much for fluid and straightforward
- Search has been moved to a dedicated tab
- Added option to filter searches by Song, Album, Artist, and Genre

#### What's Improved
- The sorting menu is now a dedicated menu instead of an overflow menu, improving accessibility
- Disk-Caching with Coil is now completely turned off
- Tablet layouts have been made more visually appealing
- Made the icons in the Playback UI look better
- Queues are now properly sorted when not shuffled

#### What's Fixed
- Fixed issue where audio focus would resume after an interruption even if explicitly paused by the user
- Fixed a crash that would occur when a song with no genre was played from its genre
- Fixed a crash that would occur from the settings being accessed before they were created
- Fixed an issue where the keyboard will stay visible when navigating to something
- Fixed multiple memory leaks
- Fixed problem where the fast scroll indicator on the Songs UI would be slightly off
- Fixed issue where rewinding wouldn't cause the playback to start again
- Fixed problem where the artist play action wouldn't work

#### What's Changed
- "Remember Shuffle" is now on by default

## v1.1.0
#### What's New
- Rewrote the music loading system to be much faster
- Genres are now song-based instead of artist-based
- When an album is being played, that album will be highlighted in the artist UI
- If a song is playing from a genre, that song will be highlighted in the genre UI
- Switched to a new audio focus system that allows for volume reduction & auto-resuming
- Added option not to load cover art
- Added option to ignore MediaStore cover art
- Added option to play a song from its genre

#### What's Improved
- Made Genre/Artist/Album UIs more efficient
- Playback state restores are now more reliable if the music library changes
- Optimized ExoPlayer for audio playback
- Landscape support is now better for phones/tablets
- Optimized how Coil is used
- Items are now shown in two columns instead of three when a phone is in landscape

#### What's Fixed
- Stop the play/pause button from animating on the Now Playing screen
- Stopped coil from increasing the app size over time due to needless disk caching
- Enabled constant bitrate seeking, allowing for AAC/certain MP3s to be seekable

#### What's Changed
- Rewind threshold option has been removed
- "Play from artist", "Play from album", and "Play from All Songs" have been removed from the song menu in favor of "Go to artist" and "Go to album"
- The currently playing song on the Album UI will now only show if the song is actually playing from the album

## v1.0.0
- Initial release
