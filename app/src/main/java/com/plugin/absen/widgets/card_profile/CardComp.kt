package com.plugin.absen.widgets.card_comp

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter
import com.plugin.absen.R
import com.plugin.absen.ui.theme.White
import com.plugin.absen.widgets.text_comp.TextComp

@Composable
fun CardComp(title: String, subTitle: String, imageUrl: String?, textColor: Color = White) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Card(
                modifier = Modifier
                    .width(40.dp)
                    .height(40.dp), shape = CircleShape
            ) {
                if (imageUrl == null)
                    Image(
                        painter = painterResource(id = R.drawable.ic_profile),
                        contentDescription = "icon profile"
                    )
                else
                    Image(
                        painter = rememberAsyncImagePainter(imageUrl),
                        contentDescription = "icon profile"
                    )
            }

            Spacer(modifier = Modifier.width(20.dp))

            Column {
                TextComp(text = subTitle, size = 10.0, textColor = textColor)
                TextComp(text = title, size = 14.0, textColor = textColor)
            }

        }

        Icon(
            painter = painterResource(id = R.drawable.ic_notif),
            modifier = Modifier
                .width(15.dp)
                .height(18.dp),
            tint = White,
            contentDescription = "icon notification"
        )
    }
}