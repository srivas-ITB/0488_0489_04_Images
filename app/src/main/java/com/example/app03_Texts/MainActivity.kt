package com.example.app03_Texts

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.app03_Texts.ui.theme.MyApp_Theme

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

        Text(
            "This is my text example",
            color = Color.Red,
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.Cursive,
            textDecoration = TextDecoration.Underline
        )

        val myStile = TextStyle(
            color = Color.Yellow,
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.Cursive
        )


        Text(
            "Texto usando el estilo predefinido",
            style = myStile
        )

        Text (
            "Texto sin ningún estilo preasignado"
        )

        Text(
            "Un nuevo texto con el estilo predefinido",
            style = myStile
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
