package cf939.d

fun main(args:Array<String>){
    readLine()
    val a= readLine()!!
    val b= readLine()!!
    val findSet = Array(26){'a'+it}
    val pairs = arrayListOf<Pair<Char,Char>>()

    fun root(a:Char):Char {
        var c=a
        while (c!=findSet[c-'a']) c=findSet[c-'a']
        return c
    }

    a.zip(b).filter { it.first!=it.second }.forEach {
        val ra=root(it.first)
        val rb=root(it.second)
        if (ra!=rb){
            pairs.add(Pair(ra,rb))
            findSet[ra-'a'] = rb
        }
    }

    println(pairs.size)
    pairs.forEach { println("${it.first} ${it.second}") }
}