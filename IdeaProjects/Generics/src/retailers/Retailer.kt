package retailers

interface Retailer<out T> {
    fun sell(): T
}