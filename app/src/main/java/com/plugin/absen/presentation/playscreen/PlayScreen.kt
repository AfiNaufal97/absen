package com.plugin.absen.presentation.playscreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.plugin.absen.R

@Composable
fun PlayScreen() {
    Scaffold() {
        androidx.compose.material.Surface {
            Column {
                Image(
                    painter = painterResource(id = R.drawable.im_player),
                    contentDescription = "image player"
                )
                ViewTabPlay()
                Spacer(modifier = Modifier.height(16.dp))
//                ListVideoComp(title = "Video 1", duration = 2)
            }
        }
    }

}