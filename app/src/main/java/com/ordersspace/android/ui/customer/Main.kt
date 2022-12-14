@file:OptIn(ExperimentalMaterial3Api::class)

package com.ordersspace.android.ui.customer

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.ordersspace.android.ui.BottomAppBar
import com.ordersspace.android.ui.BottomNavContent
import com.ordersspace.android.ui.navigation.Route
import com.ordersspace.android.ui.theme.OrdersSpaceTheme

@Composable
fun CustomerMain(navController: NavHostController) {
    val bottomNavController = rememberNavController()

    Scaffold(bottomBar = { BottomAppBar(Route.customerMainPages, bottomNavController) }) {
        Box(Modifier.padding(it)) {
            BottomNavContent(Route.customerMainPages, navController, bottomNavController)
        }
    }
}

@Composable
@Preview(showSystemUi = true)
fun CustomerMainPreview() = OrdersSpaceTheme { CustomerMain(rememberNavController()) }
