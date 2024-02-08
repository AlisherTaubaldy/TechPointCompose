package com.example.techpointcompose.items

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.rememberImagePainter
import com.example.techpointcompose.data.Course
import coil.ImageLoader
import com.example.techpointcompose.StarRatingBar


@Composable
fun CourseListItem(course: Course) {

    Card(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth(),
        elevation = 4.dp,
        shape = RoundedCornerShape(8.dp)
    ) {
        Column(
            modifier = Modifier.padding(16.dp)
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = rememberImagePainter(course.imageUrl),
                    contentDescription = null, // Assuming image is purely decorative
                    modifier = Modifier
                        .size(100.dp)
                )
                Spacer(modifier = Modifier.width(16.dp))
                Column {
                    Text(course.title, style = MaterialTheme.typography.h6)
                    Spacer(modifier = Modifier.height(4.dp))
                    Row {
                        StarRatingBar(
                            maxStars = 5,
                            rating = course.rating,
                            onRatingChanged = {
                            }
                        )
                        Spacer(modifier = Modifier.width(8.dp))
                        Text(
                            text = "Price: $${course.price}",
                            style = MaterialTheme.typography.caption
                        )
                    }
                }
            }
            Spacer(modifier = Modifier.height(16.dp))
            Text(course.description, style = MaterialTheme.typography.body1)
        }
    }
}

@Composable
@Preview
fun CoursePreview() {
    CourseListItem(course = Course(
        id = 1,
        title = "Hello",
        description = "Hello from another side",
        rating = 4.56F,
        imageUrl = "https://www.google.com/url?sa=i&url=https%3A%2F%2Fraccoongang.com%2Fblog%2Fhow-structure-your-online-course%2F&psig=AOvVaw0Q88PpGfBgmRHygywGM-75&ust=1707290160434000&source=images&cd=vfe&opi=89978449&ved=0CBIQjRxqFwoTCIixis6VloQDFQAAAAAdAAAAABAE",
        price = 13.89F,
        category = "Поножи"
    )
    )
}
