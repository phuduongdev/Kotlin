package classes.and.objects.animals.canines

import classes.and.objects.animals.Canine

class Wolf : Canine() {
    override val image = "wolf.jpg"
    override val food = "meat"
    override val habitat = "forests"

    override fun makeNoise() {
        println("Hooooooooooooowl!")
    }

    override fun eat() {
        println("The wolf is eatiing $food")
    }
}