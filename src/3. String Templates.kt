// String templates expressions are used to access data stored in variables and other objects and convert them into strings
// A string value is a sequence of characters in double quotes " "
// Template expressions always start with a dollar sign $
// To evaluate a piece of code in template expression, place the code within curly braces{ } after the dollar sign $

fun main(){
    val customers = 10
    println("There are $customers customers today")
    //Result : There are 10 customers today
    println("There are ${customers +2} customers today")
    //Result : There are 12 customers today
    println("There are {$customers + 2} customers today")
    //Result : There are {10 + 2} customers today

    val name = "Mary"
    val age = 20
    // The result should be Mary is 20 years old

    println("$name is $age years old today")
}