package com.damzaky.ruangan.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.damzaky.ruangan.model.Mahasiswa
import com.damzaky.ruangan.model.MahasiswaRepository

/**
 * Created by Damar Zaky on 6/20/2022.
 */
class MahasiswaViewModel constructor(private val repository: MahasiswaRepository): ViewModel() {
    var mahasiswaList: LiveData<List<Mahasiswa>>

    init {
        mahasiswaList = repository.get()
    }

    fun getAllUsers() {
        val response : LiveData<List<Mahasiswa>>
        response = repository.get()

        mahasiswaList = response
    }

    fun insert(mahasiswa: Mahasiswa) {
        repository.add(mahasiswa)
    }

    fun delete(mahasiswa: Mahasiswa) {
        repository.delete(mahasiswa)
    }
}