// Task 8.3: weather station temperature analysis program

import kotlin.system.exitProcess
import kotlin.collections.*

fun main(args: Array<String>) {
    // Add your code here
    if (args.size != 1) {
        println("Error: one argument was expected!")
        exitProcess(1)
    }
    
    val recordList = fetchData( args[0] )    
    val temperatureAverage = recordList.map { it.second }.average()
    println("Average temperature: %.2f".format(temperatureAverage))
    
}
