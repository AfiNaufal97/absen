package com.plugin.absen.presentation.my_course

import AppBarComp
import CardCourseComp
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.plugin.absen.ui.theme.BackgroundWhite
import com.plugin.absen.ui.theme.MainColor
import com.plugin.absen.ui.theme.Orange
import com.plugin.absen.ui.theme.White
import com.plugin.absen.widgets.button.ButtonComp

@Composable
fun MyCourseScreen() {
    Scaffold(topBar = {
        AppBarComp(title = "My Course")
    }) {


        androidx.compose.material.Surface(
            modifier = Modifier
                .fillMaxSize(), color = MainColor
        ) {
            Card(
                modifier = Modifier.fillMaxSize(),
                backgroundColor = BackgroundWhite,
                shape = RoundedCornerShape(topStart = 30.dp, topEnd = 30.dp)
            ) {
                Column(modifier = Modifier.padding(horizontal = 25.dp)) {
                    CardCourseComp(
                        showMoney = false,
                        title = "Declarative interfaces for any Apple Devices",
                        money = "IDR 850.000",
                        level = "All Level",
                        course = true,
                        creatorName = "By Sarah William"
                    )

                    CardCourseComp(
                        showMoney = false,
                        title = "Declarative interfaces for any Apple Devices",
                        money = "IDR 850.000",
                        level = "All Level",
                        course = true,
                        creatorName = "By Sarah William"
                    )

                    CardCourseComp(
                        showMoney = false,
                        title = "Declarative interfaces for any Apple Devices",
                        money = "IDR 850.000",
                        level = "All Level",
                        course = true,
                        creatorName = "By Sarah William"
                    )


                    Spacer(modifier = Modifier.height(30.dp))


                }

            }
        }
    }
}