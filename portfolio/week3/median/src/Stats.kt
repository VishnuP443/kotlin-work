// Task 7.7.1: statistics functions
import kotlin.collections.*

fun median(numbers: List<Float>): Float{
    
    if (numbers.isEmpty()) {
        throw IllegalArgumentException("The list is empty")
    }
    
    var result = 0.0f
    val middle = numbers.size / 2
    val sortedNums = numbers.sorted()
    
    
    if (numbers.size % 2 == 0) {
        result = (sortedNums[middle - 1] + sortedNums[middle]) / 2
    }
    
    else {
        result = sortedNums[middle]
    }
    
    return result
    
}

