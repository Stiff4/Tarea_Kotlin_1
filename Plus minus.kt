import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.util.*
import java.util.concurrent.*
import java.util.function.*
import java.util.regex.*
import java.util.stream.*
import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.jvm.*
import kotlin.jvm.functions.*
import kotlin.jvm.internal.*
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*

// Complete the plusMinus function below.
fun plusMinus(arr: Array<Int>): Unit {

    var positives: Double = 0.0
    var negatives: Double = 0.0
    var zeros: Double = 0.0
    var size: Double = arr.size.toDouble()

    for ((i, v) in arr.withIndex()){
        if (v > 0) {positives += 1}
        if (v < 0) {negatives += 1}
        if (v == 0) {zeros += 1}
    }

    val res1 = (positives/size)
    val res2 = (negatives/size)
    val res3 = (zeros/size)

    println(res1)
    println(res2)
    println(res3)

}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val arr = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    plusMinus(arr)
}