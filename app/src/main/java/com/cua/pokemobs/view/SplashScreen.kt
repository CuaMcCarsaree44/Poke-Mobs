package com.cua.pokemobs.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.cua.pokemobs.R

class SplashScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sleep:Handler = Handler()
        sleep.postDelayed({
            startActivity(Intent(this@SplashScreen, MenuActivity::class.java))
            this@SplashScreen.finish()
        }
         , 2000
        )
    }
}
