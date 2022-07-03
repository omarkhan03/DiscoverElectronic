package com.example.vaporwaveappdemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
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

fun buildChart(): MutableList<Album> {


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
        Album(13),
        Album(14),
        Album(15),
        Album(16),
        Album(17),
        Album(18),
        Album(19),
        Album(20),
        Album(21),
        Album(22),
        Album(23),
        Album(24),
        Album(25),
        Album(26),
        Album(27),
        Album(28),
        Album(29),
        Album(30),
        Album(31),
        Album(32),
        Album(33),
        Album(34),
        Album(35),
        Album(36),
        Album(37),
        Album(38),
        Album(39),
        Album(40),
        Album(41),
        Album(42),
        Album(43),
        Album(44),
        Album(45),
        Album(46),
        Album(47),
        Album(48),
        Album(49),
        Album(50),
        Album(51),
        Album(52),
        Album(53),
        Album(54),
        Album(55),
        Album(56),
        Album(57),
        )

    return albumList.toMutableList()
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