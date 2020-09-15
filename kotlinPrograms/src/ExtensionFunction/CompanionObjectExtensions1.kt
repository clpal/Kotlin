package ExtensionFunction
class CompanionObjectExtensions1 {
    companion object {
        // member function of companion object
        fun display(str :String) : String{
            return str
        }
    }
}
// extension function of companion object
fun CompanionObjectExtensions1.Companion.abc(){
    println("Extension function of companion object")
}
fun main(args: Array<String>) {
    val ob = CompanionObjectExtensions1.display("Function declared in companion object")
    println(ob)
    // invoking the extension function
    val ob2 = CompanionObjectExtensions1.abc()
}