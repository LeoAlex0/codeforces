package commonTemplate

fun<T> listOf(size: Int,init: (Int) -> T) = (0 until size).map(init)
