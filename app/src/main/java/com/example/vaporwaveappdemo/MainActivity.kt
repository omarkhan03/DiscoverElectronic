package com.example.vaporwaveappdemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.vaporwaveappdemo.ui.theme.Navigation
import com.example.vaporwaveappdemo.ui.theme.VaporwaveAppDemoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            VaporwaveAppDemoTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) { val albumList = buildChart()
                    Navigation(albumList)
                }
            }
        }
    }
}

fun buildChart(): List<Album> {
    val albumList = listOf(
        Album(1),
        Album(2),
        Album(3),
        Album(4),
        Album(5),
        Album(6),
        Album(7),
        Album(8),
        Album(9),
        Album(10),
        Album(11),
        Album(12),
        Album(13)
    )

    return albumList
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    VaporwaveAppDemoTheme {
        Greeting("Android")
    }
}