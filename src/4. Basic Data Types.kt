//Type inference is Kotlin's ability to infer the data type
// In total Kotlin has the following data types:
//  Category                  Basic Type
//  Integers                    Byte
//                              Short
//                              Int
//                              Long

//  Unsigned Integers           UByte
//                              UShort
//                              UInt
//                              ULong

//  Floating-Point Numbers      Float
//                              Double

//  Boolean                     Booleans

//  Characters                  Char

//  Strings                     String

fun main() {
    
    var customers = 10
    customers = 8
    customers = customers + 3 // Example of addition: 11
    customers += 7 // Example of addition: 18
    customers -= 3 // Example of subtraction: 15
    customers *= 2 // Example of multiplication: 30
    customers /= 3 // Example of division: 10
// +=, -=, *=, /=, and %= are augmented assignment operators.
    println(customers)


    // Variable declared without initialization
        val g: Int
    // Variable initialized
        g = 3
    // Variable explicitly typed and initialized
        val h: String = "hello"
    // Variables can be read because they have been initialized
        println(g) // 3
        println(h) // hello


    val a: Int = 1000
    val b: String = "log message"
    val c: Double = 3.14
    val d: Long = 100_000_000_000_000
    val e: Boolean = false
    val f: Char = '\n'

}
