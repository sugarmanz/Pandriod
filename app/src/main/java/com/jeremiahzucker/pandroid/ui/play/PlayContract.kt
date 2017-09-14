package com.jeremiahzucker.pandroid.ui.play

import com.jeremiahzucker.pandroid.player.PlayMode
import com.jeremiahzucker.pandroid.player.PlayerService
import com.jeremiahzucker.pandroid.request.model.ExpandedStationModel
import com.jeremiahzucker.pandroid.request.model.TrackModel
import com.jeremiahzucker.pandroid.ui.base.BasePresenter
import com.jeremiahzucker.pandroid.ui.base.BaseView

/**
 * PlayContract
 *
 * Author: Jeremiah Zucker
 * Date:   9/2/2017
 * Desc:   TODO: Complete
 */
interface PlayContract {

    interface View : BaseView<Presenter> {

        fun updateSeekCallback()

        fun onPlayerServiceBound(service: PlayerService)

        fun onPlayerServiceUnbound()

        fun onTrackSetAsFavorite(track: TrackModel)

        fun onTrackUpdated(track: TrackModel?)

        fun updatePlayMode(playMode: PlayMode)

        fun updatePlayToggle(play: Boolean)

        fun updateFavoriteToggle(favorite: Boolean)

    }

    interface Presenter : BasePresenter<View> {

        // TODO: Convert to thumbs up/down terminology
        fun setTrackAsFavorite(track: TrackModel, favorite: Boolean)

        fun bindPlayerService()

        fun unbindPlayerService()

    }

}