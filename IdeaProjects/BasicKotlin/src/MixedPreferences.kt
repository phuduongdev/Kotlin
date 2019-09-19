fun main(args: Array<String>) {
    val x = arrayOf(0, 1, 2, 3, 4)
    x[3] = x[2] //0 1 2 2 4
    x[4] = x[0] //0 1 2 2 0
    x[2] = x[1] //0 1 1 2 0
    
    for (i in x) println(i)
}