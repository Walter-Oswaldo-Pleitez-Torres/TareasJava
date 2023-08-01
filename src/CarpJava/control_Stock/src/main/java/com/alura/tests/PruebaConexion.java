package com.alura.tests;
//Intentando conectar a BD con instrucciones de Alura

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PruebaConexion {
    public static void main(String[] args) throws SQLException {
        Connection con = DriverManager.getConnection(
        "jdbc:mysql://localhost/control_Stock?useTimeZone=true&serverTimeZone=UTC", 
        "root",
        "vientomarea{sql}"
        );
        
        con.close();
    }
}
