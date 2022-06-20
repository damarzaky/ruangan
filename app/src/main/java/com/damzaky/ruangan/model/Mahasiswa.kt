package com.damzaky.ruangan.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

/**
 * Created by Damar Zaky on 6/20/2022.
 */
@Entity(tableName = "mahasiswatable")

data class Mahasiswa(
    @ColumnInfo(name = "nama") var nama: String = "",
    @ColumnInfo(name = "nim") var nim: String = ""
) : Serializable {
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0
}