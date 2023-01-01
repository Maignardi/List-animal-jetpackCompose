package com.example.crud_jetpack_compose_hilt.navigation

import com.example.crud_jetpack_compose_hilt.core.Constants.Companion.MASCOTAS_SCREEN
import com.example.crud_jetpack_compose_hilt.core.Constants.Companion.UPDATE_MASCOTAS_SCREEN

sealed class Screen(val route: String) {
    object MascotasScreen: Screen(MASCOTAS_SCREEN)
    object UpdateMascotaScreen: Screen(UPDATE_MASCOTAS_SCREEN)
}
