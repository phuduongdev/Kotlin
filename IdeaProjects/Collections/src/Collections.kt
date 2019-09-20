data class Recipe(var name: String)

fun main(args: Array<String>) {
//    basicList()
//    codeMagnets()
//    basicSet()
    basicMap()

//    var array = arrayOf(1, 2, 3, 4)

//    var immutable = listOf(1, 2, 3, 4, 5)
//    for (i in immutable) print(" i")
//
//    var mutableList = mutableListOf(1, 3, 3, 2)
//    println(mutableList)
//    mutableList.add(0, 5)
//    mutableList.add(7)
//    mutableList.addAll(array)
//    mutableList.sort()
//    println("sau khi add: $mutableList")
//
//    var mutableSet = mutableSetOf(1, 3, 2, 3)
//    println(mutableSet)
//    mutableSet.addAll(array)
//
//    println("sau khi add $mutableSet")

}

fun basicMap() {
    val r1 = Recipe("Chicken Soup")
    val r2 = Recipe("Quinoa Salad")
    val r3 = Recipe("Thai Curry")
    val r4 = Recipe("Jambalaya")
    val r5 = Recipe("Sausage Rolls")

    val recipeMap = mutableMapOf("recipe1" to r1, "recipe2" to r2, "recipe3" to r3)
    println("Recipe Map original: $recipeMap")

    val recipesToAdd = mapOf("recipe4" to r4, "recipe5" to r5)
    recipeMap.putAll(recipesToAdd)
    println("Recipe Map updated: $recipeMap")

    if (recipeMap.containsKey("recipe1")) {
        println("Recipe 1 is: ${recipeMap.getValue("recipe1")}")
    }
}

fun basicSet() {
    var mShoppingList = basicList();

    val mShoppingSet = mShoppingList.toMutableSet()
    println("mShoppingSet: $mShoppingSet")
    val moreShopping = setOf("Chives", "Spinach", "Milk")
    mShoppingSet.addAll(moreShopping)
    println("mShoppingSet items added: $mShoppingSet")
    mShoppingList = mShoppingSet.toMutableList()
    println("mShoppingList new version: $mShoppingList")
}

// allow store duplicate values
fun basicList(): MutableList<String> {
    val mShoppingList = mutableListOf("Tea", "Eggs", "Milk")
    println("mShoppingList original: $mShoppingList")

    val extraShopping = listOf("Cookies", "Sugar", "Eggs")
    mShoppingList.addAll(extraShopping)
    println("mShoppingList items added: $mShoppingList")

    mShoppingList.sort()
    println("mShoppingList sorted: $mShoppingList")
    mShoppingList.reverse()
    println("mShoppingList reversed: $mShoppingList")
    return mShoppingList
}

/*
The function needs to produce this output.
[Zero, Two, Four, Six]
[Two, Four, Six, Eight]
[Two, Four, Six, Eight, Ten]
[Two, Four, Six, Eight, Ten]
*/
fun codeMagnets() {
    var a: MutableList<String> = mutableListOf()
    a.add(0, "Zero")
    a.add(1, "Two")
    a.add(2, "Four")
    a.add(3, "Six")
    println(a)
    if (a.contains("Zero")) a.add("Eight")
    a.removeAt(0)
    println(a)
    if (a.indexOf("Four") != 4) a.add("Ten")
    println(a)
    if (a.contains("Zero")) a.add("Twelve")
    println(a)
}