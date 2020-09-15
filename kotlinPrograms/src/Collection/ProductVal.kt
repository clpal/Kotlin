package Collection

val product={a:Int,b:Int->a+b}
val sum= product(58,3)
val calculation:(Int,Int,Int)->Int={a,b,c->a+b*c}
val result= calculation(3,4,5)
val lambda4 : String.(Int) -> String = { this + it }
val nums=arrayOf(-3,5,4,46,-9)


fun main(args:Array<String>) {

  val result= nums.filter { a->a>1 }
    print(result)
}