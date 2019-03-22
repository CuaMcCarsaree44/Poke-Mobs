package com.cua.pokemobs.model.MainLink

import com.google.gson.annotations.SerializedName

data class AbilitiesItem(

    @field:SerializedName("is_hidden")
    val isHidden: Boolean? = null,

    @field:SerializedName("ability")
    val ability: Ability? = null,

    @field:SerializedName("slot")
    val slot: Int? = null
)

data class Ability(

    @field:SerializedName("name")
    val name: String? = null,

    @field:SerializedName("url")
    val url: String? = null
)