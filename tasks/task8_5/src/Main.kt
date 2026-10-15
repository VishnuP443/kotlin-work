// Task 8.5: example of using a higher-order function

fun main() {
    // Add your testing code here
    val text = readln()
    val vowelCount = text.count {it.lowercase() in "aeiou"}
    println("$vowelCount vowels found")
}

