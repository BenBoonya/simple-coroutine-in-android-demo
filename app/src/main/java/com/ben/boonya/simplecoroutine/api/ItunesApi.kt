package com.ben.boonya.simplecoroutine.api

import com.ben.boonya.simplecoroutine.model.ArtistApi
import com.ben.boonya.simplecoroutine.model.ResponseWrapper
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * Created by Boonya Kitpitak on 10/28/18.
 */
interface ItunesApi {

    @GET("/search")
    fun searchForArtist(@Query("term") artistName: String = "", @Query("entity") entity: String = "musicArtist"): Call<ResponseWrapper<ArtistApi>>

}