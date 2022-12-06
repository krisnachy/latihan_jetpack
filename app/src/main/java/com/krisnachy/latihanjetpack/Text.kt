package com.krisnachy.latihanjetpack

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TextCustomization() {
    Column {
        Text(
            text = "Hello World",
            modifier = Modifier
                //Jika backgroun diletakkan setelah padding, maka akan menjadikan padding tidak mempunyai warna,
                //jika padding juga ingin mempunyai warna diletakkan sebelum .padding
                .background(MaterialTheme.colors.primary)
                .padding(16.dp)
        )
        //Cara import text dari resource
        Text(
            text = stringResource(id = R.string.app_name),
            modifier = Modifier
                .background(MaterialTheme.colors.primary)
                .padding(16.dp)
                .width(200.dp),
            color = Color.White,
            fontSize = MaterialTheme.typography.h6.fontSize,
            fontStyle = FontStyle.Italic,
            fontWeight = FontWeight.ExtraBold,
            textAlign = TextAlign.End
        )
    }
}

@Composable
fun MakeColorful() {
    Text(
        buildAnnotatedString {
            withStyle(
                style = SpanStyle(
                    color = MaterialTheme.colors.primary,
                    fontSize = 30.sp,
                    fontWeight = FontWeight.Bold
                )
            ) {
                append('A')
            }
            append('B')
            append('C')
            append('D')
        }
    )
}

@Composable
fun LotOfText() {
    Text(
        text = "Hello World".repeat(20),
        maxLines = 2,
        overflow = TextOverflow.Clip
    )
}