package com.corenetworks.modelo;

public class Ave implements iObjetoVolador{
    @Override
    public String despegar() {
        return "El ave está despegando";
    }

    @Override
    public String volar() {
        return "El ave está volando";
    }

    @Override
    public String aterrizar() {
        return "El ave está aterrizando";
    }
    public String hacerNido(){
        return "El ave está haciendo su nido";
    }
    public String ponerHUevo(){
        return "El ave está poniendo huevo";
    }

    @Override
    public String toString() {
        return "Ave{}";
    }
}
