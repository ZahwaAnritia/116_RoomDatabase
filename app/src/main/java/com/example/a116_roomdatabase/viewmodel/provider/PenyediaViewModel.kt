package com.example.a116_roomdatabase.viewmodel.provider

import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.createSavedStateHandle
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.a116_roomdatabase.repositori.AplikasiSiswa
import com.example.a116_roomdatabase.viewmodel.EntryViewModel
import com.example.a116_roomdatabase.viewmodel.HomeViewModel

object PenyediaViewModel {
    val Factory = viewModelFactory {
        initializer {
            val application = this[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY] as AplikasiSiswa
            HomeViewModel(application.container.repositoriSiswa)
        }
        initializer {
            val application = this[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY] as AplikasiSiswa
            EntryViewModel(application.container.repositoriSiswa)
        }
    }
}