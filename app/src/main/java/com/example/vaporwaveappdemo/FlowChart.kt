package com.example.vaporwaveappdemo

fun getConnections(number : Int) : List<Int> {
    val connections = when (number) {
        1-> listOf(2,3, 0, 0, 0, 0)
        2-> listOf(3,1, 0, 0, 0, 0)
        3-> listOf(1,2, 0, 0, 0, 0)
        else -> listOf(2,3, 0, 0, 0, 0)
    }

    return connections
}