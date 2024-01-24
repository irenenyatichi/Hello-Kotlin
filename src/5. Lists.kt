//Lists store items in the order they are added and allow for duplicate items
//To come up with a Read-Only list use the 'listOf()' function
//A mutable list is created using the 'mutableListOf()' function
//Kt infers the type of List but one can add it within <> angled brackets after declaration

fun main() {

// Read only list
    val readOnlyShapes = listOf("triangle", "square", "circle")
    println(readOnlyShapes)
// Result: [triangle, square, circle]

// Read only list
    val readOnlyShape: List<String> = listOf("triangle", "square", "circle")
    println(readOnlyShape)
// Result: [triangle, square, circle]

// Mutable list
    val shapes = mutableListOf("triangle", "square", "circle")
    println(shapes)
// Result: [triangle, square, circle]

// Mutable list with explicit type declaration
    val shape: MutableList<String> = mutableListOf("triangle", "square", "circle")
    println(shape)
// Result: [triangle, square, circle]

// To prevent unwanted modifications, you can obtain read only views of mutable lists and assigning them to a List in a process known as casting
    val shapesy: MutableList<String> = mutableListOf("triangle", "square", "circle")
    val shapesyLocked: List<String> = shapesy

// Lists are ordered to access an item in the list using the 'Indexed Access Operator []
// They are numbered from 'Index 0"
    val readOnShapes = listOf("triangle", "square", "circle")
    println("The first shape in the list is ${readOnShapes [0]}")
// Result: The first shape in the list is triangle

// One can use the first() and last() functions respectively
    println("The first shape in the list is ${readOnShapes.first()} while the last one is a ${readOnShapes.last()}")
    //Result: The first shape in the list is triangle while the last one is a circle


// To get the numbers of items on thr list use the 'count()'.
    val readOShapes = listOf("triangle", "square", "circle")
    println("readOShapes has ${readOShapes.count()}")
    //Result: readOShapes has 3

//To check whether an item is in the list
    val readOlShapes = listOf("triangle", "square", "circle")
    println("circle" in readOlShapes)
    //Result: true

// To add remove items from a mutable list use '.add()' and '.remove()')
    val menu: MutableList<String> = mutableListOf("Rice", "Minji", "Carrot")
    menu.add("Chicken")
    println(menu)
    // Result: [Rice, Minji, Carrot, Chicken]
    menu.remove("Minji")
    println(menu)
    // Result: [Rice, Carrot, Chicken]
    menu.removeAt(1)
    println(menu)
    // Result: [Rice, Chicken]
    
}
