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
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.rememberImagePainter
import com.example.techpointcompose.data.Course
import coil.ImageLoader
import com.example.techpointcompose.StarRatingBar
import com.example.techpointcompose.data.Category


@Composable
fun CategoriesListItem(category: Category) {

    Card(
        modifier = Modifier
            .padding(8.dp)
            .width(100.dp),
        elevation = 4.dp,
        shape = RoundedCornerShape(8.dp)
    ) {
        Column(
            modifier = Modifier.padding(8.dp)
        ) {
            Image(
                painter = rememberImagePainter(category.imageUrl),
                contentDescription = null, // Assuming image is purely decorative
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(100.dp)
                    .aspectRatio(1f)
                    .clip(RoundedCornerShape(8.dp))
            )
            Text(
                category.title,
                maxLines = 2,
                style = MaterialTheme.typography.caption,
            )
        }
    }
}

@Composable
@Preview
fun CategoriesPreview() {
    CategoriesListItem(category = Category(
        id = 1,
        title = "Hello",
        imageUrl = "https://www.google.com/url?sa=i&url=https%3A%2F%2Fraccoongang.com%2Fblog%2Fhow-structure-your-online-course%2F&psig=AOvVaw0Q88PpGfBgmRHygywGM-75&ust=1707290160434000&source=images&cd=vfe&opi=89978449&ved=0CBIQjRxqFwoTCIixis6VloQDFQAAAAAdAAAAABAE",
    )
    )
}
