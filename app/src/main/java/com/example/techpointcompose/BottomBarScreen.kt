package com.example.techpointcompose

import androidx.compose.ui.res.stringResource


sealed class BottomBarScreen(
    val route: String,
    val title: String,
    val icon: Int,
    val icon_focused: Int
) {

    // for home
    object Home: BottomBarScreen(
        route = "home",
        title = "Home",
        icon = R.drawable.round_home_24,
        icon_focused = R.drawable.outline_home_24
    )

    // for library
    object Library: BottomBarScreen(
        route = "library",
        title = "Library",
        icon = R.drawable.round_home_24,
        icon_focused = R.drawable.outline_home_24
    )

    // for notification
    object Notification: BottomBarScreen(
        route = "notification",
        title = "Notification",
        icon = R.drawable.round_home_24,
        icon_focused = R.drawable.outline_home_24

    )

    // for classroom
    object Classroom: BottomBarScreen(
        route = "classroom",
        title = "Classroom",
        icon = R.drawable.round_home_24,
        icon_focused = R.drawable.outline_home_24
    )

    // for profile
    object Profile: BottomBarScreen(
        route = "profile",
        title = "Profile",
        icon = R.drawable.round_home_24,
        icon_focused = R.drawable.outline_home_24
    )

}
