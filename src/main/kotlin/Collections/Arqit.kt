package Collections

class Arqit {

    fun removeMaxMin(arr: IntArray): IntArray {
        val max = arr.max();
        val min = arr.min();

        return arr.filter { it != max && it != min }.toIntArray();
    }


}