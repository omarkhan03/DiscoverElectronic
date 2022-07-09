package com.example.vaporwaveappdemo

import android.graphics.Color.rgb
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Button
import androidx.compose.material.Divider
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import kotlin.random.Random

@Composable
fun HomeScreen(navController: NavController) {
    Box(modifier = Modifier
        .fillMaxSize()
        .background(color = Color(50, 56, 70))) {

        Column(Modifier.verticalScroll(rememberScrollState())) {

            Box(
                modifier = Modifier
                    .padding(start = 20.dp, top = 20.dp, bottom = 10.dp, end = 20.dp)
                    .background(
                        color = Color(56, 69, 96), shape =
                        RoundedCornerShape(
                            topEnd = 20.dp,
                            bottomEnd = 20.dp,
                            bottomStart = 20.dp,
                            topStart = 20.dp
                        )
                    )
            ) {
                Text(
                    "Welcome to Discover Electronic, an app designed to introduce you to electronic music.",
                    modifier = Modifier.fillMaxWidth()
                        .padding(start = 10.dp, top = 10.dp, bottom = 10.dp, end = 10.dp),
                    textAlign = TextAlign.Center,
                    fontSize = 25.sp,
                    color = Color.White
                )
            }


            Text(
                "To start, pick one of the below options based on your music taste.",
                modifier = Modifier.fillMaxWidth()
                    .padding(start = 20.dp, top = 10.dp, bottom = 10.dp, end = 20.dp),
                textAlign = TextAlign.Center,
                fontSize = 15.sp,
                color = Color.White
            )

            Button(
                onClick = {
                    navController.navigate(Screen.AlbumScreen.withArgs((11)))
                }, shape = RoundedCornerShape(
                    topEnd = 30.dp,
                    bottomEnd = 30.dp
                ), modifier = Modifier.padding(top = 5.dp, bottom = 5.dp, start = 5.dp)
                    .border(
                        1.dp, color = Color.Black, shape = RoundedCornerShape(
                            topEnd = 30.dp,
                            bottomEnd = 30.dp
                        )
                    )
            ) {
                Text(
                    text = "You are a hip hop fan.",
                    textAlign = TextAlign.Center,
                    modifier = Modifier.width(250.dp).padding(end = 10.dp),
                    color = Color.Black
                )
                Icon(
                    imageVector = Icons.Filled.ArrowForward,
                    contentDescription = "Localized description",
                    modifier = Modifier.size(50.dp).padding(),
                    tint = Color.Black
                )
            }

            Button(
                onClick = {
                    navController.navigate(Screen.AlbumScreen.withArgs((1)))
                }, shape = RoundedCornerShape(
                    topEnd = 30.dp,
                    bottomEnd = 30.dp
                ), modifier = Modifier.padding(top = 5.dp, bottom = 15.dp, start = 5.dp)
                    .border(
                        1.dp, color = Color.Black, shape = RoundedCornerShape(
                            topEnd = 30.dp,
                            bottomEnd = 30.dp
                        )
                    )
            ) {
                Text(
                    text = "You are a rock fan.",
                    textAlign = TextAlign.Center,
                    modifier = Modifier.width(250.dp).padding(end = 10.dp),
                    color = Color.Black
                )
                Icon(
                    imageVector = Icons.Filled.ArrowForward,
                    contentDescription = "Localized description",
                    modifier = Modifier.size(50.dp).padding(),
                    tint = Color.Black
                )
            }

            Divider(color = Color.White, thickness = 1.dp)

            Text(
                "Alternatively, you could select the option below to start at a random album.",
                modifier = Modifier.fillMaxWidth()
                    .padding(start = 20.dp, top = 15.dp, bottom = 10.dp, end = 20.dp),
                textAlign = TextAlign.Center,
                fontSize = 15.sp,
                color = Color.White
            )

            Button(
                onClick = {
                    navController.navigate(Screen.AlbumScreen.withArgs((1..57).random()))
                }, shape = RoundedCornerShape(
                    topEnd = 30.dp,
                    bottomEnd = 30.dp
                ), modifier = Modifier.padding(top = 5.dp, bottom = 15.dp, start = 5.dp)
                    .border(
                        1.dp, color = Color.Black, shape = RoundedCornerShape(
                            topEnd = 30.dp,
                            bottomEnd = 30.dp
                        )
                    )
            ) {
                Text(
                    text = "Random album!",
                    textAlign = TextAlign.Center,
                    modifier = Modifier.width(250.dp).padding(end = 10.dp),
                    color = Color.Black
                )
                Icon(
                    imageVector = Icons.Filled.ArrowForward,
                    contentDescription = "Localized description",
                    modifier = Modifier.size(50.dp).padding(),
                    tint = Color.Black
                )
            }

            Text("This is not a perfect chart. It is designed to provide a high level " +
                    "overview of electronic music as a whole. Links to more info on each album has " +
                    "been provided for users to further explore electronic music in depth.\n\n" +
                    "Created by Omar Khan.\nOriginal chart was created by Reddit user u/Beef_The_Thief.",
                modifier=Modifier.fillMaxWidth().padding(start = 10.dp, top = 20.dp, bottom = 10.dp, end = 10.dp),
                textAlign = TextAlign.Center,
                fontSize = 10.sp,
                color = Color.White)
        }

    }
}