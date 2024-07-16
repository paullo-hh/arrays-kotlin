fun main() {

    println("Estamos no diretório: ${getPathAtual()}")
    println("Atualizado em ${getLocalDateTimeFormat()}")
}

fun getPathAtual():String {

    return System.getProperty("user.dir")
}