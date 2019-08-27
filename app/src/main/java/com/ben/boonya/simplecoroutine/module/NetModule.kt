package com.ben.boonya.simplecoroutine.module

import com.ben.boonya.simplecoroutine.api.ItunesApi
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

val netModule = module {
    single { provideGson() }
    single { provideApi(gson = get()) }
}

fun provideApi(gson: Gson) = Retrofit.Builder()
    .baseUrl("https://itunes.apple.com/")
    .addConverterFactory(GsonConverterFactory.create(gson))
    .build()
    .create(ItunesApi::class.java)

fun provideGson() = GsonBuilder().create()