package org.example;

public class Pronostico {
    private Partido partido;
    private Equipo equipo;
    private ResultadoEnum resultado;

    public Pronostico(Partido partido, Equipo equipo, ResultadoEnum resultado) {
        this.partido = partido;
        this.equipo = equipo;
        this.resultado = resultado;
    }

    public int obtenerPuntos() {
        ResultadoEnum resultadoPartido = ResultadoEnum.obtenerResultado(partido);

        if (resultadoPartido == resultado) {
            return resultado == ResultadoEnum.EMPATO ? 1 : 2;
        } else {
            return 0;
        }
    }

    public Partido getPartido() {
        return partido;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public ResultadoEnum getResultado() {
        return resultado;
    }
}