package com.aulasandroid.pokemon_api.services

import com.aulasandroid.pokemon_api.model.PokemonList
import retrofit2.http.GET
import retrofit2.http.Path

interface PokemonService {

    @GET(value = "pokemon")
    fun getPokemons(@Path("results")result: List<PokemonList>)

}