package com.example.repte2_albertorodellar.model

sealed class Routes(val route: String) {
    object LaunchScreen: Routes("launchScreen")
    object CharacterScreen: Routes("characterScreen")
    object GameScreen: Routes("gameScreen")
    object ResultScreen: Routes("resultScreen")

}