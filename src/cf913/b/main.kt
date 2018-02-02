package cf913.b

import java.util.*

fun main(a:Array<String>){
    val input = Scanner(System.`in`)
    val parent = Array(input.nextInt()){ if (it==0) -1 else input.nextInt()-1 }
    val childNum = Array(parent.size){0}
    parent.forEach { if (it!=-1) childNum[it]++ }
    val ans = Array(parent.size){0}
    (0 until parent.size).filter { childNum[it]==0 }.forEach {
        ans[parent[it]]++
    }
    if ((0 until parent.size).all { childNum[it]==0 || ans[it]>=3 }){
        println("Yes")
    } else {
        println("No")
    }
}