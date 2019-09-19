package entities

import entities.animals.Hippo
import entities.animals.canines.Wolf


class Vet {
    fun giveShot(animal: Animal) {
        animal.makeNoise()
    }
}

fun main(args: Array<String>) {
    val arr = arrayOf(Hippo(), Wolf(), Vehicle())
    for (item in arr) {
        item.roam()
        if (item is Animal){
            item.eat()
        }
    }

    val vet = Vet()
    vet.giveShot(Hippo())
    vet.giveShot(Wolf())
}