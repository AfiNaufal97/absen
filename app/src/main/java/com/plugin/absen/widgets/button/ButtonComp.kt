package com.plugin.absen.widgets.button

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.FloatingActionButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.plugin.absen.ui.theme.MainColor
import com.plugin.absen.widgets.text.TextComp

@Composable
fun ButtonComp(
    text: String,
    onClick: () -> Unit,
    textSize: Double,
    height: Double = 48.0,
    textColor: Color,
    backgoundColor:Color = MainColor,
    modifier: Modifier = Modifier
) {
    Button(
        modifier = Modifier
            .fillMaxWidth()
            .height(height.dp), shape = RoundedCornerShape(10.dp),
        colors = ButtonDefaults.buttonColors(backgroundColor = backgoundColor),
        onClick = onClick
    ) {
        TextComp(text = text, size = textSize, textColor)
    }

}