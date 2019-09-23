package food.controller

import food.model.Food

open class FoodList {
    var foodList: MutableList<Food>? = null

    constructor() {
        foodList = mutableListOf(
            Food("f1", "Ga Kho", 22000.0),
            Food("f2", "Thit Heo Kho Tieu", 20000.0),
            Food("f2", "Thit Kho Mang", 20000.0)
        )
    }

    fun goiMon(food: Food): Food? {
        return foodList?.get(foodList!!.indexOf(food))
    }
}