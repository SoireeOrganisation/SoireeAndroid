package com.example.myapplication.application

import android.app.Application
import timber.log.Timber

class Controller : Application() {
    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
    }
}