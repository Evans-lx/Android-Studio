package com.example.lazycolumnlab
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.unit.dp

@Composable
fun ListCountry(country: Country, onDelete: () -> Unit) {
    Row(
        modifier = androidx.compose.ui.Modifier
            .fillMaxWidth()
            .padding(8.dp)
            .clickable { onDelete() },
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column {
            Text(text = "Country: ${country.name}")
            Text(text = "Capital: ${country.capital}")
        }
        Column(
            modifier = androidx.compose.ui.Modifier
                .fillMaxWidth(),
            horizontalAlignment = Alignment.End,
            verticalArrangement = Arrangement.SpaceBetween,
        ) {
            Icon(imageVector = Icons.Default.Delete, contentDescription = null)
        }
    }
}
