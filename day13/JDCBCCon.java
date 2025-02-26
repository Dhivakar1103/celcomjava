package com.celcom.day13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class JDBCCon {
	private static final String URL = "jdbc:oracle:thin:@//172.19.0.5:1521/trainingsql.celcom.com";
	private static final String USER = "training";
	private static final String PASS = "Celcom123";
	private static Connection conn;

	public static Connection connect() {
		try {
			conn = DriverManager.getConnection(URL, USER, PASS);

		} catch (SQLException e) {
			System.out.println("Database connection failed!");
			e.printStackTrace();
		}
		return conn;  

	}
}
