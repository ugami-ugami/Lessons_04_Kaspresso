package homework

class Log(val entries: List<String>) {

    operator fun plus(other: Log): Log {
        return Log(this.entries + other.entries)
    }
}

fun main() {
    val log1 = Log(listOf("Start"))
    val log2 = Log(listOf("End"))

    val merged = log1 + log2

    println(merged.entries) // [Start, End]
}