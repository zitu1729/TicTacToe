package com.internshala.ticktactoe

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    var newGame: Button? = null
    var exit: Button? = null
    var about: Button? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        newGame = findViewById(R.id.new_game)
        exit = findViewById(R.id.exit_game)
        about = findViewById(R.id.about_game)

        newGame?.setOnClickListener({
            var startAct = Intent(this@MainActivity, PlayingScreen::class.java)
            startActivity(startAct)
        })

        exit?.setOnClickListener({
            this.finish()
        })
        about?.setOnClickListener({
            Toast.makeText(this@MainActivity, "App version:1.0 developer{jitendra}", Toast.LENGTH_LONG).show()
        })

    }
}

