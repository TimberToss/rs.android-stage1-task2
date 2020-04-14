package subtask4

import java.lang.StringBuilder
import kotlin.properties.Delegates

class Pangram {

    fun getResult(inputString: String): String {
        isPangram = inputString
            .toLowerCase()
            .filter { it in 'a'..'z' }
            .toCharArray()
            .distinct().size == 26

        return inputString
            .split(Regex("\\s+"))
            .filter { it != "" }
            .map { createPairs(it) }
            .sortedBy{ it.first }
            .joinToString(" ") { "${it.first}${it.second}" }
    }

    private fun createPairs(word: String): Pair<Int, String> {
        var count = 0
        val newWord = StringBuilder(word)
        for (i in newWord.indices) {
            if (check(newWord[i].toLowerCase())) {
                newWord[i] = newWord[i].toUpperCase()
                count++
            }
        }
        return Pair(count, newWord.toString())
    }

    private fun check(character: Char) : Boolean =
        if (isPangram) {
            character in VOWELS
        } else {
            character !in VOWELS && character.isLetter()
        }

    companion object {
        private val VOWELS = arrayOf('a', 'e', 'i', 'u', 'o', 'y')
        private var isPangram by Delegates.notNull<Boolean>()
    }
}