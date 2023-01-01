package com.example.crud_jetpack_compose_hilt.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavGraph
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.crud_jetpack_compose_hilt.navigation.Screen.*
import com.example.crud_jetpack_compose_hilt.presentation.mascotas.MascotasScreen

@Composable
fun NavGraph(
    navController: NavHostController
) {
    NavHost(navController = navController,
        startDestination = MascotasScreen.route){
        composable(
            route = MascotasScreen.route
        ){
            MascotasScreen()
        }
    }
}