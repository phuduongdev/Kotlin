package loops

fun main(args: Array<String>) {
    basicWhile()
}

fun basicWhile() {
    var i = 0
    while (i < 10) {
        println("Vong lap While thu ${i + 1}")
        i++
    }
}