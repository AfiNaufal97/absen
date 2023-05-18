package com.plugin.absen.widgets.card_progress

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.plugin.absen.R
import com.plugin.absen.ui.theme.Orange
import com.plugin.absen.widgets.text.TextComp

@Composable
fun CardProgressComp(progress: String, titleProgress: String, textColor: Color = Color.Black) {
    Card() {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Box(
                modifier = Modifier
                    .width(35.dp)
                    .height(35.dp)
                    .background(color = Orange.copy(0.5f)), contentAlignment = Alignment.Center
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_award),
                    modifier = Modifier
                        .width(20.dp)
                        .height(20.dp),
                    contentDescription = "icon award"
                )
            }

            Spacer(modifier = Modifier.width(16.dp))

            Column(horizontalAlignment = Alignment.Start) {
                TextComp(text = titleProgress, size = 10.0, textColor)
                TextComp(text = progress, size = 14.0, textColor)

            }
        }
    }
}