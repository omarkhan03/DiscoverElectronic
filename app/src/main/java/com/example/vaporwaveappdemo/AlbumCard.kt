package com.example.vaporwaveappdemo

import android.inputmethodservice.Keyboard
import android.media.Image
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.material.Checkbox
import androidx.compose.material.SnackbarDefaults.backgroundColor
import androidx.compose.material.Text
import androidx.compose.runtime.*
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
fun AlbumCard(navController: NavController, number: Int) {

    val album = Album(number)
    val name = album.name
    val artist = album.artist
    val art = album.art

    var next by remember {
        mutableStateOf(number+1)
    }

    var prev by remember {
        mutableStateOf(number-1)
    }

    Box(modifier = Modifier.fillMaxSize().background(color = Color(31, 1, 56))) {
        Card(elevation = 6.dp,
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 200.dp, bottom = 200.dp, start = 70.dp, end = 70.dp),
            backgroundColor = Color(192, 176, 209)

        ) {

            Column(Modifier.verticalScroll(rememberScrollState()),
                horizontalAlignment = Alignment.Start) {

                Text("#$number: $name",Modifier.padding(start=20.dp, top = 10.dp),
                    color = Color.Black)
                Text(artist,Modifier.padding(start=20.dp),
                    color = Color.Black)

                Image(painter = painterResource(id = art),
                    contentDescription = "Floral Shoppe",
                    modifier = Modifier
                        .size(200.dp)
                        .padding(start = 20.dp))

                Row(horizontalArrangement = Arrangement.Start,
                    modifier = Modifier.fillMaxWidth()) {
                    Text("Listened?", modifier = Modifier.padding(start = 20.dp, top = 12.dp),
                        color = Color.Black)

                    val checkedState = remember { mutableStateOf(true) }
                    Checkbox(checked = checkedState.value,
                        onCheckedChange = { checkedState.value = it },
                    )
                }

                Row(horizontalArrangement = Arrangement.Start,
                    modifier = Modifier.fillMaxWidth()) {
                    Button(
                        onClick = {
                            navController.navigate(com.example.vaporwaveappdemo.Screen.AlbumScreen.withArgs((next)))
                        }) {
                        Text(text = "a")
                    }
                    Button(
                        onClick = {
                            navController.navigate(com.example.vaporwaveappdemo.Screen.AlbumScreen.withArgs((prev)))

                        }) {
                        Text(text = "b")
                    }
                }

            }
        }
    }
}

