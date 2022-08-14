package com.example.architacturepatternmvp.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.architacturepatternmvp.databinding.ActivityMainBinding
import com.example.architacturepatternmvp.presenter.Presenter
import com.example.architacturepatternmvp.view.CounterView

class MainActivity : AppCompatActivity(), CounterView{
    lateinit var binding: ActivityMainBinding
     private val presenter = Presenter()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        presenter.attachView(this)
        initClicker()
    }

    private fun initClicker() {
        with(binding){
            incrementBtn.setOnClickListener {
                presenter.increment()
            }
            decrementBtn.setOnClickListener {
                presenter.decrement()

                }
            }
        }

    override fun updateText(count: Int) {
        binding.counterTV.text = count.toString()
    }
    fun main(){
        
    }
}
