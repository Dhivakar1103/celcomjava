package com.celcom.day11;

import java.sql.*;
import java.util.Scanner;

class EmployeeDB {
	private Connection conn;
	private Scanner sc = new Scanner(System.in);

	public EmployeeDB() {
		try {
			String url = "jdbc:mysql://localhost:3306/empdetails";
			String username = "root";
			String pass = "12345678";
			conn = DriverManager.getConnection(url, username, pass);
		} catch (SQLException e) {
			System.out.println("Database Connection Failed!");
			e.printStackTrace();
		}
	}

	public void addEmployee() {
		System.out.print("Enter Employee ID: ");
		int employeeID = sc.nextInt();
		sc.nextLine();

		System.out.print("Enter Employee Name: ");
		String employeeName = sc.nextLine();

		System.out.print("Enter Mobile Number: ");
		long number = sc.nextLong();

		System.out.print("Enter Age: ");
		int age = sc.nextInt();

		try {
			String sql = "INSERT INTO employees (id, name, number, age) VALUES (?, ?, ?, ?)";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, employeeID);
			pstmt.setString(2, employeeName);
			pstmt.setLong(3, number);
			pstmt.setInt(4, age);
			int rowsUpdated = pstmt.executeUpdate();
			 
			System.out.println("Employee added successfully");
		} catch (SQLException e) {
			System.out.println("Failed to add employee!");
			e.printStackTrace();
		}
	}

	public void update() {
		System.out.println("Enter the employee id : ");
		int employeeID = sc.nextInt();
		System.out.print("Enter Mobile Number to update : ");
		long number = sc.nextLong();

		try {
			String sql = "UPDATE employees set number = ? Where id = ?";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setLong(1, number);
			pstmt.setInt(2, employeeID );
			pstmt.executeUpdate();
			
		} catch (SQLException e) {
			System.out.println("Failed to add employee!");
			e.printStackTrace();
		}
	}

	public void viewEmployees() {
		try {
			String sql = "SELECT * FROM employees";
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			if (!rs.isBeforeFirst()) {
				System.out.println("No employees found.\n");
				return;
			}
			while (rs.next()) {
				System.out.println("----------------------------");
				System.out.println("Employee ID: " + rs.getInt("id"));
				System.out.println("Employee Name: " + rs.getString("name"));
				System.out.println("Mobile Number: " + rs.getLong("number"));
				System.out.println("Age: " + rs.getInt("age"));

			}
		} catch (SQLException e) {
			System.out.println("Failed to retrieve employees!");
			e.printStackTrace();
		}
		System.out.println("----------------------------");
	}

	public void deleteEmployee() {
		System.out.print("Enter Employee ID to delete: ");
		int employeeID = sc.nextInt();

		try {
			String sql = "DELETE FROM employees WHERE id = ?";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, employeeID);
			int rows = pstmt.executeUpdate();

			if (rows > 0) {
				System.out.println("Employee deleted successfully!\n");
			} else {
				System.out.println("Employee ID not found!\n");
			}
		} catch (SQLException e) {
			System.out.println("Failed to delete employee!");
			e.printStackTrace();
		}
	}
}

public class EmployeeTask {
	public static void main(String[] args) {
		EmployeeDB detail = new EmployeeDB();
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("\nMenu:");
			System.out.println("1. Add Employee");
			System.out.println("2. View Employees");
			System.out.println("3. Delete Employee");

			System.out.println("4. Update Employee");
			System.out.println("5. Exit");
			System.out.print("Enter your choice: ");

			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				detail.addEmployee();
				break;
			case 2:
				detail.viewEmployees();
				break;
			case 3:
				detail.deleteEmployee();
				break;
			case 4:
				detail.update();
				break;
			case 5:

				System.out.println("Exiting...");
				sc.close();
				return;
			default:
				System.out.println("Invalid choice! Try again.\n");
			}
		}
	}
}
