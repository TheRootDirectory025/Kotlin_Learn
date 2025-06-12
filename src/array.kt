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


    /**
     *  if we change a variable value by assigning another object to it
     *  if we change the object values then the main object values will be changed !
     *
     */
    var obj1 = arrayOf<Int>(1, 2, 3)
    var obj2 = arrayOf<Int>(1, 2, 5 , 7)
    obj2 = obj1
    obj2[0] = 1000

    // the value of first unit is changed !
    for (i in obj1) {
        println(i)
    }

    var obj3 = arrayOf<Int>(1, 2, 3 , 10 , 8 , 9 , 17 , 21 , 30)
    var obj4 = arrayOf<Int>(1, 2, 3)

    // the operator == will be like .equals and it compares only hashCodes
    // but contentEquals will compares the values !
    println(obj3.equals(obj4))
    println(obj3==obj4)
    println(obj3.contentEquals(obj4))

    /***
     * we can also make a deepCopy from array
     */
    var obj5 = obj3.reversedArray()
    var obj6 = obj3.sortedArray()
    var obj7 = obj5.copyOf()

    // first returns the first content
    println(obj5.first())
    // last returns the last content
    println(obj5.last())
    // shuffle will change the index of values randomly !
    obj5.shuffle()
    obj5.forEach { println(it) }
    // fill will change values from fromindex to toindex -1 to setted value !
    obj5.fill(99 , 2 , 5)


    // string is a char array and it has methods !
    var name : String = "Mohsen Bagheri"
    println(name.length)
    println(name.plus(" hello"))
    println(name.replace("Mohsen" , "Mahdi"))






}