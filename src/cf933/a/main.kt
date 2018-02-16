package cf933.a

import kotlin.math.max

fun main(args:Array<String>){
    readLine()

    val ans=IntArray(4){0}
    readLine()!!.split(' ').map { it.toInt()-1 }.forEach {
        //0->0+  1->0*1+    2->0*1*0+   3->0*1*0*1+
        if (it==0){
            ++ans[0]
            ans[2] = max(ans[2],ans[1])+1
        } else {
            ans[1] = max(ans[1],ans[0])+1
            ans[3] = max(ans[3],ans[2])+1
        }
    }
    println(ans.max()!!)
}