package algoritmos

import java.text.DecimalFormat
import java.util.*

fun main() {
    println(calcularMedia())
}

fun calcularMedia(): String? {

    println("CALCULADORA - CÁLCULO DE NOTAS")

    println("Digite a primeira nota: ")
    val nota1 = readln().toDouble()

    println("Digite a segunda nota: ")
    val nota2 = readln().toDouble()

    println("Digite a terceira nota: ")
    val nota3 = readln().toDouble()

    println("Digite a quarta nota: ")
    val nota4 = readln().toDouble()

    println("Digite a quinta e última nota: ")
    val nota5 = readln().toDouble()

    return baterMartelo(nota1, nota2, nota3, nota4, nota5)

}

fun baterMartelo(nota1:Double, nota2:Double, nota3:Double, nota4:Double, nota5:Double): String? {

    val media = ( nota1 + nota2 + nota3 + nota4 + nota5 ) / 5

    val format = DecimalFormat("#.#")

    val mediaFormated = format.format(media)

    if (mediaFormated >= 5.9.toString()) {
        println("O aluno está aprovado!\nParabéns!!")
    } else ( println("Não foi dessa vez. Reprovado!") )

    return mediaFormated
}

