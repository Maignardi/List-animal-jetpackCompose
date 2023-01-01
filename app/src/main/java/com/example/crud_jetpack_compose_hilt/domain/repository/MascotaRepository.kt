package com.example.crud_jetpack_compose_hilt.domain.repository

import com.example.crud_jetpack_compose_hilt.domain.model.Mascota
import kotlinx.coroutines.flow.Flow

typealias Mascotas = List<Mascota>
interface MascotaRepository {
    fun getMascotasFromRoom() : Flow<Mascotas>
    fun addMascotaToRoom(mascota: Mascota)
}