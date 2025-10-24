package com.mederico.doctoryaapp.presentation.on_boarding


import androidx.compose.animation.Animatable
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mederico.doctoryaapp.presentation.on_boarding.components.OnBoardingButtonLogin
import com.mederico.doctoryaapp.presentation.on_boarding.components.OnBoardingFooter
import com.mederico.doctoryaapp.presentation.on_boarding.components.OnboardingContent
import com.mederico.doctoryaapp.presentation.on_boarding.data.getDataOnBoardingPage


@Composable
fun OnboardingScreen(navSingIn:() -> Unit) {
    val onBoardingList = getDataOnBoardingPage()
    val pagerState = rememberPagerState{onBoardingList.size}
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        HorizontalPager(
            state = pagerState,
            modifier = Modifier
                .fillMaxSize()
                .weight(10f)
        ) { page ->
            OnboardingContent(onBoardingPage = onBoardingList[page])
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1.5f),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ){
            OnBoardingButtonLogin(
                counterPageFished = onBoardingList.size-1,
                pagerState = pagerState,
                navSingIn = navSingIn
            )
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1.5f),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            OnBoardingFooter(
                counterPages = onBoardingList.size,
                pagerState = pagerState
            )
        }
    }
}
@Preview(
    showSystemUi = true,
    device = Devices.PIXEL_5
)
@Composable
fun OnboardingScreenPreview(modifier: Modifier = Modifier) {
    OnboardingScreen({} )
}

