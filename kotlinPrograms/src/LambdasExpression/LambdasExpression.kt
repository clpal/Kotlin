package LambdasExpression
fun main(a:Array<String>){
    val square : (Int) -> Int = { value -> value * value }
    val nine = square(3)
    println(nine)
}
