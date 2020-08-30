package jp.techacademy.kotlinlog

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val human = Human("田中", 33, "将棋")

        human.say()
        human.think()

        val human2 = Human("伊藤", 25,"釣り")
        human2.say()
        human2.think()
    }


}
