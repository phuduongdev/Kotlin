package classes.and.objects.animals

import classes.and.objects.Animal

open class Canine : Animal() {
    override fun roam() {
        println("The Canine is roaming")
    }
}