// Task 4.7: finding the longest line in a file

import kotlin.system.exitProcess
import kotlin.io.path.*
import kotlin.collections.*



fun main(args: Array<String>) {
    
    if (args.size > 1) {
        println("Error: Expected one argument! received multiple.")
        exitProcess(1)
    }
    
    val filePath = Path(args[0])
    var currentMax = 0
    var lineMax = 0
    var currentLine = 1
    
    filePath.forEachLine {
        if (it.length > currentMax) {
            currentMax = it.length
            lineMax = currentLine
        }
        currentLine += 1
    }
    
    println("Line $lineMax is the longest (length = $currentMax)")
    exitProcess(0)
    
}