package cf939.b

fun main(args:Array<String>){
    val (k,n) = readLine()!!.split(' ').map { it.toLong() }
    val a = readLine()!!.split(' ').map { it.toLong() }.toLongArray()
    val ans = (0 until n.toInt()).minBy { k%a[it] }
    println("${ans!!+1} ${k/a[ans]}")
}