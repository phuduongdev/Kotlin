data class Grocery(
    val name: String, val category: String,
    val unit: String, val unitPrice: Double,
    val quantity: Int
)

fun main(args: Array<String>) {
    val groceries = initGroceries()
//    calculateBuildin(groceries)
//    filterAndViewBuildin(groceries)
//    groupByBuildin(groceries)
//    foldBuildin(groceries)
//how much will be spent on vegetables
    var spentOnVegatables = groceries
        .filter { it.category == "Vegetable" }
//        .fold(0.0) { spent, item -> spent + (item.unitPrice * item.quantity) }
        .sumByDouble { it.unitPrice * it.quantity }
    println("Spent on Vegetable: $spentOnVegatables")
//    Create a List containing the name of each item whose total price is less than 5.0
    var itemslt5 = groceries
        .filter { (it.unitPrice * it.quantity) < 5.0 }
        .map { it.name }
    println("Items have total price is less than 5.0: ${itemslt5}")
//    Print the total cost of each category.
    println("The total cost of each category:")
    groceries
        .groupBy { it.category }
        .forEach { category ->
            //            var total = it.value.fold(0.0) { sum, item -> sum + (item.unitPrice * item.quantity) }
            var total = category.value.sumByDouble { item ->
                item.unitPrice * item.quantity
            }
            println("${category.key}: $total")
        }
//    Print the name of each item that doesn’t come in a bottle, grouped by unit.
    println("Name of each item that does not come in a bottle, group by unit: ")
    groceries
        .filterNot { it.unit == "Bottle" }
        .groupBy { it.unit }
        .forEach { unit ->
            println(unit.key)
            unit.value.forEach { item ->
                println("\t${item.name}")
            }
        }


}

fun foldBuildin(groceries: List<Grocery>) {
//    val ints = listOf(1, 2, 3)
//    val sumOfInts = ints.fold(0, { sum, item -> sum + item })
//    println("Sum of ints: $sumOfInts")
//
//    val productOfInts = ints.fold(1, { multi, item -> multi * item })
//    println("Product of ints: $productOfInts")

    val names = groceries.fold("") { string, item -> string + " ${item.name}" }
    println("Names: $names")

    val totalPrice = groceries.fold(0.0) { sum, item -> sum + item.quantity * item.unitPrice }
    println("Total price: $totalPrice")

    val changeFrom50 = groceries.fold(50.0) { change, item -> change - (item.unitPrice * item.quantity) }
    println("Change from 50: $changeFrom50")
}

fun groupByBuildin(groceries: List<Grocery>) {
    groceries.groupBy { it.category }.forEach { it ->
        println(it.key)
        it.value.forEach { println("\t${it.name}") }
    }
}

fun filterAndViewBuildin(groceries: List<Grocery>) {
    val vegatables = groceries.filter { it.category == "Vegetable" }
    println("Vegetable: $vegatables")
    val notFrozen = groceries.filterNot { it.category == "Frozen" }
    println("Not frozen: $notFrozen")

    val groceryNames = groceries.map { it.name } //return a list
    println("Grocery names: $groceryNames")

    val halfUnitPrice = groceries.map { it.unitPrice * 0.5 }
    println("Half Unit Price: $halfUnitPrice")

    val newPrices = groceries
        .filter { it.unitPrice > 3.0 }
        .map { it.unitPrice * 2 }
    println("New Prices: $newPrices")

    println("Grocery names: ")
    groceries.forEach { println(it.name) }

    println("Groceries with unit price > 3.0: ")
    groceries
        .filter { it.unitPrice > 3.0 }
        .forEach { println(it.name) }

    var itemNames = ""
    groceries.forEach { itemNames += "${it.name} " }
    println("Item names: $itemNames")
}

fun calculateBuildin(groceries: List<Grocery>) {
    val highestUnitPrice = groceries.maxBy { it.unitPrice }
    println("Highest unit price: $highestUnitPrice")
    val lowestQuantity = groceries.minBy { it.quantity }
    println("Lowest Quantity: $lowestQuantity")

    val sumQuantity = groceries.sumBy { it.quantity }
    println("Sum of quantity: $sumQuantity")
    val totalPrice = groceries.sumByDouble { it.quantity * it.unitPrice }
    println("Total price: $totalPrice")
}

fun initGroceries(): List<Grocery> {
    return listOf(
        Grocery("Tomatoes", "Vegetable", "lb", 3.0, 3),
        Grocery("Mushrooms", "Vegetable", "lb", 4.0, 1),
        Grocery("Bagels", "Bakery", "Pack", 1.5, 2),
        Grocery("Olibe oil", "Pantry", "Bottle", 6.0, 1),
        Grocery("Ice cream", "Frozen", "Pack", 3.0, 2)
    )
}

