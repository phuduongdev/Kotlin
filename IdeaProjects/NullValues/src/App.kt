class Wolf {
    var hunger = 10
    var food = "meat"

    fun eat() {
        println("The Wolf is eating $food")
    }
}

class MyWolf() {
    var wolf: Wolf? = Wolf()

    fun eat() {
        wolf?.eat()
    }
}

fun getAlphaWolf(): Wolf? {
    return Wolf()
}

fun main(args: Array<String>) {
    var w: Wolf? = Wolf()

    if (w != null) w.eat()

    var x = w?.hunger
    println("The value of x is $x")
    //use the Elvis operator to set y to the value of hunger.
    //If w is not null, If w is null it set y to -1
    var y = w?.hunger ?: -1
    println("the value of y is $y")

    var myWolf = MyWolf()
    myWolf?.wolf?.hunger = 8
    println("The value of myWolf?.wolf?.hunger is ${myWolf?.wolf?.hunger}")

    var myArray = arrayOf("Hi", "Hello", null)
    for (item in myArray) {
        item?.let { println(it) } //This print the non-null items in the array
    }

    getAlphaWolf()?.let { it.eat() }

    w = null
//    var z = w!!.hunger //this will throw a NullPointerException as w is null
}