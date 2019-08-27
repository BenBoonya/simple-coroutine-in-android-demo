package com.ben.boonya.simplecoroutine.model

import com.google.gson.annotations.SerializedName

/**
 * Created by Boonya Kitpitak on 10/28/18.
 */
data class ArtistApi(
    @SerializedName("wrapperType") val wrapperType: String,
    @SerializedName("artistType") val type: String,
    @SerializedName("artistName") val name: String,
    @SerializedName("artistLinkUrl") val linkUrl: String,
    @SerializedName("artistId") val artistId: String,
    @SerializedName("primaryGenreName") val genreName: String,
    @SerializedName("primaryGenreId") val genreId: String
)