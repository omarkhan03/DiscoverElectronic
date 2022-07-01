package com.example.vaporwaveappdemo

import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember

class Album(number : Int) {

    val details = when ( number ) {
        1-> listOf("Kid A", "Radiohead", R.drawable.album1.toString())
        2-> listOf("Selected Ambient Works 85-92", "Aphex Twin", R.drawable.album2.toString())
        3-> listOf("Lift Your Skinny Fists Like Antennas to Heaven", "Godspeed you Black Emperor", R.drawable.album3.toString())
        4-> listOf("Psychic", "Darkside", R.drawable.album4.toString())
        5-> listOf("Silent Shout", "The Knife", R.drawable.album5.toString())
        6-> listOf("Selected Ambient Works Volume II", "Aphex Twin", R.drawable.album6.toString())
        7-> listOf("Drukqs", "Aphex Twin", R.drawable.album7.toString())
        8-> listOf("Music Has the Right to Children", "Boards of Canada", R.drawable.album8.toString())
        9-> listOf("Geogaddi", "Boards of Canada", R.drawable.album9.toString())
        11-> listOf("Metaphorical Music", "Nujabes", R.drawable.album11.toString())
        10-> listOf("Cosmogramma", "Flying Lotus", R.drawable.album10.toString())
        12-> listOf("Midnight Menu", "TOKiMONSTA", R.drawable.album12.toString())
        13-> listOf("Modal Soul", "Nujabes", R.drawable.album13.toString())

        else -> {listOf("Floral Shoppe", "Macintosh Plus", "R.drawable.album1")}
    }

    val name = details[0]
    val artist = details[1]
    val art = details[2].toInt()

    val listened = mutableStateOf(false)

}