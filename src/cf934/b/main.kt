package cf934.b

fun main(args:Array<String>){
    var k= readLine()!!.toInt()
    if (k>36) println(-1)
    else{
        while(k>=2){
            print(8)
            k-=2
        }
        if (k==1) print(6)
        println()
    }
}