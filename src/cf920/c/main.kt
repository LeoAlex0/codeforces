package cf920.c

fun main(args:Array<String>){
    val n= readLine()!!.toInt()
    val dat= readLine()!!.split(" ").map { it.toInt() }

    var last= -1
    val listRange = mutableListOf<IntRange>()
    val idxSet= mutableSetOf<Int>()
    readLine()!!.forEachIndexed { index, c ->
        if (c=='1' && last==-1) {
            last = index
        }
        if (c=='0' && last!=-1) {
            listRange.add(IntRange(last, index))
            last = -1
        }
    }
    if (last!=-1) listRange.add(IntRange(last,n-1))

    last=0
    (0 until n).forEach {
        if (last != listRange.size && it > listRange[last].endInclusive) last++
        if (last==listRange.size || it !in listRange[last]) idxSet.add(it)
    }

    println(if (listRange.all {range-> range.all { dat[it]-1 in range } }
    && idxSet.all { dat[it]==it+1 }) "YES" else "NO")
}