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
    colorsList.add(0, "white")
    colorsList.add("black")

    println(colorsList)


    //loops
    var x = 1
    while (x <= 100) {
        if (x % 2 == 0) {
            print("$x ")
        }
        x++
    }


    //map

    var car = mapOf("name" to "Honda", "color" to "red", "year" to 2020)
    println()
    for ((key, value) in car)
        println("$key: $value")

    //set

    var text = "Process finished with exit code 0"
    var letterSet = mutableSetOf<Char>()
    for (letter in text) letterSet.add(letter)
    println(letterSet)
    println(letterSet.size)


    //functions

    fun happyBirthday(name: String, age: Int): String {
        return "Happy ${age}th birthday, $name"
    }

    println(happyBirthday("Dennis", 46))

    fun hello() = println("Hello")
    hello()

    fun countAndPrintArgs(vararg numbers: Int) {
        for (number in numbers) print("$number ")
    }

    var numberList = listOf(1, 2, 3, 4, 5)

    countAndPrintArgs(*numberList.toIntArray())


    //classes

    class Person(firstName: String, lastName: String, yearOfBirth: Int) {
        var firstName = firstName
        var lastName = lastName
        var age = 0

        init {
            age = 2022 - yearOfBirth
        }

        fun getFullName(): String {
            return "$firstName $lastName"
        }
    }

    var me = Person("Dennis", "Hartstock", 1976)
    println()
    println("My name is ${me.getFullName()}, i'm $age years old")

    //null safety

    var a = "Kotlin"
    val b: String? = null
    println(a.length)
    println(b?.length)
}