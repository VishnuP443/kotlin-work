// Task 5.1.2: main program
import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.size != 1) {
        println("Error: Expected one argument!")
        exitProcess(1)
    }
    
    val sides = args[0].toInt()
    
    rollDie(sides)

}