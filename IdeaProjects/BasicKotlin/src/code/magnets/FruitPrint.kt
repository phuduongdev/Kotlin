package code.magnets

fun main(args: Array<String>) {
    val fruit = arrayOf("Apple", "Banana", "Cherry", "Blueberry", "Pomergranate")
    val index = arrayOf(1, 3, 4, 2)
    var x = 0
    var y: Int
    while (x < 4) {
        y = index[x]
        println("Fruit = ${fruit[y]}")
        x++
    }
}