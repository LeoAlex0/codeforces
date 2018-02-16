package cf934.a

import kotlin.math.min

fun main(args:Array<String>) {
    val (n, _) = readLine()!!.split(' ').map { it.toInt() }
    val a = readLine()!!.split(' ').map { it.toInt() }.sorted()
    val bRaw = readLine()!!.split(' ').map { it.toInt() }
    val b = listOf(bRaw.min()!!.toLong(), bRaw.max()!!.toLong())

    val ans = min(
            listOf(a[1] * b[0], a[1] * b[1], a[n - 1] * b[0], a[n - 1] * b[1]).max()!!,
            listOf(a[0] * b[0], a[0] * b[1], a[n - 2] * b[0], a[n - 2] * b[1]).max()!!)
    println(ans)
}