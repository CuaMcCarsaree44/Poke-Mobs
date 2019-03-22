package com.cua.pokemobs.model.MainLink

import com.google.gson.annotations.SerializedName
data class Species(

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("url")
	val url: String? = null
)