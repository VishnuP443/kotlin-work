// Task 4.3: grade calculation using a when expression
import kotlin.math.roundToInt
import kotlin.system.exitProcess

fun main(args: Array<String>) {

    if (args.size != 3) {
        println("Error: 3 arguments were not provided!")
        exitProcess(1)
    }

    val module_one = args[0].toFloat()
    val module_two = args[1].toFloat()
    val module_three = args[2].toFloat()

    if ( (module_one < 0 || module_one > 100 ) || (module_two < 0 || module_two > 100 ) || (module_three < 0 || module_three > 100 ) ) {
        println("Error: scores have to be between 0 and 100!")
        exitProcess(1)
    }

    val weighted_average = ( ( module_one + module_two + module_three ) / 3 ).roundToInt()

    val grade = when (weighted_average) {
        in 0..39 -> "Fail, Mark: $weighted_average"
        in 40..69 -> "Pass, Mark: $weighted_average"
        in 70..100 -> "Distinction, Mark: $weighted_average"
        else -> println("Error has occured")
    }
    println(grade)
}
