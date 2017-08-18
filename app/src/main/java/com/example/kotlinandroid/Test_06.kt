package com.example.kotlinandroid

import android.content.Context
import android.util.AttributeSet

/**
 * Created by Administrator on 2017/8/16.
 * Kotlin继承
 */

fun main(args:Array<String>){
    val s=Student("Runoob",18,"S123456",89)
    println("学生名:${s.name}")
    println("年龄：${s.age}")
    println("学生号:${s.no}")
    println("成绩:${s.score}")

    val s2=Student2("zhangsan",18,"S54321",99)

    val s3=Student3()
    s3.study()

    val c=C()
    c.f()
    c.a()
    c.b()

    val bar=Bar1()
    bar.a()

}

class Example//隐式集成Any

open class Personss(var name: String,var age: Int){
    //open修饰基类
    /**次级构造函数**/
}

class Student(name:String,age:Int,var no:String,var score:Int):Personss(name,age){

}

//子类没有主构造函数

open class Person2(name:String){
    constructor(name: String,age: Int):this(name){
        println("------------------基类次级构造函数-----------------------")
    }
}

class Student2:Person2{
    constructor(name: String,age: Int,no: String,score: Int):super(name,age){
        println("------------------继承次级构造函数---------------------")
        println("学生名:${name}")
        println("年龄:${age}")
        println("学号：${no}")
        println("分数:${score}")
    }

}

open class Person3{
    open fun study(){  //允许子类重写
        println("我毕业了")
    }
}
//继承Person类
class Student3:Person3(){
    override fun study() {
        super.study()
        println("我在读大学")
    }
}
//open定义可继承的基类以及可重写的方法
open class A{
    open fun f(){
        println("执行了f方法")
    }
    open fun a(){
        println("执行了a方法")
    }
}

interface B{
    fun f(){
        println("执行了接口f方法")
    }
    fun b(){
        println("执行了接口b方法")
    }
}

class C():A(),B {
    override fun f() {
        super<A>.f()
        super<B>.f()
    }
    override fun a(){
       super<A>.a()
    }

    override fun b() {
        super.b()
    }

}

//属性重写
open class Foo
{
    open var x:Int=1
}
class Bar1:Foo(){
    override var x:Int=1
    fun a(){
        println("x is ${x}")
    }
}

interface Foos{
    val count:Int
}
class Bar2:Foos{
    override val count: Int
        get() = TODO("not implemented") //To change initializer of created properties use File | Settings | File Templates.

}
class Bar3:Foos{
    override val count: Int
        get() = TODO("not implemented") //To change initializer of created properties use File | Settings | File Templates.
}