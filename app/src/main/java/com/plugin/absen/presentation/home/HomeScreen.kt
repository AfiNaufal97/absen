package com.plugin.absen.presentation.home

import CardCourseComp
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Card
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.plugin.absen.presentation.home.part.FloatingCard
import com.plugin.absen.ui.theme.*
import com.plugin.absen.widgets.card_profile.CardComp
import com.plugin.absen.widgets.card_progress.CardProgressComp
import com.plugin.absen.widgets.text.TextComp

@Composable
fun HomeScreen() {
    val scroll = rememberScrollState()
    Surface(
        modifier = Modifier.verticalScroll(scroll),
        color = MainColor
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
        ) {
            CardComp(title = "Poetri Lazuardi ", subTitle = "Welcome back", imageUrl = null)
            Spacer(modifier = Modifier.height(50.dp))
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(), shape = RoundedCornerShape(
                    topEnd = 30.dp,
                    topStart = 30.dp
                ), backgroundColor = BackgroundWhite
            )
            {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(
                            top = 137.dp,
                            start = 16.dp,
                            end = 16.dp
                        )
                ) {
                    Spacer(modifier = Modifier.height(10.dp))
                    TextComp(text = "Recommendation", size = 14.0, textColor = Color.Black)
                    CardCourseComp(
                        title = "Declarative interfaces for any Apple Devices",
                        money = "IDR 850.000",
                        course = true
                    )
                    CardCourseComp(
                        title = "Declarative interfaces for any Apple Devices",
                        money = "IDR 850.000",
                        course = true
                    )
                    CardCourseComp(
                        title = "Declarative interfaces for any Apple Devices",
                        money = "IDR 850.000",
                        course = true
                    )
                    CardCourseComp(
                        title = "Declarative interfaces for any Apple Devices",
                        money = "IDR 850.000",
                        course = true
                    )
                }
            }
        }

        FloatingCard()
    }


}