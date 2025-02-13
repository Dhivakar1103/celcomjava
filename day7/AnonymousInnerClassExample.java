package com.celcom.day7;

interface MyInterface {
	public void display();
}

public class AnonymousInnerClassExample implements MyInterface {
	public void display() {
		System.out.println("Display");
	}

	public static void main(String[] args) {
		AnonymousInnerClassExample obj = new AnonymousInnerClassExample();
		obj.display();
		
		MyInterface obj1 = new MyInterface() {
			public void display() {
				System.out.println("Display1");
			}
			
		};
		obj1.display();
		//lambda
		MyInterface lam = () -> System.out.println("Lambda ");
		lam.display();
		

	}

}
