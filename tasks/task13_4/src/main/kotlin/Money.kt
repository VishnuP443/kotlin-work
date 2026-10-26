// Task 13.4: Money class
data class Money(val euros: Int, val cents: Int) {
    operator fun plus(other: Money): Money {
        var newEuros = euros + other.euros
        var newCents = cents + other.cents
        
        val leftOver = newCents % 100
        val addOnEuros = newCents / 100
        newEuros += addOnEuros
        newCents = leftOver
        
        return Money(newEuros, newCents)
    }
    
    override fun toString(): String = "€${euros}." + "${cents}".padStart(2, '0')
    
    init {
        require(euros >= 0) { "Euros cannot be negative"}
        require(cents in 0..99) { "Cents cannot be negative or greater than 100"}
    }
    
    
}