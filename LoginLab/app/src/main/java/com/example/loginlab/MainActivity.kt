package com.example.loginlab

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
<<<<<<< HEAD
<<<<<<< HEAD
=======
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
>>>>>>> newbranch
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material.TextFieldDefaults
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.loginlab.ui.theme.LoginLabTheme
import com.example.loginlab.ui.theme.LoginScreen
<<<<<<< HEAD
=======
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material.TextFieldDefaults
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.loginlab.ui.theme.LoginLabTheme
import com.example.loginlab.ui.theme.LoginScreen
import com.example.loginlab.ui.theme.Yellow1
import com.example.loginlab.ui.theme.Yellow2
import com.example.loginlab.ui.theme.Yellow3
>>>>>>> 9c58dafaf355358d9db00bc0405ea04542b354e2
=======
import com.example.loginlab.ui.theme.Yellow1
import com.example.loginlab.ui.theme.Yellow2
import com.example.loginlab.ui.theme.Yellow3
>>>>>>> newbranch

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
<<<<<<< HEAD
<<<<<<< HEAD
            LoginScreen()
=======
            MaterialTheme {
                AppNavigator()
            }
>>>>>>> 9c58dafaf355358d9db00bc0405ea04542b354e2
=======
            MaterialTheme {
                AppNavigator()
            }
>>>>>>> newbranch
        }
    }
}

<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
>>>>>>> newbranch
@Composable
fun LoginScreen(onNavigateToSignUp: () -> Unit) {
    val username = remember { mutableStateOf("") }
    val password = remember { mutableStateOf("") }
    val annotatedText = buildAnnotatedString {
        withStyle(style = SpanStyle(color = Yellow1)) {
            append("Not registered yet? Sign Up Now")
        }
    }
    Box(
        modifier = Modifier
            .fillMaxSize(),
//            .padding(horizontal = 30.dp, vertical = 50.dp), // Adjust padding as needed
        contentAlignment = Alignment.BottomCenter
    ) {
        Image(
            painter = painterResource(id = R.drawable.cat), // Ensure to replace `bg_image` with your actual image file name
            contentDescription = "Background Image",
            modifier = Modifier.matchParentSize(),
            contentScale = ContentScale.Crop // This scales the image to fill the size of the container
        )
        Card(
            colors = CardDefaults.cardColors(
                containerColor = Color.White, //改变卡片的背景颜色
            ),
            elevation = CardDefaults.cardElevation(defaultElevation = 5.dp) ,
            shape = RoundedCornerShape(30.dp),
            modifier = Modifier
                .padding(30.dp)
//                .fillMaxWidth()
                .height(380.dp)
                .width(340.dp)
//                .background(color = Color.Blue)
        ) {
            Column(
                modifier = Modifier
                    .padding(24.dp)
                    .fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text("Login", fontSize = 36.sp, color = Yellow1, fontWeight = FontWeight.Bold)
                Spacer(modifier = Modifier.height(16.dp))
                OutlinedTextField(
                    value = username.value,
                    onValueChange = { username.value = it },
                    label = { Text("Username", fontSize = 20.sp, color = Color.Gray) },
                    leadingIcon = { Icon(Icons.Filled.Person, contentDescription = null, modifier = Modifier.size(30.dp), tint = Yellow2 ) },
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(20.dp),
                    colors = OutlinedTextFieldDefaults.colors(
                        unfocusedBorderColor = Yellow1,
                        focusedBorderColor = Yellow2,
                    ),
                )
                Spacer(modifier = Modifier.height(10.dp))
                OutlinedTextField(
                    value = password.value,
                    onValueChange = { password.value = it },
                    label = { Text("Password", fontSize = 20.sp, color = Color.Gray) },
                    leadingIcon = { Icon(Icons.Filled.Lock, contentDescription = null, modifier = Modifier.size(30.dp), tint = Yellow2 )  },
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(20.dp),
                    colors = OutlinedTextFieldDefaults.colors(
                        unfocusedBorderColor = Yellow1,
                        focusedBorderColor = Yellow2,
                    ),
                )
                Button(
                    onClick = { /* Handle login here */ },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(80.dp)
                        .padding(top = 30.dp),
                    shape = RoundedCornerShape(20.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Yellow1,  // Normal state color
                    contentColor = Color.White  // Text and icon color
                )
                ) {
                    Text("Login", fontSize = 18.sp)
                }
                Spacer(modifier = Modifier.height(16.dp))  // Adjust the height to increase or decrease the space
                ClickableText(
                    text = annotatedText,
                    onClick = { onNavigateToSignUp() },
                    style = TextStyle(color = Color.Black, fontSize = 14.sp)
                )
            }
        }
    }
}

@Composable
fun AppNavigator() {
    val navController = rememberNavController()
    NavHost(navController, startDestination = "login") {
        composable("login") { LoginScreen { navController.navigate("signup") } }
        composable("signup") { SignUpScreen() }
    }
}
<<<<<<< HEAD
>>>>>>> 9c58dafaf355358d9db00bc0405ea04542b354e2
=======
>>>>>>> newbranch
