package cf939.c

fun main(args:Array<String>){
    val n=readLine()!!.toInt()
    val arr= readLine()!!.split(' ').map { it.toInt() }.toList()
    val (s,f) = readLine()!!.split(' ').map { it.toInt()-1 }

    var sum=arr.subList(s,f).sum()
    val ans=(0 until n).map { sum+=arr[(f+it)%n]-arr[(s+it)%n];sum }
            .reversed().withIndex().maxBy { it.value }!!.index+1

    println(ans)
}