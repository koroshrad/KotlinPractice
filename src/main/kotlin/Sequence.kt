fun main() {
    var seq = generateSequence(100) {it+ 1}
    println(seq.drop(2).take(4).toList())
}