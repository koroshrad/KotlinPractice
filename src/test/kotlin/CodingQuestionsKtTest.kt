import jdk.jfr.Description
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class CodingQuestionsKtTest {

    @Test
    @Description("Test case: ")
    fun largestNumber() {
        val actual = largestNumber(arrayListOf(2,4,5,7,3))
        assertEquals(7, actual)
    }

    @Test
    fun largestNumber2() {
        val actual = largestNumber(arrayListOf(2,2,2))
        assertEquals(2, actual)
    }

    @Test
    fun largestNumber3() {
        val actual = largestNumber(arrayListOf(-1,0,-200,-20))
        assertEquals(0, actual)
    }

    @Test
    fun factorialWhen0() {
        val actual = factorial(0)
        assertEquals(1, actual)
    }

    @Test
    fun factorialWhen1() {
        val actual = factorial(1)
        assertEquals(1, actual)
    }

    @Test
    fun factorialWhen4() {
        val actual = factorial(0)
        assertEquals(1, actual)
    }

    @Test
    fun smallerValue() {
        val actual = smallerValue(5.0,4.0)
        assertEquals(4.0, actual)
    }

    @Test
    @Description("Test case: Ascending list of integers")
    fun averageOfFourBiggest() {
        val actual = averageOfLargestFour(listOf(1,2,3,4,5))
        assertEquals(3.5, actual)
    }

    @Test
    @Description("Test case: Descending list of Integers with answer to 1 d.p")
    fun averageOfFourBiggest2() {
        val actual = averageOfLargestFour(listOf(5,4,3,2,1))
        assertEquals(3.5, actual)
    }

    @Test
    @Description("Test case: Unordered list of Integers")
    fun averageOfFourBiggest3() {
        val actual = averageOfLargestFour(listOf(55,3,35,23,10))
        assertEquals(30.75, actual)
    }


    @Test
    @Description("Test case: Unordered list of Integers with an answer to 2 d.p")
    fun averageOfFourBiggest4() {
        val actual = averageOfLargestFour(listOf(55,3,35,23,10))
        assertEquals(30.75, actual)
    }

    @Test
    fun largestOfFour() {
        val actual = largestOfFour(listOf(1,10,2,20,3,30))
        assertEquals(63, actual)
    }

    @Test
    fun largestOfFour2() {
        try {
            largestOfFour(listOf(1,10,2,4))
        } catch (e: IllegalArgumentException) {
            assertEquals("The list must contain at least 4 numbers.", e.message)
        }
    }

}