package com.celcom.day13;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Functions {
	Scanner sc = new Scanner(System.in);
	Connection conn;

	public Functions() {

		conn = JDBCCon.connect();
	}

	public void newCus() {

		System.out.println("Enter the User ID");
		int cusID = sc.nextInt();
		System.out.println("Enter Name :");
		String name = sc.next();
		System.out.println("Enter the Account number :");
		long accNum = sc.nextLong();
		System.out.println("Enter the initial Balance");
		double balance = sc.nextDouble();
		try {

			String query = "insert into cusdata (cusID , name , accNum , balance)values (?,?,?,?)";
			PreparedStatement ptst = conn.prepareStatement(query);
			ptst.setInt(1, cusID);
			ptst.setString(2, name);
			ptst.setLong(3, accNum);
			ptst.setDouble(4, balance);
			ptst.executeUpdate();
			System.out.println("Data added successfully ");

		} catch (SQLException e) {
			System.out.println("Account not added");

		}
	}

	public void viewCus() {
		try {

			String query = "Select * from cusData";

			PreparedStatement pst = conn.prepareStatement(query);
			ResultSet rs = pst.executeQuery();
			if (!rs.isBeforeFirst()) {
				System.out.println("No data found ");
				return;

			}
			while (rs.next()) {
				System.out.println("Customer id : " + rs.getInt("cusId"));
				System.out.println("Customer name : " + rs.getString("name"));

				System.out.println("Account id : " + rs.getLong("accNum"));
				System.out.println("Balance  : " + rs.getDouble("balance"));

			}

		} catch (SQLException e) {
			System.out.println("Account not added");

		}
	}

	public void deposit() {
		try {
			System.out.println("Enter the Customer ID :");
			int cusID = sc.nextInt();
			System.out.println("Enter the amount to deposit :");
			double balance = sc.nextDouble();
			String query = "update cusdata set balance = balance + ? where cusID = ?";
			PreparedStatement pst = conn.prepareStatement(query);

			pst.setDouble(1, balance);
			pst.setInt(2, cusID);
			pst.execute();
			System.out.println("Customer ID Deposited successfully ");
		} catch (SQLException e) {
			System.out.println("Account not added");

		}
	}

	public void withdraw() {
		try {
			System.out.println("Enter the Customer ID : ");
			int cusID = sc.nextInt();
			System.out.println("Enter the amount to withdraw :");
			double balance = sc.nextDouble();
			String query = "Select balance from cusData where cusid = ?";
			PreparedStatement pst = conn.prepareStatement(query);
			pst.setInt(1, cusID);
			ResultSet rs = pst.executeQuery();
			rs.next();
			double amount = rs.getDouble(1);
			if (amount < balance) {
				System.out.println("Insufficient Balance");
				return;
			}
			amount -= balance;
			query = "update cusdata set balance = ? where cusID = ?";
			pst = conn.prepareStatement(query);

			pst.setDouble(1, amount);
			pst.setInt(2, cusID);
			pst.execute();
			System.out.println("Customer ID Withdrawed successfully ");
		} catch (SQLException e) {
			e.printStackTrace();

		}
	}
	public void deletecus() {
		System.out.println("Enter the Customer ID to delete :");
		int cusId = sc.nextInt();
		String query = "Delete cusdata where cusID =?"; 
		PreparedStatement pst;
		try {
			pst = conn.prepareStatement(query);
			pst.setInt(1, cusId);
			pst.execute();
			System.out.println("Customer ID Deleted successfully ");
		} catch (SQLException e) {
			System.out.println("Customer id not found");
			e.printStackTrace();
		}
		
		
		
		
	}

}
