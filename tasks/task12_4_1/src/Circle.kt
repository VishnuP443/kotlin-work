// Task 12.4.1: Circle class
import kotlin.math.PI

class Circle(val centre: Point, val radius: Double) {
    fun area() = PI * radius * radius
    fun perimeter() = 2 * PI * radius
    infix fun contains(p: Point) = p.distanceTo(centre) <= radius
    
    init {
        require(radius > 0) {"Radius must be greater than 0"}
    }
}
