package sort

object QuickSort {


    fun sort(values: Array<Int>): Array<Int> {
        sort(values, 0, values.size - 1)
        return values
    }

    private fun sort(values: Array<Int>, low: Int, high: Int) {
        var i = low; var j = high

        val pivot = values[low + (high - low) / 2]

        while(i <= j) {
            while(values[i] < pivot) i++
            while(values[j] > pivot) j--

            if(i <= j) {
                exchange(values, i, j)
                i++
                j--
            }
        }

        if(j > low) {
            sort(values, low, j)
        }

        if(i < high) {
            sort(values, i, high)
        }
    }

    private fun exchange(values: Array<Int>, i: Int, j: Int) {
        val aux = values[i]
        values[i] = values[j]
        values[j] = aux
    }

}