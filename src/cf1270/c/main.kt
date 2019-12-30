package cf1270.c

// two number
fun main(){
    repeat(readLine()!!.toInt()){
        readLine()
        val arr = readLine()!!.split(' ').map(String::toLong)
        val xum = arr.reduce(Long::xor)
        val sum = arr.sum()

        println(2)
        println("$xum ${xum+sum}")
    }
}

// append only one number
/*
fun main() {
    repeat(readLine()!!.toInt()) {
        readLine()
        val arr = readLine()!!.split(' ').map { it.toLong() }
        var xors = arr.reduce(Long::xor) shl 1
        var sums = arr.sum()
        val ans = mutableListOf<Int>()
        var (out, shift) = listOf(0, 0)

        while (xors != 0L || sums != 0L || out != 0 || shift != 0) {
            val (xors_,sums_) = listOf((xors and 1L).toInt(),(sums and 1L).toInt())

            out = sums_ xor xors_ xor out xor shift
            shift = (sums_ and out) or (sums_ and shift) or (out and shift)
            ans.add(out)

            xors = xors shr 1
            sums = sums shr 1
        }

        println(1)
        println(ans.foldRight(0L){ x,rem -> (rem shl 1) or x.toLong() })
    }
}
 */