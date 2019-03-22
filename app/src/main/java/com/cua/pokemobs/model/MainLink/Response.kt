package com.cua.pokemobs.model.MainLink

import com.google.gson.annotations.SerializedName

data class Response(

	@field:SerializedName("location_area_encounters")
	val locationAreaEncounters: String? = null,

	val types: List<TypesItem?>? = null,

	@field:SerializedName("base_experience")
	val baseExperience: Int? = null,

	@field:SerializedName("held_items")
	val heldItems: List<Any?>? = null,

	val weight: Int? = null,

	@field:SerializedName("is_default")
	val isDefault: Boolean? = null,

	val abilities: List<AbilitiesItem?>? = null,
	val species: Species? = null,
	val stats: List<StatsItem?>? = null,
	val name: String? = null,
	val id: Int? = null,
	val height: Int? = null,
	val order: Int? = null
)