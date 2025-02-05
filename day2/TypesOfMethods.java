package com.celcom.day2;

public class TypesOfMethods {
	void m1 () {
		System.out.println("Instance method ");
	}
	static void m2() {
		System.out.println("Static method ");
		
	}

	public static void main(String[] args) {
		TypesOfMethods obj = new TypesOfMethods();
		obj.m1();
		TypesOfMethods.m2();
		
		// TODO Auto-generated method stub
		
		

	}

}
