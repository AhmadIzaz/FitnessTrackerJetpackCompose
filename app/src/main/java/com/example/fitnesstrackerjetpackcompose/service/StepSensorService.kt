package com.example.fitnesstrackerjetpackcompose.service

import android.content.Context
import android.hardware.Sensor
import android.hardware.SensorEvent
import android.hardware.SensorEventListener
import android.hardware.SensorManager

class StepSensorService(private val context: Context) : SensorEventListener {

    private var sensorManager: SensorManager? = null
    var stepCount = 0
        private set

    init {
        sensorManager = context.getSystemService(Context.SENSOR_SERVICE) as SensorManager
        registerStepCounter()
    }

    private fun registerStepCounter() {
        val stepCounterSensor = sensorManager?.getDefaultSensor(Sensor.TYPE_STEP_COUNTER)
        stepCounterSensor?.let {
            sensorManager?.registerListener(this, it, SensorManager.SENSOR_DELAY_UI)
        }
    }

    override fun onAccuracyChanged(sensor: Sensor?, accuracy: Int) {
        // Handle sensor accuracy changes if needed
    }

    override fun onSensorChanged(event: SensorEvent?) {
        if (event?.sensor?.type == Sensor.TYPE_STEP_COUNTER) {
            stepCount = event.values[0].toInt()
            // Here you can update your UI or data model accordingly
        }
    }

    // To unregister the sensor on onDestroy()
    fun unregisterSensor() {
        sensorManager?.unregisterListener(this)
    }
}