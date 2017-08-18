package com.example.kotlinandroid

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val tv=findViewById(R.id.tv) as TextView
        tv.setOnClickListener {
            Toast.makeText(this,"点击了",Toast.LENGTH_SHORT).show()
        }

        fun sum(a:Int,b:Int):Int{
            return a+b
        }
    }
}
