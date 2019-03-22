package com.cua.pokemobs.model.MainLink

import com.google.gson.annotations.SerializedName

data class StatsItem(

    @field:SerializedName("stat")
    val stat: Stat? = null,

    @field:SerializedName("base_stat")
    val baseStat: Int? = null,

    @field:SerializedName("effort")
    val effort: Int? = null
)

data class Stat(

    @field:SerializedName("name")
    val name: String? = null,

    @field:SerializedName("url")
    val url: String? = null
)

