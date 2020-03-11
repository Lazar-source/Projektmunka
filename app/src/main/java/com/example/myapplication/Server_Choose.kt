package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.server_name.*

class Server_Choose : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.server_name)
        button_nameSelect.setOnClickListener {
            startActivity(Intent(this, Server_withName::class.java))
        }
    }
}