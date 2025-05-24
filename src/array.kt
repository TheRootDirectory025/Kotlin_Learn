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


}