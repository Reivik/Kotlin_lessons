package org.example

fun main() {
    val yearOfFlight: Int = 1961
    var hourOfFlight: String = "09"
    var minuteOfFlight: String = "07"

    println("Год полета - $yearOfFlight")
    println("Взлет - $hourOfFlight:$minuteOfFlight")

    hourOfFlight = "10"
    minuteOfFlight = "55"

    print("Год полета - $yearOfFlight\nПосадка - $hourOfFlight:$minuteOfFlight")
}