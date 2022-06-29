package com.example.vaporwaveappdemo

import android.inputmethodservice.Keyboard
import android.media.Image
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.material.Checkbox
import androidx.compose.material.SnackbarDefaults.backgroundColor
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.BlendMode.Companion.Screen
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.key.Key.Companion.G
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.vaporwaveappdemo.ui.theme.Purple200
import com.example.vaporwaveappdemo.ui.theme.Purple500
import com.example.vaporwaveappdemo.ui.theme.Purple700

@Composable
fun AlbumCard(number : Int, name : String, artist : String, art : Int) {

    Card(elevation = 6.dp,
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 200.dp, bottom = 200.dp, start = 70.dp, end = 70.dp),
        backgroundColor = Color(192, 176, 209)

    ) {

        Column(Modifier.verticalScroll(rememberScrollState()),
            horizontalAlignment = Alignment.Start) {

            Text("#$number: $name",Modifier.padding(start=20.dp, top = 10.dp))
            Text(artist,Modifier.padding(start=20.dp))

            Image(painter = painterResource(id = art),
                contentDescription = "Floral Shoppe",
                modifier = Modifier
                    .size(200.dp)
                    .padding(start = 20.dp))

            Row(horizontalArrangement = Arrangement.Start,
                modifier = Modifier.fillMaxWidth()) {
                Text("Listened?", modifier = Modifier.padding(start = 20.dp, top = 12.dp))

                val checkedState = remember { mutableStateOf(true) }
                Checkbox(checked = checkedState.value,
                    onCheckedChange = { checkedState.value = it },
                )
            }

            Row(horizontalArrangement = Arrangement.Start,
                modifier = Modifier.fillMaxWidth()) {
                Button(
                    onClick = {
                    }) {
                    Text(text = "a")
                }
                Button(
                    onClick = {
                    }) {
                    Text(text = "b")
                }
            }

        }
    }
}

