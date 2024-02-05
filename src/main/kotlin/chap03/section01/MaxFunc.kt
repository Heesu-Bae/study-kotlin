package chap03.section01

fun main() { // 최초의 스택 프레임
    var num1 = 10 // 임시 변수 혹은 지역 변수
    var num2 = 3 // 임시 변수 혹은 지역 변수
    val result: Int

    result = max(num1, num2)
    println(result)
}

fun max(a: Int, b: Int) = if (a > b) a else b