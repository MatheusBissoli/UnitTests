package com.bissoli.unittest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.bissoli.unittest.R

class MainActivity : AppCompatActivity(), Operations {

    private lateinit var viewModel: OperationsViewModel
    lateinit var factory: OperationsFabric

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        factory = OperationsFabric(this)
        viewModel = ViewModelProvider(this, factory)
            .get(OperationsViewModel::class.java)
    }

    override fun sumNum(num1: Int, num2: Int): Int {
        return num1 + num2
    }

    override fun divNum(num1: Double, num2: Double): Double {
        return (num1 / num2)
    }
}