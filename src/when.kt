fun main() {
    var day: Int = readln().toInt()


    // switch-case in kotlin is just like that
    when (day) {
        1 -> {
            println("Monday")
        }

        2 -> {
            println("Tuesday")
        }

        3 -> {
            println("Wednesday")
        }

        4 -> {
            println("Thursday")
        }

        5 -> {
            println("Friday")
        }

        6 -> {
            println("Saturday")
        }

        7 -> {
            println("Sunday")
        }
    }


    val name: String = readln()


    // if one of conditions runs after that others will never run !
    when {
        day == 1 -> {}
        name == "mohsen" -> {}
        true -> {}
    }

    var age: Int = readln().toInt()

    // we can have else in when
    when {
        age > 18 -> {}
        name == "ali" -> {}
        else -> {}
    }

    // we can use in just like that
    if (age in 1..10) {

    } else if (age in 11..25) {

    }
    when (age) {
        in 1..10 -> {}
        in 11..25 -> {}
        in 25..35 -> {}

    }


}