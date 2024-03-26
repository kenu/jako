fun main() {
    val fruits = arrayOf("apple", "banana", "orange")
    for (fruit in fruits) {
        if (fruit == "banana") {
            break
        }
        println(fruit)
    }
}
