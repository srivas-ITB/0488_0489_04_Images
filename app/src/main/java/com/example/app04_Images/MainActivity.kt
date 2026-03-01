package com.example.app04_Images

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.app04_Images.ui.theme.MyApp_Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApp_Theme() {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    MyLayout(
                        modifier = Modifier.padding( innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun MyLayout(modifier: Modifier = Modifier){

    Column(modifier = Modifier) {

        //Dejo un espacio para alejar del borde superior
        Spacer(modifier = Modifier.height(50.dp))

        val myStyle = TextStyle(
            color = Color.White,
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.Serif,
            textDecoration = TextDecoration.Underline,
            letterSpacing = 2.sp
        )

        Text(
            "Proves amb el component Image",
            style = myStyle
        )

        Image(
            painter = painterResource(id = R.drawable.ic_launcher_foreground),
            contentDescription = "Example",
            alpha = 0.5f
        )

    }



}

@Composable
fun Column(content: @Composable () -> Unit) {
    TODO("Not yet implemented")
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview2() {
    MyApp_Theme() {
        MyLayout()
    }
}
