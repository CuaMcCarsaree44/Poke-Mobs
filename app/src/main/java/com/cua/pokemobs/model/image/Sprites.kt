package com.cua.pokemobs.model.image

import com.google.gson.annotations.SerializedName

data class Sprites(
	@field:SerializedName("front_default")
	val frontDefault: String = ""
)