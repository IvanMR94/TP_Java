package org.example;

public class Equipo {
    private String nombre;

    //Constructor
    public Equipo(String nombre) {
        this.nombre = nombre;
    }

    //Métodos "get" y "set" para acceder y modificar el atributo "nombre".
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
