package com.ben.boonya.simplecoroutine

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ben.boonya.simplecoroutine.model.Artist
import com.ben.boonya.simplecoroutine.model.ArtistApi
import com.ben.boonya.simplecoroutine.model.ResponseWrapper
import kotlinx.coroutines.*
import kotlin.coroutines.CoroutineContext

class ArtistViewModel(
    private val getArtistsUseCase: GetArtistsUseCase
) : ViewModel(), CoroutineScope {

    private val job = Job()

    val artistsLiveData: MutableLiveData<List<Artist>> = MutableLiveData()

    override val coroutineContext: CoroutineContext
        get() = job + Dispatchers.Main

    fun getArtist() {
        launch {
            val artistResponse: ResponseWrapper<ArtistApi>? = withContext(Dispatchers.IO) {
                getArtistsUseCase("Slayer")
            }

            artistsLiveData.value = artistResponse?.result?.map {
                Artist(it.name, it.genreName)
            }
        }
    }

    override fun onCleared() {
        super.onCleared()
        job.cancel()
    }
}