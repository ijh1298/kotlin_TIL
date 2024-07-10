package ch08

/**
 * Card 클래스의 suit를 위한 값은 정해져 있다. Enum 클래스를 사용하면 간결하게 표현 가능하다.
 */
enum class Suit {CLUBS, DIAMONDS, HEARTS, SPADES}

sealed class CardWithEnum(val suit: Suit) {
    class Ace(suit: Suit): Card(suit)
    class King(suit: Suit): Card(suit) {
        override fun toString() = "King of $suit"
    }
    class Queen(suit: Suit): Card(suit) {
        override fun toString() = "Queen of $suit"
    }
    class Jack(suit: Suit): Card(suit) {
        override fun toString() = "Jack of $suit"
    }
    class Pip(suit: Suit, val number: Int): Card(suit) {
        init {
            if (number < 2 || number > 10)
                throw RuntimeException("Pip has to be between 2 and 10")
        }
    }
    fun printCards() {
        println(process(Ace(Suit.DIAMONDS)))
        println(process(Queen(Suit.CLUBS)))
        println(process(Pip(Suit.SPADES, 2)))
        println(process(Pip(Suit.HEARTS, 6)))
    }
}