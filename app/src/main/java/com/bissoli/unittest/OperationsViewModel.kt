package com.bissoli.unittest

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class OperationsViewModel(
    private val operations: Operations
) : ViewModel() {

    var sum = MutableLiveData<Int>()

    var div = MutableLiveData<Double>()

    fun calcSum(value1: Int, value2: Int) {
        sum.postValue(operations.sumNum(value1, value2))
    }

    fun calcDiv(value1: Double, value2: Double){
        div.postValue(operations.divNum(value1, value2))
    }

}