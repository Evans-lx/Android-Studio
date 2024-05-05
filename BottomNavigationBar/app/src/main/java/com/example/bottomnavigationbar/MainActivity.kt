package com.example.bottomnavigationbar
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

class MainActivity : ComponentActivity() {
    private val viewModel: NavigationViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainScreen(viewModel)
        }
    }
}

@Composable
fun MainScreen(viewModel: NavigationViewModel) {
    val navController = rememberNavController()
    Log.d("MainScreen", "NavController initialized: $navController")
    Scaffold(
        topBar = { SimpleTopAppBar(viewModel.selectedTab) },
        bottomBar = {
            BottomNavigationBar(
                selectedTab = viewModel.selectedTab,
                navController = navController,  // 传递 NavController
                onTabSelected = viewModel::selectTab
            )
        }
    ) { paddingValues ->
        NavHost(
            navController,
            startDestination = Routes.Home.value,
            Modifier.padding(paddingValues)
        ) {
            composable(Routes.Message.value) {
                MessageScreen()
            }
            composable(Routes.Home.value) {
                HomeScreen()
            }
            composable(Routes.Profile.value) {
                ProfileScreen()
            }

        }
    }
}
