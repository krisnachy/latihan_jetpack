package com.krisnachy.latihanjetpack

import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun ColumnExample() {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        androidx.compose.material.Surface(
            modifier = Modifier
                .width(200.dp)
                .height(50.dp)
                .weight(3f),
            //Weight untuk memecah kolom 3f berarti menjadi 3 dari x
            color = MaterialTheme.colors.primary
        ) {}
        androidx.compose.material.Surface(
            modifier = Modifier
                .width(200.dp)
                .height(50.dp),
            color = MaterialTheme.colors.primary
        ) {}
        androidx.compose.material.Surface(
            modifier = Modifier
                .width(200.dp)
                .height(50.dp),
            color = MaterialTheme.colors.primary
        ) {}
        androidx.compose.material.Surface(
            modifier = Modifier
                .width(200.dp)
                .height(50.dp),
            color = MaterialTheme.colors.primary
        ) {}
    }
}

@Composable
fun ColumnScope.CustomIcon(weight: Float, color: Color) {
    androidx.compose.material.Surface(
        modifier = Modifier
            .width(200.dp)
            .weight(weight),
        //Weight untuk memecah kolom 3f berarti menjadi 3 dari x
        color = color
    ) {}
}