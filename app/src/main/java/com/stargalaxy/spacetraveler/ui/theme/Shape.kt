package com.stargalaxy.spacetraveler.ui.theme

import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.unit.dp

data class JetSpaceTraveler (
    val small:CornerBasedShape,
    val medium:CornerBasedShape,
    val large:CornerBasedShape,
    val dialog: CornerBasedShape
)

val Shapes = JetSpaceTraveler(
    small = RoundedCornerShape(8.dp),
    medium = RoundedCornerShape(16.dp),
    large = RoundedCornerShape(64.dp) ,
    dialog = RoundedCornerShape(24.dp)
)