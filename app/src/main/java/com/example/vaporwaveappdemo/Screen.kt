package com.example.vaporwaveappdemo

sealed class Screen(val route: String) {
    object AlbumScreen : Screen("album_screen")

    fun withArgs(vararg args: Int): String {
        return buildString {
            append(route)
            args.forEach { arg ->
                append("/$arg")
            }
        }
    }
}
