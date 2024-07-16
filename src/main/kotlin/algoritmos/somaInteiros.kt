package algoritmos

//DESENVOLVIDO POR MIM
fun main() {

    println("A soma dos números é ${somarNumeros()}")

}

fun somarNumeros(): Int {

    println("CALCULADORA - SOMA")

    println("Digite um número inteiro: ")
    var num1 = readln().toInt()

    println("Digite o segundo número inteiro: ")
    var num2 = readln().toInt()

    val soma = num1 + num2

    return soma

}




//DESENVOLVIDO PELO PROFESSOR

/*

fun main() {

    val primeiroNumero = 10
    val segundoNumero = 10

    //var soma = primeiroNumero + segundoNumero
    var soma = somarDoisNumeros(primeiroNumero, segundoNumero)

    imprimirText(primeiroNumero, segundoNumero, soma)

}

private fun imprimirText(primeiroNumero: Int, segundoNumero: Int, soma: Int) {
    println("1º número: $primeiroNumero")
    println("2º número: $segundoNumero")
    println("Soma: $soma")
}

fun somarDoisNumeros(primeiroNumero:Int, segundoNumero:Int):Int {
    return (primeiroNumero + segundoNumero)
}
*/
