package com.celcom.day6;


public class TryCatchExample {

	public static void main(String[] args) {
		System.out.println("Before exceptions");

		try {
			int a = 10/0;
			
		}
		catch(ArithmeticException e){
			System.out.println(e);
			
		}
		catch(NumberFormatException e) {
			System.out.println(e);
		}
		System.out.println("After exceptions");
	}

}
