open class myparentclass{
    val dad= "he likes watching soccer"
     val mum= "she liles cooking"
}
class myboyclass:myparentclass(){
    fun myboy(){
        println(dad)
    }
}
class mygirlclass:myparentclass(){
    fun mygirl(){
        println(mum)
    }
}

fun main(args: Array<String>) {
    val kijana=myboyclass()
    kijana.myboy()
}