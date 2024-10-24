fun main() {
    printWeather("Ankara", 27, 31, 82)
    printWeather("Tokyo", 32, 36, 10)
	printWeather("Cape Town", 59, 64, 2)
	printWeather("Guatemala City", 50, 55, 5)
}

fun printWeather(city: String, tempLow: Int, tempHigh: Int, rain: Int){
    println("City: $city")
    println("Low temperature: $tempLow, High temperature: $tempHigh")
    println("Chance of rain: $rain %")
    println()
}