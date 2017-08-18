package com.example.kotlinandroid

/**
 * Created by Administrator on 2017/8/17.
 * Kotlin扩展
 */

fun main(args: Array<String>) {
    val user = User("张三")
    user.Print()

    val l = mutableListOf(1, 2, 3)
    l.swap(0, 2)
    println(l.toString())

    println(DD().foo())
    println(CCC().foo())
    printFoo(DD())

    val e=E()
    e.foo()
    E().foo()

    val t="asa"
    println(t.toString())

    println("no:${MyClass.no}")
    MyClass.foo()

    val g=G()
    g.caller(F())
}

class User(var name: String)

fun User.Print() {
    print("用户名:${name}")
}

fun MutableList<Int>.swap(index1: Int, index2: Int) {
    val tmp = this[index1]
    this[index1] = this[index2]
    this[index2] = tmp
}

//this指代接收者对象‘

open class CCC
class DD : CCC()

fun CCC.foo() = "c"
fun DD.foo() = "d"

fun printFoo(c: CCC) {
    println(c.foo())
}
//若扩展函数和成员函数一致，则使用该函数时，会优先使用成员函数。
class E {
    fun foo() {
        println("成员函数")
    }
}

fun E.foo() {
    println("扩展函数")
}

//扩展一个空对象
fun Any?.toString():String{
    if(this==null)
        return "null"
    else
        println("Not Null")
    return toString()

}

//伴生对象的扩展
class MyClass{
    companion object {

    }
}

fun MyClass.Companion.foo(){
    println("伴生对象的扩展函数")
}

val MyClass.Companion.no:Int
get() = 10

class F{
    fun bar(){
        println("F bar")
    }
}

class G{
    fun bar(){
        println("G bar")
    }
    fun F.foo(){
        bar()
        this@G.bar()
    }

    fun caller(f:F){
        f.foo()
    }
}
