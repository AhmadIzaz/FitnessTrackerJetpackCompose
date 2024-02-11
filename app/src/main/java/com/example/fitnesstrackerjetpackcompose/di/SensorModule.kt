package com.example.fitnesstrackerjetpackcompose.di

import android.content.Context
import com.example.fitnesstrackerjetpackcompose.service.StepSensorService
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

val sensorModule = module {
    single { provideStepSensorService(androidContext()) }
}

fun provideStepSensorService(context: Context): StepSensorService = StepSensorService(context)