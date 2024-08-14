
package com.tamzi.colorpallete.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.tamzi.pallete.ColorPalleteTheme
import com.tamzi.pallete.atoms.color.white

@Preview(showBackground = true)
@Composable
fun ComboTwoScreen() {

    ColorPalleteTheme {
        Column(
            Modifier
                .fillMaxSize()
                .background(color = white)
                .padding(horizontal = 13.dp, vertical = 5.dp)
        ) {
         /*  BreathingSpace26()
            CPageTitle("Welcome Message")
            SeparatorSpace()
            CSubtitleRed("dcke 2022 welcome remarks as subtitle")
            SeparatorSpace()
            CParagraph("Welcome to droidconKE 2022. Lorem something something")
            BreathingSpace13()*/
        }
    }
}