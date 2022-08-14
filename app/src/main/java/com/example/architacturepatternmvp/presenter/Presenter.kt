package com.example.architacturepatternmvp.presenter

import com.example.architacturepatternmvp.model.CounterModel
import com.example.architacturepatternmvp.view.CounterView

class Presenter {
    private val model = CounterModel()
    lateinit var view:CounterView

    fun increment(){
        model.increment()
        view.updateText(model.count)
    }
    fun decrement(){
        model.decrement()
        view.updateText(model.count)
}
    fun attachView(view:CounterView){
        this.view = view 
    }
}