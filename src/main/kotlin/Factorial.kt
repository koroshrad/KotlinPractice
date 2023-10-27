class Factorial {



    fun factorial2(num: Int): Long {
        var result :Long = 1
        for (i in 1..num) {
            result *= i
        }
        return result
    }
}