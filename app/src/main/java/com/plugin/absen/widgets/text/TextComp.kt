package com.plugin.absen.widgets.text

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp
import com.plugin.absen.ui.theme.White

@Composable
fun TextComp(text: String, size: Double, textColor: Color = White, modifier: Modifier = Modifier) {
    Text(text = text, fontSize = size.sp, color = textColor, modifier = modifier)
}