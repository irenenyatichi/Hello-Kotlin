// When you use conditionals as statements, you let each branch execute different actions in the body based on the conditions
// When you use conditionals as expressions to return different values for each branch of condition
// You use expressions when the body of each branch appears similar
// The anatomy of expressions is:
//     val name = if (CONDITION) {
//             BODY 1
//         } else {
//              BODY 2
//         }

//   CONVERT AN 'IF' STATEMENT TO EXPRESSION
// There's a lot of println() statement repetition in this if/else statement:

fun main() {
    val trafficLightColor = "Black"

    if (trafficLightColor == "Red") {
        println("Stop")
    } else if (trafficLightColor == "Yellow") {
        println("Slow")
    } else if (trafficLightColor == "Green") {
        println("Go")
    } else {
        println("Invalid traffic-light color")
    }
// Convert this if/else statement to an if/else expression and remove this repetition:
// Define a message variable and then assign it an if/else statement:
     if (trafficLightColor == "Red") {
        println("Stop")
    } else if (trafficLightColor == "Yellow") {
        println("Slow")
    } else if (trafficLightColor == "Green") {
        println("Go")
    } else {
        println("Invalid traffic-light color")
    }
//    Remove all println() statements and their curly braces, but leave the values inside them:
// Add a println() statement to the end of the program and then pass it the message variable as an argument:
val message =
            if (trafficLightColor == "Red") "Stop"
            else if (trafficLightColor == "Yellow") "Slow"
            else if (trafficLightColor == "Green") "Go"
            else "Invalid traffic-light color"

    println(message)

//   CONVERT A 'WHEN' STATEMENT TO EXPRESSION
    val trafficColor = "Amber"

    val messages = when(trafficColor) {
        "Red" -> "Stop"
        "Yellow", "Amber" -> "Slow"
        "Green" -> "Go"
        else -> "Invalid traffic-light color"
    }
    println(messages)
    }
