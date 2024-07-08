fun getTemperatureAtAirport(code: String) = "${Math.round(Math.random() * 30) + code.count()} C"

val airportCodes = listOf("LAX", "SFO", "PDX", "SEA")
val temperatures = airportCodes.map { code -> code to getTemperatureAtAirport(code) }
for (temp in temperatures) {
    println("Airport: ${temp.first}: Temperature: ${temp.second}")
}