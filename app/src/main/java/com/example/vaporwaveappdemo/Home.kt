package com.example.vaporwaveappdemo

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun HomeScreen(navController: NavController) {
    Box(modifier = Modifier
        .fillMaxSize()
        .background(color = Color(204, 190, 237))) {

        Column(

        ) {
            Text("Welcome to Discover Electronic, an app designed to introduce you to electronic music.",
                modifier=Modifier.fillMaxWidth().padding(start = 20.dp, top = 20.dp, bottom = 20.dp, end = 20.dp),
                textAlign = TextAlign.Center,
                fontSize = 30.sp,
                color = Color.Black)

            Text("To start, pick one of the below options based on your music taste.",
                modifier=Modifier.fillMaxWidth().padding(start = 20.dp, top = 20.dp, bottom = 20.dp, end = 20.dp),
                textAlign = TextAlign.Center,
                fontSize = 20.sp,
                color = Color.Black)

            Button(
                onClick = {
                    navController.navigate(Screen.AlbumScreen.withArgs((11)))
                }, shape = RoundedCornerShape(
                    topEnd = 30.dp,
                    bottomEnd = 30.dp
                ), modifier = Modifier.padding(top = 5.dp, bottom = 5.dp, start = 5.dp)
                    .border(1.dp, color = Color.Black, shape = RoundedCornerShape(
                        topEnd = 30.dp,
                        bottomEnd = 30.dp)
                    )
            ) {
                Text(
                text = "You are a hip hop fan.",
                textAlign = TextAlign.Center,
                modifier = Modifier.width(250.dp).padding(end=10.dp)
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
                ), modifier = Modifier.padding(top = 5.dp, bottom = 5.dp, start = 5.dp)
                    .border(1.dp, color = Color.Black, shape = RoundedCornerShape(
                        topEnd = 30.dp,
                        bottomEnd = 30.dp)
                    )
            ) {
                Text(
                    text = "You are a rock fan.",
                    textAlign = TextAlign.Center,
                    modifier = Modifier.width(250.dp).padding(end=10.dp)
                )
                Icon(
                    imageVector = Icons.Filled.ArrowForward,
                    contentDescription = "Localized description",
                    modifier = Modifier.size(50.dp).padding(),
                    tint = Color.Black
                )
            }

        }




    }
}