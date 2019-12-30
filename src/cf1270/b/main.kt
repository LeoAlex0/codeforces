package cf1270.b

fun main() {
    repeat(readLine()!!.toInt()) {
        readLine()
        val arr = readLine()!!.split(' ').map { it.toInt() }

        var (mino, mini, maxo, maxi) = arrayOf(arr[0], 0, arr[0], 0)
        arr.forEachIndexed { i, x ->
            if (i == 0) return@forEachIndexed
            if (x - i > mino) {
                println("YES")
                println("${mini+1} ${i+1}")
                return@repeat
            } else {
                mini = i
                mino = x - i
            }

            if (x + i < maxo) {
                println("YES")
                println("${maxi+1} ${i+1}")
                return@repeat
            } else {
                maxi = i
                maxo = x + i
            }
        }
        println("NO")
    }
}