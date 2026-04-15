package com.aulasandroid.pokemon_api.model

import com.google.gson.annotations.SerializedName


data class PokemonResponse(

    @SerializedName("results")
    val results: List<Pokemon>
        )

data class Pokemon (
    @SerializedName("count")
    val count: Int,
    @SerializedName("name")
    val name: String = "",
    @SerializedName("url")
    val url: String = ""
)
fun getPokemonIdFromUrl(url: String): String {
    return url.split("/").filter { it.isNotEmpty() }.last()
}
