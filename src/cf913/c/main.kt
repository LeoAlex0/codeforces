package cf913.c

import java.util.*
import kotlin.math.max

fun main(a:Array<String>){
    val input = Scanner(System.`in`)

    val n=input.nextInt()
    val l=input.nextInt()
    val c=Array(n){ input.nextInt() }

    println(find(c,l))
}

fun find (c:Array<Int>,W:Int,map:MutableMap<Int,Long> = hashMapOf()):Long =
    if (W == 0) 0L
    else map[W] ?: Array(c.size) {
        val single = 1 shl it //单位价值
        c[it] * max(1, W / single).toLong() +
                if (single >= W) 0
                else find(c, W % single, map)
    }.min()!!.also { map.put(W, it) }