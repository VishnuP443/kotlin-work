// Task 12.9: demo program for class implementing Static Factory Method
import kotlinx.datetime.LocalDate

fun main() {
    val p1 = Person.create("Bob", LocalDate(1997, 10, 12))
    val p2 = Person.create("Bob", LocalDate(1997, 10, 12))
}