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

fun compareTriplets(a: Array<Int>, b: Array<Int>): Array<Int> {

    var array = Array<Int>(2){0}


    if (a[0] > b[0]) 
        array[0] += 1
    if (a[1] > b[1]) 
        array[0] += 1
    if (a[2] > b[2]) 
        array[0] += 1
    
    
    if (a[0] < b[0]) 
        array[1] += 1
    if (a[1] < b[1]) 
        array[1] += 1
    if (a[2] < b[2]) 
        array[1] += 1

    return array
}

fun main(args: Array<String>) {
    val a = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val b = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = compareTriplets(a, b)

    println(result.joinToString(" "))
}