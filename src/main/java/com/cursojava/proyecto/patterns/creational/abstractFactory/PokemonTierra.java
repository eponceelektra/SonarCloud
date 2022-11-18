package com.cursojava.proyecto.patterns.creational.abstractFactory;

import com.cursojava.proyecto.utils.herencia.Agua;
import com.cursojava.proyecto.utils.herencia.Moves;

public class PokemonTierra implements AprenderMovimiento{

    @Override
    public Moves aprenderMovimiento() {
        return new Agua();
    }
}
