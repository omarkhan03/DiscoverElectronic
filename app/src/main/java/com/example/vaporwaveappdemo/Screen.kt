package com.example.vaporwaveappdemo

sealed class Screen(val route: String) {
    object HomeScreen : Screen("home_screen")
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
