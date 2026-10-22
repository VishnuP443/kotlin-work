// Task 12.1: program that uses a Point object

fun main() {    
    val p1 = Point(x = 3.0, y = 4.0)
    val p2 = Point(x = 9.0, y = 7.0)
    println("P1 Coordinates: ${p1.x}, ${p1.y}")
    println("P2 Coordinates: ${p2.x}, ${p2.y})")
    
    val originDistForP1 = p1.distance()
    val originDistForP2 = p2.distance()
    
    println("P1 and P2 Distance from origin:\nP1: $originDistForP1\nP2: $originDistForP2")
    
    val distanceBetweenPoints = p1 distanceTo p2
    
    println("Distance from P1 to P2:\n$distanceBetweenPoints")
}