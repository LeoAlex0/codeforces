package cf939.a

fun main(args:Array<String>){
    readLine()
    val a=readLine()!!.split(' ').map { it.toInt()-1 }.toIntArray()

    println(if (a.any { a[a[a[it]]]==it }) "YES" else "NO")
}