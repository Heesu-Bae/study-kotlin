package chap03.section03

fun main() {
    println("funcFunc: ${funcFunc()}")
}

fun sum2(a: Int, b: Int) = a + b
fun funcFunc(): Int { // 함수의 반환값으로 함수 사용
    return sum2(2, 2)
}