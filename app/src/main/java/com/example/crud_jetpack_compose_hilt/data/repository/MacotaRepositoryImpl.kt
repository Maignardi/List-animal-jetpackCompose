package com.example.crud_jetpack_compose_hilt.data.repository

import com.example.crud_jetpack_compose_hilt.data.network.MacotaDao
import com.example.crud_jetpack_compose_hilt.domain.model.Mascota
import com.example.crud_jetpack_compose_hilt.domain.repository.MascotaRepository

class MacotaRepositoryImpl
    (private val mascotaDao: MacotaDao
    ): MascotaRepository {

    override fun getMascotasFromRoom() = mascotaDao.getMascotas()
    override fun addMascotaToRoom(mascota: Mascota) = mascotaDao.addMacota(mascota)
}