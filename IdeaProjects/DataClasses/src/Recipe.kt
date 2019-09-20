data class Recipe(val title: String,
                  val mainIngredient: String,
                  val isVegatarian: Boolean = false,
                  val difficult: String = "Easy")

class Mushroom(val size:Int,
               val isMagic: Boolean){
    constructor(isMagicSC: Boolean):this(0, isMagicSC){
        //todo code run when secondary constructor is called
    }
}

fun main(args: Array<String>) {
    val r1 = Recipe("Thai Curry", "Chicken")
    val r2 = Recipe(title = "Thai Curry", mainIngredient = "Chicken")
    val r3 = r1.copy(title = "Bhuna")

    println("Recipe 1 have hasCode() : " + r1.hashCode())
    println("Recipe 2 have hasCode() : " + r2.hashCode())
    println("Recipe 3 have hasCode() : " + r3.hashCode())

    println(r1.toString())
    println(r2.toString())
    println(r3.toString())

    println("r1 == r2? ${r1 == r2}") //only check same data of a data class
    println("r1 === r2? ${r1 === r2}") //check same data and reference to same location
    println("r1 == r3? ${r1 == r3}")

    //Destructuring a data object splits it into its component parts
    val (title, mainIngredient, vegetarian, difficult) = r3
    println("Destructuring r3... Title is $title and Vegatarian is $vegetarian")

    val m1 = Mushroom(6, false)
    println("m1 size is ${m1.size} and isMagic is ${m1.isMagic}")
    val m2 = Mushroom(true)
    println("m1 size is ${m2.size} and isMagic is ${m2.isMagic}")
}

//This is an example of a function that uses default parameter values
fun findRecipes (title: String = "",
                 ingredient: String = "",
                 isVegatarian: Boolean = false,
                 difficult: String = "") : Array<Recipe> {
    return arrayOf(Recipe(title, ingredient, isVegatarian, difficult))
}