package com.example.one_calc.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CalculatorButton(
    symbol: String,
    modifier: Modifier,
    color: Color = Color.White,
    textStyle: TextStyle = TextStyle(),
) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .clip(RoundedCornerShape(50.dp))
            .background(color)
            .then(modifier)
    ) {
        Text(
            text = symbol,
            style = textStyle,
            color = Color.White,
            fontSize = 36.sp
        )
    }
}

@Preview
@Composable
fun PreviewCalcButton() {
    CalculatorButton(
        symbol = "+",
        modifier = Modifier
            .width(60.dp)
            .height(60.dp),
        color = Color.Black
    )
}