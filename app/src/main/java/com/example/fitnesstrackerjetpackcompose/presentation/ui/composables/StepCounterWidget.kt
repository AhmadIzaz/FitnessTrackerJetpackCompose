package com.example.fitnesstrackerjetpackcompose.presentation.ui.composables

import StepProgressLoader
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun StepCounterWidget(stepCount: Int) {
    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color.Gray), contentAlignment = Alignment.Center) {
        Text(
            text = "Today",
            modifier = Modifier
                .align(Alignment.TopCenter)
                .padding(top = 32.dp)
        )
        Box(contentAlignment = Alignment.Center, modifier = Modifier.size(200.dp)) {
            /*Canvas(modifier = Modifier.matchParentSize()) {
                drawCircle(
                    color = Color.LightGray,
                    radius = size.minDimension / 2,
                    style = Stroke(width = 20.dp.toPx())
                )*/
            StepProgressLoader(stepsTaken = 5, stepGoal = 20)
            }
            /*
            // Step count text inside the circle
            Text(
                text = "$stepCount",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold
            )
            */
        }
    }

@Preview(showBackground = true)
@Composable
fun PreviewStepCounterWidget() {
    MaterialTheme {
        StepCounterWidget(stepCount = 1234)
    }
}
