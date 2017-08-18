package com.example.kotlinandroid

/**
 * Created by Administrator on 2017/8/17.
 * kotlin接口
 */
fun main(args: Array<String>) {
    val child = Child()
    child.foo()
    child.bar()

    val impl=MyImpl()
    impl.bar()

    val d=D()
    d.bar()
    d.foo()
}

interface MyInterface {
    fun bar()
    fun foo() {
        // 可选的方法体
        println("foo")
    }
    var name:String
}
class Child: MyInterface {
    override var name: String="wang"
    override fun bar() {
        // 方法体
        println("bar")
    }

    override fun foo() {
        super.foo()
    }
}
class MyImpl:MyInterface{
    override var name: String="zhang"
    override fun bar() {
     println("name is ${name}")
    }

}

//函数重写

interface AA{
    fun foo(){
        println("AA--->A")
    }
    fun bar(){}//没有方法体，是抽象的
}
interface BB{
    fun foo(){
        println("BB--->B")
    }
    fun bar(){
        println("BB--->Bar")
    }
}
class CC:AA{
    override fun bar() {
        super.bar()
        println("AA--->bar")
    }
}

class D:AA, BB{
    override fun foo() {
        super<AA>.foo()
        super<BB>.foo()
    }

    override fun bar() {
        super<BB>.bar()
    }
}



