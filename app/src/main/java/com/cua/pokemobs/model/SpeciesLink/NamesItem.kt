package com.cua.pokemobs.model.SpeciesLink

import com.google.gson.annotations.SerializedName

data class NamesItem(

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("language")
	val language: Language? = null
)