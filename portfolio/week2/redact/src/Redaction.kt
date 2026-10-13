// COMP2850 Portfolio: Week 2
// Function to redact sensitive information in a string
import kotlin.text.*

fun redact(document: String, redacting: String, redactionChar: Char = 'X'): String {
    val redactionString = redactionChar.toString().repeat(redacting.length)
    val newString = document.replace( redacting, redactionString )
    return newString
}