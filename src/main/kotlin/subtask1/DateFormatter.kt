package subtask1

import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.time.format.DateTimeParseException
import java.util.*

class DateFormatter {

    fun toTextDay(day: String, month: String, year: String): String {
        val dateTimeMonth = if (month.length == 1) "0$month" else month
        return try {
            LocalDate.parse("$year-$dateTimeMonth-$day")
                .format(DateTimeFormatter.ofPattern("dd MMMM, EEEE", Locale("ru")))
        } catch (e: DateTimeParseException) {
            "Такого дня не существует"
        }
    }
}
