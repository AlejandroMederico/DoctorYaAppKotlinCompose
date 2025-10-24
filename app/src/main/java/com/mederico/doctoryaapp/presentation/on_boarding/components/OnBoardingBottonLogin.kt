package com.mederico.doctoryaapp.presentation.on_boarding.components

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.pager.PagerState
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun OnBoardingButtonLogin(
    modifier: Modifier = Modifier,
    counterPageFished: Int,
    pagerState: PagerState,
    navSingIn: () -> Unit
    ) {
    AnimatedVisibility(
        visible = pagerState.currentPage == counterPageFished
    ) {
        OutlinedButton(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            onClick = { navSingIn() }
        ){
            Text(text = "Go to Sign In")
        }
    }
}