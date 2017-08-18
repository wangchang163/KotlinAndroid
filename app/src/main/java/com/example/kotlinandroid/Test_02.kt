package com.example.kotlinandroid

/**
 * Created by Administrator on 2017/8/16.
 */
fun main(args: Array<String>) {
    val a: Int = 10000
    println(a === a)
    val boxedA: Int? = a
    val anotherBoxedA: Int? = a
    println(boxedA === anotherBoxedA)
    println(boxedA == anotherBoxedA)
    println(decimalDifitValue('8'))
    pArray()
    strs(arrayOf("2","3"))
}

//===判断对象，==判断值

//类型转换
val b: Int = 1
val i: Byte = b.toByte()

val c: Byte = 1
val ii: Int = c.toInt()


//字符
fun check(c: Char) {
    if (c.equals("1")) {
    }
}

fun decimalDifitValue(c: Char): Int {
    if (c !in '0'..'9')
        throw IllegalArgumentException("out of range")
    return c.toInt() - '0'.toInt()

}

fun pArray(){
    val a= arrayOf(1,2,3)
    val b= Array(3,{i->(i*2)})
    println(a[0])
    println(b[2])
    val x:IntArray= intArrayOf(1,2,3)
    x[0]=x[1]+x[2]
    println(x[0])
}

fun strs(str:Array<String>){
    for (c in str){
        print(c+"   ")
    }
    val  text="""
     春眠不觉晓，
处处闻啼鸟。
夜来风雨声，
花落知多少。
          """
    println(text)
    println(text.trimStart())

    val i=10;
    val s="i=$i"
    println(s)

    val ss="run oob"
    val str="$ss.length is ${ss.length}"
    println(str)
}