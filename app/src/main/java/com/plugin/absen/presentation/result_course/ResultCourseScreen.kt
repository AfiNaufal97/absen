package com.plugin.absen.presentation.search

import AppBarComp
import CardCourseComp
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Card
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.plugin.absen.ui.theme.BackgroundWhite
import com.plugin.absen.ui.theme.Grey
import com.plugin.absen.ui.theme.MainColor
import com.plugin.absen.utils.Size
import com.plugin.absen.widgets.text.TextComp

@Composable
fun ResultCouseScreen() {
    val size = Size()
    val scrool = rememberScrollState()

    Scaffold(modifier = Modifier.fillMaxSize(), backgroundColor = MainColor, topBar = {
        AppBarComp(title = "Search Results")
    }) {
        Surface(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(scrool)
        ) {
            Card(
                modifier = Modifier
                    .fillMaxSize(),
                backgroundColor = BackgroundWhite,
                shape = RoundedCornerShape(topEnd = 30.dp, topStart = 30.dp)
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(16.dp)

                ) {

                    Spacer(modifier = Modifier.height(16.dp))
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        TextComp(
                            text = "Results for “Swift UI”",
                            size = 14.0,
                            textColor = androidx.compose.ui.graphics.Color.Black
                        )
                        TextComp(
                            text = "Total 200",
                            size = 12.0,
                            textColor = Grey
                        )
                    }

                    Spacer(modifier = Modifier.height(19.dp))
                    TextComp(
                        text = "Recomended Course",
                        size = 14.0,
                        textColor = androidx.compose.ui.graphics.Color.Black
                    )

                    CardCourseComp(
                        course = true,
                        title = "Declarative interfaces for any Apple Devices",
                        money = "IDR.850.000",
                        creatorName = "Harapan Bangsa",
                        level = "All Level"
                    )
                    CardCourseComp(
                        course = true,
                        title = "Declarative interfaces for any Apple Devices",
                        money = "IDR.850.000",
                        creatorName = "Harapan Bangsa",
                        level = "All Level"
                    )

                    CardCourseComp(
                        course = true,
                        title = "Declarative interfaces for any Apple Devices",
                        money = "IDR.850.000",
                        creatorName = "Harapan Bangsa",
                        level = "All Level"
                    )

                    CardCourseComp(
                        course = true,
                        title = "Declarative interfaces for any Apple Devices",
                        money = "IDR.850.000",
                        creatorName = "Harapan Bangsa",
                        level = "All Level"
                    )
                }
            }

        }

    }

}