package com.bissoli.unittest

import com.google.common.truth.Truth.assertThat
import org.junit.Before
import org.junit.Test
import java.lang.Double.NaN

class MainActivityTest {

    private lateinit var mainActivity: MainActivity

    @Before
    fun setUp() {
        mainActivity = MainActivity()
    }

    @Test
    fun sumNum_numGiven_returnsSuccess() {
        val result = mainActivity.sumNum(12, 12)
        assertThat(result).isEqualTo(24)
    }

    @Test
    fun sumNum_numNotGiven_returnsSuccess() {
        val result = mainActivity.sumNum(0, 0)
        assertThat(result).isEqualTo(0)
    }

    @Test
    fun divNum_numGiven_returnsSuccess() {
        val result = mainActivity.divNum(6.0, 2.0)
        assertThat(result).isEqualTo(3.0)
    }

    @Test
    fun divNum_numNotGiven_returnsSuccess() {
        val result = mainActivity.divNum(0.0, 0.0)
        assertThat(result).isEqualTo(NaN)
    }
}