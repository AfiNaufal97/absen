package com.plugin.absen.widgets.rounded_image

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter

@Composable
fun RoundedImageComp(width: Double, height: Double, image: String) {
    Card(modifier = Modifier.size(width.dp, height.dp), shape = CircleShape) {
        Image(painter = rememberAsyncImagePainter(model = image), contentDescription = "Image")
    }
}