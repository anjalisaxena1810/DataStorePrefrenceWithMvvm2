package com.example.datastoreprefrencewithmvvm

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch


class DataStoreViewModel(private val repository : DataStoreSharedPrefRepository):ViewModel() {
//    val repository : DataStoreSharedPrefRepository = DataStoreSharedPrefRepository(context = context)

    fun saveToPref(FirstName: String, LastName: String) {
        viewModelScope.launch {
            repository.saveToPref(FirstName, LastName)
        }
    }

    fun getFirstName(): String {
        var FirstName = ""
        viewModelScope.launch {
            repository.getFirstName().collect {
                FirstName = it
            }
        }
        return FirstName
    }

    fun getLastName(): String {
        var LastName = ""
        viewModelScope.launch {
            repository.getLastName().collect {
                LastName = it
            }
        }
        return LastName
    }
}

