package edu.parkingproject.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private final String URL = "jdbc:mysql://localhost:3306/parking";
    private final String USER = "root";
    private final String PASSWORD = "ormazudvar";

    public Connection getConnection(){
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(URL,USER,PASSWORD);
            System.out.println("Connection is OK");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return connection;
    }
}
