package com.example.architacturepatternmvp.presenter

import android.graphics.Color
import com.example.architacturepatternmvp.helper.Injector
import com.example.architacturepatternmvp.model.CounterModel
import com.example.architacturepatternmvp.view.CounterView

class Presenter {
    private val model = Injector.getModel()
    lateinit var view: CounterView

    fun increment() {
        model.increment()
        showToastIfNeeded()
        view.updateText(model.count)
        changeTextIfNeeded()
    }

    fun decrement() {
        model.decrement()
        showToastIfNeeded()
        view.updateText(model.count)
        changeTextIfNeeded()
    }

    fun attachView(view: CounterView) {
        this.view = view
    }

    private fun showToastIfNeeded() {
        if (model.count == 10) {
            view.showToast()
        }
    }

    private fun changeTextIfNeeded() {
        if (model.count == 15) {
            view.changeTextColor(Color.GREEN)
        } else {
            view.changeTextColor(Color.BLACK)
        }
    }
}