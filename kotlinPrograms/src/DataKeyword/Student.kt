package DataKeyword
// Check Data keyword
data class Program(val studentName: String,val age:Int)


fun main(args:Array<String>){
    val stu= Program("Chhote",30)
    val stu1= Program("Chhote",30)
    val stu2= Program("Anju",26)
// check Equal Method
    if(stu.equals(stu1))

    println("Stu is equal to stu1")
    else

        println("Stu is not equal to stu1")

    if (stu.equals(stu2))
        println("Stu is equal to stu2")
    else
    println("Stu is equal to stu2")

// check Hash Code
    println("Hash code of Stu: ${stu.hashCode()}")
    println("Hash code of Stu1: ${stu1.hashCode()}")
    println("Hash code of Stu2: ${stu2.hashCode()}")

    val stu3=stu.copy(studentName = "bhaiya")
    println("stu Name: ${stu.studentName} Age: ${stu.age}")
    println("stu3 Name: ${stu3.studentName} Age: ${stu3.age}")

    // check  to String Method
    println("String to Method" +stu.toString())
 // Check Component N()

    val name=stu.component1()
   val age= stu.component2()
   // val dd=stu.component3()
    println(name)
    print(age)
   // print(dd)
}
