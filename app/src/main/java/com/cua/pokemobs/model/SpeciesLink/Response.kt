package com.cua.pokemobs.model.SpeciesLink

import com.google.gson.annotations.SerializedName

data class Response(

	@field:SerializedName("genera")
	val genera: List<GeneraItem?>? = null,

	@field:SerializedName("capture_rate")
	val captureRate: Int? = null,

	@field:SerializedName("forms_switchable")
	val formsSwitchable: Boolean? = null,

	@field:SerializedName("id")
	val id: Int? = null,

	@field:SerializedName("is_baby")
	val isBaby: Boolean? = null,

	@field:SerializedName("order")
	val order: Int? = null,

	@field:SerializedName("base_happiness")
	val baseHappiness: Int? = null,

	@field:SerializedName("names")
	val names: List<NamesItem?>? = null,

	@field:SerializedName("gender_rate")
	val genderRate: Int? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("has_gender_differences")
	val hasGenderDifferences: Boolean? = null,

	@field:SerializedName("hatch_counter")
	val hatchCounter: Int? = null,

	@field:SerializedName("form_descriptions")
	val formDescriptions: List<Any?>? = null
)