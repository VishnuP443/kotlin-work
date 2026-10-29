// Task 15.2.3: demo program

fun main() {
    // Write code to demonstrate the classes here
    val account1 = SavingsAccount("Lucas", 1.8)
    account1.deposit(1250)
    account1.applyInterest(5)
    account1.withdraw(amount = 50)
    println(account1.balance)
}
