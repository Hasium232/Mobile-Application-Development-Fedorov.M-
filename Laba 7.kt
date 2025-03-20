import java.util.Random
//Задание 1

fun calculator() {
    println("<<ВЕЛИКИЙ_КАЛЬКУЛЯТОР>>")
        println("Введите первое число: ")
        val num1 =  readln().toDouble()
        println("Введите оператор: ")
        val operator =  readln()
        println("Введите второе число: ")
        val num3 =  readln().toDouble()

        val result = when (operator) {
            "+" -> num1 + num3
            "-" -> num1 - num3
            "*" -> num1 * num3
            "/" -> num1 / num3
            else -> throw IllegalArgumentException("Неверный оператор")
        }
        println("Результат: $result")
    }
//Задание 2
fun isPalidrome(word: String): Boolean{
    return word == word.reversed()
}

//Задание 3
fun calculatorPoints(wins: Int, draws: Int, losses: Int): Int {
    return wins * 3 + draws * 1
}


//Задание 4
fun findMinNumber(numbers: List<Int>): Int{
    return  numbers.minOrNull() ?: throw IllegalArgumentException("Список пуст")
}

//Задание 5
fun  areNumbersEqual(num1: Int, num2: Int): Boolean {
    return num1 == num2
}

//Заданаие 6
fun PlayBlackJack() {
    val random = Random()
    var total = 0

    println("Здаров, ты попал к Гамблёрам, они заставляют  играть вас в 21-о !!!" )
    println("- НУ что ж выхода нет (")
    while (true) {
        val card = random.nextInt(11) + 1
        total += card
        println("Вы получили карту: $card. Сумман на общаг: $total")

        if (total >= 21) {
            break
        }

        println("Желаете взять еще карту мистер Свин? (y/n)")
        val input = readLine()!!
        if (input.lowercase() != "y"){
            break
        }
    }

    when {
        total == 21 -> println("Да как ты это сделал, ну что же Поздравляем вас с Победой.")
        total > 21 -> println("Ну братан, ты перебрал, Ты нам должен !!! ")
        else -> println("Вы остановились на $total.")
    }
}

fun main() {

    calculator()

    println("ПРОВЕРКА_НА_ПАЛИНДРОМ")
    println("Введите слово проверки на палиндром: ")
    val word = readln()
    println("Это палиндром? ${isPalidrome(word)}")

    println("")

    println("Счётчик Очков")
    println("Введите Кол-во побед, ничьих и поражений: ")
    val wins = readln().toInt()
    val draws = readln().toInt()
    val  losses= readln().toInt()
    println("Комманда набрала ${calculatorPoints(wins, draws, losses)} очков")

    println("")

    println("Нахождение минимального числа")
    println("Введите список чисел через пробел: ")
    val numbers = readln().split(" ").map {it.toInt()}
    println("Минимальное число: ${findMinNumber(numbers)}")

    println("")

    println("Равенств двух чисел")
    println("Введите два числа для проверки на равенство: ")
    val num1 = readln().toInt()
    val num2 = readln().toInt()
    println("Числа равны? ${areNumbersEqual(num1, num2)}")

    println("")

    PlayBlackJack()
}
