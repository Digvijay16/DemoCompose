package com.djmac.demoandroidkotlin.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.djmac.demoandroidkotlin.R
import com.djmac.demoandroidkotlin.data.CountryInfo

@Composable
fun CountryCard(countryInfo: CountryInfo) {
    Surface(
        modifier = Modifier
            .fillMaxWidth(1.0f)
            .padding(16.dp)
            .wrapContentHeight(align = Alignment.Top)
            .border(1.dp, color = Color.LightGray)
            .shadow(elevation = 2.dp)
    ) {
        Row(modifier = Modifier.fillMaxWidth()) {
            Column(
                modifier = Modifier
                    .fillMaxWidth(0.2f)
                    .weight(0.2f)
            ) {
                Box(
                    modifier = Modifier
                        .width(80.dp)
                        .height(60.dp)
                        .padding(8.dp),
                    contentAlignment = Alignment.Center
                ) {

                    val resourceId = countryInfo.flagId
                    val imagePainter: Painter = painterResource(id = resourceId)

                    Image(
                        painter = imagePainter,
                        contentDescription = "Country Flag",
                        contentScale = ContentScale.Crop
                    )
                }

                Text(
                    text = countryInfo.commonName,
                    modifier = Modifier
                        .fillMaxWidth(1.0f)
                        .padding(2.dp),
                    fontSize = 20.sp,
                    textAlign = TextAlign.Center
                )


                Text(
                    text = countryInfo.nationalCapital,
                    modifier = Modifier
                        .fillMaxWidth(1.0f)
                        .padding(2.dp),
                    fontSize = 16.sp,
                    textAlign = TextAlign.Center
                )

            }

            Column(
                modifier = Modifier
                    .fillMaxWidth(0.8f)
                    .weight(0.8f)
            ) {
                Text(
                    text = countryInfo.officialName,
                    modifier = Modifier
                        .fillMaxWidth(1.0f)
                        .padding(2.dp),
                    fontSize = 20.sp,
                    textAlign = TextAlign.Center
                )

                Text(
                    text = countryInfo.region,
                    modifier = Modifier
                        .fillMaxWidth(1.0f)
                        .padding(2.dp),
                    fontSize = 18.sp,
                    textAlign = TextAlign.Center
                )

                Text(
                    text = countryInfo.subRegion,
                    modifier = Modifier
                        .fillMaxWidth(1.0f)
                        .padding(2.dp),
                    fontSize = 18.sp,
                    textAlign = TextAlign.Center
                )

                Row(
                    modifier = Modifier.fillMaxWidth(1.0f),
                    horizontalArrangement = Arrangement.SpaceEvenly,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    CircularCard(countryInfo.currencySymbol)

                    Text(
                        text = countryInfo.currencyName,
                        modifier = Modifier
                            .fillMaxWidth(0.5f)
                            .padding(2.dp),
                        fontSize = 18.sp,
                        textAlign = TextAlign.Center
                    )
                    Column(
                        modifier = Modifier.fillMaxWidth(0.8f),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text(
                            text = countryInfo.mobileCode,
                            modifier = Modifier
                                .fillMaxWidth(0.4f)
                                .padding(2.dp),
                            fontSize = 18.sp,
                            textAlign = TextAlign.Center
                        )

                        Text(
                            text = countryInfo.tld,
                            modifier = Modifier
                                .fillMaxWidth(0.4f)
                                .padding(2.dp),
                            fontSize = 18.sp,
                            textAlign = TextAlign.Center
                        )
                    }

                }

            }
        }
    }
}


