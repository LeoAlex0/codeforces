package cf913.e

import java.util.*
import kotlin.collections.HashMap

fun main(args: Array<String>) {
    val ans = hashMapOf<Pair<Int,Int>,String>()

    bfs(ans)

    val n = readLine()!!.toInt()
    for (i in 1..n) println(ans[Pair(readLine()!!.toInt(2),2)])
}

fun bfs(ans:HashMap<Pair<Int,Int>,String>) {
    val (x, y, z) = listOf(0b00001111, 0b00110011, 0b01010101)
    val findQueue = LinkedList<Pair<Int, Int>>()
    fun update(pos:Pair<Int,Int>, value: String) {
        if (value shrt ans[pos].orEmpty()) {
            ans[pos] = value
            findQueue.addLast(pos)
        }
    }
    ans[Pair(x,0)] = "x";ans[Pair(y,0)] = "y";ans[Pair(z,0)] = "z"
    findQueue.addAll(listOf(Pair(x,0),Pair(y,0),Pair(z,0)))
    while (findQueue.isNotEmpty()) {
        val pos = findQueue.removeFirst()
        val cur = ans[pos]!!
        val (position,priority) = pos

        if (priority == 0) update(Pair(position xor 255,0),"!$cur")
        update(Pair(position,0),"($cur)")
        for (it in priority + 1..2) update(Pair(position,it),cur)
        listOf(Pair(x, "x"), Pair(y, "y"), Pair(z, "z")).forEach {
            when (priority) {
                1 -> ans.filterKeys { it.second<=1 }.forEach { k, v ->
                    update(Pair(position and k.first,1), minOf("$cur&$v","$v&$cur"))
                }
                2 -> ans.filterKeys { it.second<=2 }.forEach { k,v ->
                    update(Pair(position or k.first,2), minOf("$cur|$v","$v|$cur"))
                }
            }
        }
    }
}

infix fun String.shrt(b:String) =
        b.isEmpty() || this.length < b.length || this.length == b.length && this<b