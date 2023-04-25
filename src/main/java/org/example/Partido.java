package org.example;

public class Partido {
    private Equipo equipo1;
    private Equipo equipo2;
    private int golesEquipo1;
    private int golesEquipo2;

    public Partido(Equipo equipo1, Equipo equipo2) {
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
    }

    public void setGolesEquipo1(int golesEquipo1) {
        this.golesEquipo1 = golesEquipo1;
    }

    public void setGolesEquipo2(int golesEquipo2) {
        this.golesEquipo2 = golesEquipo2;
    }

    public int getGolesEquipo1() {
        return golesEquipo1;
    }

    public int getGolesEquipo2() {
        return golesEquipo2;
    }


    // metodo para el resultado
    public String getResultado() {
        if (golesEquipo1 > golesEquipo2) {
            return equipo1.getNombre() + " ganó";
        } else if (golesEquipo2 > golesEquipo1) {
            return equipo2.getNombre() + " ganó";
        } else {
            return "Empate";
        }
    }


}
