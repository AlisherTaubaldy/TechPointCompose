package com.example.techpointcompose.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.techpointcompose.CourseListItem
import com.example.techpointcompose.data.CourseDataProvider

@Composable
fun HomeScreen() {
    val courses = remember{ CourseDataProvider.courseList }
    LazyColumn(
        contentPadding = PaddingValues(vertical = 8.dp, horizontal = 4.dp)
    ) {
        items(
            items = courses,
            itemContent = {
                CourseListItem(course = it)
            }

        )
    }

}