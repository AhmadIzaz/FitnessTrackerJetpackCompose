package com.example.fitnesstrackerjetpackcompose.presentation.ui.naivgation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.fitnesstrackerjetpackcompose.presentation.ui.screen.main.MainScreen
import com.example.fitnesstrackerjetpackcompose.presentation.ui.screen.splash.SplashScreen

@Composable
fun AppNavigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "splash_screen") {
        composable("splash_screen") { SplashScreen(navController) }
        composable("main_screen") { MainScreen(navController,1) }
    }
}
