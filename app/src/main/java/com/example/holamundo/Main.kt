package com.example.holamundo

import androidx.core.text.trimmedLength

fun main(){
    // println("Hola Mundo Mundial")

   // var number : Int = 10
    // val number2 : Int = 20
    // var name = "Seba"

    val palabra01 = "   Hola que tal    "

        // var number = 10

        // val concatenado = "El valor de palabra 01 es : $number" //palabra01 es reemplazada por number

        val sinespacios = palabra01.replace(" ", "")
        val concatenado = "El largo de palabra 01 es: ${sinespacios.length}"

        println(concatenado)



}