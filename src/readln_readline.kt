fun main(){
    var num = readLine()!!.toInt()
    var num2 = readln().toInt()
    /**
     * readLine can not be null ! but
     * readln can be null and return ""
     */

    println("minimum is : ${Math.min(num, num2)}")

}