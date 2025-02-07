package com.celcom.day4;

public class JavaBlockExample1 {
	{
		System.out.println("Instance Block");
	}
	JavaBlockExample1(){
		System.out.println("Constructor Block");
	}
	public String toString() {
		return "Tostring";
	}

	static{
		System.out.println("Static Block");
	}

	public static void main(String[] args) {
		System.out.println("Main Method Block ");
		JavaBlockExample1 obj = new JavaBlockExample1 ();
		System.out.println(obj);
	}

}
