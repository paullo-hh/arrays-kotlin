package array

fun main() {
    val casa = Array(size = 10, init = { index -> "Elements" } )

    println("Tamanho do array: ${casa.size}")

//    println("Elemento da posição #0: ${casa.get(0)}")
//    println("Elemento da posição #1: ${casa.get(1)}")
//    println("Elemento da posição #2: ${casa.get(2)}")
//    println("Elemento da posição #3: ${casa.get(3)}")
//    println("Elemento da posição #4: ${casa.get(4)}")

    casa.set(1, "Cozinha")

//    println("Elemento da posição #1: ${casa.get(1)}")

    for ( posicao in casa ) {
        println("Elemento: $posicao")
    }

}