package com.cua.pokemobs.model.MainLink

data class Response(
	val types: List<TypesItem?> = emptyList(),
	val weight: Int = 0,
	val abilities: List<AbilitiesItem?> = emptyList(),
	val species: Species = Species(),
	val stats: List<StatsItem?> = emptyList(),
	val name: String = "",
	val id: Int = 0,
	val height: Int = 0
)