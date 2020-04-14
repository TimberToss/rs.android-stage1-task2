package subtask3

class Abbreviation {

    fun abbreviationFromA(a: String, b: String) =
        if (check(a, b))
            "YES"
        else
            "NO"

    private fun check(mutableString: String, immutableString: String): Boolean {
        val array =
            Array(mutableString.length + 1) { BooleanArray(immutableString.length + 1) }
        array[0][0] = true

        for (i in mutableString.indices) {
            for (j in 0..immutableString.length) {
                if (array[i][j]) {
                    if (j < immutableString.length
                        && mutableString[i].toUpperCase() == immutableString[j]) {
                        array[i + 1][j + 1] = true
                    }
                    if (mutableString[i].isLowerCase()) {
                        array[i + 1][j] = true
                    }
                }
            }
        }
        return array[mutableString.length][immutableString.length]
    }
}
