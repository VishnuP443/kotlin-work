// Task 7.7.1: statistics functions
import kotlin.collections.*

fun median(numbers: List<Float>): Float{
    
    if (numbers.isEmpty()) {
        throw IllegalArgumentException("The list is empty")
    }
    
    var result = 0.0f
    val middle = numbers.size / 2
    
    
    if (numbers.size % 2 == 0) {
        result = (numbers[middle - 1] + numbers[middle]) / 2
    }
    
    else {
        result = numbers[middle]
    }
    
    return result
    
}


// Tests that I checked

// I have checked first on a list of size 1
// since this is the lower bound for odd sized lists
// Then I checked for the lower bound of even sized lists
// excluding zero containing random values
// as the median function should return an average of the
// two values either side of the middle
// after this I checked the general case past the lower bould
// for odd sized lists with a list of size 3 with random values
// as for this the middle index should be returned
// And finally I tested the list of size 4 as this again is
// past the lower bound for even sized lists