package com.ben.boonya.simplecoroutine.module

import com.ben.boonya.simplecoroutine.ArtistRepository
import com.ben.boonya.simplecoroutine.ArtistViewModel
import com.ben.boonya.simplecoroutine.GetArtistsUseCase
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val artistModule = module {
    single {
        ArtistRepository(get())
    }
    factory {
        GetArtistsUseCase(get())
    }
    viewModel { ArtistViewModel(get()) }
}