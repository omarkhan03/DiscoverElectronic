package com.example.vaporwaveappdemo

import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember

class Album(number : Int) {

    val details = when ( number ) {
        1-> listOf("Kid A", "Radiohead", R.drawable.album1.toString())
        2-> listOf("Selected Ambient Works 85-92", "Aphex Twin", R.drawable.album2.toString())
        3-> listOf("Lift Your Skinny Fists Like Antennas to Heaven", "Godspeed you Black Emperor", R.drawable.album3.toString())

        else -> {listOf("Floral Shoppe", "Macintosh Plus", "R.drawable.album1")}
    }

    val name = details[0]
    val artist = details[1]
    val art = details[2].toInt()

    val listened = mutableStateOf(false)

}