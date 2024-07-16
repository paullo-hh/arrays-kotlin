package algoritmos

//DESENVOLVIDO POR MIM
fun main() {

    println("A divisão dos números é ${dividir()}")

}

fun dividir():Double {

    println("CALCULADORA - DIVISÃO")

    println("Digite um número: ")
    var num1 = readln().toDouble()

    println("Digite o segundo número: ")
    var num2 = readln().toDouble()

    //val divisao = num1 / num2
    val divisao = dividirNumeros(num1,num2)

    return divisao
}

fun dividirNumeros(num1:Double, num2:Double):Double {
    return (num1 / num2)
}

