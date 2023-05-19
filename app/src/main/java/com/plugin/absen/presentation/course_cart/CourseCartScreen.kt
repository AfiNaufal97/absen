package com.plugin.absen.presentation.course_cart

import AppBarComp
import CardCourseComp
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.FabPosition
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.plugin.absen.ui.theme.BackgroundWhite
import com.plugin.absen.ui.theme.MainColor
import com.plugin.absen.ui.theme.Orange
import com.plugin.absen.ui.theme.White
import com.plugin.absen.widgets.button.ButtonComp

@Composable
fun CourseCartScreen() {
    Scaffold(topBar = {
        AppBarComp(title = "Cart")
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
                        imageInLeft = false,
                        title = "Declarative interfaces for any Apple Devices",
                        money = "IDR 850.000",
                        level = "All Level",
                        course = true,
                        creatorName = "By Sarah William"
                    )

                    CardCourseComp(
                        imageInLeft = false,
                        title = "Declarative interfaces for any Apple Devices",
                        money = "IDR 850.000",
                        level = "All Level",
                        course = true,
                        creatorName = "By Sarah William"
                    )

                    CardCourseComp(
                        imageInLeft = false,
                        title = "Declarative interfaces for any Apple Devices",
                        money = "IDR 850.000",
                        level = "All Level",
                        course = true,
                        creatorName = "By Sarah William"
                    )


                    Spacer(modifier = Modifier.height(30.dp))


                    ButtonComp(
                        modifier = Modifier.padding(horizontal = 16.dp),
                        text = "Checkout Now",
                        onClick = { },
                        textSize = 14.0,
                        textColor = White,
                        backgoundColor = Orange
                    )


                }

            }
        }


    }

}