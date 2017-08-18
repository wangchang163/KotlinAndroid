package com.example.kotlinandroid

/**
 * Created by Administrator on 2017/8/16.
 * Kotlin循环控制
 */
fun main(args: Array<String>) {
    indices()
    index()
    t_do_while()
}

//通過索引遍历数组或者list
fun indices() {
    val x = arrayOf(1, 2, 3, 4, "5", "6")
    for (i in x.indices) {
        print(x[i])
    }

    for ((index, value) in x.withIndex()) {
        print(value)
    }
}

fun index() {
    val items = listOf<String>("apple", "banana", "kiwi")
    for (i in items) {
        println(i)
    }

    for (index in items.indices) {
        println(items[index])
    }
    for ((index, value) in items.withIndex()) {
        println(index)
    }
}

fun t_do_while() {
    println("---------while的使用---------------")
    var x = 5
    while (x > 0) {
        println("x=" + x--)
    }
    println("----------do-while的使用-----------")
    var y = 5
    do {
        println("y=" + y--)
    } while (y > 0)
}

fun foo(){

}