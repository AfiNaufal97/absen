package com.plugin.absen.widgets.edit_text

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.plugin.absen.ui.theme.Grey
import com.plugin.absen.ui.theme.White
import com.plugin.absen.widgets.text.TextComp

@Composable
fun EditTextComp(
    value: String,
    image: Int,
    placeHolder: String,
    search: Boolean = false,
    searchAction: () -> Unit = {}
) {
    Card(modifier = Modifier.fillMaxWidth(), shape = RoundedCornerShape(10.dp)) {
        if (search)
            TextField(
                value = value,
                modifier = Modifier.fillMaxWidth(),
                placeholder = {
                    TextComp(text = placeHolder, size = 14.0, textColor = Grey)
                },
                colors = TextFieldDefaults.textFieldColors(
                    backgroundColor = White,
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent,
                    disabledIndicatorColor = Color.Transparent
                ),
                onValueChange = {

                },
                trailingIcon = {

                    Icon(
                        modifier = Modifier
                            .width(20.dp)
                            .height(20.dp),
                        tint = Color.Black,
                        painter = painterResource(id = image),
                        contentDescription = "icon email"
                    )
                })
        else
            TextField(
                value = value,
                leadingIcon = {

                    Icon(
                        modifier = Modifier
                            .width(20.dp)
                            .height(20.dp),
                        tint = Color.Black,
                        painter = painterResource(id = image),
                        contentDescription = "icon email"
                    )
                },
                modifier = Modifier.fillMaxWidth(),
                placeholder = {
                    TextComp(text = placeHolder, size = 14.0, textColor = Grey)
                },
                colors = TextFieldDefaults.textFieldColors(
                    backgroundColor = White,
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent,
                    disabledIndicatorColor = Color.Transparent
                ),
                onValueChange = {

                },
            )
    }


}