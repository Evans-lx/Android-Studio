package com.example.layoutlab

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.layoutlab.ui.theme.LayoutLabTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApp(modifier = Modifier.fillMaxSize())
        }
    }
}


@Composable
fun Seasons(name: String, modifier: Modifier = Modifier) {
    val context =LocalContext.current
    var result by remember { mutableStateOf(name) }
    Surface(
        color = MaterialTheme.colorScheme.primary,
        modifier = modifier.padding(vertical = 4.dp, horizontal = 8.dp)
    ) {
        Row(modifier = Modifier.padding(24.dp)) {
            Column(modifier = Modifier.weight(1f)) {
                Text(text = "Season: ")
                Text(text = name)
            }
            Column() {
                ElevatedButton(
                    onClick = {
                        Toast.makeText(
                            context,
                            "Season selected is: $result",
                            Toast.LENGTH_SHORT)
                            .show()
                    }
                ) {
                    Text(text = "Show Season")
                }
            }
        }
    }
}



@Preview(showBackground = true)
@Composable
fun MyApp(
    modifier: Modifier = Modifier,
    names: List<String> = listOf("Spring", "Summer", "Autumn"
        ,"Winter")
) {
    Column(modifier) {
        for (name in names) {
            Seasons(name = name)
        }
    }
}
