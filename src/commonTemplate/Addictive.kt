package commonTemplate

interface Addictive<T>{
    operator fun plusAssign(other: T)
    operator fun unaryMinus():T
}