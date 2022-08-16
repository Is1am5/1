package com.example.architacturepatternmvp.view

import androidx.annotation.ColorInt

interface CounterView {
    fun updateText(count: Int)
    fun showToast()
    fun changeTextColor(@ColorInt color: Int)
}