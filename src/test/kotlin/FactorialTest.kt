import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class FactorialTest {

    @Test
    fun factorial2WhenZero() {
        val actual = factorial2(0)
        assertEquals(1, actual)
    }

    @Test
    fun factorial2When2() {
        val actual = factorial2(2)
        assertEquals(2, actual)
    }

    @Test
    fun factorial2When4() {
        val actual = factorial2(4)
        assertEquals(24, actual)
    }
}