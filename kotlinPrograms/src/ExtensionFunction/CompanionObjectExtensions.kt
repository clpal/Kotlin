package ExtensionFunction

class  MyClass {
    // companion object declaration
    companion  object {
       fun display(){
            println("Function declared in companion object")
        }
        fun display(str :String) : String{
            return str
        }
    }


}

fun main(args:Array<String>){
    //invoking member function
    MyClass.display()

}