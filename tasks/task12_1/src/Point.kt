// Task 12.1: Point class
import kotlin.math.hypot

class Point(var x: Double, var y: Double) {
    fun distance() = hypot(x, y)
    infix fun distanceTo(other: Point): Double = hypot(x - other.x, y - other.y)
}