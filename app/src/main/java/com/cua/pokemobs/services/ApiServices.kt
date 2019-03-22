package com.cua.pokemobs.services

import retrofit2.http.GET
import retrofit2.http.Path
import com.cua.pokemobs.model.MainLink.Response
import retrofit2.Call

interface ApiServices {
    @GET("pokemon/")
    fun getMain(@Path("pokemon") pokemon:String): Call<Response>

    @GET("pokemon-species/")
    fun getSpecies(@Path("pokemon") pokemon:String): Call<com.cua.pokemobs.model.SpeciesLink.Response>
}