// Task 5.1.1: anagrams() function

infix fun String.anagramOf(other: String): Boolean =  this.lowercase().toList().sorted() == other.lowercase().toList().sorted()