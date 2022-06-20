package com.damzaky.ruangan.model

/**
 * Created by Damar Zaky on 6/20/2022.
 */
class MahasiswaRepository constructor(private val mahasiswaDao: MahasiswaDao) {
    fun add(mahasiswa: Mahasiswa) {
        mahasiswaDao.insert(mahasiswa)
    }

    fun delete(mahasiswa: Mahasiswa) {
        mahasiswaDao.delete(mahasiswa)
    }

    fun get() = mahasiswaDao.getAll()
}