// Task 12.5.4: demo program for class with a computed property
import kotlinx.datetime.LocalDate

fun main() {
    val p = Person("Dylan", LocalDate(1997, 5, 12))
    println(p.age)
}
