package com.ben.boonya.simplecoroutine

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.ben.boonya.simplecoroutine.model.Artist
import kotlinx.android.synthetic.main.artist_viewholder.view.*

/**
 * Created by Boonya Kitpitak on 10/25/18.
 */
class ArtistViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    private val nameTextView = itemView.artistNameTextView
    private val genreTextView = itemView.genreTextView

    fun bindUi(artist: Artist) {
        nameTextView.text = artist.name
        genreTextView.text = artist.genre
    }

}