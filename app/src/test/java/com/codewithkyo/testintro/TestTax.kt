package com.codewithkyo.testintro

import com.google.common.truth.Truth.assertThat
import org.junit.Before
import org.junit.Test

class TestTax {

    private lateinit var tax: Tax

    @Before
    fun setup() {
        tax = Tax()
    }

    @Test
    fun calculateTaxTest() {
        val netTax = tax.calculateTax(100.0, 0.1)
        assertThat(netTax).isEqualTo(10)
    }

    @Test
    fun calculateIncomeTest() {
        val netIncome = tax.calculateIncome(100.0, 0.1)
        assertThat(netIncome).isEqualTo(90)
    }

}