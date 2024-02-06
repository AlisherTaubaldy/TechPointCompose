package com.example.techpointcompose.ui.theme

import androidx.compose.ui.graphics.Color

sealed class ThemeColors(
    val background: Color,
    val surface: Color,
    val primary: Color,
    val text: Color
) {
    object Day: ThemeColors(
        background = Color(0xFFFBFDFB),
        surface = Color(0xFF075465),
        primary = Color(0xFF012C36),
        text = Color(0xFF001216)
    )
    object Night: ThemeColors(
        background = Color(0xFF3C3C3C),
        surface = Color(0xFF021B20),
        primary = Color(0xFF010B0E),
        text = Color(0xFF6E858A)
    )
}
