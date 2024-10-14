package com.djmac.demoandroidkotlin.screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.djmac.demoandroidkotlin.R
import com.djmac.demoandroidkotlin.components.CountryCard
import com.djmac.demoandroidkotlin.components.CountryCardWithConstraintsLayout
import com.djmac.demoandroidkotlin.data.CountryInfo


@Composable
fun MainScreen(countryInfo: CountryInfo) {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.surface
    ) {
        CountryCardWithConstraintsLayout(countryInfo)
    }
}


@Preview
@Composable
fun PreviewMainScreen() {
    val countryInfo = CountryInfo(
        flagId = R.drawable.`in`,
        commonName = "Bharat",
        nationalCapital = "New Delhi",
        officialName = "Republic Of India",
        region = "Asia",
        subRegion = "South Asia",
        currencySymbol = "₹",
        currencyName = "Indian Rupee",
        mobileCode = "+91",
        tld = ".in"
    )
    CountryCardWithConstraintsLayout(countryInfo)
}
