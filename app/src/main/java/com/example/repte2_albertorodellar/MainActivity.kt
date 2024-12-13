package com.example.repte2_albertorodellar

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.repte2_albertorodellar.ui.theme.Repte2_AlbertoRodellarTheme
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.repte2_albertorodellar.model.Routes
import com.example.repte2_albertorodellar.views.LaunchScreen
import com.example.repte2_albertorodellar.views.MenuScreen
import com.example.repte2_albertorodellar.views.GameScreen
import com.example.repte2_albertorodellar.views.ResultScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Repte2_AlbertoRodellarTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Repte2App(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Repte2App(modifier: Modifier){
    val navigationController = rememberNavController()
    NavHost(
        navController = navigationController,
        startDestination = Routes.LaunchScreen.route
    ) {
        composable(Routes.LaunchScreen.route) { LaunchScreen(navigationController) }
        composable(Routes.MenuScreen.route) { MenuScreen(navigationController) }
        composable(Routes.GameScreen.route) { GameScreen(navigationController) }
        composable(Routes.ResultScreen.route) { ResultScreen(navigationController) }

    }
}


