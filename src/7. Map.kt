// Maps store/items in key-value pairs
// You access the value by referencing the key which must be unique
// to understand which value which you want to get
// You can duplicate values in a map
// Read-only = mapOf()
// Mutable = mutableMapOf()
// Angle brackets <> can be used to specify type
// The easiest way to create maps is to use 'to' btn key and value

fun main (){

    //Read-Only Map
    val readOnlyJuiceMenu = mapOf("apple" to 100, "kiwi" to 120, "orange" to 80)
    println(readOnlyJuiceMenu)
    // Result: {apple=100, kiwi=120, orange=80}

    //Mutable Map
    val juiceMenu: MutableMap<String, Int> = mutableMapOf("Rice" to 150, "uji" to 100)
    println(juiceMenu)
    // Result: {Rice=150, uji=100}

    //Casting
    val juiceMen: MutableMap<String, Int> = mutableMapOf("Rice" to 150, "uji" to 100)
    var juiceLocked: Map<String, Int> = juiceMen
    println(juiceLocked)
    // Result: {Rice=150, uji=100}

    //Indexed Access Operator
    val readonlyJuice = mapOf("apple" to 100, "kiwi" to 190, "orange" to 200)
    println("The value of apple juice is ${readonlyJuice["apple"]}/=")
    // Result: The value of apple juice is 100/=

    //.count() function
    val readonlyJuic = mapOf("apple" to 100, "kiwi" to 190, "orange" to 200)
    println("There are ${readonlyJuic.count()} types of juice on the menu")
    // Result: There are 3 types of juice on the menu

    //.put() and .remove() Functions
    val readonlyJui: MutableMap<String, Int> = mutableMapOf("apple" to 100, "kiwi" to 190, "orange" to 200)
    readonlyJui.put("coconut", 180)
    println(readonlyJui)
    // Result: {apple=100, kiwi=190, orange=200, coconut=180}
    readonlyJui.remove("apple", 100)
    println(readonlyJui)
    // Result: {kiwi=190, orange=200, coconut=180}
    readonlyJui.remove("orange")
    println(readonlyJui)
    //Result: {kiwi=190, coconut=180}

    //To check if a specific key is already included in the map
    val juiceMe: MutableMap<String, Int> = mutableMapOf("Rice" to 150, "uji" to 100, "apple" to 100, "kiwi" to 190, "orange" to 200)
    println(juiceMe.containsKey("kiwi"))
    // Result: true
    println(juiceMe.containsValue(100))
    // Result: true

    //To obtain specific maps
    val juiceM: MutableMap<String, Int> = mutableMapOf("Rice" to 150, "uji" to 100, "apple" to 100, "kiwi" to 190, "orange" to 200)
    println(juiceM.keys)
    // Result: [Rice, uji, apple, kiwi, orange]
    println(juiceM.values)
    //Result: [150, 100, 100, 190, 200]
}