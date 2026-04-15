package com.aulasandroid.pokemon_api.services


import com.aulasandroid.pokemon_api.model.Pokemon
import com.aulasandroid.pokemon_api.model.PokemonResponse
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface PokemonService {

    @GET(value = "pokemon")
    suspend fun getPokemons(
        @Query("limit") limit: Int
    ): PokemonResponse

    @GET("pokemon/{idOuNome}")
    suspend fun getPokemonById(
        @Path("idOuNome") idOuNome: String
        ): Pokemon

}