// Task 12.8.2: class to represent playing cards

data class Card(val rank: Rank, val suit: Suit) {

    enum class Rank(val value: Char) {
        Ace('A'),
        Two('2'),
        Three('3'),
        Four('4'),
        Five('5'),
        Six('6'),
        Seven('7'),
        Eight('8'),
        Nine('9'),
        Ten('T'),
        Jack('J'),
        Queen('Q'),
        King('K');
        
        override fun toString() = "$value"
    }
    
    enum class Suit(val symbol: Char) {
        Clubs('♣'),
        Diamonds('♦'),
        Hearts('♥'),
        Spades('♠');

        val plainSymbol get() = name[0]

        override fun toString() = "$symbol"
    }
    
    val fullName = "${rank.name} of ${suit}" 
    
    override fun toString() = "${rank.value}${suit.symbol}"
}