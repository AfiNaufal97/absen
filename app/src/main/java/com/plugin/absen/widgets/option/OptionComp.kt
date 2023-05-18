package com.plugin.absen.widgets.option

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.plugin.absen.ui.theme.White
import com.plugin.absen.widgets.text.TextComp

@Composable
fun OptionComp(text: String, textColor: Color = White, backGroundColor: Color) {
    Card(
        shape = RoundedCornerShape(20.dp), modifier = Modifier.padding(end = 10.dp), backgroundColor = backGroundColor
    ) {
        TextComp(
            text = text,
            size = 10.0,
            textColor,
            modifier = Modifier.padding(horizontal = 10.dp, vertical = 5.dp)
        )
    }
}