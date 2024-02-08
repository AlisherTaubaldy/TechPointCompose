package com.example.techpointcompose.data

object CategoryDataProvider {

    val exCoursePic = "https://independent-thinkers.co.uk/wp-content/uploads/2022/02/Free-Online-Courses-with-Certificates.jpg"

    val category = Category(
        id = 1,
        title = "Школьные предметы",
        imageUrl = exCoursePic,
    )

    val categoryList = listOf(
        category,
        Category(
            id = 2,
            title = "Hi",
            imageUrl = exCoursePic,
        ),
        Category(
            id = 3,
            title = "Heeey",
            imageUrl = exCoursePic,
        ),
        Category(
            id = 4,
            title = "What the fuck",
            imageUrl = exCoursePic,
        ),
        Category(
            id = 5,
            title = "Maybe 35 колонка",
            imageUrl = exCoursePic,
        ),
        Category(
            id = 6,
            title = "Подписка жасасай",
            imageUrl = exCoursePic,
        ),

        )
}