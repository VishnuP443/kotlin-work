// Task 12.8.2: program to manipulate playing cards
import Card.Rank
import Card.Suit

fun main() {
    val deck = mutableListOf<Card>()
    
    for (suit in Suit.entries) {
        for (rank in Rank.entries) {
            var card = Card(rank, suit)
            deck.add(card)
        }
    }
    
    deck.shuffle()
    
    for (c in deck) {
        println(c.fullName)
    }
    
}