package com.cua.pokemobs.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import com.cua.pokemobs.R
import com.cua.pokemobs.databinding.ActivityDetailBinding
import com.cua.pokemobs.viewmodel.PokemonViewModel
class DetailActivity : AppCompatActivity() {
    private lateinit var bind:ActivityDetailBinding
    private lateinit var str:String
    private val viewModel by lazy {
        ViewModelProviders.of(this).get(PokemonViewModel::class.java)
    }

    companion object {
        const val SEARCH_PK = "SearchString"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initBinding()
        val intent = intent
        str = intent.getStringExtra(SEARCH_PK)
        gets(str)

    }

    private fun gets(str:String)
    {
        viewModel.getData(str.toLowerCase())
    }

    private fun initBinding()
    {
        bind = DataBindingUtil.setContentView(this@DetailActivity, R.layout.activity_detail)
        bind.apply {
            viewModel = this@DetailActivity.viewModel
        }
    }
}
