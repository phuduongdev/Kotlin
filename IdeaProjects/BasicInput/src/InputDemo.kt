fun main() {
    print("Nhap du lieu tu ban phim: ")
    var data:String? = readLine() //String la kieu mac dinh
    println("Chuoi vua nhap vao: $data")
    println("")

    var a:Double = 0.0
    var b:Double = 0.0
    print("nhap so a: ")
    var stringOfNumber = readLine()
    if(stringOfNumber != null){
        a = stringOfNumber.toDouble()
    }
    print("nhap so b: ")
    stringOfNumber = readLine()
    if (stringOfNumber != null){
        b = stringOfNumber.toDouble()
    }
    println(a==b)
}