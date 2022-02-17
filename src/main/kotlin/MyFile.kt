import kotlin.math.PI
import kotlin.math.pow

fun main() {
    val NAME = "Dennis"
    var age = 45
    var isStudent = false
    var hasTicket: Boolean = true

    println("My name is $NAME. I'm $age years old.")

    if (isStudent || hasTicket) {
        println("I can go to the party")
    }


    /*
    Shortcuts for math
     */

    //val PI = 3.14
    var radius = 7
    var circleArea = PI * radius.toDouble().pow(2)
    var circleAreaToInt = circleArea.toInt()

    println("$circleAreaToInt vs $circleArea")


    // arrays and lists

    var array = arrayOf<String>("one", "two", "three")
    var list = listOf(1, 2, 3, "one", true)
    var mutableList = mutableListOf<Double>(1.0, 2.4, 3.9)

    var rainbowColorsArray = arrayOf("red", "orange", "yellow", "green", "blue", "indigo", "violet")
    var colorsList = mutableListOf<String>()
    colorsList.addAll(rainbowColorsArray)
    colorsList.add(0,"white")
    colorsList.add("black")

    println(colorsList)

}