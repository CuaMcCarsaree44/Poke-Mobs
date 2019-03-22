package com.cua.pokemobs.model.MainLink

data class TypesItem(
    val slot: Int = 0,
    val type: Type = Type()
)

data class Type(
    val name: String = "",
    val url: String = ""
)