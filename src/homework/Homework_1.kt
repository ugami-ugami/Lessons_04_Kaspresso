package homework

class Inventory {
    private val items = mutableListOf<String>()

    operator fun plus(item: String): Inventory {
        items.add(item)
        return this
    }

    override fun toString(): String {
        return items.toString()
    }

    operator fun get(index: Int): String {
        return items.get(index)
    }

    operator fun contains(target: String): Boolean {
        return items.contains(target)
    }
}

fun main() {
    val inventory = Inventory()
    inventory + "Sword" + "Shield" + "Armor"
    println(inventory)

    println(inventory[1])

    println("Armor" in inventory)
}


