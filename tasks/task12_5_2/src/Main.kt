// Task 12.5.2: demo program for class with custom getter
import kotlinx.datetime.LocalDate

fun main() {
    val p = Person("BobBy", LocalDate(1992, 8, 23))
    println(p.name)
}