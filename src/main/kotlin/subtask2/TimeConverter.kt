package subtask2

import java.lang.ClassCastException

class TimeConverter {

    fun toTextFormat(hour: String, minute: String): String {
        try {
            val nextHour = hour.toInt()
            val numberMinutes = minute.toInt()
            val currentHour = nextHour - 1

            return when (numberMinutes) {
                0 -> "${numberArray[currentHour]} o' clock"
                1 -> "one minute past ${numberArray[currentHour]}"
                15 -> "quarter past ${numberArray[currentHour]}"
                in 1..29 -> {
                    "${numberArray[numberMinutes - 1]} minutes past ${numberArray[currentHour]}"
                }
                30 -> "half past ${numberArray[currentHour]}"
                31 -> "one minute to ${numberArray[currentHour]}"
                45 -> "quarter to ${numberArray[nextHour]}"
                in 31..59 -> {
                    "${numberArray[59 - numberMinutes]} minutes to ${numberArray[nextHour]}"
                }
                else -> ""
            }
        } catch (e: ClassCastException) {
            return ""
        }
    }

    companion object {
        private val numberArray = arrayOf(
            "one", "two", "three", "four", "five", "six", "seven", "eight",
            "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen",
            "seventeen", "eighteen", "nineteen", "twenty", "twenty one", "twenty two",
            "twenty three", "twenty four", "twenty five", "twenty six", "twenty seven",
            "twenty eight", "twenty nine"
        )
    }
}
