package com.cua.pokemobs.services

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import java.util.concurrent.TimeUnit

class ApiConnection {

    private val loggingInterceptor: HttpLoggingInterceptor by lazy {
        HttpLoggingInterceptor()
            .setLevel(HttpLoggingInterceptor.Level.BODY)
    }

    private val httpClient: OkHttpClient by lazy {
        OkHttpClient.Builder()
            .connectTimeout(1, TimeUnit.MINUTES)
            .readTimeout(1, TimeUnit.MINUTES)
            .followRedirects(false)
            .addNetworkInterceptor(loggingInterceptor)
            .addInterceptor { chain ->
                val builderNew = chain.request().newBuilder()
                builderNew.addHeader("Accept", "application/vnd.api+json")
                builderNew.addHeader("Content-Type", "application/vnd.api+json")
                val requestNew = builderNew.build()
                chain.proceed(requestNew)
            }
            .build()
    }

    private fun setInit():Retrofit
    {
        return Retrofit.Builder().baseUrl(MAIN_API_POKEMON)
            .addConverterFactory(GsonConverterFactory.create()).client(httpClient).build()
    }

    private fun setInit2():Retrofit
    {
        return Retrofit.Builder().baseUrl(MAIN_API_IMAGE)
            .addConverterFactory(GsonConverterFactory.create()).client(httpClient).build()
    }

    private fun setInit3():Retrofit
    {
        return Retrofit.Builder().baseUrl(MAIN_API_SPECIES)
            .addConverterFactory(GsonConverterFactory.create()).client(httpClient).build()
    }

    fun getInstance():ApiServices
    {
        return setInit().create(ApiServices::class.java)
    }

    fun getInstanceForImage():ApiServices
    {
        return setInit2().create(ApiServices::class.java)
    }

    fun getInstanceForSpecies():ApiServices
    {
        return setInit3().create(ApiServices::class.java)
    }

    companion object {
        private const val MAIN_API_POKEMON = "https://pokeapi.co/api/v2/pokemon/"
        private const val MAIN_API_SPECIES = "https://pokeapi.co/api/v2/pokemon-species/"
        private const val MAIN_API_IMAGE = "https://pokeapi.co/api/v2/pokemon-form/"
    }
}