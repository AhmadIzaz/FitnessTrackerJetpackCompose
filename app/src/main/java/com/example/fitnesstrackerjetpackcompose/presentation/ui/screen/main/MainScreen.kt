package com.example.fitnesstrackerjetpackcompose.presentation.ui.screen.main

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@Composable
fun MainScreen(navController: NavHostController) {
    Column(modifier = Modifier.padding(16.dp)) {
        Text(text = "Good Morning, User!", style = MaterialTheme.typography.bodyLarge)
        Spacer(modifier = Modifier.height(16.dp))
        QuickActions()
        Spacer(modifier = Modifier.height(16.dp))
        ActivitySummary()
        // Add more components as needed
    }
}

@Composable
fun QuickActions() {
    // Example of quick actions
    Row(horizontalArrangement = Arrangement.SpaceBetween) {
        Button(onClick = { /* Handle click */ }) {
            Text("Log Workout")
        }
        Button(onClick = { /* Handle click */ }) {
            Text("Add Meal")
        }
    }
}

@Composable
fun ActivitySummary() {
    // Placeholder for activity summary
    Text("Activity Summary Here")
    // Implement using cards, charts, etc.
}
