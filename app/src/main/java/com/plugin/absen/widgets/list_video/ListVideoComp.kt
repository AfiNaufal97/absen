package com.plugin.absen.widgets.list_video

import androidx.compose.foundation.layout.*
import androidx.compose.material.Checkbox
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.plugin.absen.ui.theme.Grey
import com.plugin.absen.widgets.text.TextComp

@Composable
fun ListVideoComp(title: String, duration: Int, status: Boolean = false) {
    Row(modifier = Modifier.fillMaxWidth().padding(horizontal = 25.dp), horizontalArrangement = Arrangement.SpaceBetween) {
        Column {
            TextComp(text = title, size = 14.0, textColor = Color.Black)
            Spacer(modifier = Modifier.height(3.dp))
            Row(verticalAlignment = Alignment.CenterVertically) {
                TextComp(text = "Video", size = 14.0, textColor = Grey)
                Icon(
                    Icons.Default.AddCircle,
                    contentDescription = "icon circle",
                    modifier = Modifier.size(3.dp, 3.dp)
                )
                TextComp(text = "$duration min", size = 14.0, textColor = Grey)
            }


        }
        Checkbox(checked = status, onCheckedChange = {

        })
    }
}