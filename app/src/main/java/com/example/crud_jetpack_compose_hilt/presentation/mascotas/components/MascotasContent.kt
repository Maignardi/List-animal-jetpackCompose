package com.example.crud_jetpack_compose_hilt.presentation.mascotas.components

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import com.example.crud_jetpack_compose_hilt.domain.repository.Mascotas

@Composable
fun MascotasContent(
    padding: PaddingValues,
    mascotas: Mascotas
){
    LazyColumn(
        modifier = androidx.compose.ui.Modifier
            .fillMaxSize()
            .padding(padding)
    ){
        items(mascotas){
            mascota->
            MascotaCard(
                mascota = mascota
            )
        }
    }
}