package cf917.b

fun main(args:Array<String>){
    val(n,m) = readLine()!!.split(" ").map { it.toInt() }
    (1..m).forEach {
        val (a, b, c) = readLine()!!.split(" ")
        graph[a.toInt()] = graph.getOrDefault(a.toInt(), hashSetOf())
                .apply { add(Pair(b.toInt(), c.first())) }
    }

    (1..n).forEach { posPos->
        (1..n).forEach { negPos->
            print(if (sg(Situation(posPos,negPos,'a'))==0) 'B' else 'A')
        }
        println()
    }
}

val graph = hashMapOf<Int,HashSet<Pair<Int,Char>>>()
val sgHashMap= hashMapOf<Situation,Int>()
fun sg(cur:Situation):Int = sgHashMap[cur]?:graph[cur.posPos].orEmpty().filter { it.second>=cur.prevChar }
        .map {
            sg(Situation(cur.negPos, it.first, it.second))
        }.mex().also { sgHashMap[cur] = it }

data class Situation(val posPos:Int,val negPos:Int,val prevChar: Char)

fun List<Int>.mex() = this.toSet().let{set-> (0..Int.MAX_VALUE).first { !set.contains(it) }}