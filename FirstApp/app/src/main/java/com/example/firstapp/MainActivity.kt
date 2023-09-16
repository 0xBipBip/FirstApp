package com.example.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

fun main() {
    val example = Example()
    println(example.print())
}

class Example () {
    fun print() {
        println("HOLAAAA")
    }
}