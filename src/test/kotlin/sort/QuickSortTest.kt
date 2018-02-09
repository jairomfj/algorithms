package sort

import org.junit.Assert.assertArrayEquals
import org.junit.Test
import sort.QuickSort.sort

class QuickSortTest {

    @Test
    fun shouldReturnSortedArray1() {
        val numbers = arrayOf(5, 6, 1, 3, 7, 2, 4, 9, 8, 0)
        val expected = arrayOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)
        assertArrayEquals(expected, sort(numbers))
    }

    @Test
    fun shouldReturnSortedArray2() {
        val numbers = arrayOf(-5, 20, -50, -3, 100, 500, -2)
        val expected = arrayOf(-50, -5, -3, -2, 20, 100, 500)
        assertArrayEquals(expected, sort(numbers))
    }

}