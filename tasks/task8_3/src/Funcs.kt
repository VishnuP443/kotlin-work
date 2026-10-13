// Task 8.3: functions for temperature analysis

import kotlin.io.path.Path
import kotlin.io.path.forEachLine

typealias Record = Pair<String,Double>

fun fetchData(filename: String) = buildList {
    // Finish the implementation of this function
    val filePath = Path(filename)
    
    val fileContents = filePath.forEachLine { line ->
        val separatedLine = line.split(",")
        val weatherStationName = separatedLine[0]
        val temperatureValue = separatedLine[1].toDouble()
        
        var weatherRecord = Record(weatherStationName, temperatureValue)
        add(weatherRecord)
    }
}

// Challenge: compute average temperature with one line of code
// in main(), instead of using the function below!

fun averageTemp(data: List<Record>): Double {
    var sum = 0.0
    for (record in data) {
        sum += record.second
    }
    return sum / data.size
}
