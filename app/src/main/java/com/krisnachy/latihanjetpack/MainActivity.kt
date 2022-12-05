package com.krisnachy.latihanjetpack

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.krisnachy.latihanjetpack.ui.theme.LatihanJetpackTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LatihanJetpackTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    //Bagian sini juga harus diganti agar build sama seperti preview
                    Column {
                        Greeting("Android")
                        MyColumn()
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    //Jika tidak memakai kolom maka akan ditumpuk seperti ini
    Text(text = "Hello $name!")
}

@Composable
fun MyColumn() {
    Column(
        modifier = Modifier
            .padding(8.dp)
            .fillMaxSize()
    ) {
        Text(text = "Left Text", Modifier.background(Color.Yellow))
        Text(
            text = "Center Text", modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .background(Color.Yellow)
        )
        Text(
            text = "Right Text", modifier = Modifier
                .align(Alignment.End)
                .background(Color.Yellow)
        )
        Text(
            text = "Lainnya",
            modifier = Modifier
                .padding(vertical = 12.dp)
                .background(color = Color.Gray)
                .padding(12.dp)
                .background(color = Color.Green)
                .fillMaxWidth(),
            textAlign = TextAlign.Center
        )
        Text(
            "Green", modifier = Modifier
                .background(Color.Green)
                .fillMaxWidth()
                .weight(1f),
            textAlign = TextAlign.Center
        )
        Text(
            "Red", modifier = Modifier
                .background(Color.Red)
                .fillMaxWidth()
                .weight(1f),
            textAlign = TextAlign.Center
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    LatihanJetpackTheme {
        Column {
            Greeting("Android")
            MyColumn()
        }
    }
}