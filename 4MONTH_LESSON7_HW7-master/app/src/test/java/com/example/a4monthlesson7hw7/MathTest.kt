package com.example.a4monthlesson7hw7

import junit.framework.Assert.assertEquals
import org.junit.After
import org.junit.Before
import org.junit.Test

class MathTest {

    var math: Math? = null

    @Before
    fun init(){
        math = Math()
    }

    @Test
    fun simpleAddTest() {
        assertEquals("4", math?.add("2", "2"))
    }

    @Test
    fun simpleSymbolTest() {
        assertEquals("Вы обязаны ввести числа", math?.add("2kjhgf", "2"))
    }

    @Test
    fun simpleWithPlusTest() {
        assertEquals("4", math?.add("+2", "2"))
    }

    @Test
    fun simpleWithEmptyTest() {
        assertEquals("4", math?.add("+2", ""))
    }

    @Test
    fun simpleWithNegativeTest() {
        assertEquals("0", math?.add("-2", "+2"))
    }

    @Test
    fun simpleWithDoubleTest() {
        assertEquals("Введите целые числа", math?.add("2", "2.0"))
    }

    @Test
    fun simpleDivide() {
        assertEquals("4", math?.divide("8", "2"))
    }

    @Test
    fun simpleSymbolDivide() {
        assertEquals("Вы обязаны ввести числа", math?.divide("8asdfg", "2"))
    }

    @Test
    fun simpleZeroDivide() {
        assertEquals("На ноль делить нельзя", math?.divide("2", "0"))
    }

    //дзшка: реализовать этот тест
    @Test
    fun simpleNotNullNumberDivide() {
        assertEquals("1.25", math?.divide("10", "8"))
    }

    @Test
    fun simpleaDivide() {
        assertEquals("-2", math?.divide("-4", "2"))
    }

    @After
    fun detach(){
        math = null
    }

}