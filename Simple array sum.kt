import java.io.*
import java.math.*
import java.text.*
import java.util.*
import java.util.regex.*

/*
 * Complete the simpleArraySum function below.
 */
fun simpleArraySum(ar: Array<Int>): Int {

    var sum = 0

    for (i in ar.indices){
        sum = sum + ar[i]
    }

    return sum
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val arCount = scan.nextLine().trim().toInt()

    val ar = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val result = simpleArraySum(ar)

    println(result)
}