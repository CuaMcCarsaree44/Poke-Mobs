package com.cua.pokemobs.model.MainLink

import com.google.gson.annotations.SerializedName

data class TypesItem(

    @field:SerializedName("slot")
    val slot: Int? = null,

    @field:SerializedName("type")
    val type: Type? = null
)

data class Type(

    @field:SerializedName("name")
    val name: String? = null,

    @field:SerializedName("url")
    val url: String? = null
)