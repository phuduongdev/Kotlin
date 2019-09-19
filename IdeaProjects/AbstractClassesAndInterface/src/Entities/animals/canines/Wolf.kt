package abstractClassesAndInterface.animals.canines

import abstractClassesAndInterface.animals.Canine

class Wolf : Canine() {
    override val image: String
        get() = "wolf.jpg"
    override val food: String
        get() = "meat"
    override val habitat: String
        get() = "forests"

    override fun makeNoise() {
        println("Hooooooooooowl!")
    }

    override fun eat() {
        println("The Wolf is eating $food")
    }

}