package com.cursojava.proyecto.patterns.creational.abstractFactory;

import com.cursojava.proyecto.utils.herencia.Fuego;
import com.cursojava.proyecto.utils.herencia.Moves;

public class PokemonFuego implements AprenderMovimiento{

    @Override
    public Moves aprenderMovimiento() {
        return new Fuego();
    }
}
