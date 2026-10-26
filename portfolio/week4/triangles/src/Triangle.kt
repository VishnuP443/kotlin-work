// COMP2850 Portfolio: Week 4
// Triangle class

import kotlin.math.sqrt


data class Triangle(val sideA: Double, val sideB: Double, val sideC: Double) {
    val perimeter: Double get() = sideA + sideB + sideC
    val semiPerimeter: Double get() = perimeter / 2
    val area: Double get() {
        val s = semiPerimeter
        val area = sqrt(s * (s - sideA) * (s - sideB) * (s - sideC))
        
        return area
    }
    
    fun isValidTriangle(): Boolean {        
        return (sideA < sideB + sideC && sideB < sideA + sideC && sideC < sideA + sideB)
    }
    
    
    init {
        require(isValidTriangle() == true) {"Triangle is imaginary"}
        require(area > 1.0e-6) {"Area must be greater than 0"}
    }
    
    override fun toString(): String = "Triangle($sideA, $sideB, $sideC)"
}