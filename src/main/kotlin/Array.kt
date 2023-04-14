fun main(args: Array<String>) {
    var myarr= arrayOf("John","mike","caro" ,67,false,'t')
    var myarr1= arrayOf(3,33,7,7,5,1,0,5,7)
    myarr[2]="stacy"
    println("my name is ${myarr[1]}")
    println("my name is "+myarr[2])
    println("My array size is "+myarr.size)
    println("my sorted array is "+myarr1.sorted())
}