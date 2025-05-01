fun main(){
    var num = 12.567f
    println(num.toString())
    println(num.toInt())

    // we can use ? for nullable variables with methods ex)
    var x :Int? = null

    x?.toFloat()
}