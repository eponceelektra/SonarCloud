package com.cursojava.proyecto.utils.herencia;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Moves {

    protected List<String> mov;

    protected Moves(){
        this.mov = new ArrayList<>();
    }

    public String action (String nombre){
        Random rnd = new Random();
        int r = rnd.nextInt(mov.size());
        return nombre + " attack with an "+ mov.get(r);
    }
    
    @Override
    public String toString() {
        return "Movimiento { movimientos=" + mov.toString() + "}";
    }

    public String getMovimientoAleatorio(){
        int index =  (int)Math.floor(Math.random()*(this.mov.size()));
        return this.mov.get(index);
    }
}
