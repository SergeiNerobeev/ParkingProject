//package edu.parkingproject.util;
//
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//import java.util.Properties;
//public class PropertiesUtil {
//public static Connection getConnection(){
//    String dbUrl = null;
//    String dbUserName = "sa";
//    String dbPassword = "";
//
//    FileInputStream fis;
//    Properties properties = new Properties();
//    try {
//        fis = new FileInputStream("src/main/resources/application.properties");
//        properties.load(fis);
//
//        dbUrl = properties.getProperty("db.host?");
//    } catch (FileNotFoundException e) {
//        throw new RuntimeException(e);
//    } catch (IOException e) {
//        throw new RuntimeException(e);
//    }
//    Connection connection = null;
//    try {
//        connection = DriverManager.getConnection(dbUrl,dbUserName,dbPassword);
//    } catch (SQLException ex) {
//        ex.printStackTrace();
//        System.out.println("KUKU EPTA!");
//    }
//    return connection;
//}
//
//
//}