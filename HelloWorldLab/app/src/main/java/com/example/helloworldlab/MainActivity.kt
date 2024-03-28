package com.example.helloworldlab

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.MaterialTheme.typography
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.helloworldlab.ui.theme.HelloWorldLabTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HelloWorldLabTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    Greeting("FIT5046")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Box(modifier = Modifier.fillMaxSize()) {
        Text(
            text = "Welcome to $name!",
            modifier = Modifier.align(Alignment.Center),
            style = typography.headlineSmall,
            color = Color.Magenta,
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    HelloWorldLabTheme {
        Greeting("FIT5046")
    }
}