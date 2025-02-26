package com.celcom.day12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

//4. Create, update, insert, delete a table for a customer detail like(name, dob, address, father name, //Aadhar number, phone number etc...) in oracle
class CustomerDB {
	private static final String URL = "jdbc:oracle:thin:@//172.19.0.5:1521/trainingsql.celcom.com";
	private static final String USER = "training";
	private static final String PASS = "Celcom123";
	private Connection conn;
	private Scanner sc = new Scanner(System.in);

	public CustomerDB() {
		try {
			conn = DriverManager.getConnection(URL, USER, PASS);
			System.out.println("Connected to Oracle Database.");
		} catch (SQLException e) {
			System.out.println("Database connection failed!");
			e.printStackTrace();
		}
	}

	public void createDB() {
		System.out.println("Enter Name : ");
		String name = sc.next();
		System.out.println("Enter DateOfBirth :");
		String dob = sc.next();
		System.out.println("Enter Address : ");
		String address = sc.next();
		System.out.println("Enter Father Name :");
		String fatherName = sc.next();
		System.out.println("Enter Aadhar Number");
		long aadharNumber = sc.nextLong();
		System.out.println("Enter Phone Number");
		long phoneNumber = sc.nextLong();
		try {
			String query = "INSERT into newcustomer (name , dob ,address , father_name , aadhar_number ,phone_number)values (?, TO_DATE(?, 'YYYY-MM-DD'),?,?,?,?)";
			PreparedStatement ptst = conn.prepareStatement(query);
			ptst.setString(1, name);
			ptst.setString(2, dob);
			ptst.setString(3, address);
			ptst.setString(4, fatherName);
			ptst.setLong(5, aadharNumber);
			ptst.setLong(6, phoneNumber);
			ptst.executeUpdate();
			System.out.println("Data added Successfully");

		} catch (SQLException e) {
			System.out.println("Failed to Add Data ");
			e.printStackTrace();
		}

	}

	public void viewDB() {
		try {
			String sql = "SELECT * FROM NEWCUSTOMER";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			if (!rs.isBeforeFirst()) {
				System.out.println("No Customer found.");
				return;
			}
			while (rs.next()) {
				System.out.println("----------------------------");
				System.out.println("Name: " + rs.getString("name"));
				System.out.println("Date of birth: " + rs.getString("dob"));
				System.out.println("Address: " + rs.getString("address"));
				System.out.println("Father Name: " + rs.getString("father_Name"));
				System.out.println("Aadhar Number : " + rs.getLong("aadhar_Number"));
				System.out.println("Phone Number : " + rs.getLong("phone_Number"));

			}
		} catch (SQLException e) {
			System.out.println("Failed to retrieve employees!");
			e.printStackTrace();
		}
		System.out.println("----------------------------");
	}

	public void updateDB() {

		System.out.println("Enter the Phone Number : ");
		long phoneNumber = sc.nextLong();
		System.out.println("Enter Address : ");
		String address = sc.next();

		try {
			String sql = "UPDATE newcustomer set address = ? where phone_Number = ? ";
			PreparedStatement pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, address);
			pstmt.setLong(2, phoneNumber);
			pstmt.executeUpdate();
			System.out.println("Customer Address successfully Executed ");

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void deleteDB() {
		System.out.print("Enter Phone Number  to delete: ");
		long phoneNumber = sc.nextLong();

		try {
			String sql = "DELETE FROM newcustomer WHERE phone_Number  = ?";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setLong(1, phoneNumber);
			int rows = pstmt.executeUpdate();

			if (rows > 0) {
				System.out.println("Customer deleted successfully");
			} else {
				System.out.println(" Customer not found");
			}
		} catch (SQLException e) {
			System.out.println("Failed to delete employee!");
			e.printStackTrace();
		}
	}
}

public class OracleQuestion4 {

	public static void main(String[] args) {
		CustomerDB db = new CustomerDB();
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("\nMenu:");

			System.out.println("1. Insert Customer");
			System.out.println("2. View Customers");
			System.out.println("3. Update Customer");
			System.out.println("4. Delete Customer");
			System.out.println("5. Exit");
			System.out.println("Enter a choice : ");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				db.createDB();
				break;
			case 2:
				db.viewDB();
				break;
			case 3:
				db.updateDB();
				break;
			case 4:
				db.deleteDB();
				break;
			case 5:
				System.exit(0);
				break;
			default:
				System.out.println("Enter a valid choice");

			}
		}

	}
}
