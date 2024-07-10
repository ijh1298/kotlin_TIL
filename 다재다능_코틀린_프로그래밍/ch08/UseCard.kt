package ch08

fun process(card: Card) = when (card) {
    is Card.Ace -> "${card.javaClass.name} of ${card.suit}"
    is Card.King, is Card.Queen, is Card.Jack -> "$card"
    is Card.Pip -> "${card.number} of ${card.suit}"
}
fun main() {
    println(process(Card.Ace("Diamond")))
    println(process(Card.Queen("Clubs")))
    println(process(Card.Pip("Spades", 2)))
    println(process(Card.Pip("Hearts", 6)))
}