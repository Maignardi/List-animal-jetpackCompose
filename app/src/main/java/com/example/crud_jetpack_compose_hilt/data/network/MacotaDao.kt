package com.example.crud_jetpack_compose_hilt.data.network

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy.Companion.IGNORE
import androidx.room.Query
import com.example.crud_jetpack_compose_hilt.core.Constants.Companion.MASCOTA_TABLE
import com.example.crud_jetpack_compose_hilt.domain.model.Mascota
import com.example.crud_jetpack_compose_hilt.domain.repository.Mascotas
import kotlinx.coroutines.flow.Flow

@Dao
interface MacotaDao {

    @Query("SELECT * FROM $MASCOTA_TABLE ORDER BY id ASC")
    fun  getMascotas(): Flow<Mascotas>

    @Insert(onConflict = IGNORE)
    fun addMacota(mascota: Mascota)
}