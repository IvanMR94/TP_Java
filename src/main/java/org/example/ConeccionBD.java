package org.example;

import java.sql.*;

public class ConeccionBD {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/pronosticos_partidos?serverTimezone=UTC";
        String username = "root";
        String password = "123456789";

        try{
            Connection connection = DriverManager.getConnection(url , username , password);
            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("SELECT * FROM resultados");
            while(resultSet.next()){
                System.out.println(resultSet.getString("idRonda") + " | " + resultSet.getString("Equipo1") + " | " +resultSet.getString("Goles1") + " | " + resultSet.getString("Equipo2") + " | " + resultSet.getString("Goles2")   );

            }

            connection.close();
            statement.close();
            resultSet.close();

        }catch (SQLDataException e){

        } catch (SQLException e) {
            e.printStackTrace();
        }
        ;

    }
}
