package homework

class Toggle(val enabled: Boolean) {

    operator fun not(): Toggle {
        return Toggle(!enabled)
    }
}

fun main() {
    val toggle = Toggle(true)

    val inverted = !toggle

    println("Original: ${toggle.enabled}")
    println("Inverted: ${inverted.enabled}")
}