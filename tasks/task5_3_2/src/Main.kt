// Task 5.3.2: main program
import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.size != 1){
        println("Error: Expected one argument!")
        exitProcess(1)
    }
    
    val splittedString = args[0].split("d")
    val dieNum = splittedString[0].toInt()
    val sides = splittedString[1].toInt()
    
    rollDie(sides = sides, numOfDie = dieNum)
}