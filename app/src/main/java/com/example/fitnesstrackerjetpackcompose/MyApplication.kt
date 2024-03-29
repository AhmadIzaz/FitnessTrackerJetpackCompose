package com.example.fitnesstrackerjetpackcompose

import android.app.Application
import com.example.fitnesstrackerjetpackcompose.di.appModule
import com.example.fitnesstrackerjetpackcompose.di.sensorModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class MyApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@MyApplication)
            modules(appModule, sensorModule)
        }
    }
}
