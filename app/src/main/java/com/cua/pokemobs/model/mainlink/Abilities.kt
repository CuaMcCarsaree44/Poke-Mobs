package com.cua.pokemobs.model.mainlink

import com.google.gson.annotations.SerializedName

data class AbilitiesItem(

    @field:SerializedName("is_hidden")
    val isHidden: Boolean = false,

    val ability: Ability = Ability(),
    val slot: Int = 0
)

data class Ability(
    val name: String = "",
    val url: String = ""
)