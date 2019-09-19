package functions

fun main(args: Array<String>) {
    var a = 10 //a ref to 10
    var b: Int = a //b ref to 10 too
    println(b)

    var arrA = arrayOf(1, 2, 3, 4, 5)
    var arrB = arrA
    arrB[2] = 0
    println(arrA[2])
    arrA[1] = 10
    println(arrB[1])
}