package chap03.section01

fun main() {
    namedParam(x = 200, z = 100) // x, z의 이름과 함께 함수 호출(y는 기본값 사용)
    namedParam(z = 150) // z의 이름과 함께 함수 호출(x, y는 기본값으로 지정됨)
}

fun namedParam(x: Int = 100, y: Int = 200, z: Int) {
    println(x + y + z)
}