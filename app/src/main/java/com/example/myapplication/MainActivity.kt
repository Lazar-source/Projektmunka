package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.provider.MediaStore
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import com.google.android.youtube.player.YouTubeStandalonePlayer
import kotlinx.android.synthetic.main.kliens_main.*

import kotlinx.android.synthetic.main.main.*
import kotlinx.android.synthetic.main.server_name.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main)
        button_szerver.setOnClickListener {
            startActivity(Intent(this,Server_Choose::class.java))
        }
        button_kliens.setOnClickListener {
            startActivity(Intent(this,Client_Choose::class.java))
        }



    }
}




