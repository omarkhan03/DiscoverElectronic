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
import androidx.compose.material.icons.filled.ArrowForward
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
import com.example.vaporwaveappdemo.ui.theme.Purple200
import com.example.vaporwaveappdemo.ui.theme.Purple500
import com.example.vaporwaveappdemo.ui.theme.Purple700

@Composable
fun AlbumCard(navController: NavController, number: Int, albumList: List<Album>) {

    val album = albumList[number-1]
    val name = album.name
    val artist = album.artist
    val art = album.art
    val listened = album.listened

    val connections = getConnections(number)

    val context = LocalContext.current
    val intent = remember { Intent(Intent.ACTION_VIEW, Uri.parse("https://rateyourmusic.com/release/album/radiohead/kid-a/")) }

    Box(modifier = Modifier
        .fillMaxSize()
        .background(color = Color(204, 190, 237))) {

        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 20.dp, bottom = 20.dp, start = 20.dp, end = 20.dp),

        ) {

            Column(Modifier.verticalScroll(rememberScrollState()),
                horizontalAlignment = Alignment.CenterHorizontally) {

                Text("#$number: $name", color = Color.Black, fontWeight = FontWeight.Bold)
                Text("Artist: $artist", color = Color.Black)

                Image(painter = painterResource(id = art),
                    contentDescription = "Album art",
                    modifier = Modifier
                        .size(200.dp)
                        .padding(top = 5.dp))

                Row(horizontalArrangement = Arrangement.Center,
                    modifier = Modifier.fillMaxWidth()) {
                    Text("Listened?", modifier = Modifier.padding(top = 12.dp),
                        color = Color.Black)

                    Checkbox(checked = listened.value,
                        onCheckedChange = { listened.value = it },
                    )

                    Text(text = "More info:", modifier=Modifier.padding(start=10.dp,top=12.dp, bottom=10.dp), color = Color.Black)

                    Image(painter = painterResource(id = R.drawable.rym),
                        contentDescription = "Rym link",
                        modifier= Modifier
                            .clickable(
                                enabled = true,
                                onClickLabel = "Clickable image",
                                onClick = {
                                    context.startActivity(intent)
                                }
                            )
                            .size(35.dp).padding(start=8.dp, top=10.dp))
                }



                for (connection in connections) {
                    Button(
                        onClick = {
                            navController.navigate(com.example.vaporwaveappdemo.Screen.AlbumScreen.withArgs((connection.key)))
                        },
                        modifier = Modifier.padding(top = 5.dp, bottom = 5.dp, start = 5.dp, end = 5.dp).fillMaxWidth()) {
                            Text(text = connection.value,  textAlign = TextAlign.Center)

                        Icon(imageVector = Icons.Filled.ArrowForward, contentDescription = "Localized description",
                            modifier=Modifier.size(20.dp))
                        }

                    }
                }
        }
    }
}

