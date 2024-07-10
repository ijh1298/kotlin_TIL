abstract class Musician(val name: String, val activeForm: Int) {
    abstract fun instrumentType(): String
}
class Cellist(name: String, activeForm: Int) : Musician(name, activeForm) {
    override fun instrumentType(): String = "String"
}
val ma = Cellist("Yo-Yo-Ma", 1961)

/*
인터페이스 vs 추상클래스
여러 클래스 사이에서 상태를 다시 사용해야 한다면 추상 클래스가 좋은 선택.
추상 클래스에서는 공통 상태를 구현할 수 있다.

하나 이상의 명세와 요구사항을 만족하는 클래스들을 원하지만 각각의 클래스들이 각각의 구현을 하는 것을 원한다면
인터페이스가 좋은 선택.
 */