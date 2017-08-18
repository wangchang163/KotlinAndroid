package com.example.kotlinandroid

/**
 * Created by Administrator on 2017/8/15.
 */
class Greeter(val name: String) {
    fun greet() {
        println("Hello, ${name}");
    }
}

fun main(args: Array<String>) {
    Greeter("aa").greet()
    println(sum(1, 2))
    printSum(2, 3)
    vars(1, 2, 3, 4, 5)
    val sumLambda: (Int, Int) -> Int = { x, y -> x + y }
    println(sumLambda(1, 2))
    replaceStr()
    if (args.size < 2) {
        print("Two integers expected")
        return
    }
}

//有返回值
fun sum(a: Int, b: Int): Int {
    return a + b
}

//无返回值，不写返回类型
fun printSum(a: Int, b: Int) {
    println(a + b)
}

//可变长参数函数
fun vars(vararg v: Int) {
    for (vt in v) {
        print(vt)
    }
}

//定义常量与变量
/**
 * 可变 var<标识符>：类型 =初始化值
 * 不可变 val<标识符>：类型=初始化值
 */

//字符串模板
fun replaceStr() {
    var a = 1
    val s1 = "a is $a"
    a = 2
    val s2 = "${s1.replace("is", "was")},but now is $a"
    println(s2)
}

//null检查机制
var age: String? = "23"
val ages = age!!.toInt()
val ages1 = ages?.toInt()
val ages2 = age?.toInt() ?: -1

//条件表达式

fun parseInt(str: String): Int? {
 return null
}



