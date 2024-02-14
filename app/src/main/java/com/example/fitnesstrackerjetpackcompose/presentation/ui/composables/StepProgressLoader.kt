import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text

@Composable
fun StepProgressLoader(
    stepsTaken: Int,
    stepGoal: Int
) {
    val progress = stepsTaken.toFloat() / stepGoal.toFloat()
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier.size(200.dp)
    ) {
        Canvas(modifier = Modifier.matchParentSize()) {
            val strokeWidth = 12.dp.toPx()
            val diameter = size.minDimension - strokeWidth
            val topLeftOffset = Offset(strokeWidth / 2, strokeWidth / 2)
            val size = Size(diameter, diameter)
            val sweepAngle = progress * 360f

            // Draw loader track
            drawArc(
                color = Color.LightGray,
                startAngle = 0f,
                sweepAngle = 360f,
                useCenter = false,
                topLeft = topLeftOffset,
                size = size,
                style = Stroke(width = strokeWidth)
            )

            // Draw loader progress
            drawArc(
                color = Color.Blue,
                startAngle = 90f, // Adjust start angle for different fill initiation
                sweepAngle = sweepAngle,
                useCenter = false,
                topLeft = topLeftOffset,
                size = size,
                style = Stroke(width = strokeWidth)
            )
        }
        // Display the current step count
        Text(
            text = "$stepsTaken / $stepGoal",
            style = MaterialTheme.typography.bodyLarge
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewStepProgressLoader() {
    MaterialTheme {
        StepProgressLoader(stepsTaken = 6500, stepGoal = 10000)
    }
}
