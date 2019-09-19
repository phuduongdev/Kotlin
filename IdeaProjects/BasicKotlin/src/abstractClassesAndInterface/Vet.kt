package abstractClassesAndInterface

import abstractClassesAndInterface.animals.Hippo
import abstractClassesAndInterface.animals.canines.Wolf


class Vet {
    fun giveShot(animal: Animal) {
        animal.makeNoise()
    }
}

fun main(args: Array<String>) {
    val arr = arrayOf(Hippo(), Wolf())
    for (item in arr) {
        item.roam()
        item.eat()
    }

    val vet = Vet()
    vet.giveShot(Hippo())
    vet.giveShot(Wolf())
}