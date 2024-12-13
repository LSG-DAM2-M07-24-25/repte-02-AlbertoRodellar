
package com.example.repte2_albertorodellar.views

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.repte2_albertorodellar.R
import com.example.repte2_albertorodellar.model.Routes
import com.example.repte2_albertorodellar.viewmodel.Repte2ViewModel


@Composable
fun CharacterScreen(navController: NavController, repte2ViewModel: Repte2ViewModel) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        Column(
            modifier = Modifier.align(Alignment.Center)
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
        ){
            Image(
                painter = painterResource(id = R.drawable.dragonball_daima_logo),
                contentDescription = "Dragon Ball Logo",
                modifier = Modifier.size(200.dp)
            )
            CharactersRows()
            Button(
                onClick = {
                    navController.navigate(Routes.GameScreen.route)
                },
                modifier = Modifier
                    .width(150.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.LightGray,
                    contentColor = Color.Black
                ),
                shape = RoundedCornerShape(4.dp),
            ) {
                Text(text = "Continuar")
            }
        }
    }
}

@Composable
fun CharactersRows(){
    val characters = mapOf(
        "goku" to R.drawable.goku,
        "gomah" to R.drawable.gomah,
        "masked_majin" to R.drawable.masked_majin,
        "piccolo" to R.drawable.piccolo,
        "supreme" to R.drawable.supreme,
        "vegeta" to R.drawable.vegeta,
    )
    var selectedOption by remember { mutableStateOf("goku") }

    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(4.dp),
    ){
        characters.forEach{ (char, imageRes) ->
            Image(
                painter = painterResource(id = imageRes),
                contentDescription = "Dragon Ball Logo",
                modifier = Modifier.size(100.dp)
            )
            RadioButton(
                selected = selectedOption == char,
                onClick = {
                    Repte2ViewModel.setCharacter(selectedOption)
                }
            )
        }
    }
}