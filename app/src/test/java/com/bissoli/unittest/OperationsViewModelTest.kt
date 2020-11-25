package com.bissoli.unittest

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.google.common.truth.Truth.assertThat
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.mockito.Mockito

class OperationsViewModelTest {

    private lateinit var operationsViewModel: OperationsViewModel
    private lateinit var operations: Operations

    @get:Rule
    var instantTaskExecutorRole = InstantTaskExecutorRule()

    @Before
    fun setUp() {
        operations = Mockito.mock(Operations::class.java)
        Mockito.`when`(operations.sumNum(12, 12)).thenReturn(24)
        operationsViewModel = OperationsViewModel(operations)
    }

    @Test
    fun calcSum_numGiven_updateLiveData() {
        operationsViewModel.calcSum(12, 12)
        val result = operationsViewModel.sum.value
        assertThat(result).isEqualTo(24)
    }
}