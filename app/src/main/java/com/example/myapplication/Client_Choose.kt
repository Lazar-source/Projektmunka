
package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.kliens_main.*

class Client_Choose : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.kliens_main)
        button_kliensUjSzerverValaszt.setOnClickListener {
            startActivity(Intent(this,Client_List_Choose::class.java))
        }
        }
}

