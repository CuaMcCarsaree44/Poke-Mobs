package com.cua.pokemobs.model.MainLink

import com.google.gson.annotations.SerializedName

data class StatsItem(

    val stat: Stat? = null,

    @field:SerializedName("base_stat")
    val baseStat: Int? = null,

    val effort: Int? = null
)

data class Stat(
    val name: String? = null,
    val url: String? = null
)

