package com.example.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

fun main() {
    val numbers = listOf(0, 3, 8, 4, 0, 5, 5, 8, 9, 2)
    println("list:   ${numbers}")
    println("list:   ${numbers.sorted()}")
}