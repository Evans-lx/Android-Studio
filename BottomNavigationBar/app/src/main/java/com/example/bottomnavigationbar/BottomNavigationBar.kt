package com.example.bottomnavigationbar

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Send
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.material3.Icon
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.bottomnavigationbar.ui.theme.Yellow1
import com.example.bottomnavigationbar.ui.theme.Yellow2

@Composable
fun BottomNavigationBar(
    selectedTab: BottomNavTab,
    navController: NavController, // 添加 NavController 参数
    onTabSelected: (BottomNavTab) -> Unit
) {
    BottomAppBar(
        backgroundColor = Color.White,
        contentColor = Yellow1 // 确保你有定义 Yellow1 这个颜色
    ) {
        Row(
            modifier = Modifier
                .height(56.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ) {
            BottomNavIcon(
                icon = Icons.Filled.Send,
                selected = selectedTab == BottomNavTab.Message,
                text = "Message"
            ) {
                onTabSelected(BottomNavTab.Message)
                navController.navigate("message") // 这里的 "message" 应与你的 NavHost 中定义的路由对应
            }
            BottomNavIcon(
                icon = Icons.Filled.LocationOn,
                selected = selectedTab == BottomNavTab.Home,
                text = "Home"
            ) {
                onTabSelected(BottomNavTab.Home)
                navController.navigate("home") // 这里的 "home" 应与你的 NavHost 中定义的路由对应
            }
            BottomNavIcon(
                icon = Icons.Filled.AccountCircle,
                selected = selectedTab == BottomNavTab.Profile,
                text = "Profile"
            ) {
                onTabSelected(BottomNavTab.Profile)
                navController.navigate("profile") // 这里的 "profile" 应与你的 NavHost 中定义的路由对应
            }
        }
    }
}



        @Composable
        fun BottomNavIcon(icon: ImageVector, selected: Boolean, text: String, onClick: () -> Unit) {
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier.clickable { onClick() }
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Icon(
                        imageVector = icon,
                        contentDescription = null,
                        tint = if (selected) Yellow1 else Color.DarkGray,
                        modifier = Modifier.size(34.dp) // 调整图标大小
                    )
                    Text(
                        text = text,
                        style = MaterialTheme.typography.caption,
                        color = if (selected) Yellow1 else Color.DarkGray
                    )
                }
            }
        }


                enum class BottomNavTab { Message, Home, Profile }

//        @Preview
//        @Composable
//        fun PreviewBottomNavigationBar() {
//            BottomNavigationBar(selectedTab = BottomNavTab.Home, onTabSelected = {})
//        }
