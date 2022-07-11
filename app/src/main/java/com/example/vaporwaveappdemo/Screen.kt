package com.example.vaporwaveappdemo

/**
 * Helper class for Navigation.kt
 */
sealed class Screen(val route: String) {
    object HomeScreen : Screen("home_screen")
    object AlbumScreen : Screen("album_screen")
    object ListScreen : Screen("list_screen")

    fun withArgs(vararg args: Int): String {
        return buildString {
            append(route)
            args.forEach { arg ->
                append("/$arg")
            }
        }
    }
}
