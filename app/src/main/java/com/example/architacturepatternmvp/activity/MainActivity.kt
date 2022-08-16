package com.example.architacturepatternmvp.activity

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.architacturepatternmvp.databinding.ActivityMainBinding
import com.example.architacturepatternmvp.helper.Injector
import com.example.architacturepatternmvp.presenter.Presenter
import com.example.architacturepatternmvp.view.CounterView

class MainActivity : AppCompatActivity(), CounterView{

    lateinit var binding: ActivityMainBinding
    private val presenter = Injector.getPresenter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        presenter.attachView(this)
        initClicker()
    }

    private fun initClicker() {
        with(binding) {
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


    override fun showToast() {
        Toast.makeText(this, "Поздравляем!", Toast.LENGTH_SHORT).show()
    }


    @SuppressLint("ResourceAsColor")
    override fun changeTextColor(color: Int) {
        binding.counterTV.setTextColor(color)
    }
}