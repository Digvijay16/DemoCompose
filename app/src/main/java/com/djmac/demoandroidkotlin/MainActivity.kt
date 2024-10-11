package com.djmac.demoandroidkotlin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.djmac.demoandroidkotlin.data.CountryInfo
import com.djmac.demoandroidkotlin.screens.MainScreen
import com.djmac.demoandroidkotlin.ui.theme.DemoAndroidKotlinTheme

class MainActivity : ComponentActivity() {
    private val countryInfo = CountryInfo(
        flagId = R.drawable.`in`,
        commonName = "Bharat",
        nationalCapital = "New Delhi",
        officialName = "Republic Of India",
        region = "Asia",
        subRegion = "South Asia",
        currencySymbol ="₹",
        currencyName ="Indian Rupee",
        mobileCode ="+91",
        tld = ".in"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DemoAndroidKotlinTheme {
                MainScreen(countryInfo)
            }
        }
    }
}

