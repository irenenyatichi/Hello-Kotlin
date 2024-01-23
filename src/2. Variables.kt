val soda = 7
var hotdog = 10

fun main(){
//    Variables are used to store data
//            val = read-only variables
//            var = mutable variables
    val popcorn = 5 // Definite 5 boxes of popcorn val popcorn = 10 // This is for test purposes since val is immutable
    var customers = 12 // Mutable number of customers
    val hotdog = 9

    // Let's reassign the customers to see how var works
    customers = 15

    // Let's print the above to see what are the results
    println(popcorn)
    println(customers)
    println(soda)
    println(hotdog)

    //Results
    5
    15
    7
    9

    //Variables can be declared outside the main() fun. They are said to be declared top level. Example is soda
    //All variables are declared as read-only (val) by default. Declare mutable variables (var) only if necessary
}

