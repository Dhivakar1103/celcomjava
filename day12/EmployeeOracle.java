package com.celcom.day12;
import java.sql.*;

public class EmployeeOracle {
    public static void main(String[] args) {
        String url = "jdbc:oracle:thin:@localhost:1521:XE";
        String username = "system";
        String password = "12345678";

        try {
            // Load the Oracle JDBC driver explicitly
            Class.forName("oracle.jdbc.driver.OracleDriver");

            // Establish connection
            try (Connection conn = DriverManager.getConnection(url, username, password);
                 Statement stmt = conn.createStatement();
                 ResultSet rs = stmt.executeQuery("SELECT * FROM emp")) {

                System.out.println("Connected to Oracle XE successfully!");

                // Print Employee Details
                while (rs.next()) {
                    System.out.println("Employee ID: " + rs.getInt("id") +
                                       ", Name: " + rs.getString("name")+
                                      " Age: " + rs.getInt("age"));
                }
            }
        } catch (ClassNotFoundException e) {
            System.out.println("Oracle JDBC Driver not found!");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Database connection failed!");
            e.printStackTrace();
        }
    }
}