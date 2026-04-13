package com.aulasandroid.pokemon_api.model


data class PokemonList(
    val results: List<Pokemon>
        )

data class Pokemon (
    val name: String = "",
    val url: String = ""

)
