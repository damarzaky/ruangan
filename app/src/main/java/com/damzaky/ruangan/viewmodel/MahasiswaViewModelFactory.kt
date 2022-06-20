package com.damzaky.ruangan.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.damzaky.ruangan.model.MahasiswaRepository

/**
 * Created by Damar Zaky on 6/20/2022.
 */
class MahasiswaViewModelFactory constructor(private val repository: MahasiswaRepository) :
    ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return if (modelClass.isAssignableFrom(MahasiswaViewModel::class.java)) {
            MahasiswaViewModel(this.repository) as T
        } else {
            throw IllegalArgumentException("ViewModel Not Found")
        }
    }
}