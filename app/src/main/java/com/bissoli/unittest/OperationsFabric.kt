package com.bissoli.unittest

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class OperationsFabric(
    private val operations: Operations
) : ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return OperationsViewModel(operations) as T
    }
}