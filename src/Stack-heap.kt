/**
 * in Kotlin we can save our variables into RAM
 * RAM is devided into 2 space Stack and Heap
 *
 * Stack is faster than Heap
 *
 *
 * all of variables stores in Stack With the exception of Class Objects and Strings
 *
 */

fun main(){
    // Stack
    // primitive Datas
    val number : Int = 5
    val number2 : Float = 5.1f




    // Heap
    // none-primitive Datas

    // String Constant Pool
    /***
     * in Heap We have String constant pool
     * String Constant pool stores string variables with same value just like python
     * with same Storage and just a pointer !
     */
    val name : String = "Kotlin"
    val name2 : String = "Kotlin"
    println(System.identityHashCode(name))
    println(System.identityHashCode(name2))


}