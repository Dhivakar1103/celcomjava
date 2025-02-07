package com.celcom.day4;

public class MethodOverloadingExample3 {
	void concat (double a,double b){
		System.out.println("Concat double value : " + a + b);
	}
	void concat(String a , String b ) {
		System.out.println("Concat String value : " + a + b);
		
	}
	void concat(int a ,int b ) {
		System.out.println("Concat int value : " + a + b);
		
	}
	

	public static void main(String[] args) {
		MethodOverloadingExample3 obj = new MethodOverloadingExample3();
		obj.concat(2.0, 3.0);
		obj.concat("dhiva", "kar");
		obj.concat(2, 3);
		

	}

}
