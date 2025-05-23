fun main(){
    var number : Int = readLine()!!.toInt()

    if(number == 100 || number % 10 == 0){
        print("if1")
    }
    else if(number % 10 == 1 && number % 10 == 2){
        print("if2")
    }
    else {
        print("else")
    }
}