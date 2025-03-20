import java.time.YearMonth
import kotlin.random.Random
fun main () {

    //Вывод чисел от 1 до 10
    println("Задание 1")
    for (i in 1..10)
        println("$i ")

    println()

    //Вывод чисел от 1 до 20
    println("Задание 2")
    for (i in 2..20 step 2) {
        println("$i")
    }

    println()

    //Сумма чисел от 1 до N
    println("Введите число N: ")
    val n0 = readln().toInt()
    val sum0 = (1..n0).sum()
    println("Сумма чисел от 1 до $n0: $sum0")

    println()

    println("4. Факториал числа:")
    print("Введите число: ")
    val n1 = readln().toInt()
    var factorial = 1L
    for (i in 1..n1) {
        factorial *= i
    }
    println("Факториал числа $n1: $factorial")

    println()

    println("5. Проверка числа на простоту:")
    print("Введите число: ")
    val n3 = readln().toInt()
    var isPrime = true
    for (i in 2 until n3) {
        if (n3 % i == 0) {
            isPrime = false
            break
        }
    }
    println(if (isPrime) "Число $n3 является простым." else "Число $n3 не является простым.")

    println()

    println("6. Вывод таблицы умножения:")
    for (i in 1..10) {
        for (j in 1..10) {
            print("${i * j}\t")
        }
        println()
    }

    println()

    println("7. Фибоначчи:")
    print("Введите количество чисел Фибоначчи: ")
    val n4 = readLine()!!.toInt()
    var a = 0
    var b = 1
    for (i in 1..n4) {
        print("$a ")
        val next = a + b
        a = b
        b = next
    }

    println()

    println("9. Обратный порядок:")
    print("Введите строку: ")
    val s = readLine()!!
    println("Обратная строка: ${s.reversed()}")

    println()

    println("10. Сумма цифр числа:")
    print("Введите число: ")
    val n10 = readLine()!!.toInt()
    val sum10 = n10.toString().map { it.toString().toInt() }.sum()
    println("Сумма цифр числа $n10: $sum10")

    println()

    println("11. Анаграммы:")
    print("Введите первую строку: ")
    val s1 = readLine()!!.lowercase().replace(" ", "")
    print("Введите вторую строку: ")
    val s2 = readLine()!!.lowercase().replace(" ", "")
    println(if (s1.toCharArray().sorted() == s2.toCharArray().sorted()) "Строки являются анаграммами." else "Строки не являются анаграммами.")

    println()

    println("12. Числовая последовательность:")
    print("Введите начальное число: ")
    val start = readLine()!!.toInt()
    print("Введите шаг: ")
    val step = readLine()!!.toInt()
    print("Введите количество элементов: ")
    val n = readLine()!!.toInt()
    val sequence = generateSequence(start) { it + step }.take(n).toList()
    println("Последовательность: $sequence")

    println()

    println("13. Таблица квадратов:")
    for (i in 1..20) {
        println("$i^2 = ${i * i}")
    }

    println()

    println("14. Генерация случайных чисел:")
    val randomNumbers = List(10) {Random.nextInt(100) + 1 }
    println("Случайные числа: $randomNumbers")

    println()

    println("15. Проверка палиндрома:")
    print("Введите строку: ")
    val s15 = readLine()!!
    println(if (s15 == s.reversed()) "Строка является палиндромом." else "Строка не является палиндромом.")

    println()

    println("16. Сигма (сумма квадратов):")
    print("Введите число N: ")
    val n16 = readLine()!!.toInt()
    val sum16 = (1..n).sumOf { it * it }
    println("Сумма квадратов от 1 до $n16: $sum16")

    println()

    println("17. Вывод символов:")
    print("Введите строку: ")
    val s17 = readLine()!!
    for (char in s17) {
        println(char)
    }

    println()

    println("18. Задача на лестницу:")
    print("Введите высоту лестницы: ")
    val n18 = readLine()!!.toInt()
    for (i in 1..n18) {
        println("#".repeat(i))
    }
    println()

    println("19. Сортировка списка:")
    val arr = arrayOf(34, 12, 56, 78, 23, 45, 67, 89, 90, 11)
    for (i in arr.indices) {
        for (j in i + 1 until arr.size) {
            if (arr[i] > arr[j]) {
                val temp = arr[i]
                arr[i] = arr[j]
                arr[j] = temp
            }
        }
    }
    println("Отсортированный массив: ${arr.joinToString()}")

    println()

    println("21. Вывод даты:")
    print("Введите год: ")
    val year = readLine()!!.toInt()
    print("Введите месяц (1-12): ")
    val month = readLine()!!.toInt()
    val yearMonth = YearMonth.of(year, month)
    val daysInMonth = yearMonth.lengthOfMonth()
    println("Даты в месяце:")
    for (day in 1..daysInMonth) {
        println("$year-${month.toString().padStart(2, '0')}-${day.toString().padStart(2, '0')}")
    }

    println()

    println("22. Угадай число:")
    val randomNumber = Random.nextInt(1, 101)
    var guess: Int
    var attempts = 0
    do {
        print("Угадайте число от 1 до 100: ")
        guess = readLine()!!.toInt()
        attempts++
        when {
            guess < randomNumber -> println("Загаданное число больше.")
            guess > randomNumber -> println("Загаданное число меньше.")
            else -> println("Поздравляем! Вы угадали число за $attempts попыток.")
        }
    } while (guess != randomNumber)

    println()

    println("23. Сложение и умножение:")
    while (true) {
        print("Введите первую цифру: ")
        val a23 = readLine()!!.toInt()
        print("Введите вторую цифру: ")
        val b23 = readLine()!!.toInt()
        print("Введите операцию (+, * или 'стоп'): ")
        val operation = readLine()!!
        if (operation == "стоп") break
        when (operation) {
            "+" -> println("Результат сложения: ${a23 + b23}")
            "*" -> println("Результат умножения: ${a23 * b23}")
            else -> println("Неверная операция.")
        }
    }

    println()

    println("25. Кубы чисел:")
    for (i in 1..10) {
        println("$i^3 = ${i * i * i}")
    }

    println()

    println("26. Сумма четных и нечетных чисел:")
    print("Введите число N: ")
    val n26 = readLine()!!.toInt()
    var sumEven = 0
    var sumOdd = 0
    for (i in 1..n26) {
        if (i % 2 == 0) sumEven += i else sumOdd += i
    }
    println("Сумма четных чисел: $sumEven")
    println("Сумма нечетных чисел: $sumOdd")

    println()

    println("27. Печать числа 'пирамида':")
    print("Введите число N: ")
    val n27 = readLine()!!.toInt()
    for (i in 1..n27) {
        println(" ".repeat(n27 - i) + (1..i).joinToString(" "))
    }

    println()

    println("28. Определение порядка:")
    print("Введите количество чисел: ")
    val n28 = readLine()!!.toInt()
    val numbers = mutableListOf<Int>()
    for (i in 1..n28) {
        print("Введите число $i: ")
        numbers.add(readLine()!!.toInt())
    }
    println("Числа в порядке возрастания: ${numbers.sorted().joinToString()}")

    println()

    println("29. Сумма ряда:")
    print("Введите число N: ")
    val n29 = readLine()!!.toInt()
    var sum29 = 0.0
    for (i in 1..n29) {
        sum29 += 1.0 / i
    }
    println("Сумма ряда: $sum29")

    println()

    println("30. Конвертация в двоичную систему:")
    print("Введите целое число: ")
    val number = readLine()!!.toInt()
    val binary = Integer.toBinaryString(number)
    println("Двоичное представление: $binary")


}










