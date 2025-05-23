import kotlin.properties.Delegates

fun main(){
    // here are some ways to make a variable
    var num : Int
    var num2 : Int? = null
    

    // Delegates will make this variable if we want to use it . Not now !!!!
    // this Variable will never accept null !
    var num3 by Delegates.notNull<Int>()
}