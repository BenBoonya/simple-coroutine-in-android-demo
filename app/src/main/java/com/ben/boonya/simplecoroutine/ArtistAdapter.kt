package com.ben.boonya.simplecoroutine

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ben.boonya.simplecoroutine.model.Artist

/**
 * Created by Boonya Kitpitak on 10/25/18.
 */
class ArtistAdapter : RecyclerView.Adapter<ArtistViewHolder>() {

    var values: List<Artist> = ArrayList(0)
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun onCreateViewHolder(parent: ViewGroup, type: Int): ArtistViewHolder {
        val viewHolder = LayoutInflater.from(parent.context).inflate(R.layout.artist_viewholder, parent, false)
        return ArtistViewHolder(viewHolder)
    }

    override fun getItemCount(): Int = values.size

    override fun onBindViewHolder(viewHolder: ArtistViewHolder, position: Int) {
        viewHolder.bindUi(values[position])
    }

}