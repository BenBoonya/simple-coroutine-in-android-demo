package com.ben.boonya.simplecoroutine

class GetArtistsUseCase(private val repository: ArtistRepository) {

    operator fun invoke(name: String) = repository.getArtist(name)

}