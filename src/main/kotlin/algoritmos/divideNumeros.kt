package algoritmos

import org.w3c.dom.Text

//DESENVOLVIDO POR MIM
fun main(){
    dividir()
}

fun dividir(): Any {

    println("CALCULADORA - DIVISÃO")

    println("Digite um número: ")
    var num1 = readln().toDouble()

    println("Digite o segundo número: ")
    var num2 = readln().toDouble()

    //val divisao = num1 / num2

    val text = "Não há divisão pelo número '0'"

    return if (num2 != 0.0) {
        println("A divisão dos números é ${dividirNumeros(num1,num2)}")
    } else {
        println("Não há divisão pelo número '0'")
    }
}

fun dividirNumeros(num1:Double, num2:Double):Double {
    return (num1 / num2)
}

