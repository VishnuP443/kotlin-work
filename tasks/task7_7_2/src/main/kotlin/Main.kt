// Task 7.7.2: phone book simulator


const val CSV_FILENAME = "phone.csv"

fun main() {
    // Implement the main program here
    // (You can add other functions to this file if you wish)
    val db = createDatabase()
    db.load(CSV_FILENAME)
    
    while (true) {
        print("Enter a contact name: ")
        val name = readln()

        val number = db[name]
        if (number != null) {
            println("$name: $number")
        }
        
        else {
            print("Enter the phone number for $name: ")
            val newNumber = readln()
            db[name] = newNumber
            db.save(CSV_FILENAME)
        }
    }
    
    
}
