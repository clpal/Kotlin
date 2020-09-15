package HigherOrderFunctions

fun add(a:Int,b:Int,c:Int ):Int{
    return a+b+c

}
//higher-order function declaration

fun highOrderfun( funt:((Int,Int,Int)->Int)){



    println(add(1,2,3))
}
fun main(a:Array<String>) {
    highOrderfun(::add)
}