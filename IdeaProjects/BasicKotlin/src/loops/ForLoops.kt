package loops

fun main(args: Array<String>) {
    println("for with range")
    for (i in 1..10) print("$i ")

    println("\nFor with until")
    for (i in 1 until 10) print("$i ")

    println("\nUse downTo to reverse the range")
    for (i in 10 downTo 1) print("$i ")

    println("\nUse step")
    for (i in 1..20 step 2) print("$i ")
    println()
    for (i in 20 downTo 1 step 2) print("$i ")
}