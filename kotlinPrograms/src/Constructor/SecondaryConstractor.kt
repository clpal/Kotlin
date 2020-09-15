package Constructor
// Secondary constractor
fun main(args:Array<String>) {
Add(3)
Add(1,2)
Add(1,3)

}

class  Add {
    constructor(a: Int):this(a,9){

        println(a)
    }
    constructor( a:Int,b:Int):this(a,b,4){

       print(a+b)
    }
    constructor(a:Int,b:Int,c:Int){

        println(a+b+c)
    }
}