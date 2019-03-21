package com.cua.pokemobs.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AlertDialog
import com.cua.pokemobs.R

class MenuActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var about: Button
    private lateinit var exit:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        about = findViewById(R.id.aboutButton)
        exit = findViewById(R.id.exitButton)
        about.setOnClickListener(this)
        exit.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v?.id)
        {
            R.id.aboutButton ->{
                var dial: AlertDialog.Builder = AlertDialog.Builder(this@MenuActivity)
                dial.setMessage("""Progress. Well the only working button is About and Exit.....
                """.trimMargin())
                dial.setTitle("About This App")
                dial.setPositiveButton("*Okay*", null)
                dial.setCancelable(true)
                dial.create().show()

            }

            R.id.exitButton -> System.exit(0)
        }
    }
}
