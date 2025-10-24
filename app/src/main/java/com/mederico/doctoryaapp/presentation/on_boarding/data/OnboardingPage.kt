package com.mederico.doctoryaapp.presentation.on_boarding.data

import androidx.annotation.DrawableRes
import com.mederico.doctoryaapp.R

data class OnboardingPage(
    @DrawableRes val image: Int,
    val title: String,
    val description: String
)

fun getDataOnBoardingPage(): List<OnboardingPage> {
    return listOf(
        OnboardingPage(
            image = R.drawable.onboarding1,
            title = "Find Your Doctor",
            description = "Easily search and book appointments with top-rated doctors in your area."
        ),
        OnboardingPage(
            image = R.drawable.onboarding2,
            title = "24/7 Access",
            description = "Get medical advice and consultations anytime, anywhere."
        ),
        OnboardingPage(
            image = R.drawable.onboarding3,
            title = "Health Records",
            description = "Securely store and manage your health records in one place."
        )
    )
}
