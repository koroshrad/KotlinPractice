import java.util.Comparator
import kotlin.text.StringBuilder

class CodingQuestions {

    fun code() {
        println("coding questions")
    }
}

fun main(array: Array<String>) {

    iterator()
}

//Write a program to reverse a string in Kotlin.

fun reverseString(str: String) : String {
    val strbuilder = StringBuilder(str)
    return strbuilder.reverse().toString()
}


//Write a program to find the largest number in an array.

fun largestNumber(nums: ArrayList<Int>): Int {
    return nums.stream().sorted(reverseOrder()).findFirst().get();
}

//To iterate over a range of numbers

fun iterator() {
    for (num in 1..3) {
        println(num)
    }
}


//4. Write a program to find the factorial of a given number in Java.

fun factorial(num: Int): Long {
    if (num == 0) return 1
    return num * factorial(num-1)
}

fun factorial2(num: Int): Long {
    var result :Long = 1
    for (i in 1..num) {
        result *= i
    }
    return result
}


//FizzBuzz

fun fizzBuzz1(num: Int) {
    for (i in 1..num) {
        print("$i) ")
        when {
            i%3 == 0 && i%5 == 0 -> print("FizzBuzz")
            i%3 == 0 -> print("Fizz")
            i%5 == 0 -> print("Buzz")
        }
        println()
    }

}

// smaller of two values

fun <T: Comparable<T>> smallerValue(num1: T, num2: T) : T {
    val res = num1.compareTo(num2)
    return if(res>0) num2 else num1
}

/*find the average of 4 biggest number
*/

//fun averageOfLargestFour(nums: List<Int>): Double {
//     return nums.stream()
//        .sorted(Comparator.reverseOrder())
//        .limit(4)
//        .mapToInt(Int::toInt)
//        .summaryStatistics().average
//}

fun averageOfLargestFour(nums: List<Int>): Double {
    return nums.sortedDescending()
        .take(4)
        .average()
}



/*find the sum of largest four nums in an array*/

fun largestOfFour(nums: List<Int>) : Int = nums.sortedDescending().take(4).sum()