package cf748.b

import java.util.*
import kotlin.collections.HashMap

fun main(args:Array<String>){
    val input = Scanner(System.`in`)
    val swapMap = HashMap<Char,Char>()

    //put的特性：覆盖并返回之前的值/null
    if (!swappable(input.next(), input.next(), swapMap)){
        println(-1)
        return
    }

    //map可以直接过filter（过滤器？？？）
    val subMap = swapMap.filter { it.key<it.value } //条件改成小于就好了
    println(subMap.size)
    subMap.forEach { t, u -> println("$t $u") }
}

val swappable = {src:String,dest:String,map:MutableMap<Char,Char> ->
    src.length==dest.length && (0 until src.length).all {
        map.put(src[it],dest[it])?:dest[it] == dest[it] &&
                map.put(dest[it],src[it])?:src[it] == src[it]}}