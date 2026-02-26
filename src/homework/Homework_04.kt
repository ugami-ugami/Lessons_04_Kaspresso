package homework

class Step(val number: Int) {

    operator fun rangeTo(other: Step): IntRange {
        return number..other.number
    }
}

operator fun IntRange.contains(step: Step): Boolean {
    return step.number in this
}

fun main() {
    val start = Step(1)
    val end = Step(5)

    val range = start..end

    println(Step(3) in range) // true
    println(Step(7) in range) // false
}