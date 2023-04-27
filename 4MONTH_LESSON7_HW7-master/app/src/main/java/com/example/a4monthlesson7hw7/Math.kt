package com.example.a4monthlesson7hw7

import androidx.core.text.isDigitsOnly

class Math {

    val integerChars = '0'..'9'

    //сложение
    fun add(a: String, b: String): String {
        var result = ""

        if (a.isInteger() && b.isInteger()) {
            result = (a.toInt() + b.toInt()).toString()
        } else if (a.contains(".") || b.contains(".")) {
            result = "Введите целые числа"
        } else {
            result = "Вы обязаны ввести числа"
        }

        return result
    }

//    fun String.isInteger() = this.all { it in integerChars }

    fun String.isInteger() = this.toIntOrNull()?.let { true } ?: false

    //деление
    fun divide(a: String, b: String): String {
        var result = ""

        if (a.isInteger() && b.isInteger() && b != "0") {
            result = (a.toInt() / b.toInt()).toString()
        } else if (a.contains(".") || b.contains(".")) {
            result = "Введите целые числа"
        } else if (b == "0" || a == "0") {
            result = "На ноль делить нельзя"
        }else if (((a.toDouble() / b.toDouble()) % 1).toString() == "0.0"){
            result = (a.toInt() / b.toInt()).toString()
        } else {
            result = "Вы обязаны ввести числа"
        }

        return result

    }
}