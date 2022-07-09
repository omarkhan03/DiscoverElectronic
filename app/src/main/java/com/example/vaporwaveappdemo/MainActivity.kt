package com.example.vaporwaveappdemo

import android.content.Context
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import com.example.vaporwaveappdemo.ui.theme.VaporwaveAppDemoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Shared preferences to keep track of listened albums
        val listened = getSharedPreferences("Listened?",Context.MODE_PRIVATE)

        setContent {
            VaporwaveAppDemoTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    // Builds the list containing every album in the database
                    val albumList = MutableList(61) { index -> Album(index+1, listened) }
                    Navigation(albumList)
                }
            }
        }
    }
}