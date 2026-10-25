// Task 12.4.1: main program

fun main() {
    val c1 = Circle(Point(5.0, 3.0), 4.5)
    val p1 = Point(12.0, 2.0)
    
    if (c1 contains p1) {
        println("p1 in c1")
    }
    
    else {
        println("p1 not in c1")
    }
    
}