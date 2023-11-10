package com.corenetworks.modelo;

public class Avion implements iObjetoVolador{
    private String color;

    @Override
    public String toString() {
        return "Avion{" +
                "color='" + color + '\'' +
                '}';
    }

    public Avion() {
    }

    public Avion(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String despegar() {
        return "El avion esta despegando";
    }

    @Override
    public String volar() {
        return "El avion está volando";
    }

    @Override
    public String aterrizar() {
        return "El avión está aterrizando";
    }
}
