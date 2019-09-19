fun main(args: Array<String>) {
    println("Nhap vao diem cua ban: ")
    var data = readLine()
    // if else hoat dong nhu mot bieu thuc tra ve ket qua (thay the ?:)
    var score: Double = if (data != null) {
        data.toDouble()
    } else {
        0.0
    }
    if (score >= 5) println("Pass")
}