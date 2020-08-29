package com.example.holamundo

import androidx.core.text.trimmedLength

fun main(){
    // println("Hola Mundo Mundial")

   // var number : Int = 10
    // val number2 : Int = 20
    // var name = "Seba"

    // val palabra01 = "   Hola que tal    "

        // var number = 10

        // val concatenado = "El valor de palabra 01 es : $number" //palabra01 es reemplazada por number

        // val sinespacios = palabra01.replace(" ", "")
        // val concatenado = "El largo de palabra 01 es: ${sinespacios.length}"

        // println(concatenado)

    // var saludo = "Hola que tal"
    // val number = 10.0
    // saludo = "Otro saludo"
    // println("saludo $number")
    // println(number)

   // val number = Long.MAX_VALUE
   // println(number)

    //val decimal = 2.0
    //println(decimal.javaClass)
    //val decimalFloat = 2.3f
    //println(decimalFloat.javaClass)

    //val y: Boolean = false
    //println(y)

    // val palabra: String
    // val char: Char ='y'

    // val num = 30
    // val palabra2 = "Hola"
    //val char: Char ='1'
    // val decimal = 10f

    //println("$num $palabra2 $char $decimal")

    //var number = 10
    //val number2 = 33
    //val number3 = 66
    //var resultado1 = number + number2 + number3
    //println("El resultado es: $number + $number2 + $number3 = $resultado1")

    //number = 55
    //println("El resultado es : $number + $number2 + $number3 = ${number + number2 + number3}")

    //var promedio = (number + number2 + number3)/3

    //println("El promedio es: $promedio")

    // imprimirnombrecompleto("Sebastian", "Chuaqui", 43)
    // imprimirnombrecompleto("Juan", "Molina", 48 )

    // val saludo = "Este es un mensaje"
    // println(saludo)

    // println(sum(20, 10))
   //  println(multiplicacion(30, 5))
    // imprimevariosparametros("Hola", "Sebastian")
    // imprimirAllWithPrefix("hello", "hola", "au revoir",  prefix = "Saludo: ")

    // val nombre = "Sebastian"
    // "hola".imprime()
    // nombre.imprime()

    //instanciar  un objeto
    // val customer = Customer()
    // val mContact = Contact(1, "seba@gmail.com")

    // println(mContact.id)
    // println(mContact.email)

    // val perrito = Dog()
    // perrito.makeNoise()

    val yorkShire: Dog = YorkShire()
    yorkShire.makeNoise()

} //Termina Main

// Declarar una funcion y darle parametros
fun imprimirnombrecompleto(nombre:String, apellido:String, edad: Int) {

    println("Mi nombre es: $nombre $apellido y tengo $edad")
 }

fun printMessage(message: String): Unit {
    println(message)
}
fun printMessageWithPrefix(nombre: String, prefix: String ="Estudiante:") {
    println("$prefix: $nombre")
}
fun sum(x: Int, y: Int): Int{
    return x + y
}
fun multiplicacion(num: Int, num2: Int): Int {
    return num * num2
}

fun imprimevariosparametros(vararg message: String) {
    for (elemento in message) println(elemento)
}

fun imprimirAllWithPrefix(vararg message: String, prefix: String){
    for(elemento in message) println(prefix + elemento)
}

fun String.imprime(){
    println(this)
}
fun String.despedida(){
    println("chao")
}

// class Customer
// class Contact(val id: Int, var email: String)

open class Dog{
    open fun makeNoise(){
        println("wow wow")
    }
}
class YorkShire : Dog(){
    override fun makeNoise() {
        println("miau miau")
    }

}