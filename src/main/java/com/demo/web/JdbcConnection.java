package com.demo.web;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcConnection {

    static String user = "root";
    static String password = "root";
    static String url = "jdbc:mysql://localhost:3306/api_registry_db?serverTimezone=America/Lima";

    Connection connection = null;

    static Connection connection1;

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection1 = DriverManager.getConnection(url, user, password);
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public JdbcConnection() throws SQLException {
    }

    public static Connection getConnection() {
        return connection1;
    }
}
