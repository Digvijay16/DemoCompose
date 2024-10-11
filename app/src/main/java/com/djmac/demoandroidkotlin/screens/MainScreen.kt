package com.djmac.demoandroidkotlin.screens

import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import com.djmac.demoandroidkotlin.viewmodels.ViewModelMainActivity


@Composable
fun MainScreen(viewModel: ViewModelMainActivity) {

    viewModel.counter.observeAsState().value.let { }
    viewModel.error.observeAsState().value?.let {
        it.let {
            Toast.makeText(LocalContext.current, it, Toast.LENGTH_LONG).show()
        }
    }


    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround,
            verticalAlignment = Alignment.CenterVertically
        ) {

            Button(onClick = { viewModel.decrementCounter.invoke() }) {
                Text(text = "Decrease")
            }

            Text(text = "${viewModel.counter.value}")

            Button(onClick = { viewModel.incrementCounter.invoke() }) {
                Text(text = "Increase")
            }

        }
    }
}


@Preview
@Composable
fun PreviewMainScreen() {
    MainScreen(ViewModelMainActivity())
}
