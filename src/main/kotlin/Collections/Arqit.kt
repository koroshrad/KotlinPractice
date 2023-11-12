package Collections

class Arqit {

    fun removeMaxMin(arr: Array<Int>): IntArray {
        val max = arr.max();
        val min = arr.min();

        return arr.filter { it != max && it != min }.toIntArray();
    }


}