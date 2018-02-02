package cf913.a
import java.util.*


fun main(a:Array<String>){
    val input = Scanner(System.`in`)

    val n=input.nextInt()
    val m= input.nextInt()
    if (n > 31) println(m)
    else println(m % (1 shl n))
}