package cf918.b

fun main(args:Array<String>){
    val (n,m) = readLine()!!.split(" ").map { it.toInt() }
    val map= hashMapOf<String,String>()
    map.putAll(Array(n){ val (a,b) = readLine()!!.split(" ");Pair(b,a) })
    (1..m).forEach {
        val (a,b) = readLine()!!.split(" ")
        println("$a $b #${map[b.removeSuffix(";")]}")
    }
}