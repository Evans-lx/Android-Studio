package com.example.bottomnavigationbar

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue

class NavigationViewModel : ViewModel() {
    var selectedTab by mutableStateOf(BottomNavTab.Home)
        private set

    fun selectTab(tab: BottomNavTab) {
        selectedTab = tab
    }
}
