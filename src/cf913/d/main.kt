package cf913.d

fun main(args:Array<String>){
    val input = System.`in`.bufferedReader()
    val (n,t) = input.readLine().split(' ').map { it.toInt() }
    val dat = Array(n){
        val (ai,ni) = input.readLine().split(' ').map { it.toInt() }
        Problem(it+1,ai,ni) }
    dat.sortBy { it.t }
    val ans = Array(n+1) {it}.binarySearch(t, Comparator{ o1,T ->
        val sumList = dat.filter { it.a>=o1 }.map { it.t }
        if (sumList.size < o1) 1
        else sumList.subList(0,o1).sum().compareTo(T)
    }).let { if (it<0) (it+1).inv() else it }
    println(ans)
    println(ans)
    println(dat.filter { it.a>=ans }.subList(0,ans).map { it.no }.joinToString(" "))
}

data class Problem(val no:Int,val a:Int,val t:Int):Comparable<Problem>{
    override fun compareTo(other: Problem): Int {
        val tc= t.compareTo(other.t)
        return if (tc!=0) tc else -a.compareTo(other.a)
    }
}