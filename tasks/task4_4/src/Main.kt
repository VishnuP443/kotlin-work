// Task 4.4: temperature conversion using a while loop

import kotlin.system.exitProcess

import com.github.ajalt.mordant.rendering.AnsiLevel
import com.github.ajalt.mordant.rendering.TextAlign.*
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
    
    if (increment <= 0 || maximumTemp < initalTemp) {
        println("Error: increment must be above 0 AND maximum temperature > initial temperature!")
        exitProcess(1)
    }
    



    val t = Terminal()

    t.println(
        table {
            borderStyle = blue
            header {
                style = red
                row("Celsius", "Fahrenheit") 
            }
            body {
                while (currentTemp <= maximumTemp)  {
                    var fahrenheit = (currentTemp * (9 / 5) ) + 32
                    align = RIGHT
                    row("$currentTemp", "$fahrenheit")
                    currentTemp += increment
                }
            }
        }
    )
}
