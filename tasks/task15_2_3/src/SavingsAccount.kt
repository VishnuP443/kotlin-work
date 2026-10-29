// Task 15.2.3: SavingsAccount class
import kotlin.math.pow

class SavingsAccount(holder: String, val rate: Double): BankAccount(holder) {
    init {
        require(rate > 0) {"Rate must be above 0"}
        println("Called subclass SavingsAccount")
    }
    
    fun applyInterest(years: Int) {
        require(years > 0) {"Years must be above 0"}
        val oldBalance = ( balance * (1 + (rate / 100) ).pow(years) ).toInt()
        deposit(oldBalance - balance)
    }
}

