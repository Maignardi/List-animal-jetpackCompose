package com.example.crud_jetpack_compose_hilt.di

import android.content.Context
import androidx.room.Room
import com.example.crud_jetpack_compose_hilt.core.Constants.Companion.MASCOTA_TABLE
import com.example.crud_jetpack_compose_hilt.data.network.MacotaDao
import com.example.crud_jetpack_compose_hilt.data.network.MascotaDB
import com.example.crud_jetpack_compose_hilt.data.repository.MacotaRepositoryImpl
import com.example.crud_jetpack_compose_hilt.domain.repository.MascotaRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
class AppModule {
    @Provides
    fun provideMascotaDb(
        @ApplicationContext
        context: Context
    ) = Room.databaseBuilder(context,
    MascotaDB::class.java,
        MASCOTA_TABLE).build()

    @Provides
    fun provideMascotaDao(
        mascotaDB: MascotaDB
    ) = mascotaDB.mascotaDao()

    @Provides
    fun provideMascotaRepository(
        mascotaDao: MacotaDao
    ): MascotaRepository = MacotaRepositoryImpl(
        mascotaDao = mascotaDao
    )

}