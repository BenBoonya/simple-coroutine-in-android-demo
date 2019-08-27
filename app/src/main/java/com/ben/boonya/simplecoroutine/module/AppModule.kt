package com.ben.boonya.simplecoroutine.module

import com.ben.boonya.simplecoroutine.ArtistRepository
import com.ben.boonya.simplecoroutine.ArtistViewModel
import com.ben.boonya.simplecoroutine.GetArtistsUseCase
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.qualifier.named
import org.koin.dsl.module

val appModule = module {
    scope(named("ARTIST_SCOPE")) {
        scoped {
            ArtistRepository(get())
        }
        scoped {
            GetArtistsUseCase(get())
        }
        viewModel { ArtistViewModel(get()) }
    }
}