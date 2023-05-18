package com.plugin.absen.presentation.login

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.plugin.absen.ui.theme.BackgroundWhite
import com.plugin.absen.ui.theme.MainColor
import com.plugin.absen.R
import com.plugin.absen.ui.theme.Orange
import com.plugin.absen.ui.theme.White
import com.plugin.absen.utils.Size
import com.plugin.absen.widgets.button.ButtonComp
import com.plugin.absen.widgets.edit_text.EditTextComp
import com.plugin.absen.widgets.text.TextComp


@Composable
fun LoginScreen() {
    val scroll = rememberScrollState()
    val loginViewModel: LoginViewModel = viewModel()
    val size = Size()
    val height = size.height()
    androidx.compose.material.Surface(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(scroll), color = MainColor
    ) {

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 131.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                modifier = Modifier
                    .width(74.dp)
                    .height(61.dp),
                painter = painterResource(id = R.drawable.lg_pugin),
                contentDescription = "Logo Plugin"
            )
            TextComp(text = "PLUG-IN", size = 24.0, textColor = White)
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

        Card(
            backgroundColor = BackgroundWhite,
            shape = RoundedCornerShape(topStart = 30.dp, topEnd = 30.dp),
            modifier = Modifier
                .fillMaxHeight()
                .padding(top = (size.height() / 2).dp)

        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(horizontal = 24.dp),
                horizontalAlignment = androidx.compose.ui.Alignment.CenterHorizontally
            ) {
                Spacer(modifier = Modifier.height(43.dp))
                EditTextComp(
                    value = loginViewModel.email.value.toString(),
                    image = R.drawable.ic_email,
                    placeHolder = "Email"
                )
                Spacer(modifier = Modifier.height(43.dp))
                EditTextComp(
                    value = loginViewModel.email.value.toString(),
                    image = R.drawable.ic_password,
                    placeHolder = "Password"
                )
                Spacer(modifier = Modifier.height(72.dp))
                ButtonComp(text = "Login", onClick = { }, textSize = 14.0, textColor = White)
                Spacer(modifier = Modifier.height(72.dp))
                TextComp(text = "© PLUG-IN 2022", size = 12.0, textColor = Orange)
                Spacer(modifier = Modifier.height(55.dp))
            }
        }

    }
}