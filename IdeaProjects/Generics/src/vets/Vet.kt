package vets

import pets.Pet

class Vet<T : Pet> {
    fun traat(t: T) {
        println("Treat Pet ${t.name}")
    }
}