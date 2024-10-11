package com.djmac.demoandroidkotlin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import com.djmac.demoandroidkotlin.screens.MainScreen
import com.djmac.demoandroidkotlin.ui.theme.DemoAndroidKotlinTheme
import com.djmac.demoandroidkotlin.viewmodels.ViewModelMainActivity

class MainActivity : ComponentActivity() {

    private val viewModel by viewModels<ViewModelMainActivity> ()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DemoAndroidKotlinTheme {
             MainScreen(viewModel)
            }
        }
    }
}

