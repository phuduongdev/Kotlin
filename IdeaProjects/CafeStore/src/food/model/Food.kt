package food.model

data class Food(var id: String, var name: String, var price: Double) {
    override fun toString(): String {
        return "$id \t\t\t $name \t\t\t $price"
    }
}