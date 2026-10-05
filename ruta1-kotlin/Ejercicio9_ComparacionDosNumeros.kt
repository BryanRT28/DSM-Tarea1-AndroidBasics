fun main() {
    println(compareTime(timeSpentToday = 300, timeSpentYesterday = 250)) // true
    println(compareTime(timeSpentToday = 300, timeSpentYesterday = 300)) // false
    println(compareTime(timeSpentToday = 200, timeSpentYesterday = 220)) // false
}

// Función que compara ambos tiempos y devuelve un Boolean
fun compareTime(timeSpentToday: Int, timeSpentYesterday: Int): Boolean {
    return timeSpentToday > timeSpentYesterday
}