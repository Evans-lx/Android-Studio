package com.example.loginlab

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 找到最下面的 TextView
        val signupText: TextView = findViewById(R.id.signupText)

        // 为 TextView 设置点击事件监听器
        signupText.setOnClickListener {
            // 创建 Intent 对象，指定要启动的目标 Activity
            val intent = Intent(this@MainActivity, SecondActivity::class.java)

            // 启动新的 Activity
            startActivity(intent)
        }
    }
}