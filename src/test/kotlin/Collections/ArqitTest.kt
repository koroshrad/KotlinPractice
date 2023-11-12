package Collections

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ArqitTest(
    val arqit: Arqit
) {

    @Test
    fun removeMaxMinTest() {

        val arr = arrayOf(1,2,4)
        val simpleArray = arrayOf(1, 2, 3)
        val actual = arqit.removeMaxMin(arr)
        assertEquals(intArrayOf(2,3,4),actual )
    }

}