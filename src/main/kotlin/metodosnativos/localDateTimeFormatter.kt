import org.springframework.format.annotation.DateTimeFormat
import java.text.DateFormat
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.LocalTime
import java.time.format.DateTimeFormatter
import javax.swing.text.DateFormatter

//package metodosnativos
//
//class ObterDataHoraAtual {
//
//}

fun main () {
    val dataHoraLocal = getLocalDateTimeFormat()

    println("A data e a hora atual são $dataHoraLocal")
}

fun getLocalDateTimeFormat():String {

    val dateTimeAtual = LocalDateTime.now()

    val dateTimeFormated = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:SS")

    val saidaFormated = dateTimeAtual.format(dateTimeFormated)

    return saidaFormated.toString()
}