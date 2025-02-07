package com.celcom.day4;

public class ConstructoOverloadingExample1 {
	ConstructoOverloadingExample1(int a,int b) {
		this(10L,20L);
		System.out.println("Integer Addition :" + (a+b));
	}
	ConstructoOverloadingExample1(double a ,double b) {
		
		
		System.out.println("Double Addition :" + (a+b));
	}
	ConstructoOverloadingExample1(long a , long b) {
		this(10.4,20.5);
		System.out.println("Long Addition :" + (a+b));
	}
	public static void main(String[] args) {
		 new  ConstructoOverloadingExample1(10,20);
//		ConstructoOverloadingExample1 add1 = new  ConstructoOverloadingExample1(10.5 , 9.5);
//		ConstructoOverloadingExample1 add2 = new  ConstructoOverloadingExample1(20L, 10L);
		

		

	}

}
