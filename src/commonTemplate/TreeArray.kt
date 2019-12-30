package commonTemplate

class TreeArray<T: Addictive<T>> (private val size:Int, init:(Int) -> T){
    private val dat:List<T> = listOf(size, init)
    companion object {
        fun lowBit(x:Int) = x and -x
    }

    class RangeAdder<T: Addictive<T>>(private val range: IntRange, private val a: TreeArray<T>) {
        operator fun plusAssign(x: T) {
            val t=-x
            var i=range.first
            while(i<a.size) {
                a.dat[i] += x
                i += lowBit(i)
            }
            i=range.last +1
            while (i<a.size) {
                a.dat[i] += t
                i += lowBit(i)
            }
        }
    }

    operator fun get(index:Int):T{
        var i = index- lowBit(index)

        val ret = dat[index]
        while (i>0){
            ret += dat[i]
            i-= lowBit(i)
        }
        return ret
    }
    operator fun get(range: IntRange) = RangeAdder(range, this)
}