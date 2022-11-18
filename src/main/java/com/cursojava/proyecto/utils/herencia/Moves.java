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

    public List<String> getMov() {
        return mov;
    }

    public void setMov(List<String> mov) {
        this.mov = mov;
    }

    @Override
    public String toString() {
        return "Movimiento{" +
                "movimientos=" + mov +
                '}';
    }

    public String getMovimientoAleatorio(){
        int index =  (int)Math.floor(Math.random()*(this.mov.size()));
        return this.mov.get(index);
    }
}
