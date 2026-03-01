package com.example.app04_Images

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SegmentedButtonDefaults.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
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

    Column(modifier.verticalScroll(rememberScrollState())) {

        //Dejo un espacio para alejar del borde superior
        Spacer(modifier = Modifier.height(50.dp))

        val styleTitle = TextStyle(
            color = Color.White,
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.Serif,
            textDecoration = TextDecoration.Underline,
            letterSpacing = 2.sp
        )

        val styleText = TextStyle(
            color = Color.Green,
            fontSize = 20.sp
        )


        Text("Component Image", style = styleTitle )

        Text("Mostrar una imatge", style = styleText)
        Image(
            painter = painterResource(id = R.drawable.ic_launcher_foreground),
            contentDescription = "Example",
            alpha = 0.5f
        )

        Text("Imatge dins un quadrat arrodonit", style = styleText)
        Row() {
            // Fer que l'imatge s'adapti a una forma
            Column() {
                Text("size 25f ", style = styleText)
                Image(
                    painter = painterResource(id = R.drawable.ic_launcher_background),
                    contentDescription = "Example",
                    modifier = Modifier.clip(RoundedCornerShape(25f))
                )
            }
            Spacer(modifier = Modifier.width(10.dp))
            Column() {
                Text("size 50f ", style = styleText)
                Image(
                    painter = painterResource(id = R.drawable.ic_launcher_background),
                    contentDescription = "Example",
                    modifier = Modifier.clip(RoundedCornerShape(50f))
                )
            }
            Spacer(modifier = Modifier.width(10.dp))
            Column() {
                Text("size 100f ", style = styleText)
                Image(
                    painter = painterResource(id = R.drawable.ic_launcher_background),
                    contentDescription = "Example",
                    modifier = Modifier.clip(RoundedCornerShape(100f))
                )
            }
        }

        Text("Imatge completament arrodonida ", style = styleText)
        Image(
            painter = painterResource(id = R.drawable.ic_launcher_background),
            contentDescription = "Example",
            modifier = Modifier.clip(CircleShape)
        )
        Text("Afegim una vora a la imatge (abans de retallar)", style = styleText)
        Image(
            painter = painterResource(id = R.drawable.ic_launcher_background),
            contentDescription = "Example",
            modifier = Modifier.clip(CircleShape).border(4.dp, Color.Red)
        )
        Text("Afegim una vora a la imatge (un cop retallada)", style = styleText)
        Image(
            painter = painterResource(id = R.drawable.ic_launcher_background),
            contentDescription = "Example",
            modifier = Modifier.clip(CircleShape).border(4.dp, Color.Red, CircleShape)
        )

        Text("Proves amb ContentScale (crop)", style = styleText)
        Image(
            painter = painterResource(id = R.drawable.ic_launcher_background),
            contentDescription = "Example",
            modifier = Modifier.clip(CircleShape)
                .border(4.dp, Color.Red, CircleShape)
                .width(50.dp)
                .height(200.dp),
            contentScale = androidx.compose.ui.layout.ContentScale.Crop
        )

        Text("Proves amb ContentScale (FillHeight)", style = styleText)
        Image(
            painter = painterResource(id = R.drawable.ic_launcher_background),
            contentDescription = "Example",
            modifier = Modifier.clip(CircleShape)
                .border(4.dp, Color.Red, CircleShape)
                .width(50.dp)
                .height(200.dp),
            contentScale = androidx.compose.ui.layout.ContentScale.FillHeight
        )

        Text("Proves amb ContentScale (FillBounds)", style = styleText)
        Image(
            painter = painterResource(id = R.drawable.ic_launcher_background),
            contentDescription = "Example",
            modifier = Modifier.clip(CircleShape)
                .border(4.dp, Color.Red, CircleShape)
                .width(50.dp)
                .height(200.dp),
            contentScale = androidx.compose.ui.layout.ContentScale.FillBounds
        )

        Text("Proves amb ContentScale (Inside)", style = styleText)
        Image(
            painter = painterResource(id = R.drawable.ic_launcher_background),
            contentDescription = "Example",
            modifier = Modifier.clip(CircleShape)
                .border(4.dp, Color.Red, CircleShape)
                .width(50.dp)
                .height(200.dp),
            contentScale = androidx.compose.ui.layout.ContentScale.Inside
        )

        Text("Proves amb ContentScale (None)", style = styleText)
        Image(
            painter = painterResource(id = R.drawable.ic_launcher_background),
            contentDescription = "Example",
            modifier = Modifier.clip(CircleShape)
                .border(4.dp, Color.Red, CircleShape)
                .width(50.dp)
                .height(200.dp),
            contentScale = androidx.compose.ui.layout.ContentScale.None
        )

        //Dejo un espacio para separar imagenes de iconos
        Spacer(modifier = Modifier.height(50.dp))

        Text("Component Icon", style = styleTitle )

        Text("Mostrar icona", style = styleText)
        Icon(imageVector = Icons.Default.Star,
            contentDescription = "Icon Example" )

        Text("Mostrar icona (amb tint groc)", style = styleText)
        Icon(imageVector = Icons.Default.Star,
            contentDescription = "Icon Example",
            tint = Color.Yellow)

        Text("Mostrar icona (amb tint blau)", style = styleText)
        Icon(imageVector = Icons.Default.Star,
            contentDescription = "Icon Example",
            tint = Color.Blue)


        // Icones que ofereix Google: https://fonts.google.com/icons

        Text("Mostrar una altra icona (shopping cart)", style = styleText)
        Icon(imageVector = Icons.Default.ShoppingCart,
            contentDescription = "Shopping cart",
            tint = Color.LightGray)


    }

}



@Preview(showBackground = true)
@Composable
fun GreetingPreview2() {
    MyApp_Theme() {
        MyLayout()
    }
}
