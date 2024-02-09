package com.example.fitnesstrackerjetpackcompose.presentation.ui.screen.splash

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavHostController
import com.example.fitnesstrackerjetpackcompose.R
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(navController: NavHostController) {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Image(painter = painterResource(id = R.drawable.fitness_tracker_logo), contentDescription = "Splash Image")

        LaunchedEffect(key1 = true) {
            delay(2000) // Delay for 2 seconds
            navController.navigate("main_screen") {
                popUpTo("splash_screen") { inclusive = true }
            }
        }
    }
}
