
package com.example.repte2_albertorodellar.views

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.repte2_albertorodellar.model.Routes
import com.example.repte2_albertorodellar.viewmodel.Repte2ViewModel

@Composable
fun ResultScreen(navController: NavController, repte2ViewModel: Repte2ViewModel) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        contentAlignment = Alignment.Center
    ) {
        Button(
            onClick = {
                navController.navigate(Routes.LaunchScreen.route)
            },
            modifier = Modifier
                .wrapContentWidth()
                .padding(top = 32.dp),
            shape = RoundedCornerShape(4.dp),
        ) {
            Text(text = "Result")
        }
    }
}
