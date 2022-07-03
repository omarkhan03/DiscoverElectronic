package com.example.vaporwaveappdemo

import android.content.Context
import android.content.Intent
import android.inputmethodservice.Keyboard
import android.media.Image
import android.net.Uri
import android.widget.Toast
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.SnackbarDefaults.backgroundColor
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.BlendMode.Companion.Screen
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.key.Key.Companion.G
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.content.ContextCompat.startActivity
import androidx.navigation.NavController
import androidx.navigation.compose.composable
import com.example.vaporwaveappdemo.ui.theme.Purple200
import com.example.vaporwaveappdemo.ui.theme.Purple500
import com.example.vaporwaveappdemo.ui.theme.Purple700

@Composable
fun AlbumCard(navController: NavController, number: Int, albumList: MutableList<Album>) {

    val album = albumList[number - 1]
    val name = album.name
    val artist = album.artist
    val rym = album.rym
    val art = album.art
    val listened = album.listened

    val connections = getConnections(number)

    val context = LocalContext.current
    val intent = remember { Intent(Intent.ACTION_VIEW, Uri.parse(rym)) }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color(186, 164, 237))
    ) {

        Column {

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
                        Icon(Icons.Filled.Home, contentDescription = null, tint = Color.Black)
                        Text("  Home", color = Color.Black, fontWeight = FontWeight.Bold)
                    }
                }

                Box(
                    modifier = Modifier
                        .clickable {
                            /*todo*/
                        }
                        .padding(top = 10.dp, bottom = 10.dp, start = 15.dp, end = 15.dp)
                ) {
                    Row {
                        Icon(Icons.Filled.List, contentDescription = null, tint = Color.Black)
                        Text("  Checklist", color = Color.Black, fontWeight = FontWeight.Bold)
                    }
                }
            }

            Divider(color = Color.Black, thickness = 1.dp)

            Column(
                Modifier.verticalScroll(rememberScrollState()),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(color = Color(204, 190, 237))
                ) {

                    Column(horizontalAlignment = Alignment.CenterHorizontally) {

                        Text(
                            "#$number: $name", color = Color.Black, fontWeight = FontWeight.Bold,
                            modifier = Modifier.padding(top = 10.dp)
                        )
                        Text("Artist: $artist", color = Color.Black)

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
                                color = Color.Black
                            )

                            Checkbox(
                                checked = listened.value,
                                onCheckedChange = { listened.value = it },
                            )

                            Text(
                                text = "More info:",
                                modifier = Modifier.padding(
                                    start = 10.dp,
                                    top = 12.dp,
                                    bottom = 10.dp
                                ),
                                color = Color.Black
                            )

                            Image(painter = painterResource(id = R.drawable.rym),
                                contentDescription = "Rym link",
                                modifier = Modifier
                                    .clickable(
                                        enabled = true,
                                        onClickLabel = "Clickable image",
                                        onClick = {
                                            context.startActivity(intent)
                                        }
                                    )
                                    .size(35.dp)
                                    .padding(start = 8.dp, top = 10.dp))
                        }

                    }


                }



                Divider(color = Color.Black, thickness = 1.dp)

                for (connection in connections) {

                    Box(
                        modifier = Modifier
                            .background(color = Color(186, 164, 237))
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
                                        .padding(end = 10.dp)
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
        }

    }

}

