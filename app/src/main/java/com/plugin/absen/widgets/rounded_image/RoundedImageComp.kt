package com.plugin.absen.widgets.rounded_image

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter
import com.plugin.absen.ui.theme.White
import com.plugin.absen.widgets.text.TextComp
import com.plugin.absen.R

@Composable
fun RoundedImageComp(
    width: Double,
    height: Double,
    image: String,
    name: String,
    author: Boolean = false,
    nameStatus: String = "Default",
    textComment: String
) {
    Card(modifier = Modifier.size(width.dp, height.dp), shape = CircleShape) {
        Image(painter = rememberAsyncImagePainter(model = image), contentDescription = "Image")
        Column {
            Row {
                TextComp(text = name, size = 12.0)
                Card(shape = RoundedCornerShape(20.dp)) {
                    TextComp(
                        text = nameStatus,
                        size = 10.0,
                        textColor = White,
                        modifier = Modifier.padding(3.dp)
                    )
                }
            }
            TextComp(text = textComment, size = 12.0)
            Spacer(modifier = Modifier.height(5.dp))
            Row {
                TextComp(text = "vote", size = 10.0)
                Spacer(modifier = Modifier.width(10.dp))
                Icon(
                    modifier = Modifier.size(12.dp, 12.dp),
                    painter = painterResource(id = R.drawable.ic_like),
                    contentDescription = "icon like"
                )
            }
        }

    }
}