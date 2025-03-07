/*
 * Copyright (c) 2021 Auxio Project
 * CompactPlaybackView.kt is part of Auxio.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package org.oxycblt.auxio.playback

import android.content.Context
import android.os.Build
import android.util.AttributeSet
import android.view.WindowInsets
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.updatePadding
import androidx.lifecycle.LifecycleOwner
import com.google.android.material.color.MaterialColors
import org.oxycblt.auxio.R
import org.oxycblt.auxio.databinding.ViewPlaybackBarBinding
import org.oxycblt.auxio.detail.DetailViewModel
import org.oxycblt.auxio.music.Song
import org.oxycblt.auxio.util.getAttrColorSafe
import org.oxycblt.auxio.util.inflater
import org.oxycblt.auxio.util.systemBarInsetsCompat

/**
 * A view displaying the playback state in a compact manner. This is only meant to be used
 * by [PlaybackLayout].
 */
class PlaybackBarView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = -1
) : ConstraintLayout(context, attrs, defStyleAttr) {
    private val binding = ViewPlaybackBarBinding.inflate(context.inflater, this, true)

    init {
        id = R.id.playback_bar

        // Deliberately override the progress bar color [in a Lollipop-friendly way] so that
        // we use colorSecondary instead of colorSurfaceVariant. This is because
        // colorSurfaceVariant is used with the assumption that the view that is using it is
        // not elevated and is therefore not colored. This view is elevated.
        binding.playbackProgressBar.trackColor = MaterialColors.compositeARGBWithAlpha(
            context.getAttrColorSafe(R.attr.colorSecondary), (255 * 0.2).toInt()
        )
    }

    override fun onApplyWindowInsets(insets: WindowInsets): WindowInsets {
        // Since we swipe up this view, we need to make sure it does not collide with
        // any gesture events. So, apply the system gesture insets if present and then
        // only default to the system bar insets when there are no other options.
        val gesturePadding = when {
            Build.VERSION.SDK_INT >= Build.VERSION_CODES.R -> {
                insets.getInsets(WindowInsets.Type.systemGestures()).bottom
            }

            Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q -> {
                @Suppress("DEPRECATION")
                insets.systemGestureInsets.bottom
            }

            else -> 0
        }

        updatePadding(
            bottom =
            if (gesturePadding != 0)
                gesturePadding
            else
                insets.systemBarInsetsCompat.bottom
        )

        return insets
    }

    fun setup(
        playbackModel: PlaybackViewModel,
        detailModel: DetailViewModel,
        viewLifecycleOwner: LifecycleOwner
    ) {
        setOnLongClickListener {
            playbackModel.song.value?.let { song ->
                detailModel.navToItem(song)
            }
            true
        }

        binding.playbackSkipPrev?.setOnClickListener {
            playbackModel.skipPrev()
        }

        binding.playbackPlayPause.setOnClickListener {
            playbackModel.invertPlayingStatus()
        }

        binding.playbackSkipNext?.setOnClickListener {
            playbackModel.skipNext()
        }

        binding.playbackPlayPause.isActivated = playbackModel.isPlaying.value!!

        playbackModel.isPlaying.observe(viewLifecycleOwner) { isPlaying ->
            binding.playbackPlayPause.isActivated = isPlaying
        }

        binding.playbackProgressBar.progress = playbackModel.position.value!!.toInt()

        playbackModel.position.observe(viewLifecycleOwner) { position ->
            binding.playbackProgressBar.progress = position.toInt()
        }
    }

    fun setSong(song: Song) {
        binding.song = song
        binding.executePendingBindings()
    }
}
