package chap02.section3

fun main() {
    var str1: String? = "Kello Kotlin"
    str1 = null
    println("str1: $str1 length: ${str1?.length ?: -1}")
}