// Conditional Expressions are commands that handle decisions . In conditionals code is dynamic as it behaves differently in different conditions
// If/else statements are used when you want a program to perform different actions based on a condition
// The anatomy of an if statement is:
//      if (CONDITION) {    BODY    }
// The condition is expressed with a Boolean expression. Expressions combine values, variables and operators that return a boolean value.
// Boolean expressions are constructed with comparison operators e.g 1==1, which compares values or variables on both sides of the equation.

// Example: Write an if statement for the red traffic-light condition:
//  1. Inside the main() function, create a trafficLightColor variable and assign it a "Red" value:
fun main (){
    val trafficLightColor = "Black"

//    2. Add an if statement for the red traffic-light condition and then pass it a trafficLightColor == "Red" expression:
//    3. In the body of the if statement, add a println() function and then pass it a "Stop" argument:
    if (trafficLightColor == "Red"){
        println("Stop")
    }

// We are able to add an "ELSE" branch to the above 'if' expression.
// The anatomy of the if/else statement is:
//      if (CONDITION) {
//             BODY 1
//         } else {
//              BODY 2
//         }
// Body 2 executes the condition when the if branch is false
  else    {
        println("Go")
    }

// When you face multiple decision points, you need to create conditionals with multiple layers of conditions, using the else if branch
// The anatomy of the if/else with multiple else if branches is:
//      if (CONDITION) {
//             BODY 1
//         }    else if( CONDITION 2){
//             BODY 2
//         }    else if( CONDITION 3){
//             BODY 3
//         }    else {
//              BODY 4
//         }
// The if statement can also contain the if branch and else if branches without any else branch:
//      if (CONDITION) {
//             BODY 1
//         }    else if( CONDITION 2){
//             BODY 2
//         }

    if (trafficLightColor == "Red"){
        println("Stop")
    } else if (trafficLightColor == "Yellow"){
        println("Slow Down")
    } else if (trafficLightColor == "Green"){
        println("Go")
    } else {
        println("Invalid color")
    }
}