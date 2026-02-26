import kotlin.system.exitProcess

class Distance(val meters: Int) {
    operator fun plus(other: Distance): Distance {
        val sum = meters + other.meters
        return Distance(sum)
    }
}

class Score (private var points: Int) {
    operator fun plusAssign(number: Int) {
        points += number
    }

    fun getPoints() = points
}

class Level(val number: Int) {
    operator fun compareTo(other: Level): Int {
        return number.compareTo(other.number)
    }
}

class User(val id: Int, val name: String) {
    override operator fun equals(other: Any?): Boolean {
        if (other !is User) return false
        return id == other.id
    }
}

infix fun Int.with(number: Int): Int {
    return "$this$number".toInt()
}

infix fun Int.without(number: Int): Int {
    return "$this".replace("$number", "").toInt()
}

fun main() {
    val distance = Distance(10)
    val otherDistance = Distance(20)
    val result = distance+otherDistance
    println(result.meters)

    val score = Score(1)
    score += 3
    println(score.getPoints())

    val uran = Level(1)
    val cezium = Level(1)

    println(uran < cezium)

    val user1 = User(1, "Mike")
    val user2 = User(13, "Aloha")
    println(user1 == user2)

    println(10 with 20)

    println(99123123 without 123123)
}
