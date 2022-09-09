package com.internshala.ticktactoe

import android.content.Intent
import android.os.Build
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.support.annotation.RequiresApi
import android.widget.ProgressBar
import java.util.*

class SplashScreen : AppCompatActivity() {

    var progressBar: ProgressBar? = null
    var mProgressStatus = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        progressBar = findViewById(R.id.progressBar)


        Thread(Runnable {
            while (mProgressStatus < 100) {
                try {
                    mProgressStatus += 1
                    Thread.sleep(20)
                } catch (e: InterruptedException) {
                    e.printStackTrace()
                }
                progressBar?.setProgress(mProgressStatus)
            }
        }).start()

        Handler().postDelayed(
                {
                    var startAct = Intent(this@SplashScreen, MainActivity::class.java)
                    startActivity(startAct)
                    this.finish()
                }, 2000)
    }
}
