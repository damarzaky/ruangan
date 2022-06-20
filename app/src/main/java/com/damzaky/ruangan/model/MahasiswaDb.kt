package com.damzaky.ruangan.model

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

/**
 * Created by Damar Zaky on 6/20/2022.
 */
@Database(entities = [Mahasiswa::class], version = 1, exportSchema = false)
abstract class MahasiswaDb : RoomDatabase() {

    companion object {
        @Volatile
        private var INSTANCE: MahasiswaDb? = null

        fun getDatabase(context: Context): MahasiswaDb {
            return INSTANCE ?: synchronized(this) {
                // Create database here
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    MahasiswaDb::class.java,
                    "mahasiswa_db"
                )
                    .allowMainThreadQueries() //allows Room to executing task in main thread
                    .fallbackToDestructiveMigration() //allows Room to recreate database if no migrations found
                    .build()

                INSTANCE = instance
                instance
            }
        }
    }

    abstract fun getMahasiswaDao() : MahasiswaDao
}