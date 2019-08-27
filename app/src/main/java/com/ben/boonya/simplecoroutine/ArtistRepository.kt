package com.ben.boonya.simplecoroutine

import com.ben.boonya.simplecoroutine.api.ItunesApi
import com.ben.boonya.simplecoroutine.model.ArtistApi
import com.ben.boonya.simplecoroutine.model.ResponseWrapper
import retrofit2.Call

class ArtistRepository(private val api: ItunesApi) {

    fun getArtist(name: String): ResponseWrapper<ArtistApi>? = request(api.searchForArtist(name))

    private fun <T> request(call: Call<T>): T? {
        return try {
            val response = call.execute()
            when (response.isSuccessful) {
                true -> response.body()
                false -> null
            }
        } catch (exception: Throwable) {
            null
        }
    }
}