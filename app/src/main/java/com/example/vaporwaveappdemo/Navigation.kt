package com.example.vaporwaveappdemo.ui.theme

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navArgument
import androidx.navigation.compose.rememberNavController
import com.example.vaporwaveappdemo.AlbumCard
import com.example.vaporwaveappdemo.Screen

@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screen.AlbumScreen.route) {
        composable(route = Screen.AlbumScreen.route) {
            AlbumCard(navController = navController, 1)
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
                    number = it.getInt("number")
                )
            }
        }
    }
}