// Task 12.5.3: demo program for class with custom setter
import kotlinx.datetime.LocalDate

fun main() {
    val p = Person("Chad", LocalDate(2013, 5, 22))
    p.name = "  "
}