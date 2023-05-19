package com.plugin.absen.presentation.playscreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Tab
import androidx.compose.material.TabRow
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.plugin.absen.ui.theme.Grey
import com.plugin.absen.ui.theme.LightGrey
import com.plugin.absen.ui.theme.White
import com.plugin.absen.widgets.list_video.ListVideoComp

@Composable
fun ViewTabPlay() {
    var tabIndex by remember {
        mutableStateOf(0)
    }


    val tabs = listOf<String>("Course Content", "Discussion")

    Column(
        modifier = Modifier
            .fillMaxWidth()
    ) {
        TabRow(selectedTabIndex = tabIndex, backgroundColor = Color.White) {
            tabs.forEachIndexed { index, value ->

                Tab(
                    selected = tabIndex == index,
                    modifier = Modifier.background(color = if (tabIndex == index) White else LightGrey),
                    onClick = {
                        tabIndex = index
                    }) {
                    Text(modifier = Modifier.padding(vertical = 10.dp),text = value, color = if (tabIndex == index) Color.Black else Grey)
                }

            }


        }

        when (tabIndex) {
            0 -> ListVideoComp(title = "Video 1", duration = 2)
            1 -> ListVideoComp(title = "Video 2", duration = 2)
        }
    }


}