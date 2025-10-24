package com.mederico.doctoryaapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.mederico.doctoryaapp.presentation.on_boarding.OnboardingScreen
import com.mederico.doctoryaapp.presentation.sing_in.SingInScren


@Composable
fun SetupNavigation() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = OnBoarding,
    ){
        composable<OnBoarding> {
            OnboardingScreen(
                navSingIn = {
                    navController.navigate(SingIn)
                }
            )
        }
        composable<SingIn>{
            SingInScren()
        }
    }
}