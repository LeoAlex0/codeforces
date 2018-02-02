package cf918.a

fun main(args:Array<String>){
    val n=readLine()!!.toInt()
    val fib = Array(n){it+1}
    (2 until n).forEach { fib[it]=fib[it-1]+fib[it-2] }
    println(Array(n){ if(fib.contains(it+1)) 'O' else 'o' }.joinToString(""))
}