package com.damzaky.ruangan.model

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

/**
 * Created by Damar Zaky on 6/20/2022.
 */
@Dao
interface MahasiswaDao {

    @Insert
    fun insert(mahasiswa: Mahasiswa)

    @Delete
    fun delete(mahasiswa: Mahasiswa)

    @Query("SELECT * FROM mahasiswatable")
    fun getAll() : LiveData<List<Mahasiswa>>

}