fun main() {
    // Задача 1: Определить максимальное из трех чисел
    println("Введите три числа:")
    val num1 = readLine()!!.toInt()
    val num2 = readLine()!!.toInt()
    val num3 = readLine()!!.toInt()

    val maxNum = maxOf(num1, num2, num3)
    println("Максимальное число: $maxNum")

    // Задача 2: Найти среднее среди трех чисел
    if (num1 == num2 || num2 == num3 || num1 == num3) {
        println("Ошибка")
    } else {
        val average = (num1 + num2 + num3) / 3.0
        println("Среднее: $average")
    }

    // Задача 3: Из двух чисел с разной четностью вывести нечетное
    println("Введите два числа:")
    val firstNum = readLine()!!.toInt()
    val secondNum = readLine()!!.toInt()

    if ((firstNum % 2 != 0 && secondNum % 2 == 0) || (firstNum % 2 == 0 && secondNum % 2 != 0)) {
        val oddNum = if (firstNum % 2 != 0) firstNum else secondNum
        println("Нечетное число: $oddNum")
    }

    // Задача 4: Проверка кратности двух чисел
    println("Введите большее и меньшее число:")
    val larger = readLine()!!.toInt()
    val smaller = readLine()!!.toInt()

    if (larger % smaller == 0) {
        println("$larger кратно $smaller")
    } else {
        println("$larger не кратно $smaller. Остаток от деления: ${larger % smaller}")
    }

    // Задача 5: Проверка существования треугольника
    println("Введите длины трех сторон треугольника:")
    val side1 = readLine()!!.toInt()
    val side2 = readLine()!!.toInt()
    val side3 = readLine()!!.toInt()

    if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1) {
        println("Треугольник может существовать")
    } else {
        println("Треугольник не может существовать")
    }

    // Задача 6: Проверка високосного года
    println("Введите год:")
    val year = readLine()!!.toInt()

    if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
        println("$year - високосный год. В году 366 дней.")
    } else {
        println("$year - невисокосный год. В году 365 дней.")
    }

    // Задача 7: Сравнение двух вещественных чисел
    println("Введите два различных вещественных числа:")
    val firstDouble = readLine()!!.toDouble()
    val secondDouble = readLine()!!.toDouble()

    if (firstDouble > secondDouble) {
        println("$firstDouble больше, чем $secondDouble")
        println("$secondDouble меньше, чем $firstDouble")
    } else {
        println("$secondDouble больше, чем $firstDouble")
        println("$firstDouble меньше, чем $secondDouble")
    }

    // Задача 8: Сравнение расстояний
    println("Введите расстояние в километрах:")
    val kilometers = readLine()!!.toDouble()

    println("Введите расстояние в футах:")
    val feet = readLine()!!.toDouble()

    val feetInMeters = feet * 0.305
    if (kilometers < feetInMeters) {
        println("Расстояние в километрах меньше расстояния в футах.")
    } else {
        println("Расстояние в футах меньше расстояния в километрах.")
    }

    // Задача 9: Проверка делимости
    println("Введите два целых числа m и n:")
    val m = readLine()!!.toInt()
    val n = readLine()!!.toInt()

    if (m % n == 0) {
        println("Частное от деления m на n: ${m / n}")
    } else {
        println("m на n нацело не делится.")
    }

    // Задача 10: Проверка делимости a на b
    println("Введите два числа a и b:")
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()

    if (b % a == 0) {
        println("$a является делителем $b")
    } else {
        println("$a не является делителем $b")
    }

    // Задача 11: Проверка четности и последней цифры
    println("Введите натуральное число:")
    val naturalNumber = readLine()!!.toInt()

    if (naturalNumber % 2 == 0) {
        println("$naturalNumber - четное число.")
    } else {
        println("$naturalNumber - нечетное число.")
    }

    if (naturalNumber % 10 == 7) {
        println("$naturalNumber заканчивается на цифру 7.")
    } else {
        println("$naturalNumber не заканчивается на цифру 7.")
    }

// Задача 12: Работа с двузначным числом
    println("Введите двузначное число:")
    val twoDigitNumber = readLine()!!.toInt()

    val firstDigit = twoDigitNumber / 10
    val secondDigit = twoDigitNumber % 10

    if (firstDigit > secondDigit) {
        println("Первая цифра больше второй.")
    } else if (firstDigit < secondDigit) {
        println("Вторая цифра больше первой.")
    } else {
        println("Цифры одинаковы.")
    }

    // Задача 13: Работа с четырехзначным числом
    println("Введите четырехзначное число:")
    val fourDigitNumber = readLine()!!.toInt()

    val thousands = fourDigitNumber / 1000
    val hundreds = (fourDigitNumber / 100) % 10
    val tens = (fourDigitNumber / 10) % 10
    val units = fourDigitNumber % 10

    // Сумма двух первых и двух последних цифр
    if ((thousands + hundreds) == (tens + units)) {
        println("Сумма двух первых цифр равна сумме двух последних.")
    } else {
        println("Сумма двух первых цифр не равна сумме двух последних.")
    }

    // Кратность суммы цифр трем
    val sumOfDigits = thousands + hundreds + tens + units
    if (sumOfDigits % 3 == 0) {
        println("Сумма цифр кратна трем.")
    } else {
        println("Сумма цифр не кратна трем.")
    }

    // Кратность произведения цифр четырем
    val productOfDigits = thousands * hundreds * tens * units
    if (productOfDigits % 4 == 0) {
        println("Произведение цифр кратно четырем.")
    } else {
        println("Произведение цифр не кратно четырем.")
    }

}