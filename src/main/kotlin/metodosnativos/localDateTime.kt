import java.time.LocalDateTime

//package metodosnativos
//
//class ObterDataHoraAtual {
//
//}

fun main () {
    val dataHoraLocal = getLocalDateTime()

    println(dataHoraLocal)
}

fun getLocalDateTime():LocalDateTime {

    return LocalDateTime.now()
}