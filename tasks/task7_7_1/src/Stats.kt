// Task 7.7.1: statistics functions
import kotlin.collections.*

fun median(numbers: List<Float>): Float{
    if (numbers.size % 2 == 0) {
        return numbers[numbers.size / 2] 
    }
    
    return numbers[(numbers.size + 1) / 2]
    
}

fun statistics(numbers: List<Float>) {
    val minimum = numbers.min()
    val maximum = numbers.max()
    val mean = numbers.average()
    val median = median(numbers)
    
    println("Minimum: $minimum\nMaximum: $maximum\nMean: $mean\nMedian: $median\n")
}   