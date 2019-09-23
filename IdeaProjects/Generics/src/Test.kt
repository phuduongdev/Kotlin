import pets.Cat
import contests.Contest
import pets.Dog
import pets.Fish
import pets.Pet
import retailers.CatRetailer
import retailers.DogRetailer
import retailers.FishRetailer
import retailers.Retailer
import vets.Vet

fun main(args: Array<String>) {
    val catFuzz = Cat("Fuzz Lightyear")
    val catKatsu = Cat("Katsu")
    val fishFinny = Fish("Finny McGraw")

    val catVet = Vet<Cat>()
    val fishVet = Vet<Fish>()
    val petVet = Vet<Pet>()

    catVet.traat(catFuzz)
    petVet.traat(catKatsu)
    petVet.traat(fishFinny)

    val catContest = Contest<Cat>(catVet)
    catContest.addScore(catFuzz, 50)
    catContest.addScore(catKatsu, 40)
    val topCat = catContest.getWinners().first()
    println("Cat contest winner is ${topCat.name}")

    val petContest = Contest<Pet>(petVet)
    petContest.addScore(catFuzz, 50)
    petContest.addScore(fishFinny, 52)
    val topPet = petContest.getWinners().first()
    println("Pet contest winner is ${topPet.name}")

    //use in with generics to add a supertype to subtype
    val fishContest = Contest<Fish>(petVet)

    val dogRetailer: Retailer<Dog> = DogRetailer()
    val catRetailer: Retailer<Cat> = CatRetailer()
    //use out with generics to make a supertype with subtype
    val petRetailer: Retailer<Pet> = FishRetailer()
    dogRetailer.sell()
    catRetailer.sell()
    petRetailer.sell()
}