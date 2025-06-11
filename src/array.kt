fun main() {

    // we can use arrayOf function to make array
    var arr = arrayOf(1, 2, 3, 4)

    var arr2 = arrayOf(
        "mohsen",
        "bagheri",
        1382,
        true,

        )

    /**
     * comparable types :
     *  { int , float , string , boolean }
     *  are comparable
     *  the -> * points to all of comparable types !
     *  comparable will give us ability to compare our datas !
     */
    var arr3: Array<Comparable<*>> = arrayOf(
        "mohsen",
        "bagheri",
        1382,
        true,

        )


    /**
     * we can make array with type Any ro accept out object in it  !
     */
    var arr4: Array<Any> = arrayOf(
        "mohsen",
        "bagheri",
        1382,
        true,

        )
//    arr3.sort()

    // we can not use arithmatic operators with ANY or Comparable Arrays !
    var arr5: Array<Comparable<*>> = arrayOf("ali" , 2 , true)

    // this is false
//    print(arr5[1] * 2)
    // this is the true way
    print(arr5[1] as Int * 2)


    /***
     * we can make a primitive array with primitive types inside it !
     * that will save in the stack !
     */
    var primitive_arr1 = emptyArray<Int>()

    val primitive_arr2 = doubleArrayOf(5.0 , 10.1)

    val primitive_arr3 = booleanArrayOf(true , false)

    val primitive_arr4 = charArrayOf('A' , 'B')


    // all arrays are fixed size !
    // but we can add a new index by create a new arr ! but It's Not a clean Architecture !
    primitive_arr1 = primitive_arr1.plus(5)

    val numbers = arrayOf(10 , "Mohsen" , 20.5)
    for ((index , item) in numbers.withIndex()) {
        println("$index : $item")
    }

    // forEach Loop !
    /***
     * (it) is a itrable variable in this loop and we can rename it too !
     */
    numbers.forEach {
        println(it)
    }
    numbers.forEach {
        i -> println(i)
    }

    // defining a array with its size !
    var nums = Array(5) {
        // default value
        i -> 1
    }




}