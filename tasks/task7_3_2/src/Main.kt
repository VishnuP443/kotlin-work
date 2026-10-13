fun main() {
    val numbers = mutableListOf(9, 3, 6, 2, 8, 5)
    println(numbers)
    println(numbers[0])
    println(numbers.slice(2..4))
    println(numbers.first())
    println(numbers.last())
    numbers[0] = 55
    numbers.add(1)
}