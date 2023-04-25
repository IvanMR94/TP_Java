package org.example;

public class Ronda {
    private int numeroRonda;
    private Partido partido;

    public Ronda(int numeroRonda, Partido partido) {
        this.numeroRonda = numeroRonda;
        this.partido = partido;
    }

    public int puntos() {
        if (partido.getGolesEquipo1() > partido.getGolesEquipo2()) {
            return 2;
        } else if (partido.getGolesEquipo2() > partido.getGolesEquipo1()) {
            return 2;
        } else {
            return 1;
        }
    }
}



