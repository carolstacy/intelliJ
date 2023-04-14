class wanafunzi(val name:String,val age:Int,val gender:String){


}

fun main(args: Array<String>) {
    val stu=wanafunzi( name = "carol", age = 17, gender =  "female")
    println("my name is ${stu.name} and i am ${stu.age}years old")

}