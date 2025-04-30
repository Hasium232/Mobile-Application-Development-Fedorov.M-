fun printNum(n: Int): List <Int> {
    return if (n <= 0) emptyList() else (n downTo 1).toList()
}


fun pyramid(n: Int) {
    for(i in 1..n) {
        val spaces = " ".repeat(n - i)
        val hashes = "#".repeat(2 * i - 1 )
        println("$spaces$hashes$spaces")

    }
}

fun caesarCipher(text: String, shift: Int): String {
    return text.map { char ->
        when {
            char.isUpperCase() -> 'A' + (char - 'A' + shift) % 26
            char.isLowerCase() -> 'a' + (char - 'a' + shift) % 26
            else -> char
        }.toChar()
    }.joinToString("")
}

fun fizzBuzz(n: Int): List <Any> {
    return (1..n).map {
        when {
            it % 15 == 0 -> "ВизллБизлл"
            it % 3 == 0 -> "Физллл"
            it % 5 == 0 -> "Бизлллл"
            else -> it
        }
    }.toList()
}

fun main() {
    println("Задание 1. Возврат сриска")

    println(printNum(0))
    println(printNum(2))
    println(printNum(5))

    println("")
    println("Задание 2. Функция для вывода пирамиды")

    pyramid(1)
    pyramid(2)
    pyramid(3)

    println("")
    println("Задание 3. Реализация шифра цезаря")

    println(caesarCipher("Hello, World!", 3))

    println("")
    println("Задание 4. Функция с заменой чисел на слова")

    println(fizzBuzz(15))
}