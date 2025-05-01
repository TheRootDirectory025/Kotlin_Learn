fun main(){
    // Kotlin has Null safety Option and we can not use a null variable by default
    // but we can create it like this
    var x = null
    // the type will be nothing? and we can not never initial it again !
    // but we can make null variable like this
    var num : Int? = null
    var num2 = null as Int?



    // we can also make sure compiler that a variable will not be null with this Syntax
    print(num!! * num2!!)

}