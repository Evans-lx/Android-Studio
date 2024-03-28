package com.example.lazycolumnlab
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import com.example.lazycolumnlab.ui.theme.LazyColumnLabTheme


@OptIn(ExperimentalComposeUiApi::class)
@Composable
fun TopSectionEnterCountry (onAdd: (String, String) -> Unit) {
    var countryName by remember { mutableStateOf("") }
    var capitalName by remember { mutableStateOf("") }
    val keyboardController = LocalSoftwareKeyboardController.current
    Card(
        modifier = androidx.compose.ui.Modifier.fillMaxWidth()
            .padding(8.dp)
    ) {
        Column(modifier = androidx.compose.ui.Modifier.padding(16.dp)) {
            OutlinedTextField(
                value = countryName,
                onValueChange = { countryName = it },
                label = { Text("Country") },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 8.dp)
            )
            OutlinedTextField(
                value = capitalName,
                onValueChange = { capitalName = it },
                label = { Text("Capital") },
                modifier = Modifier.fillMaxWidth()
            )
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                IconButton(onClick = { onAdd(countryName, capitalName) }) {
                    Icon(
                        imageVector = Icons.Default.Add,
                        contentDescription = ""
                    )
                }
                IconButton(onClick = {
                    countryName = ""
                    capitalName = ""
                    keyboardController?.hide()
                }) {
                    Icon(
                        imageVector = Icons.Default.Clear,
                        contentDescription = ""
                    )
                }
            }
        }
    }
}
