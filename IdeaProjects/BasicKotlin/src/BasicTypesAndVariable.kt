fun main(args: Array<String>) {
    var myArr = arrayOf(1, 2, 3)

    println("size of myArr: ${myArr.size}")
    println("element number 2 of myArr is: ${myArr[2]}")

    val immutableArr = arrayOf(1, 2, 3)
//    immutableArr = arrayOf(4,5,6) //compile error
    immutableArr[1] = 4
//    print(immutableArr)
    for (e in immutableArr) print(e)
}