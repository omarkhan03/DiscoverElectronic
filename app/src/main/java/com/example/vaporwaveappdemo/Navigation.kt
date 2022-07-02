package com.example.vaporwaveappdemo.ui.theme

import androidx.compose.runtime.Composable
import androidx.compose.ui.input.key.Key.Companion.Home
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navArgument
import androidx.navigation.compose.rememberNavController
import com.example.vaporwaveappdemo.*

@Composable
fun Navigation(albumList : List<Album>) {
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
    }
}