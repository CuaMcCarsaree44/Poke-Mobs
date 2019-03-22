package com.cua.pokemobs.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.cua.pokemobs.R

class SearchActivity : AppCompatActivity(){
    private lateinit var search:Button
    private lateinit var name:EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search)

        search = findViewById(R.id.searchButton)
        name = findViewById(R.id.searchTextbox)
        search.setOnClickListener {
            val intent = Intent(this@SearchActivity, DetailActivity::class.java)
            intent.putExtra(DetailActivity.SEARCH_PK, name.text.toString())
            startActivity(intent)
        }
    }
}
