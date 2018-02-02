package cf868.a
import java.util.*

fun main(args:Array<String>){
    val input = Scanner (System.`in`)
    val passwd = input.next()
    val n=input.nextInt()
    val dat = Array(n){""}
    (0 until n).forEach {
        dat[it] = input.next()
    }
    if (dat.any { it.contains(passwd) } ||
            (dat.any { passwd.endsWith(it[0]) } && dat.any { it.endsWith(passwd[0]) }))
        println("YES")
    else println("NO")
}