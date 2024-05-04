package com.example.bottomnavigationbar


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.res.painterResource
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.Divider


data class Message(
    val id: String,
    val avatar: Int, // 这里可以是 URL 或资源 ID
    val previewText: String
)

fun sampleMessages() = listOf(
    Message("User123", R.drawable.a1, "Hey, how are you doing?"),
    Message("User456", R.drawable.a2, "Let's meet tomorrow!"),
    Message("User789", R.drawable.a3, "I will send you the details later."),
    // 添加更多消息以填充列表
)


@Composable
fun MessageScreen(messages: List<Message> = sampleMessages()) {
    LazyColumn(modifier = Modifier.padding(8.dp)) {
        itemsIndexed(messages) { index, message ->
            MessageItem(message)
            if (index < messages.size - 1) {  // 确保最后一个项目后不添加分割线
                Divider(color = Color.Gray, thickness = 1.dp)
            }
        }
    }
}

@Composable
fun MessageItem(message: Message) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(id = message.avatar),
            contentDescription = "Avatar",
            modifier = Modifier
                .size(50.dp)
                .clip(RoundedCornerShape(8.dp))
                .border(2.dp, Color.Transparent, RoundedCornerShape(8.dp))
        )
        Column(
            modifier = Modifier
                .padding(horizontal = 8.dp)
                .weight(1f)
        ) {
            Text(text = message.id, fontWeight = FontWeight.Bold)
            Text(text = message.previewText, style = MaterialTheme.typography.body2)
        }
    }
}


