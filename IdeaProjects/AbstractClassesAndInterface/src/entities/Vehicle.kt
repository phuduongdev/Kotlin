package entities

import entities.common.behavior.Roamable

class Vehicle : Roamable{
//    override var velocity: Int
//        get() = 0
//        set(value) {}

    override fun roam() {
        println("The Vehicle is roaming")
    }

}