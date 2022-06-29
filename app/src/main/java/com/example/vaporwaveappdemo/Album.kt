package com.example.vaporwaveappdemo

class Album(number : Int) {

    val details = when ( number ) {
        1-> listOf("Floral Shoppe", "Macintosh Plus", R.drawable.album1.toString())
        2-> listOf("I'll Try Living Like This", "death's dynamic shroud", R.drawable.album2.toString())
        3-> listOf("Faith in Persona", "death's dynamic shroud", R.drawable.album3.toString())

        else -> {listOf("Floral Shoppe", "Macintosh Plus", "R.drawable.album1")}
    }

    val name = details[0]
    val artist = details[1]
    val art = details[2].toInt()
}