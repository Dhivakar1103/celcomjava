package com.celcom.day3;
class A{
	A(){
		System.out.println("A");
		
	}
	A(int a){
		System.out.println("A 1");
	}
	
}
class B extends A {
	B(){
		this(10);
		System.out.println("B");
		
	}
	B(int a){
		super(10);
		System.out.println("B 1");
		
	}
}
class C extends B {
	C(){
		System.out.println("C");
		
	}
}

public class SuperKeyword {

	public static void main(String[] args) {
		new C();
		

	}

}
