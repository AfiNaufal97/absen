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
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.plugin.absen.R
import com.plugin.absen.ui.theme.BackgroundWhite
import com.plugin.absen.ui.theme.MainColor
import com.plugin.absen.utils.Size
import com.plugin.absen.widgets.edit_text.EditTextComp
import com.plugin.absen.widgets.option.OptionComp
import com.plugin.absen.widgets.text.TextComp

@Composable
fun SearchCourseScreen() {
    val size = Size()
    val scrool = rememberScrollState()

    Scaffold(modifier = Modifier.fillMaxSize(), backgroundColor = MainColor, topBar = {
        AppBarComp(title = "Explore")
    }) {
        Surface(modifier = Modifier
            .fillMaxSize()
            .verticalScroll(scrool)) {
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
                    EditTextComp(
                        value = "",
                        image = R.drawable.ic_search,
                        placeHolder = "Search",
                        search = true,
                        searchAction = {

                        })
                    Spacer(modifier = Modifier.height(16.dp))
                    TextComp(
                        text = "Browser Category",
                        size = 14.0,
                        textColor = androidx.compose.ui.graphics.Color.Black
                    )
                    Spacer(modifier = Modifier.height(19.dp))
                    Box(modifier = Modifier.width(size.width().dp)) {
                        Row(Modifier.fillMaxWidth()) {
                            OptionComp(text = "Technology", backGroundColor = MainColor)
                            OptionComp(text = "Bisnis Management", backGroundColor = MainColor)
                            OptionComp(text = "Matematika", backGroundColor = MainColor)

                        }
                    }
                    Spacer(modifier = Modifier.height(19.dp))
                    Box(modifier = Modifier.width(size.width().dp)) {
                        Row(Modifier.fillMaxWidth()) {
                            OptionComp(text = "Kecerdasan Buatan", backGroundColor = MainColor)
                            OptionComp(text = "Technology", backGroundColor = MainColor)
                            OptionComp(text = "Technology", backGroundColor = MainColor)

                        }

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