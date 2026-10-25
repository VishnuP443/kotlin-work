// Task 12.3.2: demo of Person class with secondary constructor
import kotlinx.datetime.LocalDate

fun main() {
    val p = Person("           ", "1997-08-23")
    println("Name: ${p.name}\nDOB: ${p.birth}\nMarital Status: ${p.isMarried}")
}