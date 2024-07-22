import java.util.Scanner

fun main(args: Array<String>) {

    val reader = Scanner(System.`in`)

    var numeroBinario: Long = reader.nextLong()
    var numeroDecimal: Int = 0

    numeroDecimal = conversorBinarioDecimal(numeroBinario)

    println("A conversão decimal de $numeroBinario que está em binario, é $numeroDecimal .")
}

fun conversorBinarioDecimal(numeroBinario: Long): Int {

    var _numeroBinario = numeroBinario
    var _numeroDecimal = 0
    var i = 0
    var numeroTemporario: Long

    while ( _numeroBinario.toInt() != 0 ) {
        numeroTemporario = _numeroBinario % 10
        _numeroBinario /= 10
        _numeroDecimal += (numeroTemporario * Math.pow( 2.0, i.toDouble())).toInt()
        i++
    }

    return _numeroDecimal
}