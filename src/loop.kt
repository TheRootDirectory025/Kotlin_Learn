fun main(){

    // step will never be negative !
    for(i in 1..10){
        print("$i ")
    }
    println()
    for(i in 10 downTo 1){
        print("$i ")
    }
    println()
    for(i in 10 downTo 1 step 2){
        print("$i ")
    }
    println()
    for(i in 1 until 10 step 2){
        print("$i ")
    }
    println()
    for(i in 10..<100 step 10){
        print("$i ")
    }
    println()

    var counter : Int = 0

    while (counter>0){
        print("$counter ")
        counter++
    }

    var counter2 : Int = 0

    do {
        print("$counter2 ")
    } while (counter2<0)


}