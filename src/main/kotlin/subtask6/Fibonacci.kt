package subtask6

class Fibonacci {

    fun productFibonacciSequenceFor(n: Int): IntArray {
        var last = 0
        var current = 1
        while (last * current < n) {
            val tmp = current
            current += last
            last = tmp
        }
        return intArrayOf(last, current, if (last * current == n) 1 else 0)
    }
}
