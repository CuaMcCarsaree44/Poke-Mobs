package com.cua.pokemobs.services

import com.cua.pokemobs.model.image.ImageResponse
import retrofit2.http.GET
import retrofit2.http.Path
import com.cua.pokemobs.model.mainlink.MainResponse
import com.cua.pokemobs.model.specieslink.SpeciesResponse
import retrofit2.Call

interface ApiServices {
    @GET("{endpoint}/")
    fun getMain(@Path("endpoint") pokemon:String): Call<MainResponse>

    @GET("{endpoint}/")
    fun getSpecies(@Path("endpoint") pokemon:String): Call<SpeciesResponse>

    @GET("{endpoint}/")
    fun getImage(@Path("endpoint") pokemon:String): Call<ImageResponse>
}