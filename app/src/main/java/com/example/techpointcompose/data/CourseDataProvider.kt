package com.example.techpointcompose.data

object CourseDataProvider {

    val exCoursePic = "https://independent-thinkers.co.uk/wp-content/uploads/2022/02/Free-Online-Courses-with-Certificates.jpg"

    val course = Course(
        id = 1,
        title = "",
        description = "",
        rating = 4.36F,
        imageUrl = exCoursePic,
        price = 13.99F
    )

    val courseList = listOf(course,
        Course(
            id = 2,
            title = "Hi",
            description = "Hello",
            rating = 4.00F,
            imageUrl = exCoursePic,
            price = 13.99F
        ),
        Course(
            id = 3,
            title = "Heeey",
            description = "hellooooooo",
            rating = 3.56F,
            imageUrl = exCoursePic,
            price = 13.99F
        ),
        Course(
            id = 4,
            title = "What the fuck",
            description = "is that friend?",
            rating = 5.00F,
            imageUrl = exCoursePic,
            price = 13.99F
        ),
        Course(
            id = 5,
            title = "Maybe 35 колонка",
            description = "или может забить на все",
            rating = 1.00F,
            imageUrl = exCoursePic,
            price = 13.99F
        ),
        Course(
            id = 6,
            title = "Подписка жасасай",
            description = "Сгилш э заебал",
            rating = 5.00F,
            imageUrl = exCoursePic,
            price = 13.99F
        ),

    )
}