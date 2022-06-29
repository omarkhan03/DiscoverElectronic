package com.example.vaporwaveappdemo

class Album(number : Int) {

    val details = when ( number ) {
        1-> listOf<String>("Floral Shoppe", "Macintosh Plus", "R.drawable.album1")
        2-> listOf<String>("Floral Shoppe", "Macintosh Plus", "R.drawable.album1")
        3-> listOf<String>("Floral Shoppe", "Macintosh Plus", "R.drawable.album1")

        else -> {listOf<String>("Floral Shoppe", "Macintosh Plus", "R.drawable.album1")}
    }


}