package abstractClassesAndInterface.animals

import abstractClassesAndInterface.Animal

abstract class Canine : Animal() {
    override fun roam() {
        println("The Canine is roaming")
    }
}