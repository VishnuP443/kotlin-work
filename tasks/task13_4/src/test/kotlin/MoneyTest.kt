// Task 13.4: unit tests for Money class

import io.kotest.assertions.throwables.shouldThrow
import io.kotest.assertions.withClue
import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.shouldBe

@Suppress("unused")
class MoneyTest : FreeSpec({
    // Write your unit tests here
    
    
    
    "Can create a Money" {
        val m = Money(1, 50)
        withClue("euros") { m.euros shouldBe 1 }
        withClue("cents") { m.cents shouldBe 50 }
    }
    
    "Can create a different Money" {
        val m = Money(2, 99)
        withClue("euros") { m.euros shouldBe 2 }
        withClue("cents") { m.cents shouldBe 99 }
    }
    
    "Exception when creating Money with negative euros" {
        shouldThrow<IllegalArgumentException> {
            val m = Money(-1, 0)
        }

        shouldThrow<IllegalArgumentException> {
            val m = Money(-10, 0)
        }
    }

    "Exception when creating Money with negative cents" {
        shouldThrow<IllegalArgumentException> {
            val m = Money(0, -1)
        }
    
        shouldThrow<IllegalArgumentException> {
            val m = Money(0, -10)
        }
    }

    "Exception when creating Money with cents larger than 99" {
        shouldThrow<IllegalArgumentException> {
            val m = Money(0, 100)
        }
    
        shouldThrow<IllegalArgumentException> {
            val m = Money(0, 110)
        }
    }
    
    "€1.50 + €1.00 is €2.50" {
        Money(1, 50) + Money(1, 0) shouldBe Money(2, 50) 
    }

    "€1.50 + €2.00 is €3.50" {
        Money(1, 50) + Money(2, 0) shouldBe Money(3, 50)
    }
    
    "€1.50 + €0.01 is €1.51" {
        Money(1, 50) + Money(0, 1) shouldBe Money(1, 51)
    }
    
    "€2.99 + €0.01 is €3.00" {
        Money(2, 99) + Money(0, 1) shouldBe Money(3, 0)
    }
    
    "Money(0, 1) as a string is €0.01" {
        val m = Money(0, 1)
        m.toString() shouldBe "€0.01"
    }
    
    "Money(10, 50) as a string is €10.50" {
        val m = Money(10, 50)
        m.toString() shouldBe "€10.50"
    }
})
