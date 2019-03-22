package com.cua.pokemobs.model.MainLink

import com.google.gson.annotations.SerializedName

data class AbilitiesItem(

    @field:SerializedName("is_hidden")
    val isHidden: Boolean? = null,

    val ability: Ability? = null,
    val slot: Int? = null
)

data class Ability(

    val name: String? = null,
    val url: String? = null
)