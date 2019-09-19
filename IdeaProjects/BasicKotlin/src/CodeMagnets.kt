/*
Somebody used fridge magnets to write a useful new main function that prints
the String “YabbaDabbaDo”.
*/
fun main(args: Array<String>) {
    var x = 1;
    while (x < 3) {
        print(
            if (x == 1) "Yab" else "Dab"
        )
        print("ba")
        x++
    }
    if (x == 3) println("Do")

    val lambdaEx: (String) -> Unit = { a -> println(a) }
    lambdaEx("test")
}