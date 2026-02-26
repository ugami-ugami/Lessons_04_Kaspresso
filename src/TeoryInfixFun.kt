infix fun String.и(other: String): Pair<String, String> {
    return this to other
}

infix fun Pair<String, String>.обсуждали(name: String): String {
    return "Два сплетника, $second и $first, перемыли все кости своих знакомых и теперь знают все про $name"
}

fun main() {
    println("Андрей" и "Светлана" обсуждали "Валентину")
    val pair = "Андрей".и("Светлана")
    val result = pair.обсуждали("Валентину")
    println(result)

// или без переменных
    println(("Андрей".и("Светлана")).обсуждали("Валентину"))

    val untilRange = 0 until 10
    val downToRange = 10 downTo 0
    val rangeWithStep = 0 .. 10 step 2
    val logicAnd = true and false
    val logicOr = false or true
    val logicXor = true xor false
}