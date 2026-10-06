// Task 4.4: temperature conversion using a while loop

import kotlin.system.exitProcess

import com.github.ajalt.mordant.rendering.AnsiLevel
import com.github.ajalt.mordant.rendering.TextAlign
import com.github.ajalt.mordant.rendering.TextColors.*
import com.github.ajalt.mordant.table.table
import com.github.ajalt.mordant.terminal.Terminal

fun main(args: Array<String>) {
    // Add your code here
    if (args.size != 3) {
        println("Error: invalid argument count!")
        exitProcess(1)
    }

    val initalTemp = args[0].toFloat()
    val maximumTemp = args[1].toFloat()
    val increment = args[2].toFloat()
    var currentTemp = initalTemp

    while (initalTemp < maximumTemp){
        currentTemp += increment
        println(currentTemp)
    }

}
