data class Grocery(
    val name: String, val category: String,
    val unit: String, val unitPrice: Double
)

fun main(args: Array<String>) {
    val groceries = listOf(
        Grocery("Tomatoes", "Vegatable", "lb", 3.0)
        , Grocery("Mushrooms", "Vegatable", "lb", 4.0)
        , Grocery("Bagels", "Bakery", "Pack", 1.3)
        , Grocery("Olive oil", "Pantry", "Bottle", 6.0)
        , Grocery("Ice cream", "Frozen", "Pack", 3.0)
    )
    println("- Expensive ingredients:")
    search(groceries) { i: Grocery -> i.unitPrice > 5 }
    println("- All Vegatables:")
    search(groceries) { i: Grocery -> i.category == "Vegatable" }
    println("- All packs:")
    search(groceries) { i: Grocery -> i.unit == "Pack" }
}

fun search(groceries: List<Grocery>, criteria: (g: Grocery) -> Boolean) {
    for (item in groceries) {
        if (criteria(item)) {
            println(item.name)
        }
    }
}
