class Car(val yearOfMake: Int, theColor: String) {
    var fuelLevel = 100
    var color = theColor
    set(value) {
            if (value.isBlank()) {
                throw RuntimeException("no empty, please")
            }
            field = value
        }
}