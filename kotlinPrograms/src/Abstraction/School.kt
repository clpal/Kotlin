package Abstraction

abstract  class Student(name: String,age: Int){

    //constractor
    init {
        println("Student name: $name")
        println("Student Age: $age")
    }
    //non abstract
fun func(){
        println("Non abstract fun of abstract class")
    }
    // abstract function
    abstract fun demo(rollno:Int):Int
}
class College(name: String,age: Int): Student(name,age){
    override fun demo(rollno: Int): Int {
        TODO("Not yet implemented")
        print(rollno)
    }

}

fun main(args:Array<String>) {
    val clg= College("chhote",30)
    clg.demo(12)
    clg.func()

}