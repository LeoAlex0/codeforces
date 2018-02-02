package cf914.b

fun main(args:Array<String>){
    val (p1,p2) = listOf("Conan","Agasa")
    readLine()
    val init = sortedMapOf<Int,Int>()
    readLine()!!.split(' ').map { it.toInt() }.forEach {
        init[it] = ((init[it]?:0)+1)%2
    }
    println(if (init.any { it.value != 0 }) p1 else p2)
}