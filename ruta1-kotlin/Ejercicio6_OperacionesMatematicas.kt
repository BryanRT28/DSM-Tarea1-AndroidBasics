fun main() {
    val firstNumber = 10
    val secondNumber = 5
    val thirdNumber = 8

    // Operaciones de suma
    val result = add(firstNumber, secondNumber)
    val anotherResult = add(firstNumber, thirdNumber)

    println("$firstNumber + $secondNumber = $result")
    println("$firstNumber + $thirdNumber = $anotherResult")

    // Operaciones de resta (Paso 3)
    val subtractResult = subtract(firstNumber, secondNumber)
    val anotherSubtractResult = subtract(firstNumber, thirdNumber)

    println("$firstNumber - $secondNumber = $subtractResult")
    println("$firstNumber - $thirdNumber = $anotherSubtractResult")
}

// Función reutilizable para sumar dos enteros
fun add(a: Int, b: Int): Int {
    return a + b
}

// Función reutilizable para restar dos enteros
fun subtract(a: Int, b: Int): Int {
    return a - b
}