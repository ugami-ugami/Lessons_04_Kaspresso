interface Nuclear

class Carbon : Nuclear
class Boron : Nuclear
class Lithium : Nuclear
class Magnesium : Nuclear
class Proton

fun Nuclear.knockOutProton(proton: Proton): Nuclear {
    return when(this) {
        is Carbon -> Boron()
        else -> throw IllegalStateException("Операция не осуществима")
    }
}

operator fun Nuclear.minus(proton: Proton): Nuclear {
    return when(this) {
        is Carbon -> Boron()
        else -> throw IllegalStateException("Операция не осуществима")
    }
}

operator fun Nuclear.times(multiplier: Int): Nuclear {
    require(this is Carbon) {"Операция доступа только для углерода"}
    require(multiplier == 2) {"Доступно объединение двух ядер"}
    return Magnesium()
}

fun main() {
    val proton = Proton()
    val carbon = Carbon()
//    val boron = carbon.knockOutProton(proton)
    val boron = carbon - proton
    carbon * 2
    println(boron.javaClass.simpleName)

    1..10
}