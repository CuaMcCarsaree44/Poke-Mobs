package com.cua.pokemobs.model.mainlink

import com.google.gson.annotations.SerializedName

data class StatsItem(

    val stat: Stat = Stat(),

    @field:SerializedName("base_stat")
    val baseStat: Int = 0,

    val effort: Int = 0
)

data class Stat(
    val name: String = "",
    val url: String = ""
)

