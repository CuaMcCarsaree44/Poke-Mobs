package com.cua.pokemobs.model.SpeciesLink

import com.google.gson.annotations.SerializedName

data class Language(

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("url")
	val url: String? = null
)