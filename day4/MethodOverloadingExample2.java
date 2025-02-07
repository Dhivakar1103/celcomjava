package com.celcom.day4;

public class MethodOverloadingExample2 {
	void addition(int a,int b) {
		System.out.println("Integer Addition :" + (a+b));
	}
	void addition(double a ,double b) {
		System.out.println("Double Addition :" + (a+b));
	}
	void addition(long a , long b) {
		System.out.println("Long Addition :" + (a+b));
	}
	public static void main(String[] args) {
		 MethodOverloadingExample2 add = new  MethodOverloadingExample2();
		 add.addition(1.2 ,2.8);
		 add.addition(20L, 30L);
		 add.addition(7, 8);

		

	}

}
