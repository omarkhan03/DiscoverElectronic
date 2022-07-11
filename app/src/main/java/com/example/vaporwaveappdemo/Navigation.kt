package com.example.vaporwaveappdemo

import android.widget.ListView
import androidx.compose.runtime.Composable
import androidx.compose.ui.input.key.Key.Companion.Home
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navArgument
import androidx.navigation.compose.rememberNavController

/**
 * Composable to manage all the navigation in the app.
 */
@Composable
fun Navigation(albumList: MutableList<Album>) {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Screen.HomeScreen.route) {
        composable(route = Screen.HomeScreen.route) {
            HomeScreen(navController = navController)
        }
        composable(
            route = Screen.AlbumScreen.route + "/{number}",
            arguments = listOf(
                navArgument("number") {
                    type = NavType.IntType
                    defaultValue = 1
                }
            )
        ) { entry ->
            entry.arguments?.let {
                AlbumCard(
                    navController = navController,
                    number = it.getInt("number"),
                    albumList
                )
            }
        }
        composable(route = Screen.ListScreen.route) {
            ListScreen(navController = navController, albumList)
        }
    }

}

