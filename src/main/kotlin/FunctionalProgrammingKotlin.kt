
data class Student(val name: String, var age: Int)

fun getStudents() : List<Student> {
    return listOf(
        Student("A", 20),
        Student("Ba", 21),
        Student("C", 24)
    )
}


fun main(args: Array<String>) {
    val students= getStudents()
    val combos = students.map { a -> a.name + " : " + a.age }
    println("Combos $combos")

    println("The oldest student: ${students.maxBy {it.age}} ")

    println("Student with longest name: ${students.maxByOrNull { it.name.length }?.name} ")
}

/*return students with the shortest name*/

fun longestName(students: List<Student>): Student? {
    return students.maxByOrNull { it.name.length }
}

