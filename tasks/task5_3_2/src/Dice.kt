// Task 5.3.2: rollDice() function
// Task 5.1.2: rollDie() function
import kotlin.random.Random

fun rollDie(sides: Int = 6, numOfDie: Int = 1) {
    if (sides in setOf(4, 6, 8, 10, 12, 20)) {
        repeat(numOfDie){
            println("Rolling a d$sides...")
            val result = Random.nextInt(1, sides + 1)
            println("You rolled $result")   
        }
    }
    else {
        println("Error: cannot have a $sides-sided die")
    }
}