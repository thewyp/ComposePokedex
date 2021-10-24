package com.thewyp.composepokedex.pokemondetail

import androidx.lifecycle.ViewModel
import com.thewyp.composepokedex.data.remote.responses.Pokemon
import com.thewyp.composepokedex.repository.PokemonRepository
import com.thewyp.composepokedex.util.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class PokemonDetailViewModel @Inject constructor(
    private val repository: PokemonRepository
) : ViewModel() {

    suspend fun getPokemonInfo(pokemonName: String): Resource<Pokemon> {
        return repository.getPokemonInfo(pokemonName)
    }
}