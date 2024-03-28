package com.example.lazycolumnlab

import android.graphics.Insets.add
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class CountryViewModel: ViewModel() {
    val countries: MutableState<List<Country>> =
        mutableStateOf(emptyList())
    fun addCountry(country: Country) {
        countries.value= countries.value.toMutableList().apply{add(country) }
    }
    fun deleteCountry(index: Int) {
        if (index >= 0) {
            countries.value = countries.value.toMutableList().apply{removeAt(index) }
        }
    }
}