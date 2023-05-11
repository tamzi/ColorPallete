
package com.tamzi.colorpallete

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.tamzi.pallete.ColorPalleteTheme
import com.tamzi.pallete.atoms.color.white

@Preview(showBackground = true)
@Composable
fun ColorPalleteDemo() {
    ColorPalleteTheme {
        Column(
            Modifier
                .fillMaxSize()
                .background(color = white)
                .padding(horizontal = 13.dp, vertical = 5.dp)
        ) {
           /* BreathingSpace26()
            CPageTitle("Chai Demo")
            SeparatorSpace()
            CSubtitleRed("A catalog of the chai design system elements")
            SeparatorSpace()
            CParagraph("Check the code that is with each view")
            BreathingSpace13()*/
        }
    }
}