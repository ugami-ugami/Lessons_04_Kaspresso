package homework

import kotlin.random.Random

class Person(val name: String) {

    private val phrases = mutableListOf<String>()

    infix fun says(phrase: String): Person {
        phrases.add(phrase)
        return this
    }

    infix fun and(phrase: String): Person {
        if (phrases.isEmpty()) {
            throw IllegalStateException("and cannot be called before says")
        }

        phrases.add(phrase)
        return this
    }

    infix fun or(phrase: String): Person {
        if (phrases.isEmpty()) {
            throw IllegalStateException("or cannot be called before says")
        }

        val lastPhrase = phrases.last()

        val selected = selectPhrase(lastPhrase, phrase)

        phrases[phrases.lastIndex] = selected

        return this
    }

    private fun selectPhrase(first: String, second: String): String {
        return if (Random.nextBoolean()) first else second
    }

    fun getPhrases(): List<String> = phrases
}

fun main() {
    val person = Person("Mike")

    person says "Hello" and "How are you?" or "Goodbye"

    println(person.getPhrases())
}