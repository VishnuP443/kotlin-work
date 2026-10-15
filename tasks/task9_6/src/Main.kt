// Task 9.6: application to compute dataset variance

import kotlin.system.exitProcess
import kotlin.io.path.Path
import kotlin.io.path.exists

fun main(args: Array<String>) {
    // Implement main program here
    require(args.size == 1) {"Only 1 argument is required!"}
    require(Path(args[0]).exists()) {"File provided does not exist! Please try again"}
    
    val filename = args[0]
    val fileContents = readData(filename)
    val contentSize = fileContents.size
    val result = variance(fileContents)
        
    println("Data size: $contentSize\nVariance: %.5f".format(result))
    
    
}
