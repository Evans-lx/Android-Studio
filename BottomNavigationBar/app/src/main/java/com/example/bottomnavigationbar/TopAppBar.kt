package com.example.bottomnavigationbar

import androidx.compose.foundation.layout.height
import androidx.compose.material.TopAppBar
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.bottomnavigationbar.ui.theme.Yellow2

@Composable
fun SimpleTopAppBar(selectedTab: BottomNavTab) {
    val title = when (selectedTab) {
        BottomNavTab.Message -> "Message"
        BottomNavTab.Home -> "Home"
        BottomNavTab.Profile -> "Profile"
    }

    TopAppBar(
        backgroundColor = Yellow2,
        contentColor = Color.White,
        title = { Text(title) },
        modifier = Modifier.height(64.dp)
    )
}
