package com.example.datastoreprefrencewithmvvm

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class DataStoreFactory(private val repository: DataStoreSharedPrefRepository): ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(DataStoreViewModel::class.java)){
            return DataStoreViewModel(repository) as T
        }
        throw IllegalArgumentException("Unknown Error")
    }
}