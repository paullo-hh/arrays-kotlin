package algoritmos

fun main() {
    println("Um salário superior aproximado seria: ${"R$"} ${calculo()}")
}

fun calculo(): String {
    println("Vamos calcular um possível aumento de salário")

    println("Digite sua faixa salarial atual: ")
    var salarioAtual: Float = readln().toFloat()

    var salarioMinimo: Float = 1400.0F
    var salario: Float = 0.0F

    if (salarioAtual <= salarioMinimo) {
        salario = salarioAtual * 1.30.toFloat()
    } else {
        salario = salarioAtual * 1.10.toFloat()
    }

    var salarioFormatado = String.format("%.2f", salario)
    return salarioFormatado
}
