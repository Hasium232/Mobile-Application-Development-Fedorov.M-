
fun main() {
    println("№1 Типы данных в Kotlin")
    println("Byte-Хранит целое число от -128 до 127")
    println("Short-Хранит целое число от -32 767 до 32 767")
    println("Int-Хранит целое число от -2 147 483 648 до 2 147 483 648 Например 0b0101")
    println("Long-Хранит целое число от -9 223 372 036 854 775 808 до 9 223 372 036 854 775 808 ")
    println("Float-Хранит числа с плавающей точкой от -3.4*1038 до 3.4*1038")
    println("Double-Хранит числа с плавающей точкой от +- 5.0*10-324 до +- 1.7*10308")
    println("Boolean-Хранит значение истиность или ложность, например True или False")
    println("Char-Представляет отдельный символ, например 'A'")
    println("String-Хранит в себе строки например 'student AMGU'")

    println("")

    println("№2 Число с точностью до сотых ")
    var num1: Double = 876.23
    println(num1)

    println("")

    println("№3 Число е с точностью о десятых")
    var num2: Double = 6e-1
    println(num2)

    println("")

    println("№4 Программа по выводу числа")
    print("Введите число: ")
    var num3 = readln().toInt()
    println("Вы ввели число - $num3")

    println("")

    println("№5 Программа по выводу числа")
    print("Введите число: ")
    var num4 = readln().toInt()
    println("$num4 - Вот такое число Вы ввели")

    println("")

    println("№6Числа на одной строке")
    var num5 = 1
    var num6 = 13
    var num7 = 49
    println("$num5 $num6 $num6")

    println("")

    println("№6Числа на одной строке с двумя пробелпми")
    var num8 = 7
    var num9 = 15
    var num10 = 100
    println("$num8  $num9  $num10")

    println("")

    println("№7 Прога с Числа на одной строке с двумя пробелпми")
    var num11 = 2346
    var num12= 5238
    var num13 = 98347
    println("$num11  $num12  $num13")

    println("")

    println("№8 Прога с Числа на одной строке с двумя пробелпми")
    println("Введите число 1: ")
    var num14 = readln().toInt()
    println("Введите число 2: ")
    var num15= readln().toInt()
    println("Введите число 3: ")
    var num16 = readln().toInt()
    println("Вы ввели числа $num14  $num15  $num16")

    println("")

    println("№9 Прога с Числа на одной строке с двумя пробелпми")
    println("Введите число 1: ")
    var num17 = readln().toInt()
    println("Введите число 2: ")
    var num18= readln().toInt()
    println("Введите число 3: ")
    var num19 = readln().toInt()
    println("Введите число 4: ")
    var num20 = readln().toInt()
    println("Вы ввели числа $num17 $num18 $num19 $num20")

    println("")

    println("№10 Прога с Числа на одной строке с двумя пробелпми")
    var num21 = 50
    var num22 = 10
    println("$num21")
    println("$num22")

    println("")

    println("№11 Прога с Числа на одной строке с двумя пробелпми")
    var num23 = 5
    var num24 = 10
    var num25 = 21
    println("$num23")
    println("$num24")
    println("$num25")

    println("")

    println("№12 Прога с Числа столбиком")
    println("Введите число 1: ")
    var num26 = readln().toInt()
    println("Введите число 2: ")
    var num27= readln().toInt()
    println("Введите число 3: ")
    var num28 = readln().toInt()
    println("Введите число 4: ")
    var num29 = readln().toInt()
    println("$num26")
    println("$num27")
    println("$num28")
    println("$num29")

}