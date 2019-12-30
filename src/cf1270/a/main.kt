package cf1270.a

fun main() {
    repeat(readLine()!!.toInt()) {
        readLine()
        val a = readLine()!!.split(' ').map { it.toInt() }.max()!!
        val b = readLine()!!.split(' ').map { it.toInt() }.max()!!
        println(if (a > b) "YES" else "NO")
    }
}