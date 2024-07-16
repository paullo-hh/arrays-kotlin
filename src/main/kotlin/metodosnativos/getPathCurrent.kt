fun main() {

    println("Estamos no diretório: ${getPathCurrent()}")
    println("Atualizado em ${getLocalDateTimeFormat()}")
}

fun getPathCurrent():String {

    return System.getProperty("user.dir")
}