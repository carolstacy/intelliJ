class students{
//    member data
    val number1:Int=9
    val number2:Int=78
//    member function
    fun calculeSquare():Int{
        return number1*number1
    }
    fun calculeDifference():Int{
        return number2-number1
    }
}

fun main(args: Array<String>) {
//    creating object
    val myobj=students()
    println(myobj.calculeSquare())
    println(myobj.calculeDifference())
}