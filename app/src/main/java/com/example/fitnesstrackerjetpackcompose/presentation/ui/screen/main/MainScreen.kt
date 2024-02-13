package com.example.fitnesstrackerjetpackcompose.presentation.ui.screen.main

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.fitnesstrackerjetpackcompose.presentation.ui.composables.StepCounterWidget

@Composable
fun MainScreen(navigationController: NavHostController ,stepCount: Int) {
    /*Column(modifier = Modifier.padding(16.dp), horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = "Steps Today", style = MaterialTheme.typography.bodyMedium)
        Spacer(modifier = Modifier.height(16.dp))
        Text("$stepCount", style = MaterialTheme.typography.bodyMedium)
    }*/
    StepCounterWidget(stepCount = 1234)
}
