package com.cua.pokemobs.viewmodel

import android.util.Log
import android.widget.Toast
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.cua.pokemobs.model.image.ImageResponse
import com.cua.pokemobs.model.mainlink.MainResponse
import com.cua.pokemobs.model.specieslink.SpeciesResponse
import com.cua.pokemobs.services.ApiConnection
import com.cua.pokemobs.services.ApiServices
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class PokemonViewModel: ViewModel() {
    private var api:ApiServices = ApiConnection().getInstance()
    val pokemonData = MutableLiveData<MainResponse>()
    val pokemonImage = MutableLiveData<ImageResponse>()
    val pokemonSpecies = MutableLiveData<SpeciesResponse>()

    fun getData(search:String)
    {
        api.getMain(search).enqueue(object: Callback<MainResponse>{
            override fun onFailure(call: Call<MainResponse>, t: Throwable) {
                Log.d("CALL API", "RESPONSE FAILURE")
            }

            override fun onResponse(call: Call<MainResponse>, response: Response<MainResponse>) {
                if(response.isSuccessful)
                {
                    Log.d("CALL API", "RESPONSE SUCCESS")
                    response.body()?.let {
                        Log.d("CALL API", "RESPONSE BODY IS ${it.name}")
                        pokemonData.postValue(it)
                    }
                }else
                {
                    Log.d("CALL API", "RESPONSE FAILURE")
                }
            }

        })

        api = ApiConnection().getInstanceForImage()
        api.getImage(search).enqueue(object: Callback<ImageResponse>
        {
            override fun onFailure(call: Call<ImageResponse>, t: Throwable) {
                Log.d("CALL API", "IMAGE FAILURE")
            }

            override fun onResponse(call: Call<ImageResponse>, response: Response<ImageResponse>) {
                if(response.isSuccessful)
                {
                    response.body()?.let{
                        pokemonImage.postValue(it)
                    }
                }else
                {
                    Log.d("CALL API", "IMAGE FAILURE")
                }
            }
        })

        api = ApiConnection().getInstanceForSpecies()

        api.getSpecies(search).enqueue(object: Callback<SpeciesResponse>{
            override fun onFailure(call: Call<SpeciesResponse>, t: Throwable) {
                Log.d("CALL API", "SPECIES FAILURE")
            }

            override fun onResponse(call: Call<SpeciesResponse>, response: Response<SpeciesResponse>) {
                if(response.isSuccessful)
                {
                    response.body()?.let{
                        pokemonSpecies.postValue(it)
                    }
                }else
                {
                    Log.d("CALL API", "SPECIES FAILURE")
                }
            }

        })
    }
}