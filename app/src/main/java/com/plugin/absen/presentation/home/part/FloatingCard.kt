package com.plugin.absen.presentation.home.part

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.plugin.absen.ui.theme.Grey
import com.plugin.absen.ui.theme.Orange
import com.plugin.absen.ui.theme.White
import com.plugin.absen.widgets.card_profile.CardComp
import com.plugin.absen.widgets.card_progress.CardProgressComp

@Composable
fun FloatingCard() {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 80.dp, start = 20.dp, end = 20.dp),
        backgroundColor = White,
        shape = RoundedCornerShape(20.dp)
    ) {

        Column(modifier = Modifier.fillMaxWidth()) {
            CardComp(
                title = "IDR.850.000",
                subTitle = "Declarative interfaces for any Apple Devices",
                imageUrl = null,
                textColor = Color.Black
            )
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp, vertical = 16.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                CardProgressComp(progress = "50%", titleProgress = "Current Progress")
                CardProgressComp(progress = "50%", titleProgress = "Progress Future")
            }

            Surface(modifier = Modifier.fillMaxWidth()){
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(20.dp)
                        .padding(horizontal = 16.dp),
                    shape = RoundedCornerShape(10.dp),
                    backgroundColor = Grey
                ){}
                Card(
                    modifier = Modifier
                        .width(10.dp)
                        .height(20.dp)
                        .padding(horizontal = 16.dp),
                    shape = RoundedCornerShape(10.dp),
                    backgroundColor = Orange
                ){}
            }
            Spacer(modifier = Modifier.height(16.dp))

        }

    }
}