package functions

import java.util.*

fun main(args: Array<String>) {
    println("****** Tro choi keo bua bao *******")
    val options = arrayOf("Rock", "Paper", "Scissors")
    val gameChoice = getComputerChoice(options)
    val userChoice = getUserChoice(options)
//    println(userChoice)
}

fun getComputerChoice(options: Array<String>): String {
    val choiceOfComputer = (Math.random() * options.size).toInt()
    println("may tinh da chon ngau nhien mot trong 3 loai")
    return options[choiceOfComputer]
}

fun getUserChoice(options: Array<String>): String {
    var yourTurn = ""
    var isValidChoice = false
    while (!isValidChoice) {
        print("Please enter one of the following:")
        for (item in options) print(" $item")
        print(".")

        yourTurn = readLine().toString()
        if (yourTurn != null && yourTurn in options) {
            isValidChoice = true
        }
        if (!isValidChoice) println("Plz Choose again.")
    }
    return yourTurn
}

fun displayResult(choiceOfComputer: String, choiceOfHuman: String) {

}