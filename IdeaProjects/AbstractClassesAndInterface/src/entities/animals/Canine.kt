package entities.animals

import entities.Animal

abstract class Canine : Animal() {
    override fun roam() {
        println("The Canine is roaming")
    }
}