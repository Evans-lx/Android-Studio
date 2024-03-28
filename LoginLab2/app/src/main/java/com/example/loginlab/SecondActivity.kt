package com.example.loginlab

import android.app.DatePickerDialog
import android.os.Bundle
import android.widget.DatePicker
import android.widget.EditText
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import java.util.Calendar

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        // 获取 EditText 组件
        val birthdayEditText: EditText = findViewById(R.id.birthday)
        val backButton: ImageButton = findViewById(R.id.backButton)
            backButton.setOnClickListener{
                finish()
            }
        // 为 EditText 组件设置焦点监听器
        birthdayEditText.setOnClickListener {
            // 获取当前日期
            val calendar = Calendar.getInstance()
            val year = calendar.get(Calendar.YEAR)
            val month = calendar.get(Calendar.MONTH)
            val day = calendar.get(Calendar.DAY_OF_MONTH)

            // 创建 DatePickerDialog 对话框，并设置监听器
            val datePickerDialog = DatePickerDialog(this@SecondActivity,
                { view: DatePicker, year: Int, monthOfYear: Int, dayOfMonth: Int ->
                    // 将用户选择的日期设置到 EditText 中
                    val selectedDate = "$year-${monthOfYear + 1}-$dayOfMonth"
                    birthdayEditText.setText(selectedDate)
                }, year, month, day)

            // 显示 DatePickerDialog 对话框
            datePickerDialog.show()
        }
    }
}