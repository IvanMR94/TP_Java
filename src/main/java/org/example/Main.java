package org.example;

import java.sql.*;

public class Main {
    public static void main(String[] args) {


       Equipo equipo1 = new Equipo("Real Madrid");
       Equipo equipo2 = new Equipo("Barcelona");



        //crea un partido
        Partido partido = new Partido(equipo1, equipo2);

        partido.setGolesEquipo1(1);
        partido.setGolesEquipo2(0);




        //imprime el resultado en consola
        String resultado = partido.getResultado();
        System.out.println(resultado);




        //Crea rondas y otorga puntaje
        Ronda ronda = new Ronda(1, partido);
        int puntos = ronda.puntos();
        System.out.println(puntos);



        //Imprime quien ganó
        ResultadoEnum resultadoPartido = ResultadoEnum.obtenerResultado(partido);

        if (resultadoPartido == ResultadoEnum.GANO_LOCAL) {
            System.out.println("El equipo local ganó el partido");
        } else if (resultadoPartido == ResultadoEnum.GANO_VISITANTE) {
            System.out.println("El equipo visitante ganó el partido");
        } else {
            System.out.println("El partido terminó en empate");
        }





        // Se da un pronostico de algun partido
        Partido nuevoPartido = new Partido(new Equipo("Equipo A"), new Equipo("Equipo B"));
        partido.setGolesEquipo1(0);
        partido.setGolesEquipo2(1);

        Equipo equipoPronosticado = new Equipo("Equipo A");
        ResultadoEnum resultadoPronosticado = ResultadoEnum.GANO_LOCAL;

        Pronostico pronostico = new Pronostico(partido, equipoPronosticado, resultadoPronosticado);

        int puntosObtenidos = pronostico.obtenerPuntos();
        System.out.println("El pronóstico obtuvo " + puntosObtenidos + " puntos");

    }
}