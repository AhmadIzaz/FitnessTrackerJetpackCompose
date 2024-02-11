package com.example.fitnesstrackerjetpackcompose.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.fitnesstrackerjetpackcompose.presentation.ui.naivgation.AppNavigation
import com.example.fitnesstrackerjetpackcompose.presentation.ui.theme.FitnessTrackerJetpackComposeTheme
import com.example.fitnesstrackerjetpackcompose.service.StepSensorService
import org.koin.android.ext.android.inject

class MainActivity : ComponentActivity() {

    private val stepSensorService: StepSensorService by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FitnessTrackerJetpackComposeTheme {
                AppNavigation()
            }
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        stepSensorService.unregisterSensor()
    }
}