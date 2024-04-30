package com.reivik

fun main() {
    val totalSeconds = 6480

    //расчеты
    val hours = (totalSeconds / 3600)
    val remainingSecondsAfterHours = totalSeconds % 3600
    val minutes = remainingSecondsAfterHours / 60
    val seconds = remainingSecondsAfterHours % 60

    val timeInSpace = String.format("%02d:%02d:%02d", hours, minutes, seconds)

    println("Время Гагарина в космосе: $timeInSpace")
}