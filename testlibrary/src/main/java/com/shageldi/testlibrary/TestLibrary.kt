package com.shageldi.testlibrary

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun TestLibrary() {
    
    Box(modifier = Modifier
        .background(Color.Red)
        .size(40.dp)) {
        Text(text = "Hello")
    }
    
}