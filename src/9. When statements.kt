// When is used when you are dealing with multiple clauses (else if) but want to increase readability.
// When statements are preferred when there are more than 2 branches:
//      when (PARAMETER) {
//            CONDITION 1 -> BODY 1
//            CONDITION 2 -> BODY 2
//            CONDITION 3 -> BODY 3
//          }

fun main(){
    val trafficLightColor = "Black"
    when (trafficLightColor){
        "Red" -> println("Stop")
        "Yellow" -> println("Wait")
        "Green" -> println("Go")
        else -> println("Invalid traffic-light color")
    }

// Besides the comma (,) symbol to denote multiple conditions, you can also use the in keyword and a range of values in when branches.
    val number = 10
    when (number){
        1,2,3,4,5,6,7,8,9 -> println("The number is a single digit")
        in 10..56 -> println("Not here")
        //58...100 -> println("Passed it")
        else -> println("Got it")
    }

// use the is keyword as a condition to check the data type of an evaluated value.
    val x: Any = 98 //try true, 9
    when (x) {
        2, 3, 5, 7 -> println("x is a prime number between 1 and 10.")
        in 1..10 -> println("x is a number between 1 and 10, but not a prime number.")
        is Int -> println("x is an integer number, but not between 1 and 10.")
        else -> println("x isn't an integer number.")
    }
}