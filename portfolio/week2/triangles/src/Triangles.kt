// COMP2850 Portfolio: Week 2
// Functions for working with triangle geometry

import kotlin.math.sqrt

typealias Triangle = Triple<Double,Double,Double>

// Add isValidTriangle() and triangleArea() functions here
fun isValidTriangle(t: Triangle): Boolean {
    val (a, b, c) = t
    
    if (a < b + c && b < a + c && c < a + b){
        return true
    }
    return false
}

fun triangleArea(t: Triangle): Double {
    val (a, b, c) = t
    val s = (a + b + c) / 2
    val area = sqrt(s * (s - a) * (s - b) * (s - c))
    
    if (area < 1.0e-6){
        return 0.0
    }
    
    else if (area.isNaN()){
        return Double.NaN
    }
    
    else{
        return area
    }
        
}