package com.ben.boonya.simplecoroutine

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ben.boonya.simplecoroutine.model.Artist
import com.ben.boonya.simplecoroutine.model.ArtistApi
import com.ben.boonya.simplecoroutine.model.ResponseWrapper
import kotlinx.coroutines.*

class ArtistViewModel(
    private val getArtistsUseCase: GetArtistsUseCase
) : ViewModel() {
    val artistsLiveData: MutableLiveData<List<Artist>> = MutableLiveData()

    fun getArtist() {
        viewModelScope.launch {
            val artistResponse: ResponseWrapper<ArtistApi>? = withContext(Dispatchers.IO) {
                getArtistsUseCase("Slayer")
            }

            artistsLiveData.value = artistResponse?.result?.map {
                Artist(it.name, it.genreName)
            }
        }
    }
}