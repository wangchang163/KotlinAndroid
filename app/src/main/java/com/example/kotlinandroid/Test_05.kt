package com.example.kotlinandroid

/**
 * Created by Administrator on 2017/8/16.
 * Kotlin类和对象
 */
fun main(args:Array<String>){
    var site=Runoobb()//Kotlin沒有new关键字
    println("name:"+site.name)
    println("url:"+site.url)
    println("city:"+site.city)
    var person:Person= Person()
    person.lastName="wang"
    println("lastName:${person.lastName}")
    person.no=9
    println("no:${person.no}")
    person.no=20
    println("no:${person.no}")

    val runoob=Runoobs("菜鸟编程")
    println(runoob.siteName)
    println(runoob.url)
    println(runoob.country)
    runoob.printTest()

    val runoub=Runoub("菜鸟教程",10000)
    println(runoub.siteName)
    println(runoub.url)
    println(runoub.country)
    runoub.printTest()

    val demo=Outer.Nested().foo()
    println(demo)

    val demo2=Outeer().Inner().foo()
    println(demo2)
    println(Outeer().Inner().innerTest())

    var test = Test()

    /**
     * 采用对象表达式来创建接口对象，即匿名内部类的实例。
     */
    test.setInterFace(object : TestInterFace {
        override fun test() {
            println("实现接口方法--->"+test.v)
        }
    })
}

class Runoob{
    //类名Runoob

}

class Empty//空类

class Runoobb(){
    //类属性，var可变，val不可变
    var name:String="张三"
    var url:String="www.baidu.com"
    var city:String="北京"
    //类成员函数
    fun foo(){
        println("Foo")
    }
}

class Persion constructor(firstName:String){}
class Persionn(firstName: String){
    init {
        //初始化代码
    }
}

//修改getter，set方法
class Person{
    var lastName:String="zhang"
    get() = field.toUpperCase()
    set

    var no:Int=100
    get() = field
    set(value){
        if(value<10){
            field=value
        }else{
            field=-1
        }
    }

    var height:Float=145.4f
    private set
}


class LazyProperty(val initializer:()->Int){
    var value:Int?=null
    val lazy:Int
    get() {
        if (value==null){
            value=initializer()
        }
        return value!!
    }
}

class Runoobs constructor(name:String){
    var url:String="http://www.runoob.com"
    var country:String="CN"
    var siteName=name

    init {
        println("初始化网站名：${name}")
    }
    fun printTest(){
        println("我是类的函数")
    }

}
//次构造函数
class Persons{
    constructor(parent:Persons)
    {
       parent.foo()
    }
    fun foo(){}
}

class Runoub constructor(name:String){
    var url:String="http://www.runoob.com"
    var country:String="CN"
    var siteName=name

    init {
        println("初始化网站名：${name}")
    }

    //次构造函数
    constructor(name: String,alexa:Int):this(name){
        println("Alexa 排名 $alexa")
    }

    fun printTest(){
        println("我是类的函数")
    }

}

//抽象类
open class Base{
    open fun f(){}
}

abstract class Derived:Base(){
    override abstract fun f()
}
//嵌套类
class Outer{
    private val bar:Int=1
    class Nested{
        fun foo()=2
    }

}

//内部类
class Outeer{
    private val bar:Int=1
    var v="成员属性"
    inner class Inner{
        fun foo()=bar
        fun innerTest(){
            var o=this@Outeer
            println("内部类可以引用外部类成员，例如："+o.v)
        }
    }
}

//匿名内部类

class Test {
    var v = "成员属性"

    fun setInterFace(test: TestInterFace) {
        test.test()
    }
}

/**
 * 定义接口
 */
interface TestInterFace {
    fun test()
}
