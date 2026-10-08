// Task 4.5: summing odd integers with a for loop

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    // Add your code here
    if (args.size != 1) {
        println("Error: Invalid argument size! expected one argument.")
        exitProcess(1)
    }
    
    val limit = args[0].toInt()
    var sum: UInt = 0
    
    if (limit < 0) {
        println("Error: limit must be greater than 0")    
        exitProcess(1)
    }
    
    for (n in 1..limit step 2) {
        sum += n
    }
    
    println(sum)
    
    exitProcess(0)
}
