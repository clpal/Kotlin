package InterfaceExample
interface X1 {

    fun demo() {
        println("demoX function")
    }
}

interface Y1  {
    fun demo() {
        println("demoY function")
    }
}

// This class implements X and Y interfaces
class MyClass1: X1, Y1 {
    override fun demo() {
        super<X1>.demo()
    }

}

fun main(args: Array<String>) {
    val obj = MyClass1()
    obj.demo()
}