package com.example.crud_jetpack_compose_hilt.presentation.mascotas

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.crud_jetpack_compose_hilt.domain.model.Mascota
import com.example.crud_jetpack_compose_hilt.domain.repository.MascotaRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MascotasViewModel @Inject constructor(
    private val repo: MascotaRepository
): ViewModel() {
    var openDialog by mutableStateOf(false)
    val mascotas = repo.getMascotasFromRoom()
    fun addMascota(mascota: Mascota) = viewModelScope.launch(Dispatchers.IO){
        repo.addMascotaToRoom(mascota)
    }
    fun closeDialog() {
        openDialog = false
    }
    fun openDialog() {
        openDialog = true
    }
}