import javax.xml.crypto.dsig.spec.XPathFilter2ParameterSpec

fun main() {

    println("Задание 1")
    val A = true
    val B = false
    val C = false

    println("A or B: ${A || B}")
    println("A and B: ${A && B}")
    println("B or C: ${B || C}")

    println("")

    println("Задание 2")
    val X = false
    val Y = true
    val Z = false

    println("X or Z: ${X || Z}")
    println("X and Y: ${X && Y}")
    println("X and Z: ${X && Z}")

    println("")

    println("Задание 3")
    val A1 = true
    val B1 = false
    val C1 = false

    println("don't A and B: ${!A1 && B1}")
    println("A or don't B: ${A1 || !B1}")
    println("A and B or C: ${A1 && B1 || C1}")

    println("")

    println("Задание 4")
    val X1 = true
    val Y1 = true
    val Z1 = false

    println("don't X and Y: ${!X1 && Y1}")
    println("X or don't Y: ${X1 || !Y1}")
    println("X and Y or Z: ${X1 && Y1 || Z1}")

    println("")

    println("Задание 5")
    val X2 = true
    val Y2 = true
    val Z2 = false

    println("don't X and Y: ${!X2 && Y2}")
    println("X or don't Y: ${X2 || !Y2}")
    println("X and Y or Z: ${X2 && Y2 || Z2}")

    println("")

    println("Задание 6")
    val X3 = false
    val Y3 = false
    val Z3 = true

    println("X or Y and don't Z: ${X3 || Y3 && !Z3}")
    println("don't X and dob't Y: ${!X3 && !Y3}")
    println("don't (X and Z) or Y: ${!(X3 && Z3) || Y3 }")
    println("X and don't Y or Z: ${X3 && !Y3 || Z3}")
    println("X and ( don't Y or Z): ${X3 && (!Y3 || Z3)}")
    println("X and (don't(Y and Z)): ${X3 && (!(Y3 && Z3))}")

    println("")

    println("Задание 7")

    val A2 = true
    val B2 = false
    val C2 = false

    println("A or don't (A and B) or C: ${A2 || !(A2 && B2) || C2}")
    println("don't A or A and (B or C): ${!A2 || A2 && (B2 || C2)}")
    println("(A or B and don't C) and C: ${(A2 || B2 && !C2) && C2}")

}
