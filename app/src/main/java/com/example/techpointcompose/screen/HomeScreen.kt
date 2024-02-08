package com.example.techpointcompose.screen

import android.graphics.drawable.Icon
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.techpointcompose.R
import com.example.techpointcompose.data.CategoryDataProvider
import com.example.techpointcompose.items.CourseListItem
import com.example.techpointcompose.data.CourseDataProvider
import com.example.techpointcompose.items.CategoriesListItem

@Composable
fun HomeScreen() {

    val courses = remember{ CourseDataProvider.courseList }
    val categories = remember{ CategoryDataProvider.categoryList }
    Column(
        modifier = Modifier.padding(horizontal = 8.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 10.dp),
        ) {
            Text(
                text = stringResource(id = R.string.categories),
                style = MaterialTheme.typography.body1,
                modifier = Modifier.weight(1f)
            )
        }
        LazyRow{
            items(
                items = categories,
                itemContent = {
                    CategoriesListItem(category = it)
                }
            )
        }
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


}

@Preview
@Composable
fun HomeScreenPreview(){
    HomeScreen()
}