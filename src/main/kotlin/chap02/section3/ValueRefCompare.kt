package chap02.section3

fun main() {
    val a: Int = 128
    val b = a
    println(a === b) // 자료형이 기본형으로 변환되어 저장되므로 true

    val c: Int? = a
    val d: Int? = a
    val e: Int? = c
    println(c == d) // 값 동일: true
    println(c === d) // 값 동일, 참조 객체 다름: false
    println(c === e) // 값 동일, 참조 객체 동일: true
}