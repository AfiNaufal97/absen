package com.plugin.absen.widgets.list_account

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import com.plugin.absen.R
import com.plugin.absen.widgets.text.TextComp


@Composable
fun ListAccountComp(text: String, size: Double = 14.0, textColor: Color = Color.Black) {
    Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
        TextComp(text, size, textColor)
        Icon(
            painter = painterResource(id = R.drawable.ic_arrow_next),
            contentDescription = "icon for show"
        )
    }
}