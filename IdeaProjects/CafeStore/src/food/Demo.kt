package food

import food.controller.FoodList

fun main(args: Array<String>) {
    var menus = FoodList()
    println("*** Thuc don hom nay ***")
    for (item in menus.foodList!!.iterator()) println("item.toString()")

    print("Chon mon di thim: ")
    var userChoice = readLine()
}