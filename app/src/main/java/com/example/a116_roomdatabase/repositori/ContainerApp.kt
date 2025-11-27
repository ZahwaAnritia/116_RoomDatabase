package com.example.a116_roomdatabase.repositori

import android.app.Application
import android.content.Context
import com.example.a116_roomdatabase.room.DatabaseSiswa

interface ContainerApp {
    val repositoriSiswa: RepositoriSiswa
}

class ContainerDataApp(private val context: Context) : ContainerApp {

    override val repositoriSiswa: RepositoriSiswa by lazy {
        OfflineRepositoriSiswa(
            siswaDao = DatabaseSiswa.generate(context).siswaDao()
        )
    }
}

