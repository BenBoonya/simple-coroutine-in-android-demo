package com.ben.boonya.simplecoroutine

import android.app.Application
import com.ben.boonya.simplecoroutine.module.appModule
import com.ben.boonya.simplecoroutine.module.netModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class ArtistApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidLogger()
            androidContext(this@ArtistApplication)
            modules(listOf(appModule, netModule))
        }
    }
}
