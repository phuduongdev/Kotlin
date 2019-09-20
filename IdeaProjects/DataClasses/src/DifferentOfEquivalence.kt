data class Movie(val title:String, val year:String)

class Song(val title: String, val artist:String)

fun main(args: Array<String>) {
    var m1 = Movie("Black Panther", "2018")
    var m2 = Movie("Avatar", "2009")
    var m3 = Movie("Avatar", "2009")

    var s1 = Song("21 Guns", "Green Day")
    var s2 = Song("So Far Away", "Avenged Sevenfold")
    var s3 = Song("21 Guns", "Green Day")

    println("m2 == m3? ${m2 == m3}") //true because m1 and m2 are same data objects

    println("s1 == s3? ${s1 == s3}") //false because s1 and s3 are not data objects

    var m4 = m1.copy()
    println("m1 == m4? ${m1 == m4}") //true because m1 and m4 have matching property values

    var m5 = m1.copy()
    println("m1 === m5? ${m1 === m5}") //false because m1 and m5 are not same ref to a object

    var m6 = m2
    m2 = m3
    println("m3 == m6? ${m3 == m6}") //true because m2, m3 and m6 are same data objects
}