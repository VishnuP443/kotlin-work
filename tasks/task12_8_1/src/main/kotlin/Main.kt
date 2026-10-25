// Task 12.8.1: demo program for Day enum class

fun main() {
    print("Enter a day of the week: ")    
    val userDay = readln()
    
    try {
        val day = Day.valueOf(userDay)
    }
    
    catch (error: IllegalArgumentException) {
        println("Input was not capitalised or must be a valid day of the week\nValid entries: ${Day.entries}")
    }
}