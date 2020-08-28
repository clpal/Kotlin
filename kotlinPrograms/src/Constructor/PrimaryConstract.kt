package Constructor

fun main(args:Array<String>) {
//val result=Addition(1,2,3,4).sum

    //println(Addition(1,2,3,4).sum)
    //println(Addition(1,2,3,4).sum)
    Substraction(1,2,3,4)
}

class Addition constructor(a:Int,b:Int,c:Int,d:Int){
    val sum=a+b+c+d


}
class Substraction(a:Int,b:Int,c:Int,d:Int){
    // initilizer
    init {
        println(a+b+c+d)

    }


}