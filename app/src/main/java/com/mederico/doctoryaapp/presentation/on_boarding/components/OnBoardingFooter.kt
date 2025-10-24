package com.mederico.doctoryaapp.presentation.on_boarding.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.pager.PagerState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import com.mederico.doctoryaapp.ui.theme.DisabledColor
import com.mederico.doctoryaapp.ui.theme.PrimaryColor

@Composable
fun OnBoardingFooter(
    modifier: Modifier = Modifier,
    counterPages: Int,
    pagerState: PagerState
    ) {
    repeat(counterPages){ iteration ->
        val color = if (pagerState.currentPage == iteration){
            PrimaryColor
        } else {
            DisabledColor
        }
        Box(modifier = Modifier
            .padding(8.dp)
            .clip(CircleShape)
            .background(color)
            .size(12.dp)
        ){
        }
    }
}