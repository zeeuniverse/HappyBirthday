package com.zia.happybirthday

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlin.LazyThreadSafetyMode.NONE

class MainActivity : AppCompatActivity() {


    private val textView: TextView by lazy(NONE) { findViewById(R.id.my_text_view) }



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        textView.text = "Happy Birthday"


    }
}