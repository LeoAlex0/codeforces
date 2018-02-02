package cf748.b

import java.util.*

fun main(args:Array<String>){
    val dat=Array<Char?>(26){null}
    val input = Scanner(System.`in`)

    if (swappableArray(input.next(), input.next(), dat)) {
        val ans = (0 until dat.size).filter { dat[it]!=null && dat[it]!!-'a'<it }
        println(ans.size)
        ans.forEach { println("${dat[it]} ${'a'+it}") }
    }
    else println(-1)
}

val swappableArray={src:String,dest:String,map:Array<Char?> ->
    src.length == dest.length &&
    (0 until src.length).all{ idx ->
    (map[src[idx]-'a']?:dest[idx] == dest[idx]).apply { map[src[idx]-'a']=dest[idx] } &&
            (map[dest[idx]-'a']?:src[idx] == src[idx]).apply { map[dest[idx]-'a']=src[idx] }
}}