package com.ben.boonya.simplecoroutine.api

import com.google.gson.GsonBuilder
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Created by Boonya Kitpitak on 10/28/18.
 */
object Api {
    private val gson = GsonBuilder().create()

    val api: ItunesApi by lazy {
        Retrofit.Builder()
            .baseUrl("https://itunes.apple.com/")
            .addConverterFactory(GsonConverterFactory.create(gson))
            .build().create(ItunesApi::class.java)
    }
}