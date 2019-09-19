package functions

import java.util.*

fun main(args: Array<String>) {
    println("****** Tro choi keo bua bao *******")
    val options = arrayOf("Rock", "Paper", "Scissors")
    val gameChoice = getComputerChoice(options)
    val userChoice = getUserChoice(options)
//    println(userChoice)
    displayResult(gameChoice, userChoice)
}

fun getComputerChoice(options: Array<String>): String {
    var ran = Random()
    val choiceOfComputer = (ran.nextInt(options.size)).toInt()
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

fun displayResult(gameChoice: String, userChoice: String) {
    print("Computer are $gameChoice. You are $userChoice.")
    if (gameChoice == userChoice) println(" Tie!")
    else if (userChoice == "Rock" && gameChoice == "Scissors"
        || userChoice == "Paper" && gameChoice == "Rock"
        || userChoice == "Scissors" && gameChoice == "Paper"
    )
        println(" You Win!")
    else println(" You Lose!")
}