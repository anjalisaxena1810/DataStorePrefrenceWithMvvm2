package com.example.datastoreprefrencewithmvvm

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.stringPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import kotlinx.coroutines.flow.map


class DataStoreSharedPrefRepository(private val context: Context) {
    val Context.datastore : DataStore<Preferences> by preferencesDataStore("Prefr")

    companion object{
        val FirstName = stringPreferencesKey("Fname")
        val LastName =  stringPreferencesKey("Lname")


    }
    suspend fun saveToPref(FirstName:String, LastName:String){
        context.datastore.edit {
            it[stringPreferencesKey("Fname")] = FirstName
            it[stringPreferencesKey("Lname")] = LastName
        }


}
    fun getFirstName()=
        context.datastore.data.map {
            it[stringPreferencesKey("Fname")]?: "Unknown".toString()
        }

    fun getLastName()=
               context.datastore.data.map {
                it[stringPreferencesKey("Lname")] ?:"Unknown".toString()
            }
        }








