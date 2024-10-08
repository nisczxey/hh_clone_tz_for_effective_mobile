package com.example.hh_clone_tz_for_effective_mobile

import android.app.Application
import com.example.hh_clone_tz_for_effective_mobile.di.dataModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@App)
            modules(dataModule)
        }
    }
}