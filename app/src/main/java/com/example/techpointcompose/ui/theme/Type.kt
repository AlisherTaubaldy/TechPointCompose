package com.example.techpointcompose.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.techpointcompose.R

val robotoFamily = FontFamily(
    Font(R.font.robotolight, FontWeight.Light),
    Font(R.font.robotoregular, FontWeight.Normal),
    Font(R.font.robotomedium, FontWeight.Normal, FontStyle.Italic),
    Font(R.font.robotomedium, FontWeight.Medium),
    Font(R.font.robotobold, FontWeight.Bold)
)

// Set of Material typography styles to start with
val Typography = Typography(
    body1 = TextStyle(
        fontFamily = robotoFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    ),
    button = TextStyle(
        fontFamily = robotoFamily,
        fontWeight = FontWeight.W500,
        fontSize = 14.sp
    ),
    caption = TextStyle(
        fontFamily = robotoFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp
    ),
)