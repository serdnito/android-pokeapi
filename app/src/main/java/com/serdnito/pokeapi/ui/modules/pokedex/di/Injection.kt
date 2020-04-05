package com.serdnito.pokeapi.ui.modules.pokedex.di

import com.serdnito.pokeapi.ui.modules.pokedex.view.PokedexActivity
import com.serdnito.pokeapi.ui.modules.pokedex.view.list.PokedexFragment

internal fun PokedexFragment.inject() {
    (activity as PokedexActivity).pokedexComponent.inject(this)
}