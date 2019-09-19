package classes.and.objects

import classes.and.objects.animals.Hippo
import classes.and.objects.animals.canines.Wolf

class Vet {
    fun giveShot(animal: Animal) {
        animal.makeNoise()
    }
}

fun main(args: Array<String>) {
    val animalArray = arrayOf(Hippo(), Wolf())
    for (item in animalArray) {
        item.roam()
        item.eat()
    }

    val vet = Vet()
    vet.giveShot(Wolf())
    vet.giveShot(Hippo())
}