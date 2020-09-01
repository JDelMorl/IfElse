import kotlin.math.abs

fun main(args: Array<String>) {
    var guess = 0
    var answer = 0
    var temp = 0

    print ("Enter a temperature between 92.0 and 104.0: ")

        guess = readLine()!!.toInt()
        temp = abs(guess - answer)
        if (temp < 97.4)
            println("Temperature is Low")
        else if (temp < 99.5)
            println("Temperature is Normal")
        else if (temp > 99.6)
            println("Temperature is Hot")
        else
            println("Enter a  temperature between 92.0 and 104.0")

}