package com.example.vaporwaveappdemo

import android.content.ActivityNotFoundException
import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

/**
 * Composable for the screen that displays each individual album.
 */
@Composable
fun AlbumCard(navController: NavController, number: Int, albumList: MutableList<Album>) {

    val album = albumList[number - 1]
    val name = album.name
    val artist = album.artist
    val rym = album.rym
    val yt = album.yt
    val spotify = album.spotify
    val art = album.art
    val listened = album.listened
    val editListened = album.editListened
    val connections = getConnections(number)

    // Provides context and intents to each external link in the album view.
    val context = LocalContext.current
    val rymIntent = remember { Intent(Intent.ACTION_VIEW, Uri.parse(rym)) }
    val intentYTApp =
        remember { Intent(Intent.ACTION_VIEW, Uri.parse("vnd.youtube:$yt")) }
    val intentYTBrowser =
        remember { Intent(Intent.ACTION_VIEW, Uri.parse("http://www.youtube.com/watch?v=$yt")) }
    val intentSpotify = remember {
        Intent(
            Intent.ACTION_VIEW,
            Uri.parse("https://open.spotify.com/album/$spotify")
        )
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color(50, 56, 70))
    ) {

        Column {

            TopNavBar(navController = navController)
            Divider(color = Color.White, thickness = 1.dp)

            Column(
                Modifier.verticalScroll(rememberScrollState()),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(color = Color(56, 69, 96))
                ) {

                    Column(horizontalAlignment = Alignment.CenterHorizontally) {

                        Text(
                            "#$number: $name", color = Color.White, fontWeight = FontWeight.Bold,
                            modifier = Modifier.padding(top = 10.dp)
                        )
                        Text("Artist: $artist", color = Color.White)

                        Image(
                            painter = painterResource(id = art),
                            contentDescription = "Album art",
                            modifier = Modifier
                                .size(200.dp)
                                .padding(top = 5.dp)
                        )

                        Row(
                            horizontalArrangement = Arrangement.Center,
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            Text(
                                "Listened?", modifier = Modifier.padding(top = 12.dp),
                                color = Color.White
                            )

                            Checkbox(
                                checked = listened.value,
                                onCheckedChange = {

                                    listened.value = it
                                    editListened.putBoolean(number.toString(), it)
                                    editListened.commit()
                                },
                                colors = CheckboxDefaults.colors(checkmarkColor = Color.Black)
                            )

                            Text(
                                text = "More info:",
                                modifier = Modifier.padding(
                                    start = 10.dp,
                                    top = 12.dp,
                                    bottom = 10.dp
                                ),
                                color = Color.White
                            )

                            Image(painter = painterResource(id = R.drawable.rym),
                                contentDescription = "Rym link",
                                modifier = Modifier
                                    .clickable(
                                        enabled = true,
                                        onClickLabel = "Clickable image",
                                        onClick = {
                                            context.startActivity(rymIntent)
                                        }
                                    )
                                    .size(45.dp)
                                    .padding(start = 8.dp, top = 10.dp, end = 8.dp, bottom = 10.dp))
                        }

                        Row(
                            horizontalArrangement = Arrangement.Center,
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            Text(
                                "Listen here:   ", modifier = Modifier.padding(top = 3.dp),
                                color = Color.White
                            )
                            Image(painter = painterResource(id = R.drawable.youtube_logo),
                                contentDescription = "Youtube link",
                                modifier = Modifier
                                    .clickable(
                                        enabled = true,
                                        onClickLabel = "Clickable image",
                                        onClick = {
                                            try {
                                                context.startActivity(intentYTApp)
                                            } catch (ex: ActivityNotFoundException) {
                                                context.startActivity(intentYTBrowser)
                                            }

                                        }
                                    )
                                    .size(40.dp)
                                    .padding(bottom = 10.dp))

                            if (spotify != "null") {
                                Image(painter = painterResource(id = R.drawable.spotify),
                                    contentDescription = "Spotify link",
                                    modifier = Modifier
                                        .clickable(
                                            enabled = true,
                                            onClickLabel = "Clickable image",
                                            onClick = {
                                                context.startActivity(intentSpotify)

                                            }
                                        )
                                        .size(45.dp)
                                        .padding(bottom = 16.dp, top = 2.dp))
                            }
                        }

                    }
                }

                Divider(color = Color.White, thickness = 1.dp)
                FlowchartOptions(navController = navController, connections = connections)
            }
        }
    }
}

/**
 * Composable for the top navigation bar.
 */
@Composable
private fun TopNavBar(navController: NavController) {
    Row(
        horizontalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxWidth()
    ) {

        Box(
            modifier = Modifier
                .clickable {
                    navController.navigate(com.example.vaporwaveappdemo.Screen.HomeScreen.route)
                }
                .padding(top = 10.dp, bottom = 10.dp, start = 15.dp, end = 15.dp)
        ) {
            Row {
                Icon(Icons.Filled.Home, contentDescription = null, tint = Color.White)
                Text("  Home", color = Color.White, fontWeight = FontWeight.Bold)
            }
        }

        Box(
            modifier = Modifier
                .clickable {
                    navController.navigate(com.example.vaporwaveappdemo.Screen.ListScreen.route)
                }
                .padding(top = 10.dp, bottom = 10.dp, start = 15.dp, end = 15.dp)
        ) {
            Row {
                Icon(Icons.Filled.List, contentDescription = null, tint = Color.White)
                Text("  Checklist", color = Color.White, fontWeight = FontWeight.Bold)
            }
        }
    }
}

/**
 * Composable for the flowchart buttons at the bottom of the screen.
 */
@Composable
private fun FlowchartOptions(navController: NavController, connections: HashMap<Int, Pair<Int, String>>) {

    for (connection in connections) {
        Box(
            modifier = Modifier
                .background(color = Color(50, 56, 70))
                .wrapContentSize()
        ) {

            Row(
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier.fillMaxWidth()
            ) {
                Button(
                    onClick = {
                        navController.navigate(
                            com.example.vaporwaveappdemo.Screen.AlbumScreen.withArgs(
                                (connection.value.first)
                            )
                        )
                    }, shape = RoundedCornerShape(
                        topEnd = 30.dp,
                        bottomEnd = 30.dp
                    ), modifier = Modifier
                        .padding(top = 10.dp, start = 5.dp)
                        .border(
                            1.dp, color = Color.Black, shape = RoundedCornerShape(
                                topEnd = 30.dp,
                                bottomEnd = 30.dp
                            )
                        )
                ) {

                    Text(
                        text = connection.value.second,
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                            .width(250.dp)
                            .padding(end = 10.dp),
                        color = Color.Black
                    )
                    Icon(
                        imageVector = Icons.Filled.ArrowForward,
                        contentDescription = "Localized description",
                        modifier = Modifier
                            .size(50.dp)
                            .padding(),
                        tint = Color.Black
                    )
                }
            }
        }
    }
}

