package cf914.a

val hashSquare = Array(1001){it*it}.toHashSet()

fun main(args:Array<String>) {
    readLine()
    readLine()!!.split(' ')
            .map { it.toInt() }
            .filterNot { hashSquare.contains(it) }
            .max()!!
            .println()
}

fun Any.println() = println(this)