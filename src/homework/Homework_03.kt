package homework

class Price(val amount: Int) {

    operator fun times(multiplier: Int): Price {
        return Price(amount * multiplier)
    }
}

fun main() {
    val price = Price(100)
    val total = price * 3

    println(total.amount)
}