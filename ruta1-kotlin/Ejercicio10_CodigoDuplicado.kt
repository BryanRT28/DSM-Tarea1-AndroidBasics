fun main() {
    printCityWeather("Ankara", 27, 31, 82)
    printCityWeather("Tokyo", 32, 36, 10)
    printCityWeather("Cape Town", 59, 64, 2)
    printCityWeather("Guatemala City", 50, 55, 7)
}

// Función reutilizable para imprimir el reporte climático de cualquier ciudad
fun printCityWeather(cityName: String, lowTemp: Int, highTemp: Int, rainChance: Int) {
    println("City: $cityName")
    println("Low temperature: $lowTemp, High temperature: $highTemp")
    println("Chance of rain: $rainChance%")
    println()
}