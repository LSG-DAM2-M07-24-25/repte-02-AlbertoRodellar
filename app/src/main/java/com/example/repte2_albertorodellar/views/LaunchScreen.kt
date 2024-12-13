
package com.example.repte2_albertorodellar.views

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
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

@Composable
fun LaunchScreen(navController: NavController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        contentAlignment = Alignment.Center
    ) {
        Column(
            modifier = Modifier.align(Alignment.Center)
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
        ){
            Image(
                painter = painterResource(id = R.drawable.dragonball_daima_logo),
                contentDescription = "Dragon Ball Logo",
                modifier = Modifier.size(400.dp)
            )
            Button(
                onClick = {
                    navController.navigate(Routes.CharacterScreen.route)
                },
                modifier = Modifier
                    .width(150.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.LightGray,
                    contentColor = Color.Black
                ),
                shape = RoundedCornerShape(4.dp),
            ) {
                Text(text = "Entrar")
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun LaunchScreenPreview() {
    val mockNavController = rememberNavController()
    LaunchScreen(navController = mockNavController)
}