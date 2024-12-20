package com.wsb.my2do.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.wsb.my2do.navigation.destinantions.listComposable
import com.wsb.my2do.navigation.destinantions.taskComposable
import com.wsb.my2do.util.Constants.LIST_SCREEN

@Composable
fun SetupNavigation(
    navController: NavHostController
) {
    val screen = remember(navController) {
        Screens(navController = navController)
    }

    NavHost(
        navController = navController,
        startDestination = LIST_SCREEN
    ) {
        listComposable(
            navigateToTaskScreen = screen.task
        )
        taskComposable(
            navigateToTaskScreen = screen.list
        )
    }
}