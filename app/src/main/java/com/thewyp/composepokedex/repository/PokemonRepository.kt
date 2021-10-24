package com.thewyp.composepokedex.repository

import com.thewyp.composepokedex.data.remote.PokeApi
import com.thewyp.composepokedex.data.remote.responses.Pokemon
import com.thewyp.composepokedex.data.remote.responses.PokemonList
import com.thewyp.composepokedex.util.Resource
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject

@ActivityScoped
class PokemonRepository @Inject constructor(
   private val api: PokeApi
) {

    suspend fun getPokemonList(limit: Int, offset: Int): Resource<PokemonList> {
        val response = try {
            api.getPokemonList(limit, offset)
        } catch(e: Exception) {
            return Resource.Error("An unknown error occured when getPokemonList.")
        }
        return Resource.Success(response)
    }

    suspend fun getPokemonInfo(pokemonName: String): Resource<Pokemon> {
        val response = try {
            api.getPokemonInfo(pokemonName)
        } catch(e: Exception) {
            return Resource.Error("An unknown error occured when getPokemonInfo.")
        }
        return Resource.Success(response)
    }
}