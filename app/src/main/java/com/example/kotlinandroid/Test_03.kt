package com.example.kotlinandroid

/**
 * Created by Administrator on 2017/8/16.
 * Kotlin条件控制
 */

fun main(args: Array<String>) {
    chooseMax()
    rangeIn()
    tWhen()
    whenin()
    println(hasPrefix("prefix"))
}

fun chooseMax() {
    val a = 1
    val b = 2
    val max = if (a > b) {
        println("Choose a")
    } else {
        println("Choose b")
    }
    val c = if (a >= b) a else b
    println("c is " + c)
}

fun rangeIn() {
    val x = 5
    val y = 9
    if (x in 1..8) {
        println("x 在区间内")
    } else {
        println("x 在区间外")
    }
}
//when 表达式

fun tWhen() {
    val x = intArrayOf(1, 2, 3, 4)
    for (y in x){
        when (y) {
            1 -> {
                println("x is " + 1)
            }
            2 -> {
                println("x is " + 2)
            }
            else -> {
                println("x is 3 or 4")
            }
        }
        when(y){
            1,2,3,4->{
                println("y in x")
            }
            else->{
                println(" y out of x")
            }
        }
    }


}

//in和!in检测是否在区间内
fun whenin(){
    val x=0
    when (x) {
        in 1..10 -> print("x is in the range")
        !in 10..20 -> print("x is outside the range")
        else -> print("none of the above")
    }
}
fun hasPrefix(x:Any)=when(x){
    is String ->x.startsWith("prefix")
    else ->false
}



