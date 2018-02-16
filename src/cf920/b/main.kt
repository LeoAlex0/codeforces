package cf920.b

import kotlin.math.*

fun main(args: Array<String>) {
    val totT= readLine()!!.toInt()
    (1..totT).forEach {
        val n=readLine()!!.toInt()
        val dat=(1..n).map { readLine()!!.split(' ').map { it.toInt() } }
        var t=0
        println(dat.map { (l,r)-> if (t<r) max(l,t+1).also { t=it } else 0 }
                .joinToString(" "))
    }
}