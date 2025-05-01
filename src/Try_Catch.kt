fun main() {
    /**
     * we can run danger codes in try block
     * and we can catch the errors in catch block
     * and finally block Always Runs ! even without errors
     */
    var num: Int? = null

    try {
        num!!.toFloat()
    } catch (e: Exception) {
        println(e.message)
    } finally {
        println("this block always runs ! ")
    }
    // the e was a variable with type Exception !
}