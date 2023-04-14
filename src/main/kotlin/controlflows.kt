fun main(args: Array<String>) {
//    if statement
//    if...else statement
//    if elseif...statement
    emobilis()
    var num=5
    if (num>20){
        println("its true")
    }else
        println("its false")

    var nambari =4523
    if (nambari<0){
        println("its negative")
    }else if (nambari>0 && nambari<10){
        println("its a single digit number")
    }else if (nambari>=10 && nambari<1000){
        println("its adouble digit number")
    }else
        println("number has 3 or more digits")
}