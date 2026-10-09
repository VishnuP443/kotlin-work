// Task 5.1.1: main program
import kotlin.system.exitProcess

fun main( args: Array<String>) {
    if (args.size != 2) {
        println("Error: Expected two arguments!")
        exitProcess(1)
    }
    
    val stringOne = args[0]
    val stringTwo = args[1]
    
    if ( stringOne anagramOf stringTwo ) {
        println("$stringOne and $stringTwo are Anagrams!")
        exitProcess(0)
    }
    println("$stringOne and $stringTwo are not Anagrams!")
    
}