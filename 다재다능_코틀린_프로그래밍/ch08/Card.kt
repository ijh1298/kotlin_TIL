package ch08

/**
 * final 클래스란 open으로 표기되어 있지 않아서 자식 클래스가 하나도 없는 클래스를 의미
 * open과 abstract 클래스에서 어떤 클래스가 상속을 받았는지는 전혀 알 수 없다.
 *
 * sealed 클래스는 동일한 파일에 작성된 다른 클래스들에 확장이 허용되지만 그 외의 클래스들은 확장할 수 없는 클래스이다.
 * sealed 클래스의 생성자는 private이 표기되지 않았지만 private으로 취급.
 */
sealed class Card(val suit: String) {
    class Ace(suit: String): Card(suit)
    class King(suit: String): Card(suit) {
        override fun toString() = "King of $suit"
    }
    class Queen(suit: String): Card(suit) {
        override fun toString(): String = "Queen of $suit"
    }
    class Jack(suit: String): Card(suit) {
        override fun toString(): String = "Jack of $suit"
    }
    class Pip(suit: String, val number: Int): Card(suit) {
        init {
            if (number < 2 || number > 10)
                throw RuntimeException("Pip has to be between 2 and 10")
        }
    }
}