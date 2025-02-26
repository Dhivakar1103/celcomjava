package com.celcom.day13;

public class NewDetails {
	private int cusID;
	private String name;
	private long accNum;
	private double balance;
	public NewDetails(int cusID, String name, long accNum, double balance) {
		this.cusID = cusID;
		this.name = name;
		this.accNum = accNum;
		this.balance = balance;
	}
	public int getCusID() {
		return cusID;
	}
	public void setCusID(int cusID) {
		this.cusID = cusID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getAccNum() {
		return accNum;
	}
	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
}
