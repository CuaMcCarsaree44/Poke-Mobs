package com.cua.pokemobs.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.cua.pokemobs.R

class DetailActivity : AppCompatActivity() {
    companion object {
        const val SEARCH_PK = "SearchString"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val intent = intent
        var str:String = intent.getStringExtra(SEARCH_PK)
    }
}
