package com.wsb.my2do.data.models

import androidx.compose.ui.graphics.Color
import com.wsb.my2do.ui.theme.HighPriorityColor
import com.wsb.my2do.ui.theme.LowPriorityColor
import com.wsb.my2do.ui.theme.MediumPriorityColor
import com.wsb.my2do.ui.theme.NonePriorityColor


enum class Priority(val color: Color) {
    HIGH(HighPriorityColor),
    MEDIUM(MediumPriorityColor),
    LOW(LowPriorityColor),
    NONE(NonePriorityColor)
}