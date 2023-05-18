package com.plugin.absen

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.plugin.absen.presentation.search.SearchScreen
import com.plugin.absen.ui.theme.AbsenTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AbsenTheme {
                // A surface container using the 'background' color from the theme

                SearchScreen()

            }
        }
    }
}