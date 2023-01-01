package com.example.crud_jetpack_compose_hilt.data.network

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.crud_jetpack_compose_hilt.domain.model.Mascota

@Database(entities = [Mascota::class], version = 1, exportSchema = false)
abstract class MascotaDB: RoomDatabase() {
    abstract fun mascotaDao(): MacotaDao
}