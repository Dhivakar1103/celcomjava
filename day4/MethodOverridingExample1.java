package com.celcom.day4;
class SuperClass{
	void myMethod() {
		System.out.println("I am a super class");
		
	}
	
}
class SubClass extends SuperClass{
	void myMethod() {
		System.out.println("I am a sub class");
		
	}
	
}

public class MethodOverridingExample1 {

	public static void main(String[] args) {
		SubClass obj = new SubClass();
		obj.myMethod();
		SuperClass obj1 = new SubClass();
		obj1.myMethod();
	}

}
