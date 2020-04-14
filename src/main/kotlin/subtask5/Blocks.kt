package subtask5

import java.time.LocalDate
import java.time.format.DateTimeFormatter
import kotlin.Comparator
import kotlin.math.abs
import kotlin.reflect.KClass

class Blocks {

    fun getData(blockA: Array<*>, blockB: KClass<*>): Any =
        when (blockB) {
            String::class -> blockA.filterIsInstance<String>().joinToString("")
            Int::class -> blockA.filterIsInstance<Int>().sum()
            LocalDate::class -> blockA.filterIsInstance<LocalDate>().minWith(LocalDateComparator)
                ?.format(DateTimeFormatter.ofPattern("dd.MM.yyyy")) ?: ""
            else -> ""
        }

    private object LocalDateComparator : Comparator<LocalDate> {

        private val currentDate = LocalDate.now().toEpochDay()

        override fun compare(p0: LocalDate?, p1: LocalDate?): Int {
            val firstDate = abs(currentDate - (p0?.toEpochDay() ?: currentDate)).toInt()
            val secondDate = abs(currentDate - (p1?.toEpochDay() ?: currentDate)).toInt()
            return firstDate - secondDate
        }
    }
}
