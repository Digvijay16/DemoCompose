package com.djmac.demoandroidkotlin.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CircularCard(text: String) {
    Text(
        text = text,
        modifier = Modifier
            .fillMaxWidth(0.2f)
            .padding(2.dp)
            .drawBehind {
                drawCircle(color = Color.LightGray, radius = this.size.height)
            },
        fontSize = 18.sp,
        textAlign = TextAlign.Center
    )
}