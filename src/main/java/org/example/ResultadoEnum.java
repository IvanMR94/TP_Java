package org.example;

public enum ResultadoEnum {
    GANO_LOCAL,
    GANO_VISITANTE,
    EMPATO;

    public static ResultadoEnum obtenerResultado(Partido partido) {
        if (partido.getGolesEquipo1() > partido.getGolesEquipo2()) {
            return GANO_LOCAL;
        } else if (partido.getGolesEquipo2() > partido.getGolesEquipo1()) {
            return GANO_VISITANTE;
        } else {
            return EMPATO;
        }
    }
}