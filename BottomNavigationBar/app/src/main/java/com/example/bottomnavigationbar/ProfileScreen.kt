package com.example.bottomnavigationbar

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ProfileScreen() {
    Column(modifier = Modifier.padding(16.dp)) {
        Text(text = "Welcome to the Profile Screen!")
    }
    // 这里放置显示个人资料页面的内容
}
