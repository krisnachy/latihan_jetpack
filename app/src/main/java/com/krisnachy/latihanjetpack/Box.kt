package com.krisnachy.latihanjetpack

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

//Box digunakan seperti Stack pada Flutter
@Composable
fun MyBox() {
    Box(Modifier.fillMaxSize()) {
        Box(
            Modifier
                .fillMaxSize()
                .background(Color.LightGray)
        )
        Box(
            Modifier
                .height(70.dp)
                .width(70.dp)
                .background(Color.Red)
        )
        Box(
            Modifier
                .align(Alignment.TopCenter)
                .height(70.dp)
                .width(70.dp)
                .background(Color.Green)
        )
        Box(
            Modifier
                .align(Alignment.BottomEnd)
                .height(70.dp)
                .width(70.dp)
                .background(Color.Green)
        )
        Box(
            Modifier
                .align(Alignment.TopCenter)
                .fillMaxHeight()
                .width(50.dp)
                .background(Color.Blue)
        )
        Box(
            Modifier
                .align(Alignment.Center)
                .height(70.dp)
                .width(70.dp)
                .background(Color.White)
        )
        Text("This text is drawn last", modifier = Modifier.align(Alignment.Center))
    }
}