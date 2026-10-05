fun main() {
    println("=== REPASO GENERAL DE FUNDAMENTOS EN KOTLIN ===")
    println()

    // 1. Inmutabilidad (val), Mutabilidad (var) e Inferencia de tipos
    val estudiante: String = "Bryan Joel Rodriguez Tanta"
    val codigo: String = "23200204"
    var cicloActual: Int = 8

    println("Estudiante: $estudiante | Código: $codigo | Ciclo: $cicloActual")
    cicloActual = 9 // Demostración de mutabilidad con var
    println("Próximo ciclo académico: $cicloActual")
    println()

    // 2. Operaciones matemáticas y funciones reutilizables (add y subtract)
    val numA = 20
    val numB = 10
    val resultadoSuma = add(numA, numB)
    val resultadoResta = subtract(numA, numB)
    println("Operaciones: $numA + $numB = $resultadoSuma | $numA - $numB = $resultadoResta")
    println()

    // 3. Parámetros predeterminados y argumentos con nombre
    val correo = "bryan.rodriguez@unmsm.edu.pe"
    // Caso 1: usando el valor por defecto ("Unknown OS")
    println(displayAlertMessage(emailId = correo))
    // Caso 2: especificando el sistema operativo
    println(displayAlertMessage(operatingSystem = "Android 14", emailId = correo))
    println()

    // 4. Buenas prácticas de nomenclatura (camelCase) y cálculos con Double
    val pasos = 4500
    val caloriasQuemadas = pedometerStepsToCalories(pasos)
    println("Caminata: $pasos pasos equivalen a $caloriasQuemadas calorías quemadas.")
    println()

    // 5. Comparaciones lógicas con retorno Booleano
    val tiempoHoy = 320
    val tiempoAyer = 280
    val usoMasTiempo = compareTime(tiempoHoy, tiempoAyer)
    println("¿Usé más el teléfono hoy que ayer ($tiempoHoy vs $tiempoAyer min)?: $usoMasTiempo")
    println()

    // 6. Modularización y eliminación de código duplicado
    println("--- Reporte del Clima (Función Reutilizable) ---")
    printCityWeather("Lima", lowTemp = 18, highTemp = 24, rainChance = 15)
    printCityWeather("Tokyo", lowTemp = 32, highTemp = 36, rainChance = 10)
}

// Suma de dos enteros
fun add(a: Int, b: Int): Int {
    return a + b
}

// Resta de dos enteros
fun subtract(a: Int, b: Int): Int {
    return a - b
}

// Mensaje de alerta con parámetro por defecto
fun displayAlertMessage(operatingSystem: String = "Unknown OS", emailId: String): String {
    return "There's a new sign-in request on $operatingSystem for your Google Account $emailId."
}

// Cálculo de calorías aplicando convención camelCase
fun pedometerStepsToCalories(numberOfSteps: Int): Double {
    val caloriesBurnedForEachStep = 0.04
    return numberOfSteps * caloriesBurnedForEachStep
}

// Comparación booleana directa
fun compareTime(timeSpentToday: Int, timeSpentYesterday: Int): Boolean {
    return timeSpentToday > timeSpentYesterday
}

// Función que evita duplicación de sentencias println
fun printCityWeather(cityName: String, lowTemp: Int, highTemp: Int, rainChance: Int) {
    println("City: $cityName")
    println("Low temperature: $lowTemp, High temperature: $highTemp")
    println("Chance of rain: $rainChance%")
    println()
}