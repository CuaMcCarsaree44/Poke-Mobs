package com.cua.pokemobs.model.SpeciesLink

import com.google.gson.annotations.SerializedName

data class GeneraItem(

	@field:SerializedName("genus")
	val genus: String? = null,

	@field:SerializedName("language")
	val language: Language? = null
)