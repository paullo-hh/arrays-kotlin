package algoritmos

fun main() {

    println("Vamos calcular um possível aumento de salário:")

    println("Digite sua faixa salarial atual: ")
    var salarioAtual = readln().toFloat()

    var salarioMinimo = 1400.00
    var salario = 0.00

    if (salarioAtual <= salarioMinimo) {
        salario = salarioAtual * 1.30
    } else {
        salario = salarioAtual * 1.10
    }

    var salarioFormatado = String.format("%.2f", salario)
    println("Um salário superior aproximado seria: ${"R$"} $salarioFormatado")
}
