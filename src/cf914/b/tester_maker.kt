package cf914.b

import cf914.a.println

fun main(a:Array<String>){
    println(10000);print("1 ")
    Array(10000){it+1}.joinToString(" ").println()
}