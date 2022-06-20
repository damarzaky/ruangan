package com.damzaky.ruangan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.damzaky.ruangan.model.Mahasiswa
import com.damzaky.ruangan.model.MahasiswaDb
import com.damzaky.ruangan.model.MahasiswaRepository
import com.damzaky.ruangan.viewmodel.MahasiswaViewModel
import com.damzaky.ruangan.viewmodel.MahasiswaViewModelFactory

class `MainActivity` : AppCompatActivity() {
    lateinit var viewModel: MahasiswaViewModel
    private lateinit var dbService: MahasiswaDb

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        dbService = MahasiswaDb.getDatabase(applicationContext)

        viewModel = ViewModelProvider(this, MahasiswaViewModelFactory(MahasiswaRepository(
                dbService.getMahasiswaDao()))).get(MahasiswaViewModel::class.java)

        viewModel.mahasiswaList.observe(this, Observer {
            Log.d("HASIL", it.toString())
        })

        viewModel.insert(Mahasiswa(nama = "Damjek", nim = "132356236236"))
    }
}