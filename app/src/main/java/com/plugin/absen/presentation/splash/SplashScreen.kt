package com.plugin.absen.presentation.splash

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.plugin.absen.R
import com.plugin.absen.ui.theme.MainColor
import com.plugin.absen.ui.theme.Orange
import com.plugin.absen.ui.theme.White
import com.plugin.absen.widgets.text.TextComp

@Composable
fun SplashScreen() {
    Surface(modifier = Modifier.fillMaxSize(), color = MainColor) {
        Column(
            modifier = Modifier
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Image(
                modifier = Modifier
                    .width(100.dp)
                    .height(100.dp),
                contentScale = ContentScale.Fit,
                painter = painterResource(id = R.drawable.lg_pugin),
                contentDescription = "Logo Plugin"
            )
            TextComp(text = "PLUG-IN", size = 28.0, textColor = White)
            Text(text = buildAnnotatedString {
                withStyle(
                    style = SpanStyle(
                        color = White,
                        fontSize = 16.sp
                    )
                ) {
                    append("Learn from ")
                }
                withStyle(
                    style = SpanStyle(
                        color = Orange,
                        fontSize = 16.sp
                    )
                ) {
                    append(" anything")
                }
                withStyle(
                    style = SpanStyle(
                        color = White,
                        fontSize = 16.sp
                    )
                ) {
                    append(" and")
                }
                withStyle(
                    style = SpanStyle(
                        color = Orange,
                        fontSize = 16.sp
                    )
                ) {
                    append(" anywhere")
                }
            })
        }
    }

}