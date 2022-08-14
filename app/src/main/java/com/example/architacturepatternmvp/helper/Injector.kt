package com.example.architacturepatternmvp.helper

import com.example.architacturepatternmvp.model.CounterModel
import com.example.architacturepatternmvp.presenter.Presenter

class Injector {
    companion object{
        fun getPresenter():Presenter{
            return Presenter()
        }
        fun getModel():CounterModel{
            return CounterModel()
        }
    }
}