// Sets are unordered and only store unique items that is no duplication of same item in a list
// Read-only set = setOf() function
// Mutable set = mutableSetOf() function

fun main (){

    //Read Only set
    val readonlyfruit = setOf("Orange", "Mango" , "Pineapple" , "Orange")
    println(readonlyfruit)
    //Result:

    //MutableSet
    val mutablefruit = mutableSetOf("Orange", "Mango" , "Pineapple", "Mango")
    println(mutablefruit)
    //Result: [Orange, Mango, Pineapple]

    //Casting
    val castingfruit: MutableSet<String> = mutableSetOf("Orange", "Mango" , "Pineapple", "Mango")
    val fruitLocked: Set<String> = castingfruit
    //Result: [Orange, Mango, Pineapple]

    //Since sets are unordered you can't access a particular item
    //You are however able to count them using the '.count()', used in operation and the  '.add() or .remove() functionality
    val variousfruits = mutableSetOf("Orange", "Mango" , "Pineapple")
    println("This set contains ${variousfruits.count()} number of fruits")
    //Result: This set contains 3 number of fruits
    println("Mango" in variousfruits)
    //Result: true
    variousfruits.add("Passion")
    println(variousfruits)
    //Result: [Orange, Mango, Pineapple, Passion]
    variousfruits.remove("Pineapple")
    println(variousfruits)
    //Result: [Orange, Mango, Passion]
    
}
