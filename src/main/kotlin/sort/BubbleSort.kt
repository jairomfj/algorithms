package sort

object BubbleSort {

    fun sort(numbers: Array<Int>): Array<Int> {
        var i = numbers.size - 1
        while (i > 0) {
            var j = 0
            while(j < i) {
                if(numbers[j] > numbers[j + 1]) {
                   val aux = numbers[j]
                    numbers[j] = numbers[j +1]
                    numbers[j +1] = aux
                }
                j++
            }

            i--
        }

        return numbers
    }

}